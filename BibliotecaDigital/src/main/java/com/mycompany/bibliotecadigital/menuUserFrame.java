package com.mycompany.bibliotecadigital;

import dao.LibroDAO;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Libro;

public class menuUserFrame extends javax.swing.JFrame {
    
    private JPanel panelLibros;
    private LibroDAO libroDAO;

    public menuUserFrame() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jtfBuscar = new javax.swing.JTextField();
        jbHouse = new javax.swing.JButton();
        BibliotecaDigital2 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(1340, 870));
        jPanel3.setPreferredSize(new java.awt.Dimension(1340, 870));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(7, 15, 43));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setForeground(new java.awt.Color(7, 15, 43));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar_icon.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 50, 40));

        jtfBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jtfBuscar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jtfBuscar.setForeground(new java.awt.Color(7, 15, 43));
        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jtfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        jbHouse.setBackground(new java.awt.Color(255, 255, 255));
        jbHouse.setForeground(new java.awt.Color(7, 15, 43));
        jbHouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/house_icon.png"))); // NOI18N
        jbHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHouseActionPerformed(evt);
            }
        });
        jPanel1.add(jbHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, 40));

        BibliotecaDigital2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        BibliotecaDigital2.setForeground(new java.awt.Color(255, 255, 255));
        BibliotecaDigital2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital2.setText("Biblioteca Digital");
        jPanel1.add(BibliotecaDigital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 230, 60));

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setForeground(new java.awt.Color(7, 15, 43));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_icon.png"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 50, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
  
    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        jbBuscarActionPerformed(evt);
    }//GEN-LAST:event_jtfBuscarActionPerformed

    private void jbHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHouseActionPerformed
        this.dispose();
        menuUserFrame adminFrame = new menuUserFrame();
        adminFrame.setVisible(true);        
    }//GEN-LAST:event_jbHouseActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

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
            java.util.logging.Logger.getLogger(menuUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menuUserFrame frame = new menuUserFrame();
                frame.setVisible(true);            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BibliotecaDigital2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbHouse;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfBuscar;
    // End of variables declaration//GEN-END:variables
}
