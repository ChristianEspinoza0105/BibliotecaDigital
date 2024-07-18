package com.mycompany.bibliotecadigital;

import dao.LibroDAO;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Libro;

public class menuAdminFrame extends javax.swing.JFrame {
    
    private JPanel panelLibros;
    private LibroDAO libroDAO;

    public menuAdminFrame() {
        initComponents();
        inicializarPanelLibros();
        libroDAO = new LibroDAO();
        mostrarLibros();
    }
    
    private void inicializarPanelLibros() {
        panelLibros = new JPanel();
        panelLibros.setLayout(new GridLayout(0, 1, 10, 5));
        JScrollPane scrollPane = new JScrollPane(panelLibros);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jPanel3.setLayout(new BorderLayout());
        jPanel3.add(scrollPane, BorderLayout.CENTER);
    }


    private void mostrarLibros() {
        List<Libro> libros = libroDAO.obtenerTodosLosLibros();

        panelLibros.removeAll();

        for (Libro libro : libros) {
            LibroPanel libroPanel = new LibroPanel(libro);
            panelLibros.add(libroPanel);

            System.out.println("Agregando panel para libro: " + libro.getTitulo());
        }

        panelLibros.revalidate();
        panelLibros.repaint();
    }


    private void buscarLibroPorTitulo(String titulo) {
        Libro libroEncontrado = libroDAO.buscarLibroPorTitulo(titulo);

        if (libroEncontrado != null) {
            panelLibros.removeAll();
            LibroPanel libroPanel = new LibroPanel(libroEncontrado);
            panelLibros.add(libroPanel);
            panelLibros.revalidate();
            panelLibros.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún libro con el título especificado.",
                    "Libro no encontrado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
        private void eliminarLibroPorTitulo(String titulo) {
        Libro libroEliminar = libroDAO.buscarLibroPorTitulo(titulo);

        if (libroEliminar != null) {
            int opcion = JOptionPane.showConfirmDialog(this,
                    "¿Estás seguro que deseas eliminar el libro: " + libroEliminar.getTitulo() + "?",
                    "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                libroDAO.eliminarLibroPorTitulo(libroEliminar.getTitulo());
                JOptionPane.showMessageDialog(this, "Libro eliminado correctamente.",
                        "Libro eliminado", JOptionPane.INFORMATION_MESSAGE);
                mostrarLibros();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún libro con el título especificado.",
                    "Libro no encontrado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BibliotecaDigital = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jtfBuscar = new javax.swing.JTextField();
        jbAnadir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbEliminar = new javax.swing.JButton();
        jbHouse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(7, 15, 43));

        BibliotecaDigital.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(255, 255, 255));
        BibliotecaDigital.setText("Biblioteca Digital");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_icon.png"))); // NOI18N

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setForeground(new java.awt.Color(7, 15, 43));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar_icon.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtfBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jtfBuscar.setForeground(new java.awt.Color(7, 15, 43));
        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });

        jbAnadir.setBackground(new java.awt.Color(255, 255, 255));
        jbAnadir.setForeground(new java.awt.Color(7, 15, 43));
        jbAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suma_icon.png"))); // NOI18N
        jbAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnadirActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );

        jbEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbEliminar.setForeground(new java.awt.Color(7, 15, 43));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basura_icon.png"))); // NOI18N
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbHouse.setBackground(new java.awt.Color(255, 255, 255));
        jbHouse.setForeground(new java.awt.Color(7, 15, 43));
        jbHouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/house_icon.png"))); // NOI18N
        jbHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbHouse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAnadir)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BibliotecaDigital)
                .addGap(20, 20, 20))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBuscar)
                            .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAnadir))
                        .addComponent(jbEliminar)
                        .addComponent(jbHouse))
                    .addComponent(BibliotecaDigital, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        String titulo = jtfBuscar.getText().trim();
        if (!titulo.isEmpty()) {
            buscarLibroPorTitulo(titulo);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un título para buscar.",
                    "Campo vacío", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnadirActionPerformed
        this.dispose();
        AgregarLibroFrame otraVentana = new AgregarLibroFrame();
        otraVentana.setVisible(true);
    }//GEN-LAST:event_jbAnadirActionPerformed
  
    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        jbBuscarActionPerformed(evt);
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        String titulo = JOptionPane.showInputDialog(this, "Ingrese el título del libro a eliminar:");
        if (titulo != null && !titulo.isEmpty()) {
            eliminarLibroPorTitulo(titulo);
            mostrarLibros();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un título válido.", "Título Vacío", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHouseActionPerformed
        this.dispose();
        menuAdminFrame adminFrame = new menuAdminFrame();
        adminFrame.setVisible(true);        
    }//GEN-LAST:event_jbHouseActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(menuAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menuAdminFrame frame = new menuAdminFrame();
                frame.setVisible(true);            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BibliotecaDigital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbAnadir;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbHouse;
    private javax.swing.JTextField jtfBuscar;
    // End of variables declaration//GEN-END:variables
}
