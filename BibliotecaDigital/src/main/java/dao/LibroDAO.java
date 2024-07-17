package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import concurrency.Monitor;
import model.Libro;

public class LibroDAO {
    private Connection connection;
    private Monitor monitor;

    // Constructor para inicializar la conexión a la base de datos y el monitor
    public LibroDAO() {
        String url = "jdbc:postgresql://localhost:5432/biblioteca";
        String usuario = "postgres";
        String contraseña = "espinoza2004";

        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
            monitor = new Monitor(); // Inicialización del monitor
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para cerrar la conexión a la base de datos
    public void cerrarConexion() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarLibro(Libro libro) {
        final String sql = "INSERT INTO libros (titulo, autor, contenido) VALUES (?, ?, ?)";

        monitor.sincronizarAcceso(() -> {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, libro.getTitulo());
                stmt.setString(2, libro.getAutor());
                stmt.setString(3, libro.getContenido());
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }


    // Método sincronizado para obtener todos los libros de la base de datos
    public List<Libro> obtenerTodosLosLibros() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros";

        monitor.sincronizarAcceso(() -> {
            try (PreparedStatement stmt = connection.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String titulo = rs.getString("titulo");
                    String autor = rs.getString("autor");
                    String contenido = rs.getString("contenido");
                    Libro libro = new Libro(id, titulo, autor, contenido);
                    libros.add(libro);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        return libros;
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        String sql = "SELECT * FROM libros WHERE titulo = ?";
        final Libro[] libro = { null }; // Declaración final de un array para poder modificarlo dentro de la lambda

        monitor.sincronizarAcceso(() -> {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, titulo);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        int id = rs.getInt("id");
                        String autor = rs.getString("autor");
                        String contenido = rs.getString("contenido");
                        libro[0] = new Libro(id, titulo, autor, contenido);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        return libro[0];
    }

}
