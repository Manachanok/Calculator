/*
Reference : https://youtu.be/Ggy8IuIQEsA
 */
package Calculator;

/**
 *
@author Manachanok Sirivibulkovit
Cpr.E 6001012630101
 */
public class Calculator extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String operator;
    
    public Calculator() {
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

        jDisplay = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtondiv = new javax.swing.JButton();
        jButtonl = new javax.swing.JButton();
        jButtonr = new javax.swing.JButton();
        jButtondel = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonmul = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonmin = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtoneq = new javax.swing.JButton();
        jButtonplus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(230, 230, 230));

        jDisplay.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisplayActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 225, 140));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton7.setText("7");
        jButton7.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 225, 140));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton8.setText("8");
        jButton8.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 225, 140));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton9.setText("9");
        jButton9.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtondiv.setBackground(new java.awt.Color(238, 238, 238));
        jButtondiv.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtondiv.setText("/");
        jButtondiv.setMaximumSize(new java.awt.Dimension(41, 31));
        jButtondiv.setPreferredSize(new java.awt.Dimension(100, 60));
        jButtondiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondivActionPerformed(evt);
            }
        });

        jButtonl.setBackground(new java.awt.Color(238, 238, 238));
        jButtonl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonl.setText("(");
        jButtonl.setBorder(null);
        jButtonl.setBorderPainted(false);
        jButtonl.setPreferredSize(new java.awt.Dimension(100, 60));
        jButtonl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlActionPerformed(evt);
            }
        });

        jButtonr.setBackground(new java.awt.Color(238, 238, 238));
        jButtonr.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonr.setText(")");
        jButtonr.setToolTipText("");
        jButtonr.setBorder(null);
        jButtonr.setBorderPainted(false);
        jButtonr.setPreferredSize(new java.awt.Dimension(100, 60));
        jButtonr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrActionPerformed(evt);
            }
        });

        jButtondel.setBackground(new java.awt.Color(238, 238, 238));
        jButtondel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtondel.setText("del");
        jButtondel.setBorder(null);
        jButtondel.setPreferredSize(new java.awt.Dimension(100, 60));
        jButtondel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondelActionPerformed(evt);
            }
        });

        jButtonC.setBackground(new java.awt.Color(238, 238, 238));
        jButtonC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonC.setText("C");
        jButtonC.setBorder(null);
        jButtonC.setMaximumSize(new java.awt.Dimension(41, 31));
        jButtonC.setMinimumSize(new java.awt.Dimension(41, 31));
        jButtonC.setPreferredSize(new java.awt.Dimension(100, 60));
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 225, 140));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setText("4");
        jButton4.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 225, 140));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton5.setText("5");
        jButton5.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 225, 140));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton6.setText("6");
        jButton6.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonmul.setBackground(new java.awt.Color(238, 238, 238));
        jButtonmul.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonmul.setText("*");
        jButtonmul.setMaximumSize(new java.awt.Dimension(41, 31));
        jButtonmul.setPreferredSize(new java.awt.Dimension(100, 60));
        jButtonmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmulActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 225, 140));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("1");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 225, 140));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setText("2");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 225, 140));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton3.setText("3");
        jButton3.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonmin.setBackground(new java.awt.Color(238, 238, 238));
        jButtonmin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonmin.setText("-");
        jButtonmin.setMaximumSize(new java.awt.Dimension(41, 31));
        jButtonmin.setPreferredSize(new java.awt.Dimension(100, 60));
        jButtonmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonminActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(238, 238, 238));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton13.setText(".");
        jButton13.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(255, 225, 140));
        jButton0.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton0.setText("0");
        jButton0.setPreferredSize(new java.awt.Dimension(100, 60));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtoneq.setBackground(new java.awt.Color(238, 238, 238));
        jButtoneq.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtoneq.setText("=");
        jButtoneq.setPreferredSize(new java.awt.Dimension(100, 60));
        jButtoneq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneqActionPerformed(evt);
            }
        });

        jButtonplus.setBackground(new java.awt.Color(238, 238, 238));
        jButtonplus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonplus.setText("+");
        jButtonplus.setMaximumSize(new java.awt.Dimension(41, 31));
        jButtonplus.setPreferredSize(new java.awt.Dimension(100, 60));
        jButtonplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonplusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtoneq, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonplus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonmin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonmul, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDisplay)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonr, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtondel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtondel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtoneq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonplus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisplayActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String Enternumber = jDisplay.getText() + jButton7.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String Enternumber = jDisplay.getText() + jButton8.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String Enternumber = jDisplay.getText() + jButton9.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtondivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondivActionPerformed
        firstnum = Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");
        operator = "/";
    }//GEN-LAST:event_jButtondivActionPerformed

    private void jButtonlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlActionPerformed
        String Enternumber = jDisplay.getText() + jButtonl.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonlActionPerformed

    private void jButtonrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrActionPerformed
        String Enternumber = jDisplay.getText() + jButtonr.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButtonrActionPerformed

    private void jButtondelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondelActionPerformed
        String Enternumber = jDisplay.getText();
        if (Enternumber == null || Enternumber.length() == 0)
        {
            jDisplay.setText("");
        }
        else
        {
            Enternumber = Enternumber.substring(0,Enternumber.length()-1);
            jDisplay.setText(Enternumber);
        }
    }//GEN-LAST:event_jButtondelActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jDisplay.setText("");
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Enternumber = jDisplay.getText() + jButton4.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String Enternumber = jDisplay.getText() + jButton5.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String Enternumber = jDisplay.getText() + jButton6.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmulActionPerformed
        firstnum = Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");
        operator = "*";
    }//GEN-LAST:event_jButtonmulActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Enternumber = jDisplay.getText() + jButton1.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Enternumber = jDisplay.getText() + jButton2.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Enternumber = jDisplay.getText() + jButton3.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonminActionPerformed
        firstnum = Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");
        operator = "-";
    }//GEN-LAST:event_jButtonminActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String Enternumber = jDisplay.getText() + jButton13.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        String Enternumber = jDisplay.getText() + jButton0.getText();
        jDisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtoneqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneqActionPerformed
        String ans;
        secondnum = Double.parseDouble(jDisplay.getText());
        if (operator == "+")
        {
            result = firstnum + secondnum;
            ans = String.format("%.0f",result);
            jDisplay.setText(ans);
        }
        else if (operator == "-")
        {
            result = firstnum - secondnum;
            ans = String.format("%.0f",result);
            jDisplay.setText(ans);
        }
        else if (operator == "*")
        {
            result = firstnum * secondnum;
            ans = String.format("%.0f",result);
            jDisplay.setText(ans);
        }
        else if (operator == "/")
        {
            result = firstnum / secondnum;
            ans = String.format("%.0f",result);
            jDisplay.setText(ans);
        }
    }//GEN-LAST:event_jButtoneqActionPerformed

    private void jButtonplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonplusActionPerformed
        firstnum = Double.parseDouble(jDisplay.getText());
        jDisplay.setText("");
        operator = "+";
    }//GEN-LAST:event_jButtonplusActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtondel;
    private javax.swing.JButton jButtondiv;
    private javax.swing.JButton jButtoneq;
    private javax.swing.JButton jButtonl;
    private javax.swing.JButton jButtonmin;
    private javax.swing.JButton jButtonmul;
    private javax.swing.JButton jButtonplus;
    private javax.swing.JButton jButtonr;
    private javax.swing.JTextField jDisplay;
    // End of variables declaration//GEN-END:variables
}