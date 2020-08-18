package Clases;

import Atxy2k.CustomTextField.RestrictedTextField;
import Conexiones.Conexion;
import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JInternalFrame {

    public Clientes() {
        initComponents();
        nuevo.setEnabled(true);
        guardar.setEnabled(false);
        editar.setEnabled(false);
        eliminar.setEnabled(false);
        desabilitar();
        vaciarTabla();
        verDatos();

        llenarComboDia();
        llenarComboMes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buscarTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mesComboBox = new javax.swing.JComboBox<>();
        diaComboBox = new javax.swing.JComboBox<>();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1200, 720));

        jTable2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Clientes");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Teléfono Celular");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Apellido Paterno");

        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        nuevo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        editar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-document.png"))); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save-disk.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dvavd.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Clientes"));

        buscarTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buscarTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarTextFieldKeyTyped(evt);
            }
        });

        jLabel6.setText("Introduzca el número de teléfono");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("Reestablecer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        mesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        diaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nuevo)
                                .addGap(18, 18, 18)
                                .addComponent(guardar)
                                .addGap(18, 18, 18)
                                .addComponent(editar)
                                .addGap(18, 18, 18)
                                .addComponent(eliminar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(diaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(548, 548, 548))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diaComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(mesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nuevo)
                                    .addComponent(guardar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editar)
                                    .addComponent(eliminar)))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
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

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        limpiar();
        habilitar();
        nuevo.setEnabled(false);
        guardar.setEnabled(true);
        editar.setEnabled(false);
        eliminar.setEnabled(false);

        RestrictedTextField r1 = new RestrictedTextField(jTextField1);
        r1.setLimit(10);
        r1.setOnlyNums(true);

        RestrictedTextField r2 = new RestrictedTextField(jTextField2);
        r2.setLimit(50);

        RestrictedTextField r3 = new RestrictedTextField(jTextField3);
        r3.setLimit(50);

        RestrictedTextField r4 = new RestrictedTextField(buscarTextField);
        r4.setLimit(10);

        vaciarTabla();
        verDatos();
    }//GEN-LAST:event_nuevoActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try {
            String mes = "";
            String dia = "";
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();
            /*Actualizando los proveedores, el parámetro "?" indica el campo que queremos
            actualizar, en este caso, toda la tabla. Lo anterior hecho en "tal lugar" indicado
            por la campo llave "Id_proveedores".
             */
            if (diaComboBox.getSelectedIndex() == -1 && mesComboBox.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Introduzca una fecha de cumpleaños válida");
            } else {

                if (Integer.parseInt(diaComboBox.getSelectedItem().toString()) < 10) {
                    dia = "0" + diaComboBox.getSelectedItem().toString();
                } else {
                    dia = diaComboBox.getSelectedItem().toString();
                }
                if (Integer.parseInt(mesComboBox.getSelectedItem().toString()) < 10) {
                    mes = 0 + mesComboBox.getSelectedItem().toString();
                } else {
                    mes = mesComboBox.getSelectedItem().toString();
                }
                String cum = dia + "/" + mes;

                String sql = "update Clientes set Nombre = ?, Ap_Paterno = ?, Cumple=?, Regalado=? where Tel_Celular like '%" + jTextField1.getText() + "%'";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, jTextField2.getText());
                pst.setString(2, jTextField3.getText());
                pst.setString(3, cum);
                pst.setString(4, "No");
                
                //En este método, el ID está representado por el valor 5 de la consulta
                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(this, "¡Datos actualizados correctamente!");
                    limpiar();
                    llenarComboDia();
                    llenarComboMes();
                    vaciarTabla();
                    verDatos();
                    nuevo.setEnabled(true);
                    guardar.setEnabled(false);
                    editar.setEnabled(false);
                    eliminar.setEnabled(false);
                    desabilitar();
                }

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Los datos no han sido actualizados correctamente        " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar el teléfono celular ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField1.requestFocus();
        } else if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar el nombre ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField2.requestFocus();
        } else if (jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar el apellido paterno ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField3.requestFocus();
        } else if (diaComboBox.getSelectedIndex() == -1 && mesComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Introduzca una fecha de cumpleaños válida");
        } else {
            try {
                String mes = "";
                String dia = "";
                if (Integer.parseInt(diaComboBox.getSelectedItem().toString()) < 10) {
                    dia = "0" + diaComboBox.getSelectedItem().toString();
                } else {
                    dia = diaComboBox.getSelectedItem().toString();
                }
                if (Integer.parseInt(mesComboBox.getSelectedItem().toString()) < 10) {
                    mes = 0 + mesComboBox.getSelectedItem().toString();
                } else {
                    mes = mesComboBox.getSelectedItem().toString();
                }
                String cumpleaños = dia + "/" + mes;
                Connection con = null;
                Conexion conect = new Conexion();
                con = conect.getConnection();
                Statement st = con.createStatement();

                String sql = "INSERT INTO Clientes (Tel_Celular,Nombre,Ap_Paterno,QC,Cumple,Regalado) VALUES (?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, jTextField1.getText());
                pst.setString(2, jTextField2.getText());
                pst.setString(3, jTextField3.getText());
                pst.setInt(4, 0);
                pst.setString(5, cumpleaños);
                pst.setString(6, "No");
                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(this, "¡Datos guardados correctamente!");
                    limpiar();

                    llenarComboDia();
                    llenarComboMes();
                    vaciarTabla();
                    verDatos();
                    nuevo.setEnabled(true);
                    guardar.setEnabled(false);
                    editar.setEnabled(false);
                    eliminar.setEnabled(false);
                    desabilitar();
                }
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(this, "El teléfono o las placas ya han sido registradas", "CHECAR TELÉFONO O PLACAS", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_guardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int fila = jTable2.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar este cliente?", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (opc == JOptionPane.YES_OPTION) {

                try {
                    Connection con = null;
                    Conexion conect = new Conexion();
                    con = conect.getConnection();

                    String sql = "delete * from CarrosdeClientes where Tel_Celular=?";
                    PreparedStatement st = con.prepareStatement(sql);

                    st.setString(1, jTextField1.getText());
                    st.executeUpdate();

                    eliminarDetalledeVenta(jTextField1.getText());

                    String sql2 = "delete from Clientes where Tel_Celular = ?";
                    PreparedStatement pst2 = con.prepareStatement(sql2);

                    pst2.setString(1, jTextField1.getText());
                    int n2 = pst2.executeUpdate();
                    if (n2 > 0) {
                        JOptionPane.showMessageDialog(this, "Datos eleiminados correctamente");
                        limpiar();
                        vaciarTabla();
                        verDatos();
                        nuevo.setEnabled(true);
                        guardar.setEnabled(false);
                        eliminar.setEnabled(false);
                        editar.setEnabled(false);
                        desabilitar();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Datos eliminados correctamente");
                }
            }
        }


    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminarDetalledeVenta(String celular) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();

            String sql = "delete * from DetalledeVenta where telcelular like '%" + celular + "%'";
            PreparedStatement st = con.prepareStatement(sql);
            st.executeUpdate();

            String sql2 = "delete * from Venta where telcel like '%" + celular + "%'";
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst2.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se pudieron eliminar los detalle de ventas o la venta del cliente" + ex);
        }
    }

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        try {
            int fila = jTable2.getSelectedRow();
            jTextField1.setText(jTable2.getValueAt(fila, 0).toString());
            jTextField2.setText(jTable2.getValueAt(fila, 1).toString());
            jTextField3.setText(jTable2.getValueAt(fila, 2).toString());
            nuevo.setEnabled(false);
            guardar.setEnabled(false);
            editar.setEnabled(true);
            eliminar.setEnabled(true);
            habilitar();
        } catch (Exception ex) {
            System.out.println("Error al seleccionar un equipo: " + ex.getMessage());
        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed


    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (Character.isDigit(evt.getKeyChar()) == false && evt.getKeyCode() != KeyEvent.VK_BACKSPACE) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void buscarTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTextFieldKeyTyped


    }//GEN-LAST:event_buscarTextFieldKeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped

        if (Character.isLetter(evt.getKeyChar()) == false && evt.getKeyCode() != KeyEvent.VK_BACKSPACE) {
            evt.consume();
            getToolkit().beep();
        }

    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String titulos[] = {"CELULAR", "NOMBRE", "APELLIDO_PATERNO", "QUALITY_COINS"};
        String[] registros = new String[5];

        String sql = "SELECT * FROM Clientes WHERE Tel_Celular LIKE '%" + buscarTextField.getText() + "%'";

        DefaultTableModel model = new DefaultTableModel(null, titulos);

        Conexion conect1 = new Conexion();
        Connection con2 = conect1.getConnection();

        try {
            Statement st = (Statement) con2.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("Tel_Celular");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Ap_Paterno");
                registros[3] = rs.getString("QC");
                model.addRow(registros);
            }
            jTable2.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTextFieldKeyPressed


    }//GEN-LAST:event_buscarTextFieldKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vaciarTabla();
        verDatos();
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void desabilitar() {
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);

    }

    public void habilitar() {
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
    }

    public void limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }

    public void vaciarTabla() {
        DefaultTableModel Modelo = (DefaultTableModel) jTable2.getModel();
        String titulos[] = {"CELULAR", "NOMBRE", "APELLIDO_PATERNO", "QUALITY_COINS", "CUMPLEAÑOS"};
        Modelo = new DefaultTableModel(null, titulos);
        jTable2.setModel(Modelo);
    }

    public void verDatos() {
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) jTable2.getModel();
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();

            String dts[] = new String[5];
            String sql = "select * from Clientes";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                dts[0] = rs.getString("Tel_Celular");
                dts[1] = rs.getString("Nombre");
                dts[2] = rs.getString("Ap_Paterno");
                dts[3] = rs.getString("QC");
                dts[4] = rs.getString("Cumple");
                miModelo.addRow(dts);
            }
            jTable2.setModel(miModelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pueden visualizar los datos: " + ex);
        }
    }

    private void llenarComboDia() {
        diaComboBox.removeAllItems();
        diaComboBox.addItem("Elige el día");
        for (int i = 1; i <= 31; i++) {
            diaComboBox.addItem(String.valueOf(i));
        }
    }

    private void llenarComboMes() {
        mesComboBox.removeAllItems();
        mesComboBox.addItem("Elige el mes");
        for (int i = 1; i <= 12; i++) {
            mesComboBox.addItem(String.valueOf(i));
        }
    }

    private void vaciarComboDia() {
        diaComboBox.removeAllItems();
        diaComboBox.addItem("Elige el día");
    }

    private void vaciarComboMes() {
        mesComboBox.removeAllItems();
        mesComboBox.addItem("Elige el mes");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarTextField;
    private javax.swing.JComboBox<String> diaComboBox;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> mesComboBox;
    private javax.swing.JButton nuevo;
    // End of variables declaration//GEN-END:variables
}
