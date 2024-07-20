package com.mycompany.bibliotecadigital;

import dao.LibroDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Libro;

public class menuAdminFrame extends javax.swing.JFrame {
    
    private JPanel panelLibros;
    private LibroDAO libroDAO;
    int xMouse, yMouse;

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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jtfBuscar = new javax.swing.JTextField();
        jbAnadir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        BibliotecaDigital2 = new javax.swing.JLabel();
        PanelCerrar = new javax.swing.JPanel();
        LabelCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(1340, 870));
        jPanel3.setPreferredSize(new java.awt.Dimension(1340, 870));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(7, 15, 43));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setForeground(new java.awt.Color(7, 15, 43));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar_icon.png"))); // NOI18N
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbBuscarMouseExited(evt);
            }
        });
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 40, 40));

        jtfBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jtfBuscar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jtfBuscar.setForeground(new java.awt.Color(204, 204, 204));
        jtfBuscar.setText("Escribir titulo...");
        jtfBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfBuscarMousePressed(evt);
            }
        });
        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jtfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, 40));

        jbAnadir.setBackground(new java.awt.Color(51, 153, 0));
        jbAnadir.setForeground(new java.awt.Color(7, 15, 43));
        jbAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suma_icon.png"))); // NOI18N
        jbAnadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(jbAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 16, 40, 30));

        jbEliminar.setBackground(new java.awt.Color(255, 0, 0));
        jbEliminar.setForeground(new java.awt.Color(7, 15, 43));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basura_icon.png"))); // NOI18N
        jbEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 16, 40, 30));

        jbEditar.setBackground(new java.awt.Color(255, 153, 0));
        jbEditar.setForeground(new java.awt.Color(7, 15, 43));
        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lapiz_icon.png"))); // NOI18N
        jbEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 16, 40, 30));

        BibliotecaDigital2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        BibliotecaDigital2.setForeground(new java.awt.Color(255, 255, 255));
        BibliotecaDigital2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital2.setText("Biblioteca Digital");
        BibliotecaDigital2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BibliotecaDigital2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BibliotecaDigital2MouseClicked(evt);
            }
        });
        jPanel1.add(BibliotecaDigital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 230, 60));

        PanelCerrar.setBackground(new java.awt.Color(255, 255, 255));
        PanelCerrar.setPreferredSize(new java.awt.Dimension(54, 33));
        PanelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCerrarMouseExited(evt);
            }
        });

        LabelCerrar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        LabelCerrar.setForeground(new java.awt.Color(0, 0, 0));
        LabelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCerrar.setText("X");
        LabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelCerrarLayout = new javax.swing.GroupLayout(PanelCerrar);
        PanelCerrar.setLayout(PanelCerrarLayout);
        PanelCerrarLayout.setHorizontalGroup(
            PanelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCerrarLayout.setVerticalGroup(
            PanelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(PanelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

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
        jtfBuscar.setText("");
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
            JOptionPane.showMessageDialog(this, "La operación ha sido cancelada.", "Operación cancelada", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        this.dispose();
        ModificarLibroFrame otraVentana = new ModificarLibroFrame();
        otraVentana.setVisible(true);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void LabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LabelCerrarMouseClicked

    private void LabelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCerrarMouseEntered
        PanelCerrar.setBackground(Color.red);
        LabelCerrar.setForeground(Color.white);
    }//GEN-LAST:event_LabelCerrarMouseEntered

    private void LabelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCerrarMouseExited
        PanelCerrar.setBackground(Color.white);
        LabelCerrar.setForeground(Color.black);
    }//GEN-LAST:event_LabelCerrarMouseExited

    private void PanelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_PanelCerrarMouseClicked

    private void PanelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCerrarMouseEntered
        PanelCerrar.setBackground(Color.red);
        LabelCerrar.setForeground(Color.white);
    }//GEN-LAST:event_PanelCerrarMouseEntered

    private void PanelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCerrarMouseExited
        PanelCerrar.setBackground(Color.white);
        LabelCerrar.setForeground(Color.black);
    }//GEN-LAST:event_PanelCerrarMouseExited

    private void jbBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseEntered
        jbBuscar.setBackground(new Color (146, 144, 195));
    }//GEN-LAST:event_jbBuscarMouseEntered

    private void jbBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseExited
        jbBuscar.setBackground(Color.white);
    }//GEN-LAST:event_jbBuscarMouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void BibliotecaDigital2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BibliotecaDigital2MouseClicked
        this.dispose();
        menuAdminFrame adminFrame = new menuAdminFrame();
        adminFrame.setVisible(true);  
    }//GEN-LAST:event_BibliotecaDigital2MouseClicked

    private void jtfBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuscarMousePressed
            jtfBuscar.setText("");
            jtfBuscar.setForeground(Color.black);
    }//GEN-LAST:event_jtfBuscarMousePressed

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
    private javax.swing.JLabel BibliotecaDigital2;
    private javax.swing.JLabel LabelCerrar;
    private javax.swing.JPanel PanelCerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbAnadir;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JTextField jtfBuscar;
    // End of variables declaration//GEN-END:variables
}
