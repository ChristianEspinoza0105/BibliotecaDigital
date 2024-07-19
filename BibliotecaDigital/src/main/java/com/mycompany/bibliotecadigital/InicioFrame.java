
package com.mycompany.bibliotecadigital;

import javax.swing.JOptionPane;
import java.util.HashMap;

public class InicioFrame extends javax.swing.JFrame {

    private HashMap<String, String> usuarios = new HashMap<>();
    private HashMap<String, String> administradores = new HashMap<>();
        
    public InicioFrame() {
        initComponents();
        inicializarUsuarios();      
    }
    
    private void inicializarUsuarios() {
        administradores.put("admin", "admin123");
    }
    
    public void agregarUsuario(String usuario, String contrasena) {
        if (usuarios.containsKey(usuario)) {
            JOptionPane.showMessageDialog(this, "El usuario ya existe.");
        } else {
            usuarios.put(usuario, contrasena);
            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        background2 = new javax.swing.JPanel();
        InicioSesion = new javax.swing.JLabel();
        jtfContrasena = new javax.swing.JTextField();
        ContraseñaLabel = new javax.swing.JLabel();
        UsuarioLabel = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jbRegistrarse = new javax.swing.JButton();
        jbIniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        background3 = new javax.swing.JPanel();
        background4 = new javax.swing.JPanel();
        BibliotecaDigital2 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1340, 870));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background2.setBackground(new java.awt.Color(7, 15, 43));

        InicioSesion.setFont(new java.awt.Font("Roboto Black", 0, 64)); // NOI18N
        InicioSesion.setForeground(new java.awt.Color(146, 144, 195));
        InicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSesion.setText("Inicio de Sesión");

        jtfContrasena.setBackground(new java.awt.Color(255, 255, 255));
        jtfContrasena.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfContrasena.setForeground(new java.awt.Color(7, 15, 43));
        jtfContrasena.setToolTipText("");
        jtfContrasena.setBorder(null);
        jtfContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContrasenaActionPerformed(evt);
            }
        });

        ContraseñaLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        ContraseñaLabel.setForeground(new java.awt.Color(255, 255, 255));
        ContraseñaLabel.setText("Contraseña");

        UsuarioLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioLabel.setText("Nombre de Usuario");

        jtfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsuario.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(7, 15, 43));
        jtfUsuario.setToolTipText("");
        jtfUsuario.setBorder(null);
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        jbRegistrarse.setBackground(new java.awt.Color(83, 92, 145));
        jbRegistrarse.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrarse.setText("Registrarse");
        jbRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarseActionPerformed(evt);
            }
        });

        jbIniciar.setBackground(new java.awt.Color(146, 144, 195));
        jbIniciar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbIniciar.setForeground(new java.awt.Color(255, 255, 255));
        jbIniciar.setText("Iniciar");
        jbIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(146, 144, 195));

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(68, 68, 68))
            .addGroup(background2Layout.createSequentialGroup()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContraseñaLabel)
                            .addComponent(UsuarioLabel)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InicioSesion)
                            .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(background2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jbRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UsuarioLabel)
                .addGap(18, 18, 18)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(ContraseñaLabel)
                .addGap(21, 21, 21)
                .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jbIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        background.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 660, 630));

        background3.setBackground(new java.awt.Color(27, 26, 85));
        background3.setPreferredSize(new java.awt.Dimension(510, 620));
        background3.setLayout(new javax.swing.BoxLayout(background3, javax.swing.BoxLayout.LINE_AXIS));
        background.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 660, 630));

        background4.setBackground(new java.awt.Color(83, 92, 145));
        background4.setPreferredSize(new java.awt.Dimension(510, 620));
        background4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 660, 630));

        BibliotecaDigital2.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        BibliotecaDigital2.setForeground(new java.awt.Color(7, 15, 43));
        BibliotecaDigital2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital2.setText("Biblioteca Digital");
        background.add(BibliotecaDigital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(906, 20, 410, 60));

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_icon.png"))); // NOI18N
        jbSalir.setBorder(null);
        jbSalir.setBorderPainted(false);
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        background.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jbIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarActionPerformed
        String usuario = jtfUsuario.getText();
        String contrasena = jtfContrasena.getText();

        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso como usuario.");
            menuUserFrame userFrame = new menuUserFrame();
            userFrame.setVisible(true);
            this.dispose();
        } else if (administradores.containsKey(usuario) && administradores.get(usuario).equals(contrasena)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso como administrador.");
            menuAdminFrame adminFrame = new menuAdminFrame();
            adminFrame.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
        }
    }//GEN-LAST:event_jbIniciarActionPerformed


    private void jbRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {
        RegistroFrame registroFrame = new RegistroFrame(this);
        registroFrame.setVisible(true);
        this.dispose();
    }

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(InicioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InicioFrame frame = new InicioFrame();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BibliotecaDigital2;
    private javax.swing.JLabel ContraseñaLabel;
    private javax.swing.JLabel InicioSesion;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JPanel background;
    private javax.swing.JPanel background2;
    private javax.swing.JPanel background3;
    private javax.swing.JPanel background4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbIniciar;
    private javax.swing.JButton jbRegistrarse;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
