package com.mycompany.bibliotecadigital;

import dao.DatabaseManager;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Usuario;

public class RegistroFrame extends javax.swing.JFrame {


    private InicioFrame principalFrame;
    private DatabaseManager dbManager;
    int xMouse, yMouse;
    
    public RegistroFrame(InicioFrame principalFrame) {
        this.principalFrame = principalFrame;
        this.dbManager = new DatabaseManager();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        OpcionesPanel = new javax.swing.JPanel();
        PanelRegresar = new javax.swing.JPanel();
        LabelRegresar = new javax.swing.JLabel();
        PanelCerrar = new javax.swing.JPanel();
        LabelCerrar = new javax.swing.JLabel();
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

        OpcionesPanel.setBackground(new java.awt.Color(255, 255, 255));
        OpcionesPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                OpcionesPanelMouseDragged(evt);
            }
        });
        OpcionesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OpcionesPanelMousePressed(evt);
            }
        });

        PanelRegresar.setBackground(new java.awt.Color(255, 255, 255));
        PanelRegresar.setAlignmentY(0.4F);
        PanelRegresar.setPreferredSize(new java.awt.Dimension(54, 33));
        PanelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelRegresarMouseExited(evt);
            }
        });

        LabelRegresar.setFont(new java.awt.Font("Roboto Black", 0, 28)); // NOI18N
        LabelRegresar.setForeground(new java.awt.Color(0, 0, 0));
        LabelRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelRegresar.setText("<");
        LabelRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelRegresarLayout = new javax.swing.GroupLayout(PanelRegresar);
        PanelRegresar.setLayout(PanelRegresarLayout);
        PanelRegresarLayout.setHorizontalGroup(
            PanelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelRegresarLayout.setVerticalGroup(
            PanelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegresarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCerrarLayout.setVerticalGroup(
            PanelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OpcionesPanelLayout = new javax.swing.GroupLayout(OpcionesPanel);
        OpcionesPanel.setLayout(OpcionesPanelLayout);
        OpcionesPanelLayout.setHorizontalGroup(
            OpcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesPanelLayout.createSequentialGroup()
                .addComponent(PanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1226, Short.MAX_VALUE))
        );
        OpcionesPanelLayout.setVerticalGroup(
            OpcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesPanelLayout.createSequentialGroup()
                .addGroup(OpcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(PanelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        background.add(OpcionesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 40));

        BibliotecaDigital.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(7, 15, 43));
        BibliotecaDigital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital.setText("Biblioteca Digital");
        background.add(BibliotecaDigital, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, -1, -1));

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
        background.add(ImagenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 790));

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
        jtfUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jtfUsuario.setText("Escribir su nombre de usuario...");
        jtfUsuario.setToolTipText("");
        jtfUsuario.setBorder(null);
        jtfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfUsuarioMousePressed(evt);
            }
        });
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        background.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 680, 60));

        ContraseñaLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        ContraseñaLabel.setForeground(new java.awt.Color(7, 15, 43));
        ContraseñaLabel.setText("Contraseña");
        background.add(ContraseñaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        SeparatorContraseña.setBackground(new java.awt.Color(0, 0, 0));
        background.add(SeparatorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 690, 10));

        jtfContrasena.setBackground(new java.awt.Color(255, 255, 255));
        jtfContrasena.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfContrasena.setForeground(new java.awt.Color(204, 204, 204));
        jtfContrasena.setText("Escribir su contraseña...");
        jtfContrasena.setToolTipText("");
        jtfContrasena.setBorder(null);
        jtfContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfContrasenaMousePressed(evt);
            }
        });
        jtfContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContrasenaActionPerformed(evt);
            }
        });
        background.add(jtfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 680, 60));

        jbRegistro.setBackground(new java.awt.Color(7, 15, 43));
        jbRegistro.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistro.setText("Registrarse");
        jbRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbRegistroMouseExited(evt);
            }
        });
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
                Usuario nuevoUsuario = new Usuario(usuario, contrasena);
                dbManager.agregarUsuario(nuevoUsuario);
                principalFrame.setVisible(true);
                this.dispose();
            }
    }//GEN-LAST:event_jbRegistroActionPerformed

    private void LabelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegresarMouseClicked
        InicioFrame InicioFrame = new InicioFrame();
        InicioFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelRegresarMouseClicked

    private void LabelRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegresarMouseEntered
        PanelRegresar.setBackground(new Color(57, 153, 24));
        LabelRegresar.setForeground(Color.white);
    }//GEN-LAST:event_LabelRegresarMouseEntered

    private void LabelRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegresarMouseExited
        PanelRegresar.setBackground(Color.white);
        LabelRegresar.setForeground(Color.black);
    }//GEN-LAST:event_LabelRegresarMouseExited

    private void PanelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRegresarMouseClicked
        InicioFrame InicioFrame = new InicioFrame();
        InicioFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PanelRegresarMouseClicked

    private void PanelRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRegresarMouseEntered
        PanelRegresar.setBackground(new Color(57, 153, 24));
        LabelRegresar.setForeground(Color.white);
    }//GEN-LAST:event_PanelRegresarMouseEntered

    private void PanelRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRegresarMouseExited
        PanelRegresar.setBackground(Color.white);
        LabelRegresar.setForeground(Color.black);
    }//GEN-LAST:event_PanelRegresarMouseExited

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

    private void OpcionesPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionesPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_OpcionesPanelMouseDragged

    private void OpcionesPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionesPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_OpcionesPanelMousePressed

    private void jbRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistroMouseEntered
        jbRegistro.setBackground(new Color(27, 26, 85));
    }//GEN-LAST:event_jbRegistroMouseEntered

    private void jbRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistroMouseExited
        jbRegistro.setBackground(new Color(146, 144, 195));
    }//GEN-LAST:event_jbRegistroMouseExited

    private void jtfUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsuarioMousePressed
        if (jtfUsuario.getText().equals("Escribir su nombre de usuario...")) {
            jtfUsuario.setText("");
            jtfUsuario.setForeground(Color.black);
        }

        if (jtfContrasena.getText().isEmpty()) {
            jtfContrasena.setText("Escribir su contraseña...");
            jtfContrasena.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtfUsuarioMousePressed

    private void jtfContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfContrasenaMousePressed
        if (jtfContrasena.getText().equals("Escribir su contraseña...")) {
            jtfContrasena.setText("");
            jtfContrasena.setForeground(Color.black);
        }

        if (jtfUsuario.getText().isEmpty()) {
            jtfUsuario.setText("Escribir su nombre de usuario...");
            jtfUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtfContrasenaMousePressed

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
    private javax.swing.JLabel LabelCerrar;
    private javax.swing.JLabel LabelRegresar;
    private javax.swing.JPanel OpcionesPanel;
    private javax.swing.JPanel PanelCerrar;
    private javax.swing.JPanel PanelRegresar;
    private javax.swing.JLabel RegistrarseLabel;
    private javax.swing.JPanel RegistrarsePanel;
    private javax.swing.JSeparator SeparatorContraseña;
    private javax.swing.JSeparator SeparatorUsuario;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JPanel background;
    private javax.swing.JButton jbRegistro;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
