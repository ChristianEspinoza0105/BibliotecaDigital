package model;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String contenido;

    public Libro(int id, String titulo, String autor, String contenido) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    public Libro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}

