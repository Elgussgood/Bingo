/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;
import bingo.Funciones;
import java.util.EventListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
/**
 *
 * @author sofia
 */
public class Bingo extends javax.swing.JFrame {
Funciones obj = new Funciones();
    /**
     * Creates new form Bingo
     */
    public Bingo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        diez = new javax.swing.JButton();
        once = new javax.swing.JButton();
        doce = new javax.swing.JButton();
        free = new javax.swing.JButton();
        catorce = new javax.swing.JButton();
        quince = new javax.swing.JButton();
        dieciseis = new javax.swing.JButton();
        diecisiete = new javax.swing.JButton();
        dieciocho = new javax.swing.JButton();
        diecinueve = new javax.swing.JButton();
        veinte = new javax.swing.JButton();
        veintiuno = new javax.swing.JButton();
        veintidos = new javax.swing.JButton();
        veintitres = new javax.swing.JButton();
        veinticuatro = new javax.swing.JButton();
        veinticinco = new javax.swing.JButton();
        O = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        I = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        G = new javax.swing.JLabel();
        NumeroRan = new javax.swing.JLabel();
        Retirarse = new javax.swing.JButton();
        Iniciar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        avanzar = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("B");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Juego de Bingo");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(460, 560));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        uno.setText("pene");
        uno.setEnabled(false);
        uno.setMaximumSize(new java.awt.Dimension(92, 112));
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel2.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 111));

        dos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dos.setMaximumSize(new java.awt.Dimension(92, 112));
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel2.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 92, 111));

        tres.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tres.setMaximumSize(new java.awt.Dimension(92, 112));
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel2.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 92, 111));

        cuatro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cuatro.setMaximumSize(new java.awt.Dimension(92, 112));
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel2.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 92, 111));

        cinco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cinco.setMaximumSize(new java.awt.Dimension(92, 112));
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel2.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 92, 111));

        seis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        seis.setMaximumSize(new java.awt.Dimension(92, 112));
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel2.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 111));

        siete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        siete.setMaximumSize(new java.awt.Dimension(92, 112));
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel2.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 92, 111));

        ocho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ocho.setMaximumSize(new java.awt.Dimension(92, 112));
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel2.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 92, 111));

        nueve.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nueve.setMaximumSize(new java.awt.Dimension(92, 112));
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel2.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 92, 111));

        diez.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        diez.setMaximumSize(new java.awt.Dimension(92, 112));
        diez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diezActionPerformed(evt);
            }
        });
        jPanel2.add(diez, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 92, 111));

        once.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        once.setMaximumSize(new java.awt.Dimension(92, 112));
        once.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onceActionPerformed(evt);
            }
        });
        jPanel2.add(once, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 111));

        doce.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        doce.setMaximumSize(new java.awt.Dimension(92, 112));
        doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doceActionPerformed(evt);
            }
        });
        jPanel2.add(doce, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 92, 111));

        free.setText("Free");
        free.setMaximumSize(new java.awt.Dimension(92, 112));
        free.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freeActionPerformed(evt);
            }
        });
        jPanel2.add(free, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 92, 111));

        catorce.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        catorce.setMaximumSize(new java.awt.Dimension(92, 112));
        catorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catorceActionPerformed(evt);
            }
        });
        jPanel2.add(catorce, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 92, 111));

        quince.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        quince.setMaximumSize(new java.awt.Dimension(92, 112));
        quince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quinceActionPerformed(evt);
            }
        });
        jPanel2.add(quince, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 92, 111));

        dieciseis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dieciseis.setMaximumSize(new java.awt.Dimension(92, 112));
        dieciseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dieciseisActionPerformed(evt);
            }
        });
        jPanel2.add(dieciseis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 90, 111));

        diecisiete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        diecisiete.setMaximumSize(new java.awt.Dimension(92, 112));
        diecisiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diecisieteActionPerformed(evt);
            }
        });
        jPanel2.add(diecisiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 92, 111));

        dieciocho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dieciocho.setMaximumSize(new java.awt.Dimension(92, 112));
        dieciocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dieciochoActionPerformed(evt);
            }
        });
        jPanel2.add(dieciocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 92, 111));

        diecinueve.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        diecinueve.setMaximumSize(new java.awt.Dimension(92, 112));
        diecinueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diecinueveActionPerformed(evt);
            }
        });
        jPanel2.add(diecinueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 92, 111));

        veinte.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        veinte.setMaximumSize(new java.awt.Dimension(92, 112));
        veinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veinteActionPerformed(evt);
            }
        });
        jPanel2.add(veinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 92, 111));

        veintiuno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        veintiuno.setMaximumSize(new java.awt.Dimension(92, 112));
        veintiuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintiunoActionPerformed(evt);
            }
        });
        jPanel2.add(veintiuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 90, 111));

        veintidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        veintidos.setMaximumSize(new java.awt.Dimension(92, 112));
        veintidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintidosActionPerformed(evt);
            }
        });
        jPanel2.add(veintidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 92, 111));

        veintitres.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        veintitres.setMaximumSize(new java.awt.Dimension(92, 112));
        veintitres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veintitresActionPerformed(evt);
            }
        });
        jPanel2.add(veintitres, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 92, 111));

        veinticuatro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        veinticuatro.setMaximumSize(new java.awt.Dimension(92, 112));
        veinticuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veinticuatroActionPerformed(evt);
            }
        });
        jPanel2.add(veinticuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 92, 111));

        veinticinco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        veinticinco.setMaximumSize(new java.awt.Dimension(92, 112));
        veinticinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veinticincoActionPerformed(evt);
            }
        });
        jPanel2.add(veinticinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 92, 111));

        O.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        O.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        O.setText("O");
        jPanel2.add(O, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 90, -1));

        B.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.setText("B");
        jPanel2.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        I.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I.setText("I");
        jPanel2.add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, -1));

        N.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        N.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N.setText("N");
        jPanel2.add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 90, 20));

        G.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        G.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G.setText("G");
        jPanel2.add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 90, -1));

        NumeroRan.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        NumeroRan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumeroRan.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Retirarse.setText("ACABAR");
        Retirarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarseActionPerformed(evt);
            }
        });

        Iniciar1.setText("INICIAR");
        Iniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iniciar1ActionPerformed(evt);
            }
        });

        jButton1.setText("BINGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        avanzar.setText("Siguiente");
        avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NumeroRan, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Iniciar1)
                                .addGap(33, 33, 33)
                                .addComponent(Retirarse))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(avanzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NumeroRan, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(avanzar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Retirarse)
                            .addComponent(Iniciar1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(123, 123, 123))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuatroActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
String pene=uno.getText();
String PENE="pene";
        if(pene.equals(PENE)){
        uno.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
    uno.setText("1");
NumeroRan.setText("1");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tresActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nueveActionPerformed

    private void diezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diezActionPerformed

    private void onceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onceActionPerformed

    private void doceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doceActionPerformed

    private void freeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_freeActionPerformed

    private void catorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catorceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catorceActionPerformed

    private void quinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quinceActionPerformed

    private void dieciseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dieciseisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dieciseisActionPerformed

    private void diecisieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diecisieteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diecisieteActionPerformed

    private void dieciochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dieciochoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dieciochoActionPerformed

    private void diecinueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diecinueveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diecinueveActionPerformed

    private void veinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veinteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veinteActionPerformed

    private void veintiunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintiunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veintiunoActionPerformed

    private void veintidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veintidosActionPerformed

    private void veintitresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veintitresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veintitresActionPerformed

    private void veinticuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veinticuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veinticuatroActionPerformed

    private void veinticincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veinticincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veinticincoActionPerformed

    private void RetirarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RetirarseActionPerformed
//Iniciar Boton
    private void Iniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar1ActionPerformed
String LISTAB=obj.RandNumeroB();
String LISTAI=obj.RandNumeroI();
String LISTAN=obj.RandNumeroN();
String LISTAG=obj.RandNumeroG();
String LISTAO=obj.RandNumeroO();


String[] listaB = LISTAB.split(" ");
String[] listaI = LISTAI.split(" ");
String[] listaN = LISTAN.split(" ");
String[] listaG = LISTAG.split(" ");
String[] listaO = LISTAO.split(" ");
uno.setText(listaB[0]);
dos.setText(listaI[0]);
tres.setText(listaN[0]);
cuatro.setText(listaG[0]);
cinco.setText(listaO[0]);
seis.setText(listaB[1]);
siete.setText(listaI[1]);
ocho.setText(listaN[1]);
nueve.setText(listaG[1]);
diez.setText(listaO[1]);
once.setText(listaB[2]);
doce.setText(listaI[2]);
Iniciar1.setText("RECETEAR");
catorce.setText(listaG[2]);
quince.setText(listaO[2]);
dieciseis.setText(listaB[3]);
diecisiete.setText(listaI[3]);
dieciocho.setText(listaN[3]);
diecinueve.setText(listaG[3]);
veinte.setText(listaO[3]);
veintiuno.setText(listaB[4]);
veintidos.setText(listaI[4]);
veintitres.setText(listaN[4]);
veinticuatro.setText(listaG[4]);
veinticinco.setText(listaO[4]);

    }//GEN-LAST:event_Iniciar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void avanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarActionPerformed
         
        String LISTA=obj.RandNumero();
        String[] lista = LISTA.split(" ");
        
        for(int i=0;i<75;i++){

            NumeroRan.setText(lista[i]);
         }
    }//GEN-LAST:event_avanzarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Bingo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bingo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bingo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bingo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bingo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B;
    private javax.swing.JLabel G;
    private javax.swing.JLabel I;
    private javax.swing.JButton Iniciar1;
    private javax.swing.JLabel N;
    private javax.swing.JLabel NumeroRan;
    private javax.swing.JLabel O;
    private javax.swing.JButton Retirarse;
    private javax.swing.JButton avanzar;
    private javax.swing.JButton catorce;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton diecinueve;
    private javax.swing.JButton dieciocho;
    private javax.swing.JButton dieciseis;
    private javax.swing.JButton diecisiete;
    private javax.swing.JButton diez;
    private javax.swing.JButton doce;
    private javax.swing.JButton dos;
    private javax.swing.JButton free;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton once;
    private javax.swing.JButton quince;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    private javax.swing.JButton veinte;
    private javax.swing.JButton veinticinco;
    private javax.swing.JButton veinticuatro;
    private javax.swing.JButton veintidos;
    private javax.swing.JButton veintitres;
    private javax.swing.JButton veintiuno;
    // End of variables declaration//GEN-END:variables
}
