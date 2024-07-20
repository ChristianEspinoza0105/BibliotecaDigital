
package com.mycompany.bibliotecadigital;

import model.Libro;
import dao.LibroDAO;
import javax.swing.JOptionPane;

public class ModificarLibroFrame extends javax.swing.JFrame {
    private LibroDAO libroDAO;

    public ModificarLibroFrame() {
        initComponents();
        libroDAO = new LibroDAO();
    }
    
    private void limpiarCampos() {
        jtaTitulo.setText("");
        jtaAutor.setText("");
        jtaPDF.setText("");
        jtaImg.setText("");
        jtaResumen.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contrasena2 = new javax.swing.JLabel();
        jtfContrasena2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        background2 = new javax.swing.JPanel();
        BibliotecaDigital2 = new javax.swing.JLabel();
        InicioSesion1 = new javax.swing.JLabel();
        AutorLabel = new javax.swing.JLabel();
        TituloLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtaTitulo = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtaAutor = new javax.swing.JTextArea();
        ResumenLabel = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtaResumen = new javax.swing.JTextArea();
        ResumenLabel1 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtaPDF = new javax.swing.JTextArea();
        ResumenLabel2 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtaImg = new javax.swing.JTextArea();
        jbBuscar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        background3 = new javax.swing.JPanel();
        background4 = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();

        Contrasena2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contrasena2.setForeground(new java.awt.Color(7, 15, 43));
        Contrasena2.setText("Ruta PDF:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1340, 870));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background2.setBackground(new java.awt.Color(7, 15, 43));

        BibliotecaDigital2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        BibliotecaDigital2.setForeground(new java.awt.Color(255, 255, 255));
        BibliotecaDigital2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital2.setText("Biblioteca Digital");

        InicioSesion1.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        InicioSesion1.setForeground(new java.awt.Color(146, 144, 195));
        InicioSesion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSesion1.setText("Modificar Libro");

        AutorLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        AutorLabel.setForeground(new java.awt.Color(255, 255, 255));
        AutorLabel.setText("Autor");

        TituloLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        TituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel.setText("Titulo");

        jtaTitulo.setColumns(20);
        jtaTitulo.setFont(new java.awt.Font("Roboto Thin", 0, 24)); // NOI18N
        jtaTitulo.setRows(5);
        jScrollPane6.setViewportView(jtaTitulo);

        jtaAutor.setColumns(20);
        jtaAutor.setFont(new java.awt.Font("Roboto Thin", 0, 24)); // NOI18N
        jtaAutor.setRows(5);
        jScrollPane7.setViewportView(jtaAutor);

        ResumenLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        ResumenLabel.setForeground(new java.awt.Color(255, 255, 255));
        ResumenLabel.setText("Ruta IMG");

        jtaResumen.setColumns(20);
        jtaResumen.setFont(new java.awt.Font("Roboto Thin", 0, 24)); // NOI18N
        jtaResumen.setRows(5);
        jScrollPane8.setViewportView(jtaResumen);

        ResumenLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        ResumenLabel1.setForeground(new java.awt.Color(255, 255, 255));
        ResumenLabel1.setText("Resumen");

        jtaPDF.setColumns(20);
        jtaPDF.setFont(new java.awt.Font("Roboto Thin", 0, 24)); // NOI18N
        jtaPDF.setRows(5);
        jScrollPane9.setViewportView(jtaPDF);

        ResumenLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        ResumenLabel2.setForeground(new java.awt.Color(255, 255, 255));
        ResumenLabel2.setText("Ruta PDF");

        jtaImg.setColumns(20);
        jtaImg.setFont(new java.awt.Font("Roboto Thin", 0, 24)); // NOI18N
        jtaImg.setRows(5);
        jScrollPane10.setViewportView(jtaImg);

        jbBuscar.setBackground(new java.awt.Color(83, 92, 145));
        jbBuscar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(83, 92, 145));
        jbModificar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        Regresar.setBackground(new java.awt.Color(83, 92, 145));
        Regresar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResumenLabel1)
                    .addComponent(ResumenLabel2)
                    .addComponent(ResumenLabel)
                    .addComponent(AutorLabel)
                    .addComponent(TituloLabel)
                    .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, background2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(InicioSesion1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BibliotecaDigital2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(background2Layout.createSequentialGroup()
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BibliotecaDigital2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InicioSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AutorLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ResumenLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ResumenLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResumenLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Regresar))
                .addGap(64, 64, 64))
        );

        jPanel1.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 860, 790));

        background3.setBackground(new java.awt.Color(27, 26, 85));
        background3.setPreferredSize(new java.awt.Dimension(510, 620));
        background3.setLayout(new javax.swing.BoxLayout(background3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 860, 790));

        background4.setBackground(new java.awt.Color(83, 92, 145));
        background4.setPreferredSize(new java.awt.Dimension(510, 620));
        background4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 860, 790));

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("<");
        jbSalir.setBorder(null);
        jbSalir.setBorderPainted(false);
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.dispose();
        menuAdminFrame adminFrame = new menuAdminFrame();
        adminFrame.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        String titulo = jtaTitulo.getText().trim();
        String autor = jtaAutor.getText().trim();
        String pdfPath = jtaPDF.getText().trim();
        String imagenPath = jtaImg.getText().trim();
        String resumen = jtaResumen.getText().trim();

        if (titulo.isEmpty() || autor.isEmpty() || pdfPath.isEmpty() || imagenPath.isEmpty() || resumen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
            return;
        }

        Libro libro = new Libro(0, titulo, autor, pdfPath, imagenPath, resumen); // ID 0 porque no se usa en la actualización por título
        boolean actualizado = libroDAO.actualizarLibro(libro);

        if (actualizado) {
            JOptionPane.showMessageDialog(this, "Libro actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el libro.");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        String titulo = jtaTitulo.getText().trim();
        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa el título del libro que deseas buscar.");
            return;
        }

        Libro libro = libroDAO.buscarLibroPorTitulo(titulo);
        if (libro != null) {
            jtaAutor.setText(libro.getAutor());
            jtaPDF.setText(libro.getPdfPath());
            jtaImg.setText(libro.getImagenPath());
            jtaResumen.setText(libro.getResumen());
        } else {
            JOptionPane.showMessageDialog(this, "Libro no encontrado.");
            limpiarCampos();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        menuAdminFrame menuAdminFrame = new menuAdminFrame();
        menuAdminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarLibroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarLibroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarLibroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarLibroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarLibroFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutorLabel;
    private javax.swing.JLabel BibliotecaDigital2;
    private javax.swing.JLabel Contrasena2;
    private javax.swing.JLabel InicioSesion1;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel ResumenLabel;
    private javax.swing.JLabel ResumenLabel1;
    private javax.swing.JLabel ResumenLabel2;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JPanel background2;
    private javax.swing.JPanel background3;
    private javax.swing.JPanel background4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextArea jtaAutor;
    private javax.swing.JTextArea jtaImg;
    private javax.swing.JTextArea jtaPDF;
    private javax.swing.JTextArea jtaResumen;
    private javax.swing.JTextArea jtaTitulo;
    private javax.swing.JTextField jtfContrasena2;
    // End of variables declaration//GEN-END:variables
}
