
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BibliotecaDigital = new javax.swing.JLabel();
        InicioSesion = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        jtfContrasena = new javax.swing.JTextField();
        Contrasena = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbIniciar = new javax.swing.JButton();
        BibliotecaDigital1 = new javax.swing.JLabel();
        jbRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(7, 15, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lIbro_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(82, 82, 82))
        );

        BibliotecaDigital.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(7, 15, 43));
        BibliotecaDigital.setText("Biblioteca Digital");

        InicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        InicioSesion.setForeground(new java.awt.Color(7, 15, 43));
        InicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSesion.setText("Inicio de Sesión");

        Usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(7, 15, 43));
        Usuario.setText("Usuario:");

        jtfContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContrasenaActionPerformed(evt);
            }
        });

        Contrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contrasena.setForeground(new java.awt.Color(7, 15, 43));
        Contrasena.setText("Contraseña:");

        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(7, 15, 43));
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbIniciar.setBackground(new java.awt.Color(7, 15, 43));
        jbIniciar.setForeground(new java.awt.Color(255, 255, 255));
        jbIniciar.setText("Iniciar");
        jbIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarActionPerformed(evt);
            }
        });

        BibliotecaDigital1.setForeground(new java.awt.Color(7, 15, 43));
        BibliotecaDigital1.setText("Gustavo Christian Espinoza Cuevas");

        jbRegistrarse.setBackground(new java.awt.Color(27, 26, 85));
        jbRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrarse.setText("Registrarse");
        jbRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(InicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 82, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(BibliotecaDigital1)
                                        .addGap(152, 152, 152))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Contrasena)
                                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfContrasena)
                                            .addComponent(jtfUsuario)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                                .addComponent(jbIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jbRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)))
                                        .addGap(73, 73, 73))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BibliotecaDigital)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BibliotecaDigital)
                .addGap(27, 27, 27)
                .addComponent(InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(Usuario)
                .addGap(24, 24, 24)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contrasena)
                .addGap(18, 18, 18)
                .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbIniciar))
                .addGap(18, 18, 18)
                .addComponent(jbRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BibliotecaDigital1)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbIniciarActionPerformed(java.awt.event.ActionEvent evt) {                                          
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
    }

    private void jbRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {
        RegistroFrame registroFrame = new RegistroFrame(this);
        registroFrame.setVisible(true);
        this.dispose();
    }

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jtfContrasenaActionPerformed(java.awt.event.ActionEvent evt) {
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
    private javax.swing.JLabel BibliotecaDigital;
    private javax.swing.JLabel BibliotecaDigital1;
    private javax.swing.JLabel Contrasena;
    private javax.swing.JLabel InicioSesion;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbIniciar;
    private javax.swing.JButton jbRegistrarse;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
