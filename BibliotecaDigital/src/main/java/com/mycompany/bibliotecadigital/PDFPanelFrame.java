package com.mycompany.bibliotecadigital;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.rendering.ImageType;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFPanelFrame extends javax.swing.JFrame {

    private BufferedImage currentPageImage;
    private java.util.List<Integer> matchedPages;
    private int currentMatchIndex;
    private PDDocument document;
    private PDFRenderer pdfRenderer;
    private int currentPage;
    private float zoomLevel;

    
    int xMouse, yMouse;

    public PDFPanelFrame(String titulo, String pdfPath) {
        initComponents();
        zoomLevel = 100f;
        matchedPages = new java.util.ArrayList<>();
        currentMatchIndex = -1;
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
                BufferedImage image = pdfRenderer.renderImageWithDPI(pageIndex, zoomLevel, ImageType.RGB);
                SwingUtilities.invokeLater(() -> {
                    if (image != null) {
                        Graphics2D g2d = (Graphics2D) JPPDF.getGraphics();
                        g2d.clearRect(0, 0, JPPDF.getWidth(), JPPDF.getHeight());
                        double scaleX = (double) JPPDF.getWidth() / image.getWidth();
                        double scaleY = (double) JPPDF.getHeight() / image.getHeight();
                        g2d.scale(scaleX, scaleY);
                        g2d.drawImage(image, 0, 0, null);
                        g2d.dispose();
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
    private void searchWordInPDF(String word) {
        if (document == null) {
            JOptionPane.showMessageDialog(this, "No hay documento cargado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        matchedPages.clear();
        StringBuilder occurrences = new StringBuilder();
        int totalOccurrences = 0;
        try {
            PDFTextStripper stripper = new PDFTextStripper();
            for (int page = 1; page <= document.getNumberOfPages(); page++) {
                stripper.setStartPage(page);
                stripper.setEndPage(page);
                String pageText = stripper.getText(document);
                String[] lines = pageText.split("\n");
                for (int lineNum = 0; lineNum < lines.length; lineNum++) {
                    if (lines[lineNum].contains(word)) {
                        matchedPages.add(page);
                        occurrences.append("Página ").append(page).append(", Renglón ").append(lineNum + 1).append("\n");
                        totalOccurrences++;
                    }
                }
            }

            JFrame resultFrame = new JFrame("Resultados de Búsqueda");
            resultFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            resultFrame.setSize(600, 400);
            resultFrame.setLocationRelativeTo(null);

            JTextArea textArea = new JTextArea();
            textArea.setText("Número total de coincidencias: " + totalOccurrences + "\n\n" + occurrences.toString());
            textArea.setCaretPosition(0);
            textArea.setEditable(false);
            textArea.setLineWrap(true);

            JScrollPane scrollPane = new JScrollPane(textArea);
            resultFrame.add(scrollPane);

            resultFrame.setVisible(true);

            if (totalOccurrences > 0) {
                currentMatchIndex = 0;
                goToCurrentMatch();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el PDF", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


    private void goToCurrentMatch() {
        if (matchedPages.isEmpty() || currentMatchIndex < 0 || currentMatchIndex >= matchedPages.size()) {
            return;
        }
        int pageNumber = matchedPages.get(currentMatchIndex);
        currentPage = pageNumber - 1;
        renderPage(currentPage);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        fondolibro1 = new javax.swing.JPanel();
        jbAtras = new javax.swing.JButton();
        jbAdelante = new javax.swing.JButton();
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
        jbBuscarPagina = new javax.swing.JButton();
        jbBuscarPalabra = new javax.swing.JButton();
        OpcionesPanel = new javax.swing.JPanel();
        PanelRegresar = new javax.swing.JPanel();
        LabelRegresar = new javax.swing.JLabel();
        PanelCerrar = new javax.swing.JPanel();
        LabelCerrar = new javax.swing.JLabel();
        jbMoverPalabraAtras = new javax.swing.JButton();
        jbMoverPalabraAdelante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1340, 870));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondolibro1.setBackground(new java.awt.Color(7, 15, 43));

        jbAtras.setBackground(new java.awt.Color(255, 255, 255));
        jbAtras.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbAtras.setForeground(new java.awt.Color(7, 15, 43));
        jbAtras.setText("<");
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
        jbAdelante.setText(">");
        jbAdelante.setBorder(null);
        jbAdelante.setBorderPainted(false);
        jbAdelante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdelanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPPDFLayout = new javax.swing.GroupLayout(JPPDF);
        JPPDF.setLayout(JPPDFLayout);
        JPPDFLayout.setHorizontalGroup(
            JPPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        JPPDFLayout.setVerticalGroup(
            JPPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondolibro1Layout = new javax.swing.GroupLayout(fondolibro1);
        fondolibro1.setLayout(fondolibro1Layout);
        fondolibro1Layout.setHorizontalGroup(
            fondolibro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondolibro1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondolibro1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(JPPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        fondolibro1Layout.setVerticalGroup(
            fondolibro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondolibro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondolibro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        background.add(fondolibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 690, 920));

        fondolibro2.setBackground(new java.awt.Color(27, 26, 85));
        fondolibro2.setPreferredSize(new java.awt.Dimension(510, 620));
        fondolibro2.setLayout(new javax.swing.BoxLayout(fondolibro2, javax.swing.BoxLayout.LINE_AXIS));
        background.add(fondolibro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 690, 920));

        fondolibro3.setBackground(new java.awt.Color(83, 92, 145));
        fondolibro3.setPreferredSize(new java.awt.Dimension(510, 620));
        fondolibro3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(fondolibro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 690, 920));

        BibliotecaDigital.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        BibliotecaDigital.setForeground(new java.awt.Color(0, 0, 0));
        BibliotecaDigital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2_icon.png"))); // NOI18N
        BibliotecaDigital.setText("Biblioteca Digital");
        BibliotecaDigital.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BibliotecaDigital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BibliotecaDigitalMouseClicked(evt);
            }
        });
        background.add(BibliotecaDigital, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 310, 60));

        PalabraLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        PalabraLabel.setForeground(new java.awt.Color(7, 15, 43));
        PalabraLabel.setText("Buscar Palabra:");
        background.add(PalabraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 270, 50));

        jtfBuscarPalabra.setBackground(new java.awt.Color(255, 255, 255));
        jtfBuscarPalabra.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfBuscarPalabra.setForeground(new java.awt.Color(204, 204, 204));
        jtfBuscarPalabra.setText("Ingresar texto...");
        jtfBuscarPalabra.setToolTipText("");
        jtfBuscarPalabra.setBorder(null);
        jtfBuscarPalabra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfBuscarPalabraMousePressed(evt);
            }
        });
        jtfBuscarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarPalabraActionPerformed(evt);
            }
        });
        background.add(jtfBuscarPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 400, 60));

        SeparatorPalabra.setBackground(new java.awt.Color(0, 0, 0));
        SeparatorPalabra.setForeground(new java.awt.Color(7, 15, 43));
        background.add(SeparatorPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 530, 10));

        PaginaLabel.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        PaginaLabel.setForeground(new java.awt.Color(7, 15, 43));
        PaginaLabel.setText("Buscar Página:");
        background.add(PaginaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 310, 50));

        jtfBuscarPagina.setBackground(new java.awt.Color(255, 255, 255));
        jtfBuscarPagina.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jtfBuscarPagina.setForeground(new java.awt.Color(204, 204, 204));
        jtfBuscarPagina.setText("Ingresar numero de página...");
        jtfBuscarPagina.setToolTipText("");
        jtfBuscarPagina.setBorder(null);
        jtfBuscarPagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfBuscarPaginaMousePressed(evt);
            }
        });
        jtfBuscarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarPaginaActionPerformed(evt);
            }
        });
        background.add(jtfBuscarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 400, 60));

        SeparatorPagina.setBackground(new java.awt.Color(0, 0, 0));
        SeparatorPagina.setForeground(new java.awt.Color(7, 15, 43));
        background.add(SeparatorPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 530, 10));

        jbBuscarPagina.setBackground(new java.awt.Color(146, 144, 195));
        jbBuscarPagina.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jbBuscarPagina.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarPagina.setText("Buscar");
        jbBuscarPagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBuscarPaginaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbBuscarPaginaMouseExited(evt);
            }
        });
        jbBuscarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPaginaActionPerformed(evt);
            }
        });
        background.add(jbBuscarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 330, 100, 40));

        jbBuscarPalabra.setBackground(new java.awt.Color(146, 144, 195));
        jbBuscarPalabra.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jbBuscarPalabra.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarPalabra.setText("Buscar");
        jbBuscarPalabra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBuscarPalabraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbBuscarPalabraMouseExited(evt);
            }
        });
        jbBuscarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPalabraActionPerformed(evt);
            }
        });
        background.add(jbBuscarPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 200, 100, 40));

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
                .addComponent(LabelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

        jbMoverPalabraAtras.setBackground(new java.awt.Color(255, 255, 255));
        jbMoverPalabraAtras.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbMoverPalabraAtras.setForeground(new java.awt.Color(7, 15, 43));
        jbMoverPalabraAtras.setText("<");
        jbMoverPalabraAtras.setBorder(null);
        jbMoverPalabraAtras.setBorderPainted(false);
        jbMoverPalabraAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMoverPalabraAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoverPalabraAtrasActionPerformed(evt);
            }
        });
        background.add(jbMoverPalabraAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 150, 30, 30));

        jbMoverPalabraAdelante.setBackground(new java.awt.Color(255, 255, 255));
        jbMoverPalabraAdelante.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jbMoverPalabraAdelante.setForeground(new java.awt.Color(7, 15, 43));
        jbMoverPalabraAdelante.setText(">");
        jbMoverPalabraAdelante.setBorder(null);
        jbMoverPalabraAdelante.setBorderPainted(false);
        jbMoverPalabraAdelante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMoverPalabraAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoverPalabraAdelanteActionPerformed(evt);
            }
        });
        background.add(jbMoverPalabraAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 150, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfBuscarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarPalabraActionPerformed
    }//GEN-LAST:event_jtfBuscarPalabraActionPerformed

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

    private void jbBuscarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPaginaActionPerformed
        try {
            int pageNumber = Integer.parseInt(jtfBuscarPagina.getText());
            if (pageNumber >= 1 && pageNumber <= document.getNumberOfPages()) {
                currentPage = pageNumber - 1;
                renderPage(currentPage);
            } else {
                JOptionPane.showMessageDialog(this, "Número de página fuera de rango.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número de página válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbBuscarPaginaActionPerformed

    private void jbBuscarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPalabraActionPerformed
        String word = jtfBuscarPalabra.getText();
        if (word == null || word.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese una palabra para buscar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        searchWordInPDF(word);
    }//GEN-LAST:event_jbBuscarPalabraActionPerformed

    private void OpcionesPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionesPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_OpcionesPanelMousePressed

    private void OpcionesPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionesPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_OpcionesPanelMouseDragged

    private void LabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LabelCerrarMouseClicked

    private void PanelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCerrarMouseEntered
        PanelCerrar.setBackground(Color.red);
        LabelCerrar.setForeground(Color.white);
    }//GEN-LAST:event_PanelCerrarMouseEntered

    private void PanelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_PanelCerrarMouseClicked

    private void PanelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCerrarMouseExited
        PanelCerrar.setBackground(Color.white);
        LabelCerrar.setForeground(Color.black);
    }//GEN-LAST:event_PanelCerrarMouseExited

    private void LabelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCerrarMouseExited
        PanelCerrar.setBackground(Color.white);
        LabelCerrar.setForeground(Color.black);
    }//GEN-LAST:event_LabelCerrarMouseExited

    private void LabelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCerrarMouseEntered
        PanelCerrar.setBackground(Color.red);
        LabelCerrar.setForeground(Color.white);
    }//GEN-LAST:event_LabelCerrarMouseEntered

    private void jbBuscarPalabraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarPalabraMouseEntered
        jbBuscarPalabra.setBackground(new Color(27, 26, 85));
    }//GEN-LAST:event_jbBuscarPalabraMouseEntered

    private void jbBuscarPaginaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarPaginaMouseEntered
        jbBuscarPagina.setBackground(new Color(27, 26, 85));
    }//GEN-LAST:event_jbBuscarPaginaMouseEntered

    private void jbBuscarPalabraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarPalabraMouseExited
        jbBuscarPalabra.setBackground(new Color(146, 144, 195));
    }//GEN-LAST:event_jbBuscarPalabraMouseExited

    private void jbBuscarPaginaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarPaginaMouseExited
        jbBuscarPagina.setBackground(new Color(146, 144, 195));
    }//GEN-LAST:event_jbBuscarPaginaMouseExited

    private void jtfBuscarPalabraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuscarPalabraMousePressed
        if (jtfBuscarPalabra.getText().equals("Ingresar texto...")) {
            jtfBuscarPalabra.setText("");
            jtfBuscarPalabra.setForeground(Color.black);
        }

        if (jtfBuscarPagina.getText().isEmpty()) {
            jtfBuscarPagina.setText("Ingresar numero de página...");
            jtfBuscarPagina.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtfBuscarPalabraMousePressed

    private void jtfBuscarPaginaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuscarPaginaMousePressed
        if (jtfBuscarPagina.getText().equals("Ingresar numero de página...")) {
            jtfBuscarPagina.setText("");
            jtfBuscarPagina.setForeground(Color.black);
        }

        if (jtfBuscarPalabra.getText().isEmpty()) {
            jtfBuscarPalabra.setText("Ingresar texto...");
            jtfBuscarPalabra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtfBuscarPaginaMousePressed

    private void LabelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegresarMouseClicked
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

    private void BibliotecaDigitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BibliotecaDigitalMouseClicked
        this.dispose();
        menuAdminFrame adminFrame = new menuAdminFrame();
        adminFrame.setVisible(true);  
    }//GEN-LAST:event_BibliotecaDigitalMouseClicked

    private void jbMoverPalabraAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoverPalabraAtrasActionPerformed
        if (currentMatchIndex > 0) {
            currentMatchIndex--;
            goToCurrentMatch();
        }
    }//GEN-LAST:event_jbMoverPalabraAtrasActionPerformed

    private void jbMoverPalabraAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoverPalabraAdelanteActionPerformed
        if (currentMatchIndex < matchedPages.size() - 1) {
            currentMatchIndex++;
            goToCurrentMatch();
        }
    }//GEN-LAST:event_jbMoverPalabraAdelanteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PDFPanelFrame("Título del PDF", "path/to/your/pdf.pdf").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BibliotecaDigital;
    private javax.swing.JPanel JPPDF;
    private javax.swing.JLabel LabelCerrar;
    private javax.swing.JLabel LabelRegresar;
    private javax.swing.JPanel OpcionesPanel;
    private javax.swing.JLabel PaginaLabel;
    private javax.swing.JLabel PalabraLabel;
    private javax.swing.JPanel PanelCerrar;
    private javax.swing.JPanel PanelRegresar;
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
    private javax.swing.JButton jbMoverPalabraAdelante;
    private javax.swing.JButton jbMoverPalabraAtras;
    private javax.swing.JTextField jtfBuscarPagina;
    private javax.swing.JTextField jtfBuscarPalabra;
    // End of variables declaration//GEN-END:variables
}
