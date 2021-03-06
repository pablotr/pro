/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author mati
 */
public class MenuItem extends javax.swing.JFrame {
    Font fuente;
    /**
     * Creates new form MenuItem
     */
    public MenuItem() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroupColores = new javax.swing.ButtonGroup();
        buttonGroupLetra = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelEjemplo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuFormato = new javax.swing.JMenu();
        jMenuColor = new javax.swing.JMenu();
        jRadioButtonMenuItemNegro = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemAzul = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemRojo = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemVerde = new javax.swing.JRadioButtonMenuItem();
        jMenuLetra = new javax.swing.JMenu();
        jRadioButtonMenuItemSerif = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemMono = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemSSerif = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItemNegrita = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemCursiva = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabelEjemplo.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabelEjemplo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEjemplo.setText("Texto de ejemplo");
        jPanel1.add(jLabelEjemplo, java.awt.BorderLayout.CENTER);

        jMenuArchivo.setMnemonic('a');
        jMenuArchivo.setText("Archivo");

        jMenuItemAbout.setMnemonic('a');
        jMenuItemAbout.setText("Acerca de...");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAbout);

        jMenuItemSalir.setMnemonic('s');
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.setToolTipText("");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuFormato.setMnemonic('f');
        jMenuFormato.setText("Formato");

        jMenuColor.setMnemonic('c');
        jMenuColor.setText("Color");
        jMenuColor.setToolTipText("");

        buttonGroupColores.add(jRadioButtonMenuItemNegro);
        jRadioButtonMenuItemNegro.setSelected(true);
        jRadioButtonMenuItemNegro.setText("Negro");
        jRadioButtonMenuItemNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemNegroActionPerformed(evt);
            }
        });
        jMenuColor.add(jRadioButtonMenuItemNegro);

        buttonGroupColores.add(jRadioButtonMenuItemAzul);
        jRadioButtonMenuItemAzul.setText("Azul");
        jRadioButtonMenuItemAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemAzulActionPerformed(evt);
            }
        });
        jMenuColor.add(jRadioButtonMenuItemAzul);

        buttonGroupColores.add(jRadioButtonMenuItemRojo);
        jRadioButtonMenuItemRojo.setText("Rojo");
        jRadioButtonMenuItemRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemRojoActionPerformed(evt);
            }
        });
        jMenuColor.add(jRadioButtonMenuItemRojo);

        buttonGroupColores.add(jRadioButtonMenuItemVerde);
        jRadioButtonMenuItemVerde.setText("Verde");
        jRadioButtonMenuItemVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemVerdeActionPerformed(evt);
            }
        });
        jMenuColor.add(jRadioButtonMenuItemVerde);

        jMenuFormato.add(jMenuColor);

        jMenuLetra.setMnemonic('t');
        jMenuLetra.setText("Tipo de letra");
        jMenuLetra.setToolTipText("");

        buttonGroupLetra.add(jRadioButtonMenuItemSerif);
        jRadioButtonMenuItemSerif.setSelected(true);
        jRadioButtonMenuItemSerif.setText("Serif");
        jRadioButtonMenuItemSerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemSerifActionPerformed(evt);
            }
        });
        jMenuLetra.add(jRadioButtonMenuItemSerif);

        buttonGroupLetra.add(jRadioButtonMenuItemMono);
        jRadioButtonMenuItemMono.setText("Monospaced");
        jRadioButtonMenuItemMono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemMonoActionPerformed(evt);
            }
        });
        jMenuLetra.add(jRadioButtonMenuItemMono);

        buttonGroupLetra.add(jRadioButtonMenuItemSSerif);
        jRadioButtonMenuItemSSerif.setText("SansSerif");
        jRadioButtonMenuItemSSerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemSSerifActionPerformed(evt);
            }
        });
        jMenuLetra.add(jRadioButtonMenuItemSSerif);
        jMenuLetra.add(jSeparator1);

        jCheckBoxMenuItemNegrita.setText("Negrita");
        jCheckBoxMenuItemNegrita.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxMenuItemNegritaItemStateChanged(evt);
            }
        });
        jMenuLetra.add(jCheckBoxMenuItemNegrita);

        jCheckBoxMenuItemCursiva.setText("Cursiva");
        jCheckBoxMenuItemCursiva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxMenuItemCursivaItemStateChanged(evt);
            }
        });
        jMenuLetra.add(jCheckBoxMenuItemCursiva);

        jMenuFormato.add(jMenuLetra);

        jMenuBar1.add(jMenuFormato);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        JOptionPane.showMessageDialog(null, "Éste es un ejemplo\ndel uso de menús", "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemAboutActionPerformed

    private void jRadioButtonMenuItemNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemNegroActionPerformed
        jLabelEjemplo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jRadioButtonMenuItemNegroActionPerformed

    private void jRadioButtonMenuItemAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemAzulActionPerformed
        jLabelEjemplo.setForeground(Color.BLUE);
    }//GEN-LAST:event_jRadioButtonMenuItemAzulActionPerformed

    private void jRadioButtonMenuItemRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemRojoActionPerformed
        jLabelEjemplo.setForeground(Color.RED);
    }//GEN-LAST:event_jRadioButtonMenuItemRojoActionPerformed

    private void jRadioButtonMenuItemVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemVerdeActionPerformed
        jLabelEjemplo.setForeground(Color.GREEN);
    }//GEN-LAST:event_jRadioButtonMenuItemVerdeActionPerformed

    private void jRadioButtonMenuItemSerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemSerifActionPerformed
        fuente = jLabelEjemplo.getFont();
        jLabelEjemplo.setFont(new Font(Font.SERIF, fuente.getStyle(), fuente.getSize()));
    }//GEN-LAST:event_jRadioButtonMenuItemSerifActionPerformed

    private void jRadioButtonMenuItemMonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemMonoActionPerformed
        fuente = jLabelEjemplo.getFont();
        jLabelEjemplo.setFont(new Font(Font.MONOSPACED, fuente.getStyle(), fuente.getSize()));
    }//GEN-LAST:event_jRadioButtonMenuItemMonoActionPerformed

    private void jRadioButtonMenuItemSSerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemSSerifActionPerformed
        fuente = jLabelEjemplo.getFont();
        jLabelEjemplo.setFont(new Font(Font.SANS_SERIF, fuente.getStyle(), fuente.getSize()));
    }//GEN-LAST:event_jRadioButtonMenuItemSSerifActionPerformed

    private void jCheckBoxMenuItemNegritaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemNegritaItemStateChanged
        fuente = jLabelEjemplo.getFont();
        if (evt.getStateChange()==ItemEvent.SELECTED) {
            jLabelEjemplo.setFont(new Font(fuente.getName(), fuente.getStyle() + Font.BOLD, fuente.getSize()));
        } else {
            jLabelEjemplo.setFont(new Font(fuente.getName(), fuente.getStyle() - Font.BOLD, fuente.getSize()));
        }
    }//GEN-LAST:event_jCheckBoxMenuItemNegritaItemStateChanged

    private void jCheckBoxMenuItemCursivaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemCursivaItemStateChanged
        fuente = jLabelEjemplo.getFont();
        if (evt.getStateChange()==ItemEvent.SELECTED) {
            jLabelEjemplo.setFont(new Font(fuente.getName(), fuente.getStyle() + Font.ITALIC, fuente.getSize()));
        } else {
            jLabelEjemplo.setFont(new Font(fuente.getName(), fuente.getStyle() - Font.ITALIC, fuente.getSize()));
        }
    }//GEN-LAST:event_jCheckBoxMenuItemCursivaItemStateChanged

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupColores;
    private javax.swing.ButtonGroup buttonGroupLetra;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemCursiva;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemNegrita;
    private javax.swing.JLabel jLabelEjemplo;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuColor;
    private javax.swing.JMenu jMenuFormato;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuLetra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemAzul;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemMono;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemNegro;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemRojo;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemSSerif;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemSerif;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemVerde;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
