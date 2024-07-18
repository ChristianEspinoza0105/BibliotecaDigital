package model;

public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private String PdfPath;
    private String imagenPath;
    private String resumen;

    public Libro(int id, String titulo, String autor, String PdfPath, String imagenPath, String resumen) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.PdfPath = PdfPath;
        this.imagenPath = imagenPath;
        this.resumen = resumen;
    }

    public Libro(String titulo, String autor, String PdfPath, String imagenPath, String resumen) {
        this.titulo = titulo;
        this.autor = autor;
        this.PdfPath = PdfPath;
        this.imagenPath = imagenPath;
        this.resumen = resumen;
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

    public String getPdfPath() {
        return PdfPath;
    }

    public void setPdfPath(String PdfPath) {
        this.PdfPath = PdfPath;
    }

    public String getImagenPath() {
        return imagenPath;
    }

    public void setImagenPath(String imagenPath) {
        this.imagenPath = imagenPath;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

}