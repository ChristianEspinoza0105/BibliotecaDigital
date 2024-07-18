package com.mycompany.bibliotecadigital;

public class RegistroFrame extends javax.swing.JFrame {

    private InicioFrame principalFrame;
    
    public RegistroFrame(InicioFrame principalFrame) {
        this.principalFrame = principalFrame;
        initComponents();
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
        jbRegresar = new javax.swing.JButton();
        jbRegistro = new javax.swing.JButton();
        BibliotecaDigital1 = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(7, 15, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(83, 83, 83))
        );

        BibliotecaDigital.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(7, 15, 43));
        BibliotecaDigital.setText("Biblioteca Digital");

        InicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        InicioSesion.setForeground(new java.awt.Color(7, 15, 43));
        InicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InicioSesion.setText("Registro de Usuario");

        Usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(7, 15, 43));
        Usuario.setText("Usuario:");

        Contrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contrasena.setForeground(new java.awt.Color(7, 15, 43));
        Contrasena.setText("Contraseña:");

        jbRegresar.setBackground(new java.awt.Color(7, 15, 43));
        jbRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegresar.setText("Regresar");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });

        jbRegistro.setBackground(new java.awt.Color(7, 15, 43));
        jbRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistro.setText("Registrarse");
        jbRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistroActionPerformed(evt);
            }
        });

        BibliotecaDigital1.setForeground(new java.awt.Color(7, 15, 43));
        BibliotecaDigital1.setText("Gustavo Christian Espinoza Cuevas");

        jlEstado.setForeground(new java.awt.Color(7, 15, 43));
        jlEstado.setText("Ingrese los Siguientes Datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(InicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BibliotecaDigital)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Contrasena)
                                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfContrasena)
                                    .addComponent(jtfUsuario)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                        .addComponent(jbRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BibliotecaDigital1)
                                .addGap(152, 152, 152))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlEstado)
                                .addGap(180, 180, 180))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BibliotecaDigital)
                .addGap(29, 29, 29)
                .addComponent(InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario)
                .addGap(18, 18, 18)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contrasena)
                .addGap(18, 18, 18)
                .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegresar)
                    .addComponent(jbRegistro))
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

    private void jbRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistroActionPerformed
        String usuario = jtfUsuario.getText();
        String contrasena = jtfContrasena.getText();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            jlEstado.setText("Usuario y Contraseña no pueden estar vacíos.");
        } else {
            principalFrame.agregarUsuario(usuario, contrasena);
            principalFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbRegistroActionPerformed

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        InicioFrame PrincipalFrame = new InicioFrame();
        PrincipalFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbRegresarActionPerformed

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
    private javax.swing.JLabel BibliotecaDigital1;
    private javax.swing.JLabel Contrasena;
    private javax.swing.JLabel InicioSesion;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbRegistro;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
