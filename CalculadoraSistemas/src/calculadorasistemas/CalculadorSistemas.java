/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasistemas;

/**
 *
 * @author pablotr
 */
public class CalculadorSistemas extends javax.swing.JFrame {
    
    private boolean inputDecimal = true; /*'Decimal' está seleccionado por defecto*/
    private boolean inputBinario = false;
    private boolean inputOctal = false;
    private boolean inputHexadecimal = false;

    /**
     * Creates new form NewJFrame
     */
    public CalculadorSistemas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupInput = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonBinario = new javax.swing.JRadioButton();
        jRadioButtonOctal = new javax.swing.JRadioButton();
        jRadioButtonHexadecimal = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonBinario = new javax.swing.JButton();
        jButtonOctal = new javax.swing.JButton();
        jButtonHexadecimal = new javax.swing.JButton();
        jTextFieldInput = new javax.swing.JTextField();
        jRadioButtonDecimal = new javax.swing.JRadioButton();
        jButtonDecimal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldOutput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneNotificacion = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CALCULADORA SISTEMAS");

        jLabel2.setText("Input:");

        buttonGroupInput.add(jRadioButtonBinario);
        jRadioButtonBinario.setText("Binario");
        jRadioButtonBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBinarioActionPerformed(evt);
            }
        });

        buttonGroupInput.add(jRadioButtonOctal);
        jRadioButtonOctal.setText("Octal");
        jRadioButtonOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOctalActionPerformed(evt);
            }
        });

        buttonGroupInput.add(jRadioButtonHexadecimal);
        jRadioButtonHexadecimal.setText("Hexadecimal");
        jRadioButtonHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHexadecimalActionPerformed(evt);
            }
        });

        jLabel3.setText("Output:");

        jButtonBinario.setText("Binario");
        jButtonBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBinarioActionPerformed(evt);
            }
        });

        jButtonOctal.setText("Octal");
        jButtonOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOctalActionPerformed(evt);
            }
        });

        jButtonHexadecimal.setText("Hexadecimal");
        jButtonHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHexadecimalActionPerformed(evt);
            }
        });

        buttonGroupInput.add(jRadioButtonDecimal);
        jRadioButtonDecimal.setSelected(true);
        jRadioButtonDecimal.setText("Decimal");
        jRadioButtonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDecimalActionPerformed(evt);
            }
        });

        jButtonDecimal.setText("Decimal");
        jButtonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDecimalActionPerformed(evt);
            }
        });

        jLabel4.setText("Input:");

        jLabel5.setText("Output:");

        jTextPaneNotificacion.setEditable(false);
        jTextPaneNotificacion.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jTextPaneNotificacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonHexadecimal)
                            .addComponent(jRadioButtonOctal)
                            .addComponent(jRadioButtonBinario)
                            .addComponent(jRadioButtonDecimal)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonDecimal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBinario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonOctal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonHexadecimal)))
                        .addContainerGap(68, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonDecimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonBinario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonOctal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBinario)
                    .addComponent(jButtonOctal)
                    .addComponent(jButtonHexadecimal)
                    .addComponent(jButtonDecimal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBinarioActionPerformed
        jTextPaneNotificacion.setText("");
        try {
            String result = aBinario(jTextFieldInput.getText());
        jTextFieldOutput.setText(result);
        } catch(NumberFormatException e) {
            jTextPaneNotificacion.setText("ERROR: El formato del número introducido no se corresponde con el formato seleccionado (decimal, binario, octal o hexadecimal)");
        }
    }//GEN-LAST:event_jButtonBinarioActionPerformed

    private void jRadioButtonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDecimalActionPerformed
        if (!inputDecimal) {
            jTextFieldInput.setText("");
            jTextFieldOutput.setText("");
        }
        inputDecimal = true;
        inputBinario = false;
        inputOctal = false;
        inputHexadecimal = false;
    }//GEN-LAST:event_jRadioButtonDecimalActionPerformed

    private void jRadioButtonBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBinarioActionPerformed
        if (!inputBinario) {
            jTextFieldInput.setText("");
            jTextFieldOutput.setText("");
        }
        inputDecimal = false;
        inputBinario = true;
        inputOctal = false;
        inputHexadecimal = false;
    }//GEN-LAST:event_jRadioButtonBinarioActionPerformed

    private void jRadioButtonOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOctalActionPerformed
        if (!inputOctal) {
            jTextFieldInput.setText("");
            jTextFieldOutput.setText("");
        }
        inputDecimal = false;
        inputBinario = false;
        inputOctal = true;
        inputHexadecimal = false;
    }//GEN-LAST:event_jRadioButtonOctalActionPerformed

    private void jRadioButtonHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHexadecimalActionPerformed
        if (!inputHexadecimal) {
            jTextFieldInput.setText("");
            jTextFieldOutput.setText("");
        }
        inputDecimal = false;
        inputBinario = false;
        inputOctal = false;
        inputHexadecimal = true;
    }//GEN-LAST:event_jRadioButtonHexadecimalActionPerformed

    private void jButtonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDecimalActionPerformed
        jTextPaneNotificacion.setText("");
        try {
            String result = aDecimal(jTextFieldInput.getText());
        jTextFieldOutput.setText(result);
        } catch(NumberFormatException e) {
            jTextPaneNotificacion.setText("ERROR: El formato del número introducido no se corresponde con el formato seleccionado (decimal, binario, octal o hexadecimal)");
        } 
    }//GEN-LAST:event_jButtonDecimalActionPerformed

    private void jButtonOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOctalActionPerformed
        jTextPaneNotificacion.setText("");
        try {
            String result = aOctal(jTextFieldInput.getText());
        jTextFieldOutput.setText(result);
        } catch(NumberFormatException e) {
            jTextPaneNotificacion.setText("ERROR: El formato del número introducido no se corresponde con el formato seleccionado (decimal, binario, octal o hexadecimal)");
        }
    }//GEN-LAST:event_jButtonOctalActionPerformed

    private void jButtonHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHexadecimalActionPerformed
        jTextPaneNotificacion.setText("");
        try {
            String result = aHexadecimal(jTextFieldInput.getText());
        jTextFieldOutput.setText(result);
        } catch(NumberFormatException e) {
            jTextPaneNotificacion.setText("ERROR: El formato del número introducido no se corresponde con el formato seleccionado (decimal, binario, octal o hexadecimal)");
        }
    }//GEN-LAST:event_jButtonHexadecimalActionPerformed
    
    private String aDecimal(String num) {
        int i;
        if (inputBinario) {
            i = Integer.parseInt(num, 2);
        } else if (inputOctal) {
            i = Integer.parseInt(num, 8);
        } else if (inputHexadecimal) {
            i = Integer.parseInt(num, 16);
        } else {
            i = Integer.parseInt(num);
        }  
        String deci = Integer.toString(i);
        return deci;
    }
    
    private String aBinario(String num) {
        int i;
        if (inputDecimal) {
            i = Integer.parseInt(num);
        } else if (inputOctal) {
            i = Integer.parseInt(num, 8);
        } else if (inputHexadecimal) {
            i = Integer.parseInt(num, 16);
        } else {
            i = Integer.parseInt(num, 2);
        }
        String bin = Integer.toBinaryString(i);
        return bin;
    }
    
    private String aOctal(String num) {
        int i;
        if (inputDecimal) {
            i = Integer.parseInt(num);
        } else if (inputBinario) {
            i = Integer.parseInt(num, 2);
        } else if (inputHexadecimal) {
            i = Integer.parseInt(num, 16);
        } else {
            i = Integer.parseInt(num, 8);
        }
        String octal = Integer.toOctalString(i);
        return octal;
    }
    
    private String aHexadecimal (String num) {
        int i;
        if (inputDecimal) {
            i = Integer.parseInt(num);
        } else if (inputBinario) {
            i = Integer.parseInt(num, 2);
        } else if (inputOctal) {
            i = Integer.parseInt(num, 8);
        } else {
            i = Integer.parseInt(num, 16);
        }
        String hexa = Integer.toHexString(i);
        return hexa;
    }
        
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
            java.util.logging.Logger.getLogger(CalculadorSistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadorSistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadorSistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadorSistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadorSistemas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupInput;
    private javax.swing.JButton jButtonBinario;
    private javax.swing.JButton jButtonDecimal;
    private javax.swing.JButton jButtonHexadecimal;
    private javax.swing.JButton jButtonOctal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButtonBinario;
    private javax.swing.JRadioButton jRadioButtonDecimal;
    private javax.swing.JRadioButton jRadioButtonHexadecimal;
    private javax.swing.JRadioButton jRadioButtonOctal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldInput;
    private javax.swing.JTextField jTextFieldOutput;
    private javax.swing.JTextPane jTextPaneNotificacion;
    // End of variables declaration//GEN-END:variables
}
