/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.awt.event.ItemEvent;
import javafx.scene.control.ComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author pablotr
 */
public class FrameInicio extends javax.swing.JFrame {
    
    private ManipuladorBD bd = new ManipuladorBD(); 
    
    private String nextQuery;
    private boolean insertQuery;
    private boolean updateQuery;
    private boolean dropQuery;
    
    private String idRow;
    
    /**
     * Creates new form NewJFrame
     */
    public FrameInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogErrorConexion = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabelErrorInfo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonErrorOK = new javax.swing.JButton();
        jDialogTabla = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButtonEjecutar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jRadioButtonDrop = new javax.swing.JRadioButton();
        jRadioButtonInsert = new javax.swing.JRadioButton();
        jRadioButtonUpdate = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        buttonGroupQuery = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToggleButtonConexion = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxTablas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonToTablas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jDialogErrorConexion.setTitle("Error en la conexión");
        jDialogErrorConexion.setIconImage(null);
        jDialogErrorConexion.setIconImages(null);
        jDialogErrorConexion.setModal(true);

        jLabelErrorInfo.setText("texto de prueba");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelErrorInfo)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelErrorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonErrorOK.setText("OK");
        jButtonErrorOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonErrorOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonErrorOK)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonErrorOK)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogErrorConexionLayout = new javax.swing.GroupLayout(jDialogErrorConexion.getContentPane());
        jDialogErrorConexion.getContentPane().setLayout(jDialogErrorConexionLayout);
        jDialogErrorConexionLayout.setHorizontalGroup(
            jDialogErrorConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogErrorConexionLayout.createSequentialGroup()
                .addGroup(jDialogErrorConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogErrorConexionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogErrorConexionLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogErrorConexionLayout.setVerticalGroup(
            jDialogErrorConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogErrorConexionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogTabla.setModal(true);

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jButton1.setText("Añadir/Editar valor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jButtonEjecutar.setText("Ejecutar Query");
        jButtonEjecutar.setEnabled(false);
        jButtonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEjecutar)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonGroupQuery.add(jRadioButtonDrop);
        jRadioButtonDrop.setText("Borrar");
        jRadioButtonDrop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonDropItemStateChanged(evt);
            }
        });

        buttonGroupQuery.add(jRadioButtonInsert);
        jRadioButtonInsert.setText("Insertar");
        jRadioButtonInsert.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonInsertItemStateChanged(evt);
            }
        });

        buttonGroupQuery.add(jRadioButtonUpdate);
        jRadioButtonUpdate.setText("Modificar");
        jRadioButtonUpdate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonUpdateItemStateChanged(evt);
            }
        });

        jLabel6.setText("Tipo de Query:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonUpdate)
                            .addComponent(jRadioButtonInsert)
                            .addComponent(jRadioButtonDrop))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonDrop)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogTablaLayout = new javax.swing.GroupLayout(jDialogTabla.getContentPane());
        jDialogTabla.getContentPane().setLayout(jDialogTablaLayout);
        jDialogTablaLayout.setHorizontalGroup(
            jDialogTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDialogTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogTablaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jDialogTablaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jDialogTablaLayout.setVerticalGroup(
            jDialogTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialogTablaLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButtonConexion.setText("Conectar");
        jToggleButtonConexion.setPreferredSize(new java.awt.Dimension(110, 70));
        jToggleButtonConexion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButtonConexionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButtonConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButtonConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jComboBoxTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peliculas", "Socios", "Prestamos", "Musica" }));

        jLabel2.setText("BD:");

        jLabel5.setText("videoclub");

        jLabelStatus.setText("offline");

        jLabel1.setText("Status:");

        jLabel3.setText("Tabla:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabelStatus)
                    .addComponent(jComboBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonToTablas.setText("Gestionar Tabla");
        jButtonToTablas.setEnabled(false);
        jButtonToTablas.setMargin(new java.awt.Insets(4, 28, 4, 28));
        jButtonToTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToTablasActionPerformed(evt);
            }
        });

        jLabel4.setText("Escoge una tabla y haz click para continuar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButtonToTablas)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonToTablas)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonConexionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButtonConexionItemStateChanged
        if (evt.getStateChange()==ItemEvent.SELECTED) {
            jToggleButtonConexion.setText("Desconectar");
            if (bd.conectar()) {
                jLabelStatus.setText("online");
                jButtonToTablas.setEnabled(true);          
            } else {
                jLabelErrorInfo.setText(bd.getOutbox());
                jDialogErrorConexion.pack();
                jDialogErrorConexion.setVisible(true);
                jToggleButtonConexion.setSelected(false);
            }
        } else {
            jToggleButtonConexion.setText("Conectar");
            if (bd.desconectar()) {
                jLabelStatus.setText("offline");
                jButtonToTablas.setEnabled(false);
            } else {
                jLabelErrorInfo.setText(bd.getOutbox());
                jDialogErrorConexion.pack();
                jDialogErrorConexion.setVisible(true);
                jToggleButtonConexion.setSelected(false);
            }
        }
    }//GEN-LAST:event_jToggleButtonConexionItemStateChanged

    private void jButtonErrorOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonErrorOKActionPerformed
        jDialogErrorConexion.setVisible(false);
    }//GEN-LAST:event_jButtonErrorOKActionPerformed

    private void jButtonToTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToTablasActionPerformed
        switch (jComboBoxTablas.getSelectedIndex()) {
            case 0:
                jList1.setListData(new String[] {"Codigo_Pelicula", "Titulo", "Director", "Genero", "Fecha_Alta", "Argumento"});
                jList2.setListData(new String [] {"-","-","-","-","-","-"});
                break;
            case 1:
                jList1.setListData(new String[] {"Num_Socio", "Nombre", "DNI", "Telefono", "Email"});
                jList2.setListData(new String [] {"-","-","-","-","-"});
                break;
            case 2:
                jList1.setListData(new String[] {"Num_Socio", "Codigo_Pelicula", "Fecha_Prestamo", "Precio", "Num_Dias"});
                jList2.setListData(new String [] {"-","-","-","-","-"});
                break;
            case 3:
                jList1.setListData(new String[] {"id", "titulo", "autor", "duracion"});
                jList2.setListData(new String [] {"-","-","-","-"});
                break;
        }
        jDialogTabla.pack();
        jDialogTabla.setVisible(true);
    }//GEN-LAST:event_jButtonToTablasActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        jList2.setSelectedIndex(jList1.getSelectedIndex());
    }//GEN-LAST:event_jList1ValueChanged

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        jList1.setSelectedIndex(jList2.getSelectedIndex());
    }//GEN-LAST:event_jList2ValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String newValue = JOptionPane.showInputDialog(null, "Introduzca el valor deseado", "Insertar", JOptionPane.QUESTION_MESSAGE);
        if (!newValue.isEmpty()) {
            ListModel model = jList2.getModel();
            String[] values = new String[model.getSize()];
            for (int i=0; i<model.getSize(); i++) {
                if (i == jList2.getSelectedIndex()) {
                    values[i] = newValue;
                } else {
                    values[i] = (String) model.getElementAt(i);
                }
            }
        jList2.setListData(values);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButtonInsertItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonInsertItemStateChanged
        if (evt.getStateChange()==ItemEvent.SELECTED) {
            jButtonEjecutar.setEnabled(true);
            insertQuery = true;
            updateQuery = false;
            dropQuery = false;
        }
    }//GEN-LAST:event_jRadioButtonInsertItemStateChanged

    private void jButtonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjecutarActionPerformed
        if (insertQuery) {
            ListModel model = jList2.getModel();
            String[] values = new String[model.getSize()];
            for (int i=0; i<model.getSize(); i++) {
                if (((String) model.getElementAt(i)).equalsIgnoreCase("-")) {
                    values[i] = null;
                } else {
                    values[i] = (String) model.getElementAt(i);
                }
            }
            if (jComboBoxTablas.getSelectedIndex() == 0) {
                nextQuery = ""
                + "INSERT INTO peliculas VALUES("
                    + "'" + values[1] + "'" + ", " //Titulo
                    + "'" + values[2] + "'" + ", " //Director
                    + "'" + values[3] + "'" + ", " //Genero
                    + "'" + values[4] + "'" + ", " //Fecha_Alta
                    + "'" + values[5] + "'" //Argumento
                + ") ENGINE=InnoDB";
            } else if (jComboBoxTablas.getSelectedIndex() == 1) {
                nextQuery = ""
                + "INSERT INTO socios VALUES("
                    + "'" + values[1] + "'" + ", " //Nombre
                    + "'" + values[2] + "'" + ", " //DNI
                    + "'" + values[3] + "'" + ", " //Telefono
                    + "'" + values[4] + "'" //Email
                + ") ENGINE=InnoDB";
            } else if (jComboBoxTablas.getSelectedIndex() == 2) {
                nextQuery = ""
                + "INSERT INTO prestamo VALUES("
                    + values[0] + ", " //Num_Socio
                    + values[1] + ", " //Codigo_Pelicula
                    + "'" + values[2] + "'" + ", " //Fecha_Prestamo
                    + values[3] + ", " //Precio
                    + values[4] //Num_Dias
                + ") ENGINE=InnoDB";
            } else if (jComboBoxTablas.getSelectedIndex() == 3) {
                nextQuery = ""
                + "INSERT INTO musica VALUES("
                    + "'" + values[1] + "'" + ", " //Titulo
                    + "'" + values[2] + "'" + ", " //Autor
                    + "'" + values[3] + "'" //Duracion
                + ") ENGINE=InnoDB";
            }
        } else if (updateQuery) {
            
        } else if (dropQuery) {
            
        }
        bd.ejecutar(nextQuery);
    }//GEN-LAST:event_jButtonEjecutarActionPerformed

    private void jRadioButtonUpdateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonUpdateItemStateChanged
        if (evt.getStateChange()==ItemEvent.SELECTED) {
            jButtonEjecutar.setEnabled(true);
            insertQuery = false;
            updateQuery = true;
            dropQuery = false;
            
            if (jComboBoxTablas.getSelectedIndex() == 2){
                
            } else {
                idRow = JOptionPane.showInputDialog(null, "Introduzca la 'id' de la fila", "Modificar", JOptionPane.QUESTION_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_jRadioButtonUpdateItemStateChanged

    private void jRadioButtonDropItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonDropItemStateChanged
        if (evt.getStateChange()==ItemEvent.SELECTED) {
            jButtonEjecutar.setEnabled(true);
            insertQuery = false;
            updateQuery = false;
            dropQuery = true;
        }
    }//GEN-LAST:event_jRadioButtonDropItemStateChanged

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
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrameInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEjecutar;
    private javax.swing.JButton jButtonErrorOK;
    private javax.swing.JButton jButtonToTablas;
    private javax.swing.JComboBox<String> jComboBoxTablas;
    private javax.swing.JDialog jDialogErrorConexion;
    private javax.swing.JDialog jDialogTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelErrorInfo;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButtonDrop;
    private javax.swing.JRadioButton jRadioButtonInsert;
    private javax.swing.JRadioButton jRadioButtonUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButtonConexion;
    // End of variables declaration//GEN-END:variables
}
