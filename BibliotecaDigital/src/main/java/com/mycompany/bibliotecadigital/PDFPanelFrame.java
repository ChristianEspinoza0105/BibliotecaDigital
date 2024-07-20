package com.mycompany.bibliotecadigital;

import java.awt.Graphics;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.rendering.ImageType;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class PDFPanelFrame extends javax.swing.JFrame {

   private BufferedImage currentPageImage;
    private PDDocument document;
    private PDFRenderer pdfRenderer;
    private int currentPage;

    public PDFPanelFrame(String titulo, String pdfPath) {
        initComponents();
        try {
            document = PDDocument.load(new File(pdfPath));
            pdfRenderer = new PDFRenderer(document);
            currentPage = 0;
            renderPage(currentPage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public PDDocument getDocument() {
        return document;
    }

    private void renderPage(int pageIndex) {
        new Thread(() -> {
            try {
                BufferedImage image = pdfRenderer.renderImageWithDPI(pageIndex, 100, ImageType.RGB);
                SwingUtilities.invokeLater(() -> {
                    Graphics g = JPPDF.getGraphics();
                    if (image != null && g != null) {
                        g.drawImage(image, 0, 0, JPPDF.getWidth(), JPPDF.getHeight(), null);
                        g.dispose();
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        fondolibro1 = new javax.swing.JPanel();
        jbMenosZoom = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jbAdelante = new javax.swing.JButton();
        jbZoom = new javax.swing.JButton();
        JPPDF = new javax.swing.JPanel();
        fondolibro2 = new javax.swing.JPanel();
        fondolibro3 = new javax.swing.JPanel();
        BibliotecaDigital = new javax.swing.JLabel();
        PalabraLabel = new javax.swing.JLabel();
        jtfBuscarPalabra = new javax.swing.JTextField();
        SeparatorPalabra = new javax.swing.JSeparator();
        PaginaLabel = new javax.swing.JLabel();
        jtfBuscarPagina = new javax.swing.JTextField();
        SeparatorPagina = new javax.swing.JSeparator();
        jbSalir = new javax.swing.JButton();
        jbBuscarPagina = new javax.swing.JButton();
        jbBuscarPalabra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1340, 870));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondolibro1.setBackground(new java.awt.Color(7, 15, 43));

        jbMenosZoom.setBackground(new java.awt.Color(255, 255, 255));
        jbMenosZoom.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbMenosZoom.setForeground(new java.awt.Color(7, 15, 43));
        jbMenosZoom.setText("-");
        jbMenosZoom.setBorder(null);
        jbMenosZoom.setBorderPainted(false);
        jbMenosZoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMenosZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenosZoomActionPerformed(evt);
            }
        });

        jbAtras.setBackground(new java.awt.Color(255, 255, 255));
        jbAtras.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbAtras.setForeground(new java.awt.Color(7, 15, 43));
        jbAtras.setText("<-");
        jbAtras.setBorder(null);
        jbAtras.setBorderPainted(false);
        jbAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        jbAdelante.setBackground(new java.awt.Color(255, 255, 255));
        jbAdelante.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbAdelante.setForeground(new java.awt.Color(7, 15, 43));
        jbAdelante.setText("->");
        jbAdelante.setBorder(null);
        jbAdelante.setBorderPainted(false);
        jbAdelante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdelanteActionPerformed(evt);
            }
        });

        jbZoom.setBackground(new java.awt.Color(255, 255, 255));
        jbZoom.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbZoom.setForeground(new java.awt.Color(7, 15, 43));
        jbZoom.setText("+");
        jbZoom.setBorder(null);
        jbZoom.setBorderPainted(false);
        jbZoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbZoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPPDFLayout = new javax.swing.GroupLayout(JPPDF);
        JPPDF.setLayout(JPPDFLayout);
        JPPDFLayout.setHorizontalGroup(
            JPPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        JPPDFLayout.setVerticalGroup(
            JPPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondolibro1Layout = new javax.swing.GroupLayout(fondolibro1);
        fondolibro1.setLayout(fondolibro1Layout);
        fondolibro1Layout.setHorizontalGroup(
            fondolibro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondolibro1Layout.createSequentialGroup()
                .addContainerGap(474, Short.MAX_VALUE)
                .addComponent(jbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jbAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jbZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jbMenosZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(fondolibro1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(JPPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondolibro1Layout.setVerticalGroup(
            fondolibro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondolibro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondolibro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMenosZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        background.add(fondolibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 630, 870));

        fondolibro2.setBackground(new java.awt.Color(27, 26, 85));
        fondolibro2.setPreferredSize(new java.awt.Dimension(510, 620));
        fondolibro2.setLayout(new javax.swing.BoxLayout(fondolibro2, javax.swing.BoxLayout.LINE_AXIS));
        background.add(fondolibro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 630, 870));

        fondolibro3.setBackground(new java.awt.Color(83, 92, 145));
        fondolibro3.setPreferredSize(new java.awt.Dimension(510, 620));
        fondolibro3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(fondolibro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 630, 870));

        BibliotecaDigital.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(0, 0, 0));
        BibliotecaDigital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital.setText("Biblioteca Digital");
        background.add(BibliotecaDigital, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 310, 60));

        PalabraLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        PalabraLabel.setForeground(new java.awt.Color(7, 15, 43));
        PalabraLabel.setText("Buscar Palabra:");
        background.add(PalabraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 280, -1));

        jtfBuscarPalabra.setBackground(new java.awt.Color(255, 255, 255));
        jtfBuscarPalabra.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfBuscarPalabra.setToolTipText("");
        jtfBuscarPalabra.setBorder(null);
        jtfBuscarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarPalabraActionPerformed(evt);
            }
        });
        background.add(jtfBuscarPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 440, 60));

        SeparatorPalabra.setBackground(new java.awt.Color(0, 0, 0));
        background.add(SeparatorPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 540, 10));

        PaginaLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        PaginaLabel.setForeground(new java.awt.Color(7, 15, 43));
        PaginaLabel.setText("Buscar Página:");
        background.add(PaginaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 250, -1));

        jtfBuscarPagina.setBackground(new java.awt.Color(255, 255, 255));
        jtfBuscarPagina.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfBuscarPagina.setToolTipText("");
        jtfBuscarPagina.setBorder(null);
        jtfBuscarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarPaginaActionPerformed(evt);
            }
        });
        background.add(jtfBuscarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 440, 60));

        SeparatorPagina.setBackground(new java.awt.Color(0, 0, 0));
        background.add(SeparatorPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 540, 10));

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
        background.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jbBuscarPagina.setBackground(new java.awt.Color(146, 144, 195));
        jbBuscarPagina.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbBuscarPagina.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar_icon.png"))); // NOI18N
        jbBuscarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPaginaActionPerformed(evt);
            }
        });
        background.add(jbBuscarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 330, 60, 40));

        jbBuscarPalabra.setBackground(new java.awt.Color(146, 144, 195));
        jbBuscarPalabra.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbBuscarPalabra.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarPalabra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar_icon.png"))); // NOI18N
        jbBuscarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPalabraActionPerformed(evt);
            }
        });
        background.add(jbBuscarPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 200, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        try {
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfBuscarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarPalabraActionPerformed
    }//GEN-LAST:event_jtfBuscarPalabraActionPerformed

    private void jbMenosZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenosZoomActionPerformed

    }//GEN-LAST:event_jbMenosZoomActionPerformed

    private void jtfBuscarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarPaginaActionPerformed
    }//GEN-LAST:event_jtfBuscarPaginaActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        if (currentPage > 0) {
           currentPage--;
           System.out.println("Página actual después de retroceder: " + currentPage);
           renderPage(currentPage);
       } else {
           System.out.println("Ya estás en la primera página.");
       }
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void jbAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdelanteActionPerformed
        if (currentPage < document.getNumberOfPages() - 1) {
            currentPage++;
            System.out.println("Página actual después de avanzar: " + currentPage);
            renderPage(currentPage);
        } else {
            System.out.println("Ya estás en la última página.");
        }
    }//GEN-LAST:event_jbAdelanteActionPerformed

    private void jbZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZoomActionPerformed

    }//GEN-LAST:event_jbZoomActionPerformed

    private void jbBuscarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPaginaActionPerformed

    }//GEN-LAST:event_jbBuscarPaginaActionPerformed

    private void jbBuscarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPalabraActionPerformed

    }//GEN-LAST:event_jbBuscarPalabraActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PDFPanelFrame("Título del PDF", "path/to/your/pdf.pdf").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BibliotecaDigital;
    private javax.swing.JPanel JPPDF;
    private javax.swing.JLabel PaginaLabel;
    private javax.swing.JLabel PalabraLabel;
    private javax.swing.JSeparator SeparatorPagina;
    private javax.swing.JSeparator SeparatorPalabra;
    private javax.swing.JPanel background;
    private javax.swing.JPanel fondolibro1;
    private javax.swing.JPanel fondolibro2;
    private javax.swing.JPanel fondolibro3;
    private javax.swing.JButton jbAdelante;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbBuscarPagina;
    private javax.swing.JButton jbBuscarPalabra;
    private javax.swing.JButton jbMenosZoom;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbZoom;
    private javax.swing.JTextField jtfBuscarPagina;
    private javax.swing.JTextField jtfBuscarPalabra;
    // End of variables declaration//GEN-END:variables
}
