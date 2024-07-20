package com.mycompany.bibliotecadigital;

import javax.swing.JOptionPane;

public class RegistroFrame extends javax.swing.JFrame {

    private InicioFrame principalFrame;
    
    public RegistroFrame(InicioFrame principalFrame) {
        this.principalFrame = principalFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        BibliotecaDigital = new javax.swing.JLabel();
        RegistrarseLabel = new javax.swing.JLabel();
        UsuarioLabel = new javax.swing.JLabel();
        ImagenLabel = new javax.swing.JLabel();
        RegistrarsePanel = new javax.swing.JPanel();
        SeparatorUsuario = new javax.swing.JSeparator();
        jtfUsuario = new javax.swing.JTextField();
        ContraseñaLabel = new javax.swing.JLabel();
        SeparatorContraseña = new javax.swing.JSeparator();
        jtfContrasena = new javax.swing.JTextField();
        jbRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        background.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        BibliotecaDigital.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(7, 15, 43));
        BibliotecaDigital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital.setText("Biblioteca Digital");
        background.add(BibliotecaDigital, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 70, -1, -1));

        RegistrarseLabel.setFont(new java.awt.Font("Roboto Black", 0, 64)); // NOI18N
        RegistrarseLabel.setForeground(new java.awt.Color(7, 15, 43));
        RegistrarseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrarseLabel.setText("Registrarse");
        background.add(RegistrarseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 450, 80));

        UsuarioLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(7, 15, 43));
        UsuarioLabel.setText("Nombre de Usuario");
        background.add(UsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, -1, -1));

        ImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books_imagen.png"))); // NOI18N
        background.add(ImagenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 870));

        RegistrarsePanel.setBackground(new java.awt.Color(7, 15, 43));

        javax.swing.GroupLayout RegistrarsePanelLayout = new javax.swing.GroupLayout(RegistrarsePanel);
        RegistrarsePanel.setLayout(RegistrarsePanelLayout);
        RegistrarsePanelLayout.setHorizontalGroup(
            RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        RegistrarsePanelLayout.setVerticalGroup(
            RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        background.add(RegistrarsePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 460, 10));

        SeparatorUsuario.setBackground(new java.awt.Color(0, 0, 0));
        background.add(SeparatorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 690, 10));

        jtfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsuario.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfUsuario.setToolTipText("");
        jtfUsuario.setBorder(null);
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        background.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 700, 60));

        ContraseñaLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        ContraseñaLabel.setForeground(new java.awt.Color(7, 15, 43));
        ContraseñaLabel.setText("Contraseña");
        background.add(ContraseñaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        SeparatorContraseña.setBackground(new java.awt.Color(0, 0, 0));
        background.add(SeparatorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 690, 10));

        jtfContrasena.setBackground(new java.awt.Color(255, 255, 255));
        jtfContrasena.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfContrasena.setToolTipText("");
        jtfContrasena.setBorder(null);
        jtfContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContrasenaActionPerformed(evt);
            }
        });
        background.add(jtfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 700, 60));

        jbRegistro.setBackground(new java.awt.Color(7, 15, 43));
        jbRegistro.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistro.setText("Registrarse");
        jbRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistroActionPerformed(evt);
            }
        });
        background.add(jbRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 660, 220, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jtfContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfContrasenaActionPerformed

    private void jbRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistroActionPerformed
        String usuario = jtfUsuario.getText();
        String contrasena = jtfContrasena.getText();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se debe completar todos los campos.",
                    "Campos Incompletos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            principalFrame.agregarUsuario(usuario, contrasena);
            principalFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbRegistroActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        menuAdminFrame menuAdminFrame = new menuAdminFrame();
        menuAdminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InicioFrame frame = new InicioFrame();
                frame.setVisible(true);           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BibliotecaDigital;
    private javax.swing.JLabel ContraseñaLabel;
    private javax.swing.JLabel ImagenLabel;
    private javax.swing.JLabel RegistrarseLabel;
    private javax.swing.JPanel RegistrarsePanel;
    private javax.swing.JSeparator SeparatorContraseña;
    private javax.swing.JSeparator SeparatorUsuario;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JPanel background;
    private javax.swing.JButton jbRegistro;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
