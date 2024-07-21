
package com.mycompany.bibliotecadigital;

import dao.DatabaseManager;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Usuario;

public class InicioFrame extends javax.swing.JFrame {

    private DatabaseManager dbManager;
    int xMouse, yMouse;
        
    public InicioFrame() {
        this.dbManager = new DatabaseManager();
        initComponents();
    }
    
    public void agregarUsuario(String usuario, String contrasena) {
        Usuario nuevoUsuario = new Usuario(usuario, contrasena);
        dbManager.agregarUsuario(nuevoUsuario);
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
        jLabel1 = new javax.swing.JLabel();
        RegistrarsePanel = new javax.swing.JPanel();
        OpcionesPanel = new javax.swing.JPanel();
        PanelCerrar = new javax.swing.JPanel();
        LabelCerrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

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
        jtfContrasena.setForeground(new java.awt.Color(204, 204, 204));
        jtfContrasena.setText("Escribir su contraseña...");
        jtfContrasena.setToolTipText("");
        jtfContrasena.setBorder(null);
        jtfContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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

        ContraseñaLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        ContraseñaLabel.setForeground(new java.awt.Color(255, 255, 255));
        ContraseñaLabel.setText("Contraseña");

        UsuarioLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioLabel.setText("Nombre de Usuario");

        jtfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsuario.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jtfUsuario.setText("Escribir su nombre de usuario...");
        jtfUsuario.setToolTipText("");
        jtfUsuario.setBorder(null);
        jtfUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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

        jbRegistrarse.setBackground(new java.awt.Color(83, 92, 145));
        jbRegistrarse.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrarse.setText("Registrarse");
        jbRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbRegistrarseMouseExited(evt);
            }
        });
        jbRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarseActionPerformed(evt);
            }
        });

        jbIniciar.setBackground(new java.awt.Color(27, 26, 85));
        jbIniciar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbIniciar.setForeground(new java.awt.Color(255, 255, 255));
        jbIniciar.setText("Iniciar");
        jbIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbIniciarMouseExited(evt);
            }
        });
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

        background.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 660, 630));

        background3.setBackground(new java.awt.Color(27, 26, 85));
        background3.setPreferredSize(new java.awt.Dimension(510, 620));
        background3.setLayout(new javax.swing.BoxLayout(background3, javax.swing.BoxLayout.LINE_AXIS));
        background.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 660, 630));

        background4.setBackground(new java.awt.Color(83, 92, 145));
        background4.setPreferredSize(new java.awt.Dimension(510, 620));
        background4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 660, 630));

        BibliotecaDigital2.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        BibliotecaDigital2.setForeground(new java.awt.Color(7, 15, 43));
        BibliotecaDigital2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital2.setText("Biblioteca Digital");
        background.add(BibliotecaDigital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 60));

        jLabel1.setFont(new java.awt.Font("Roboto Thin", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¿Necesitas ayuda? ¡Estamos aquí para ti! Haz clic aquí para obtener asistencia inmediata.  ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 830, -1, 40));

        RegistrarsePanel.setBackground(new java.awt.Color(7, 15, 43));

        javax.swing.GroupLayout RegistrarsePanelLayout = new javax.swing.GroupLayout(RegistrarsePanel);
        RegistrarsePanel.setLayout(RegistrarsePanelLayout);
        RegistrarsePanelLayout.setHorizontalGroup(
            RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
        );
        RegistrarsePanelLayout.setVerticalGroup(
            RegistrarsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        background.add(RegistrarsePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 820, 1210, 10));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesPanelLayout.createSequentialGroup()
                .addGap(0, 1295, Short.MAX_VALUE)
                .addComponent(PanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        OpcionesPanelLayout.setVerticalGroup(
            OpcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesPanelLayout.createSequentialGroup()
                .addComponent(PanelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(OpcionesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("¡Estás a solo un paso de descubrir un mundo de libros a tu alcance! Crea tu cuenta y comienza a explorar nuestra biblioteca digital hoy mismo.");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 780, -1, 30));

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

        if (dbManager.verificarCredenciales(usuario, contrasena)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso como usuario.");
            menuUserFrame userFrame = new menuUserFrame();
            userFrame.setVisible(true);
            this.dispose();
        } else if (dbManager.verificarCredencialesAdmin(usuario, contrasena)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso como administrador.");
            menuAdminFrame adminFrame = new menuAdminFrame();
            adminFrame.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
        }
    }//GEN-LAST:event_jbIniciarActionPerformed

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

    private void jbIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIniciarMouseEntered
        jbIniciar.setBackground(new Color(83, 92, 145));
    }//GEN-LAST:event_jbIniciarMouseEntered

    private void jbIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIniciarMouseExited
        jbIniciar.setBackground(new Color(27, 26, 85));
    }//GEN-LAST:event_jbIniciarMouseExited

    private void jbRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrarseMouseEntered
        jbRegistrarse.setBackground(new Color(27, 26, 85));
    }//GEN-LAST:event_jbRegistrarseMouseEntered

    private void jbRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrarseMouseExited
        jbRegistrarse.setBackground(new Color(83, 92, 145));
    }//GEN-LAST:event_jbRegistrarseMouseExited

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
            jLabel1.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
            jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jLabel1MouseExited


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
    private javax.swing.JLabel LabelCerrar;
    private javax.swing.JPanel OpcionesPanel;
    private javax.swing.JPanel PanelCerrar;
    private javax.swing.JPanel RegistrarsePanel;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JPanel background;
    private javax.swing.JPanel background2;
    private javax.swing.JPanel background3;
    private javax.swing.JPanel background4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbIniciar;
    private javax.swing.JButton jbRegistrarse;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
