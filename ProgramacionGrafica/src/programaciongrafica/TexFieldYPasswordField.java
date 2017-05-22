/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongrafica;

import javax.swing.JOptionPane;

/**
 *
 * @author mati
 */
public class TexFieldYPasswordField extends javax.swing.JFrame {

    /**
     * Creates new form TexFieldYPasswordField
     */
    public TexFieldYPasswordField() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabelInstrucciones = new javax.swing.JLabel();
        jTextFieldVacio = new javax.swing.JTextField();
        jTextFieldTexto = new javax.swing.JTextField();
        jTextFieldNoEditable = new javax.swing.JTextField();
        jPasswordFieldOculto = new javax.swing.JPasswordField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelInstrucciones.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabelInstrucciones.setText("Introducir texto y dar enter en cada componente");

        jTextFieldVacio.setColumns(10);
        jTextFieldVacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVacioActionPerformed(evt);
            }
        });

        jTextFieldTexto.setText("Escriba el texto aquí");
        jTextFieldTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTextoActionPerformed(evt);
            }
        });

        jTextFieldNoEditable.setEditable(false);
        jTextFieldNoEditable.setText("Campo de texto no editable");
        jTextFieldNoEditable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoEditableActionPerformed(evt);
            }
        });

        jPasswordFieldOculto.setText("Texto oculto");
        jPasswordFieldOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldOcultoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNoEditable)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInstrucciones)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldVacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jTextFieldTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPasswordFieldOculto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInstrucciones)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldVacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNoEditable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPasswordFieldOculto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldVacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVacioActionPerformed
        String str = "jTextFieldVacio: " + evt.getActionCommand();
        JOptionPane.showMessageDialog(null, str, "Resultados", JOptionPane.CANCEL_OPTION);
    }//GEN-LAST:event_jTextFieldVacioActionPerformed

    private void jTextFieldTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTextoActionPerformed
        String str = "jTextFieldTexto: " + evt.getActionCommand();
        JOptionPane.showMessageDialog(null, str, "Resultados", JOptionPane.CANCEL_OPTION);
    }//GEN-LAST:event_jTextFieldTextoActionPerformed

    private void jTextFieldNoEditableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoEditableActionPerformed
        String str = "jTextFieldNoEditable: " + evt.getActionCommand();
        JOptionPane.showMessageDialog(null, str, "Resultados", JOptionPane.CANCEL_OPTION);
    }//GEN-LAST:event_jTextFieldNoEditableActionPerformed

    private void jPasswordFieldOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldOcultoActionPerformed
        String str = "jPasswordFieldOculto: " + evt.getActionCommand();
        JOptionPane.showMessageDialog(null, str, "Resultados", JOptionPane.CANCEL_OPTION);
    }//GEN-LAST:event_jPasswordFieldOcultoActionPerformed

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
            java.util.logging.Logger.getLogger(TexFieldYPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TexFieldYPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TexFieldYPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TexFieldYPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TexFieldYPasswordField().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelInstrucciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldOculto;
    private javax.swing.JTextField jTextFieldNoEditable;
    private javax.swing.JTextField jTextFieldTexto;
    private javax.swing.JTextField jTextFieldVacio;
    // End of variables declaration//GEN-END:variables
}
