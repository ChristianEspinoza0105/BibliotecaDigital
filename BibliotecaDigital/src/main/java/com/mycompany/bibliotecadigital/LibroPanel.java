package com.mycompany.bibliotecadigital;

import dao.LibroDAO;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Libro;

public class LibroPanel extends javax.swing.JPanel {

    private final Libro libro;

    public LibroPanel(Libro libro) {
        initComponents();
        this.libro = libro;
        mostrarDetallesLibro();
        jlResumen.setEditable(false);
        // Crear un JLabel para mostrar el PDF (opcional)
        JLabel pdfLabel = new JLabel();
        pdfLabel.setPreferredSize(new Dimension(800, 600));
        jPanel1.add(pdfLabel, BorderLayout.CENTER);

        // Añadir un ActionListener al botón de leer
        jbLeer.addActionListener(evt -> abrirPdf(libro.getPdfPath()));
    }
    
    private void mostrarDetallesLibro() {
        System.out.println("Mostrando detalles del libro: " + libro.getTitulo() + " - " + libro.getAutor());

        ImageIcon icon = null;
        String imagenPath = libro.getImagenPath();

        if (imagenPath != null && !imagenPath.isEmpty()) {
            System.out.println("Ruta de imagen: " + imagenPath);
            icon = new ImageIcon(imagenPath);
        } else {
            System.out.println("No se encontró ruta de imagen válida, utilizando imagen por defecto.");
            icon = new ImageIcon(getClass().getResource("src/main/resources/libro1.jpg"));
        }

        Image img = icon.getImage().getScaledInstance(299, 466, Image.SCALE_SMOOTH);
        jlImagen.setIcon(new ImageIcon(img));
        jlTitulo.setText(libro.getTitulo());
        jlAutor.setText(libro.getAutor());
        jlResumen.setText(libro.getResumen());
    }
    
    private void abrirPdf(String pdfPath) {
        if (pdfPath != null && !pdfPath.isEmpty()) {
            java.io.File pdfFile = new java.io.File(pdfPath);
            if (pdfFile.exists()) {
                try {
                    java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                    if (desktop.isSupported(java.awt.Desktop.Action.OPEN)) {
                        desktop.open(pdfFile);
                    } else {
                        JOptionPane.showMessageDialog(this, "Acción OPEN no soportada en este sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (java.io.IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al intentar abrir el archivo PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El archivo PDF no existe en la ruta especificada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "La ruta del archivo PDF no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlImagen = new javax.swing.JLabel();
        jlAutor = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jbLeer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlResumen = new javax.swing.JTextArea();
        jlFormato = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlAutor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlAutor.setForeground(new java.awt.Color(7, 15, 43));

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(7, 15, 43));

        jbLeer.setBackground(new java.awt.Color(255, 153, 0));
        jbLeer.setForeground(new java.awt.Color(255, 255, 255));
        jbLeer.setText("Leer");
        jbLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLeerActionPerformed(evt);
            }
        });

        jlResumen.setBackground(new java.awt.Color(255, 255, 255));
        jlResumen.setColumns(20);
        jlResumen.setForeground(new java.awt.Color(0, 0, 0));
        jlResumen.setRows(5);
        jScrollPane1.setViewportView(jlResumen);

        jlFormato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlFormato.setForeground(new java.awt.Color(0, 0, 0));
        jlFormato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlFormato.setText("Biblioteca Digital");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addComponent(jlAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jlFormato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLeerActionPerformed
        // Obtener el título del libro desde la interfaz gráfica (por ejemplo, desde un campo de texto)
        String titulo = jlTitulo.getText();

        // Crear una instancia de LibroDAO
        LibroDAO libroDAO = new LibroDAO();

        // Obtener la ruta del archivo PDF desde la base de datos
        String pdfFilePath = libroDAO.obtenerRutaPDF(titulo);

        // Cerrar la conexión a la base de datos
        libroDAO.cerrarConexion();

        // Verificar si se obtuvo una ruta válida
        if (pdfFilePath != null) {
            java.io.File pdfFile = new java.io.File(pdfFilePath);

            // Verificar si el archivo existe
            if (pdfFile.exists()) {
                try {
                    // Obtener el escritorio del sistema
                    java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

                    // Verificar si el escritorio soporta la acción de abrir archivos
                    if (desktop.isSupported(java.awt.Desktop.Action.OPEN)) {
                        // Abrir el archivo PDF con la aplicación predeterminada
                        desktop.open(pdfFile);
                    } else {
                        JOptionPane.showMessageDialog(null, "Acción OPEN no soportada en este sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (java.io.IOException e) {
                    JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo PDF no existe en la ruta especificada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el libro con el título especificado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbLeerActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLeer;
    private javax.swing.JLabel jlAutor;
    private javax.swing.JLabel jlFormato;
    private javax.swing.JLabel jlImagen;
    private javax.swing.JTextArea jlResumen;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables

}