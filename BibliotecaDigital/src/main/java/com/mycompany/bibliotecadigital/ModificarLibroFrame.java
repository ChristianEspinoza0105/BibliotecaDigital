
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
        jPanel2 = new javax.swing.JPanel();
        BibliotecaDigital = new javax.swing.JLabel();
        InicioSesion = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        Contrasena = new javax.swing.JLabel();
        Contrasena1 = new javax.swing.JLabel();
        Contrasena3 = new javax.swing.JLabel();
        Contrasena4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaTitulo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaAutor = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaResumen = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaPDF = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaImg = new javax.swing.JTextArea();
        jbBuscar = new javax.swing.JButton();

        Contrasena2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contrasena2.setForeground(new java.awt.Color(7, 15, 43));
        Contrasena2.setText("Ruta PDF:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(7, 15, 43));

        BibliotecaDigital.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(255, 255, 255));
        BibliotecaDigital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BibliotecaDigital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_icon.png"))); // NOI18N
        BibliotecaDigital.setText("Biblioteca Digital");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BibliotecaDigital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BibliotecaDigital)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        InicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        InicioSesion.setForeground(new java.awt.Color(7, 15, 43));
        InicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSesion.setText("Modificar Libro");

        Regresar.setBackground(new java.awt.Color(7, 15, 43));
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(7, 15, 43));
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        Usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(7, 15, 43));
        Usuario.setText("Titulo:");

        Contrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contrasena.setForeground(new java.awt.Color(7, 15, 43));
        Contrasena.setText("Autor o Autora:");

        Contrasena1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contrasena1.setForeground(new java.awt.Color(7, 15, 43));
        Contrasena1.setText("Ruta PDF:");

        Contrasena3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contrasena3.setForeground(new java.awt.Color(7, 15, 43));
        Contrasena3.setText("Ruta IMG:");

        Contrasena4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contrasena4.setForeground(new java.awt.Color(7, 15, 43));
        Contrasena4.setText("Resumen:");

        jtaTitulo.setColumns(20);
        jtaTitulo.setRows(5);
        jScrollPane1.setViewportView(jtaTitulo);

        jtaAutor.setColumns(20);
        jtaAutor.setRows(5);
        jScrollPane2.setViewportView(jtaAutor);

        jtaResumen.setColumns(20);
        jtaResumen.setRows(5);
        jScrollPane3.setViewportView(jtaResumen);

        jtaPDF.setColumns(20);
        jtaPDF.setRows(5);
        jScrollPane4.setViewportView(jtaPDF);

        jtaImg.setColumns(20);
        jtaImg.setRows(5);
        jScrollPane5.setViewportView(jtaImg);

        jbBuscar.setBackground(new java.awt.Color(7, 15, 43));
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(InicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contrasena)
                            .addComponent(Contrasena4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                            .addComponent(Contrasena1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                            .addComponent(Contrasena3)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Contrasena)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contrasena4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contrasena1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contrasena3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(jbModificar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

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
    private javax.swing.JLabel BibliotecaDigital;
    private javax.swing.JLabel Contrasena;
    private javax.swing.JLabel Contrasena1;
    private javax.swing.JLabel Contrasena2;
    private javax.swing.JLabel Contrasena3;
    private javax.swing.JLabel Contrasena4;
    private javax.swing.JLabel InicioSesion;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTextArea jtaAutor;
    private javax.swing.JTextArea jtaImg;
    private javax.swing.JTextArea jtaPDF;
    private javax.swing.JTextArea jtaResumen;
    private javax.swing.JTextArea jtaTitulo;
    private javax.swing.JTextField jtfContrasena2;
    // End of variables declaration//GEN-END:variables
}
