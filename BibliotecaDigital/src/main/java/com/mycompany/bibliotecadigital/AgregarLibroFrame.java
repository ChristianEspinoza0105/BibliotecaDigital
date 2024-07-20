
package com.mycompany.bibliotecadigital;

import model.Libro;
import dao.LibroDAO;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AgregarLibroFrame extends javax.swing.JFrame {
    private LibroDAO libroDAO;
    int xMouse, yMouse;

    public AgregarLibroFrame() {
        initComponents();
        libroDAO = new LibroDAO();
    }
    
    private void limpiarCampos() {
        jtaTitulo.setText("");
        jtaAutor.setText("");
        jtaPDF.setText("");
        jtaImg.setText("");
        jtaResumen.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contrasena2 = new javax.swing.JLabel();
        jtfContrasena2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        background2 = new javax.swing.JPanel();
        BibliotecaDigital = new javax.swing.JLabel();
        RegistrarLabel = new javax.swing.JLabel();
        TituloLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaTitulo = new javax.swing.JTextArea();
        AutorLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaAutor = new javax.swing.JTextArea();
        ResumenLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaResumen = new javax.swing.JTextArea();
        PDFLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaPDF = new javax.swing.JTextArea();
        IMGLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaImg = new javax.swing.JTextArea();
        jbAgregar = new javax.swing.JButton();
        jbRegresar = new javax.swing.JButton();
        background3 = new javax.swing.JPanel();
        background4 = new javax.swing.JPanel();
        OpcionesPanel3 = new javax.swing.JPanel();
        PanelRegresa = new javax.swing.JPanel();
        LabelRegresa = new javax.swing.JLabel();
        PanelCerrar = new javax.swing.JPanel();
        LabelCerrar = new javax.swing.JLabel();

        Contrasena2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Contrasena2.setForeground(new java.awt.Color(7, 15, 43));
        Contrasena2.setText("Ruta PDF:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1340, 870));
        jPanel1.setPreferredSize(new java.awt.Dimension(1340, 870));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background2.setBackground(new java.awt.Color(7, 15, 43));

        BibliotecaDigital.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(255, 255, 255));
        BibliotecaDigital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital.setText("Biblioteca Digital");
        BibliotecaDigital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BibliotecaDigitalMouseClicked(evt);
            }
        });

        RegistrarLabel.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        RegistrarLabel.setForeground(new java.awt.Color(146, 144, 195));
        RegistrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistrarLabel.setText("Registrar Libro");

        TituloLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        TituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel.setText("Titulo");

        jtaTitulo.setColumns(20);
        jtaTitulo.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        jtaTitulo.setRows(5);
        jScrollPane1.setViewportView(jtaTitulo);

        AutorLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        AutorLabel.setForeground(new java.awt.Color(255, 255, 255));
        AutorLabel.setText("Autor");

        jtaAutor.setColumns(20);
        jtaAutor.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        jtaAutor.setRows(5);
        jScrollPane2.setViewportView(jtaAutor);

        ResumenLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        ResumenLabel.setForeground(new java.awt.Color(255, 255, 255));
        ResumenLabel.setText("Resumen");

        jtaResumen.setColumns(20);
        jtaResumen.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        jtaResumen.setRows(5);
        jScrollPane3.setViewportView(jtaResumen);

        PDFLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        PDFLabel.setForeground(new java.awt.Color(255, 255, 255));
        PDFLabel.setText("Ruta PDF");

        jtaPDF.setColumns(20);
        jtaPDF.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        jtaPDF.setRows(5);
        jScrollPane4.setViewportView(jtaPDF);

        IMGLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        IMGLabel.setForeground(new java.awt.Color(255, 255, 255));
        IMGLabel.setText("Ruta IMG");

        jtaImg.setColumns(20);
        jtaImg.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        jtaImg.setRows(5);
        jScrollPane5.setViewportView(jtaImg);

        jbAgregar.setBackground(new java.awt.Color(83, 92, 145));
        jbAgregar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbRegresar.setBackground(new java.awt.Color(83, 92, 145));
        jbRegresar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegresar.setText("Regresar");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, background2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(RegistrarLabel)
                                .addGap(244, 244, 244)
                                .addComponent(BibliotecaDigital, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ResumenLabel)
                            .addComponent(PDFLabel)
                            .addComponent(IMGLabel)
                            .addComponent(AutorLabel)
                            .addComponent(TituloLabel)
                            .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, background2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jbRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BibliotecaDigital, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(background2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RegistrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AutorLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ResumenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PDFLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IMGLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbRegresar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 860, 790));

        background3.setBackground(new java.awt.Color(27, 26, 85));
        background3.setPreferredSize(new java.awt.Dimension(510, 620));
        background3.setLayout(new javax.swing.BoxLayout(background3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 860, 790));

        background4.setBackground(new java.awt.Color(83, 92, 145));
        background4.setPreferredSize(new java.awt.Dimension(510, 620));
        background4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(background4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 860, 790));

        OpcionesPanel3.setBackground(new java.awt.Color(255, 255, 255));
        OpcionesPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                OpcionesPanel3MouseDragged(evt);
            }
        });
        OpcionesPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OpcionesPanel3MousePressed(evt);
            }
        });

        PanelRegresa.setBackground(new java.awt.Color(255, 255, 255));
        PanelRegresa.setAlignmentY(0.4F);
        PanelRegresa.setPreferredSize(new java.awt.Dimension(54, 33));
        PanelRegresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelRegresaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelRegresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelRegresaMouseExited(evt);
            }
        });

        LabelRegresa.setFont(new java.awt.Font("Roboto Black", 0, 28)); // NOI18N
        LabelRegresa.setForeground(new java.awt.Color(0, 0, 0));
        LabelRegresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelRegresa.setText("<");
        LabelRegresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelRegresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelRegresaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelRegresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelRegresaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelRegresaLayout = new javax.swing.GroupLayout(PanelRegresa);
        PanelRegresa.setLayout(PanelRegresaLayout);
        PanelRegresaLayout.setHorizontalGroup(
            PanelRegresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRegresa, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelRegresaLayout.setVerticalGroup(
            PanelRegresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegresaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelRegresa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

        javax.swing.GroupLayout OpcionesPanel3Layout = new javax.swing.GroupLayout(OpcionesPanel3);
        OpcionesPanel3.setLayout(OpcionesPanel3Layout);
        OpcionesPanel3Layout.setHorizontalGroup(
            OpcionesPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesPanel3Layout.createSequentialGroup()
                .addComponent(PanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelRegresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1226, Short.MAX_VALUE))
        );
        OpcionesPanel3Layout.setVerticalGroup(
            OpcionesPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesPanel3Layout.createSequentialGroup()
                .addGroup(OpcionesPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelRegresa, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(PanelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(OpcionesPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        this.dispose();
        menuAdminFrame adminFrame = new menuAdminFrame();
        adminFrame.setVisible(true);
    }//GEN-LAST:event_jbRegresarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        String titulo = jtaTitulo.getText().trim();
        String autor = jtaAutor.getText().trim();
        String pdfPath = jtaPDF.getText().trim();
        String imagenPath = jtaImg.getText().trim();
        String resumen = jtaResumen.getText().trim();

        if (titulo.isEmpty() || autor.isEmpty() || pdfPath.isEmpty() || imagenPath.isEmpty() || resumen.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Libro libro = new Libro(titulo, autor, pdfPath, imagenPath, resumen);

        libroDAO.agregarLibro(libro);

        limpiarCampos();
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void LabelRegresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegresaMouseClicked
        menuAdminFrame menuAdminFrame = new menuAdminFrame();
        menuAdminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LabelRegresaMouseClicked

    private void LabelRegresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegresaMouseEntered
        PanelRegresa.setBackground(new Color(57, 153, 24));
        LabelRegresa.setForeground(Color.white);
    }//GEN-LAST:event_LabelRegresaMouseEntered

    private void LabelRegresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegresaMouseExited
        PanelRegresa.setBackground(Color.white);
        LabelRegresa.setForeground(Color.black);
    }//GEN-LAST:event_LabelRegresaMouseExited

    private void PanelRegresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRegresaMouseClicked
        menuAdminFrame menuAdminFrame = new menuAdminFrame();
        menuAdminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PanelRegresaMouseClicked

    private void PanelRegresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRegresaMouseEntered
        PanelRegresa.setBackground(new Color(57, 153, 24));
        LabelRegresa.setForeground(Color.white);
    }//GEN-LAST:event_PanelRegresaMouseEntered

    private void PanelRegresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRegresaMouseExited
        PanelRegresa.setBackground(Color.white);
        LabelRegresa.setForeground(Color.black);
    }//GEN-LAST:event_PanelRegresaMouseExited

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

    private void OpcionesPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionesPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_OpcionesPanel3MouseDragged

    private void OpcionesPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionesPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_OpcionesPanel3MousePressed

    private void BibliotecaDigitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BibliotecaDigitalMouseClicked
        this.dispose();
        menuAdminFrame adminFrame = new menuAdminFrame();
        adminFrame.setVisible(true);  
    }//GEN-LAST:event_BibliotecaDigitalMouseClicked

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
            java.util.logging.Logger.getLogger(AgregarLibroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLibroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLibroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLibroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLibroFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutorLabel;
    private javax.swing.JLabel BibliotecaDigital;
    private javax.swing.JLabel Contrasena2;
    private javax.swing.JLabel IMGLabel;
    private javax.swing.JLabel LabelCerrar;
    private javax.swing.JLabel LabelRegresa;
    private javax.swing.JPanel OpcionesPanel3;
    private javax.swing.JLabel PDFLabel;
    private javax.swing.JPanel PanelCerrar;
    private javax.swing.JPanel PanelRegresa;
    private javax.swing.JLabel RegistrarLabel;
    private javax.swing.JLabel ResumenLabel;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JPanel background2;
    private javax.swing.JPanel background3;
    private javax.swing.JPanel background4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JTextArea jtaAutor;
    private javax.swing.JTextArea jtaImg;
    private javax.swing.JTextArea jtaPDF;
    private javax.swing.JTextArea jtaResumen;
    private javax.swing.JTextArea jtaTitulo;
    private javax.swing.JTextField jtfContrasena2;
    // End of variables declaration//GEN-END:variables
}
