package bibliotecadigital;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.io.IOException;
import javax.swing.JFrame;
import model.Libro;
import dao.LibroDAO;
import java.awt.Color;

public class LibroPanel extends javax.swing.JPanel {

    private final Libro libro;
    private PDFPanelFrame pdfFrame;
    private final LibroDAO libroDAO;

    public LibroPanel(Libro libro) {
        initComponents();
        this.libro = libro;
        this.libroDAO = new LibroDAO();
        mostrarDetallesLibro();
        jlResumen.setEditable(false);
    }
    
    private void mostrarDetallesLibro() {
        System.out.println("Cargando detalles del libro...");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());

        ImageIcon icon = null;
        String imagenPath = libro.getImagenPath();

        if (imagenPath != null && !imagenPath.isEmpty()) {
            System.out.println("Imagen encontrada en la ruta: " + imagenPath);
            icon = new ImageIcon(imagenPath);
        } else {
            System.out.println("Ruta de imagen no válida, utilizando imagen por defecto.");
            icon = new ImageIcon(getClass().getResource("/resources/libro1.jpg"));
        }

        Image img = icon.getImage().getScaledInstance(299, 466, Image.SCALE_SMOOTH);
        jlImagen.setIcon(new ImageIcon(img));
        jlTitulo.setText(libro.getTitulo());
        jlAutor.setText(libro.getAutor());
        jlResumen.setText(libro.getResumen());
        System.out.println("Detalles del libro mostrados correctamente.");
    }
    

private void abrirPdf(String pdfPath) {
    System.out.println("Buscando archivo PDF con la ruta: " + pdfPath);

    File pdfFile = new File(pdfPath);
    if (pdfFile.exists() && !pdfFile.isDirectory()) {
        System.out.println("Archivo PDF encontrado en la ruta: " + pdfPath);
        try {
            SwingUtilities.invokeLater(() -> {
                PDFPanelFrame pdfFrame = new PDFPanelFrame("Visor de PDF", pdfPath);
                pdfFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                pdfFrame.pack();
                pdfFrame.setVisible(true);

                pdfFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                        try {
                            pdfFrame.getDocument().close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            });
        } catch (Exception e) {
            System.out.println("Error al intentar abrir el archivo PDF: " + pdfPath);
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al intentar abrir el archivo PDF.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        System.out.println("No se encontró el archivo PDF en la ruta: " + pdfPath);
        JOptionPane.showMessageDialog(this, "No se encontró el archivo PDF en la ruta especificada.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlAutor = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jbLeer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlResumen = new javax.swing.JTextArea();
        jlFormato = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        linea1 = new javax.swing.JPanel();
        linea2 = new javax.swing.JPanel();
        linea3 = new javax.swing.JPanel();
        portadadecoracion1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        portadadecoracion = new javax.swing.JPanel();
        jlImagen = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlAutor.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jlAutor.setForeground(new java.awt.Color(7, 15, 43));

        jlTitulo.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(7, 15, 43));

        jbLeer.setBackground(new java.awt.Color(83, 92, 145));
        jbLeer.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbLeer.setForeground(new java.awt.Color(255, 255, 255));
        jbLeer.setText("Leer");
        jbLeer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLeerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbLeerMouseExited(evt);
            }
        });
        jbLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLeerActionPerformed(evt);
            }
        });

        jlResumen.setBackground(new java.awt.Color(255, 255, 255));
        jlResumen.setColumns(20);
        jlResumen.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        jlResumen.setForeground(new java.awt.Color(0, 0, 0));
        jlResumen.setRows(5);
        jScrollPane1.setViewportView(jlResumen);

        jlFormato.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jlFormato.setForeground(new java.awt.Color(0, 0, 0));
        jlFormato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlFormato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        jlFormato.setText("Biblioteca Digital");

        jSeparator1.setBackground(new java.awt.Color(27, 26, 85));

        linea1.setBackground(new java.awt.Color(7, 15, 43));
        linea1.setPreferredSize(new java.awt.Dimension(10, 720));

        javax.swing.GroupLayout linea1Layout = new javax.swing.GroupLayout(linea1);
        linea1.setLayout(linea1Layout);
        linea1Layout.setHorizontalGroup(
            linea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        linea1Layout.setVerticalGroup(
            linea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        linea2.setBackground(new java.awt.Color(27, 26, 85));
        linea2.setPreferredSize(new java.awt.Dimension(10, 720));

        javax.swing.GroupLayout linea2Layout = new javax.swing.GroupLayout(linea2);
        linea2.setLayout(linea2Layout);
        linea2Layout.setHorizontalGroup(
            linea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        linea2Layout.setVerticalGroup(
            linea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        linea3.setBackground(new java.awt.Color(83, 92, 145));
        linea3.setPreferredSize(new java.awt.Dimension(10, 720));

        javax.swing.GroupLayout linea3Layout = new javax.swing.GroupLayout(linea3);
        linea3.setLayout(linea3Layout);
        linea3Layout.setHorizontalGroup(
            linea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        linea3Layout.setVerticalGroup(
            linea3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        portadadecoracion1.setBackground(new java.awt.Color(83, 92, 145));

        jPanel2.setBackground(new java.awt.Color(27, 26, 85));

        portadadecoracion.setBackground(new java.awt.Color(7, 15, 43));

        javax.swing.GroupLayout portadadecoracionLayout = new javax.swing.GroupLayout(portadadecoracion);
        portadadecoracion.setLayout(portadadecoracionLayout);
        portadadecoracionLayout.setHorizontalGroup(
            portadadecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
            .addGroup(portadadecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, portadadecoracionLayout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(jlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        portadadecoracionLayout.setVerticalGroup(
            portadadecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
            .addGroup(portadadecoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, portadadecoracionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jlImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(portadadecoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(portadadecoracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout portadadecoracion1Layout = new javax.swing.GroupLayout(portadadecoracion1);
        portadadecoracion1.setLayout(portadadecoracion1Layout);
        portadadecoracion1Layout.setHorizontalGroup(
            portadadecoracion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(portadadecoracion1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        portadadecoracion1Layout.setVerticalGroup(
            portadadecoracion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(portadadecoracion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(linea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(linea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(linea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(portadadecoracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jbLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(linea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(linea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jlAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jlFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(portadadecoracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        System.out.println("Acción del botón 'Leer' activada.");
        String pdfPath = libro.getPdfPath();
        if (pdfPath != null && !pdfPath.isEmpty()) {
            System.out.println("Ruta del archivo PDF: " + pdfPath);
            abrirPdf(pdfPath);
        } else {
            System.out.println("Error: El libro no tiene un archivo PDF asociado.");
            JOptionPane.showMessageDialog(this, "El libro no tiene un archivo PDF asociado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbLeerActionPerformed

    private void jbLeerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLeerMouseEntered
        jbLeer.setBackground(new Color(27, 26, 85));
    }//GEN-LAST:event_jbLeerMouseEntered

    private void jbLeerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLeerMouseExited
        jbLeer.setBackground(new Color(146, 144, 195));
    }//GEN-LAST:event_jbLeerMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbLeer;
    private javax.swing.JLabel jlAutor;
    private javax.swing.JLabel jlFormato;
    private javax.swing.JLabel jlImagen;
    private javax.swing.JTextArea jlResumen;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel linea1;
    private javax.swing.JPanel linea2;
    private javax.swing.JPanel linea3;
    private javax.swing.JPanel portadadecoracion;
    private javax.swing.JPanel portadadecoracion1;
    // End of variables declaration//GEN-END:variables

}