package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Libro;
import concurrency.Monitor;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

public class LibroDAO {
    private Connection connection;
    private Monitor monitor;
    
    public LibroDAO(Connection connection) {
        this.connection = connection;
    }

    public LibroDAO() {
        String url = "jdbc:postgresql://localhost:5432/biblioteca";
        String usuario = "postgres";
        String contraseña = "espinoza2004";

        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
            monitor = new Monitor();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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
        final String sql = "INSERT INTO libros (titulo, autor, pdf_path, imagen_path, resumen) VALUES (?, ?, ?, ?, ?)";

        monitor.sincronizarAcceso(() -> {
            try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, libro.getTitulo());
                stmt.setString(2, libro.getAutor());
                stmt.setString(3, libro.getPdfPath());
                stmt.setString(4, libro.getImagenPath());
                stmt.setString(5, libro.getResumen());
                stmt.executeUpdate();

                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    libro.setId(generatedKeys.getInt(1));
                }

                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(null, "Libro agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                });

            } catch (SQLException e) {
                e.printStackTrace();

                SwingUtilities.invokeLater(() -> {
                    JOptionPane.showMessageDialog(null, "Error al agregar el libro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                });
            }
        });
    }

    public boolean actualizarLibro(Libro libro) {
        String sql = "UPDATE libros SET autor = ?, pdf_path = ?, imagen_path = ?, resumen = ? WHERE titulo = ?";
        final boolean[] resultado = { false };

        monitor.sincronizarAcceso(() -> {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, libro.getAutor());
                stmt.setString(2, libro.getPdfPath());
                stmt.setString(3, libro.getImagenPath());
                stmt.setString(4, libro.getResumen());
                stmt.setString(5, libro.getTitulo());
                int rowsAffected = stmt.executeUpdate();
                resultado[0] = rowsAffected > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        return resultado[0];
    }

    public Libro eliminarLibroPorTitulo(String titulo) {
        Libro libroEliminado = buscarLibroPorTitulo(titulo);

        if (libroEliminado != null) {
            final String sql = "DELETE FROM libros WHERE titulo = ?";

            monitor.sincronizarAcceso(() -> {
                try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                    stmt.setString(1, titulo);
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });
        }

        return libroEliminado;
    }

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
                    String pdfPath = rs.getString("pdf_path");
                    String imagenPath = rs.getString("imagen_path");
                    String resumen = rs.getString("resumen");
                    Libro libro = new Libro(id, titulo, autor, pdfPath, imagenPath, resumen);
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
        final Libro[] libro = { null };

        monitor.sincronizarAcceso(() -> {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, titulo);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        int id = rs.getInt("id");
                        String autor = rs.getString("autor");
                        String pdfPath = rs.getString("pdf_path");
                        String imagenPath = rs.getString("imagen_path");
                        String resumen = rs.getString("resumen");
                        libro[0] = new Libro(id, titulo, autor, pdfPath, imagenPath, resumen);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        return libro[0];
    }
    
    public Libro buscarLibroPorRutaPDF(String pdfPath) {
        String query = "SELECT * FROM libros WHERE pdf_path = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pdfPath);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                String imagenPath = resultSet.getString("imagen_path");
                String resumen = resultSet.getString("resumen");
                String pdfPathFromDB = resultSet.getString("pdf_path");

                return new Libro(titulo, autor, imagenPath, resumen, pdfPathFromDB);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
