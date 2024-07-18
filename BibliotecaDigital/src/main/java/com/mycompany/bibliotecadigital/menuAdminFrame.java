package com.mycompany.bibliotecadigital;

import dao.LibroDAO;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Libro;

public class menuAdminFrame extends javax.swing.JFrame {
    
    private JPanel panelLibros; // Panel donde se añadirán los paneles de libros
    private LibroDAO libroDAO; // DAO para operaciones con libros

    public menuAdminFrame() {
        initComponents();
        inicializarPanelLibros(); // Inicializar el panel de libros
        libroDAO = new LibroDAO(); // Inicializar el DAO
        mostrarLibros(); // Llamada para mostrar los libros
    }
    
    private void inicializarPanelLibros() {
        panelLibros = new JPanel();
        panelLibros.setLayout(new GridLayout(0, 1, 10, 5)); // Layout para organizar los paneles
        JScrollPane scrollPane = new JScrollPane(panelLibros);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jPanel3.setLayout(new BorderLayout()); // Asegúrate de que jPanel3 use BorderLayout
        jPanel3.add(scrollPane, BorderLayout.CENTER); // Agrega el scrollPane al centro de jPanel3
    }

    private void mostrarLibros() {
        List<Libro> libros = libroDAO.obtenerTodosLosLibros();

        panelLibros.removeAll(); // Limpiar el panel antes de agregar libros nuevos

        for (Libro libro : libros) {
            LibroPanel libroPanel = new LibroPanel(libro);
            panelLibros.add(libroPanel);

            // Mensaje de depuración para verificar que se está creando el panel para cada libro
            System.out.println("Agregando panel para libro: " + libro.getTitulo());
        }

        panelLibros.revalidate(); // Actualizar el panel para que se muestren los nuevos componentes
        panelLibros.repaint();   // Repintar el panel para reflejar los cambios visuales
    }


    private void buscarLibroPorTitulo(String titulo) {
        Libro libroEncontrado = libroDAO.buscarLibroPorTitulo(titulo);

        if (libroEncontrado != null) {
            panelLibros.removeAll(); // Limpiar el panel actual de libros
            LibroPanel libroPanel = new LibroPanel(libroEncontrado);
            panelLibros.add(libroPanel); // Mostrar el libro encontrado
            panelLibros.revalidate();
            panelLibros.repaint();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(7, 15, 43));

        BibliotecaDigital.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(255, 255, 255));
        BibliotecaDigital.setText("Biblioteca Digital");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_icon.png"))); // NOI18N

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setForeground(new java.awt.Color(7, 15, 43));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar_icon.png"))); // NOI18N
        jbBuscar.setText("Buscar");
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
        jbAnadir.setText("Añadir libro");
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
            .addGap(0, 808, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );

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
                .addComponent(jbAnadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BibliotecaDigital)
                .addGap(20, 20, 20))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
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
                            .addComponent(jbAnadir)))
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
        // Aquí se podría abrir una nueva ventana o diálogo para añadir un libro
        // y luego actualizar la lista de libros mostrados en el panel
        JOptionPane.showMessageDialog(this, "Funcionalidad de añadir libro aún no implementada.",
                "Función no disponible", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbAnadirActionPerformed

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        jbBuscarActionPerformed(evt);
    }//GEN-LAST:event_jtfBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(menuAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JTextField jtfBuscar;
    // End of variables declaration//GEN-END:variables
}
