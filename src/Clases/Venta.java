package Clases;

import Atxy2k.CustomTextField.RestrictedTextField;
import Conexiones.Conexion;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Venta extends javax.swing.JInternalFrame {

    private int contadorChar;
    private boolean iniciado, primerIntroducido;
    int total;
    private float qc1, qc2, qc3;
    private int contadorServicios;

    public Venta() {
        initComponents();

        RestrictedTextField r1 = new RestrictedTextField(telTextField);
        r1.setOnlyNums(true);
        r1.setLimit(10);

        RestrictedTextField r5 = new RestrictedTextField(codigoTextField);
        r5.setOnlyNums(true);
        r5.setLimit(3);

        vehiculoComboBox.removeAllItems();
        vehiculoComboBox.addItem("Seleccione un vehículo");

        sucursalComboBox.removeAllItems();
        sucursalComboBox.addItem("Seleccione una sucursal");

        contadorChar = 0;
        total = 0;
        contadorServicios = 0;

        qc1 = 0.0f;
        qc2 = 0.0f;
        qc3 = 0.0f;

        primerIntroducido = false;

        desactivar();
        limpiar();

        nombreTextField.setText("");
        vaciarTabla();
        verDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        placasTextField = new javax.swing.JTextField();
        apellidoTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        telTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        vehiculoComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        eliminarProducto = new javax.swing.JButton();
        facturaCheckBox = new javax.swing.JCheckBox();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        sucursalComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        qcLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        qcGenerados = new javax.swing.JLabel();
        qcPorGanar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nServiciosLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));
        jDesktopPane1.setForeground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Teléfono Celular");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vehículo");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Placas");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Código de Servicio");

        codigoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextFieldActionPerformed(evt);
            }
        });
        codigoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoTextFieldKeyTyped(evt);
            }
        });

        placasTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        apellidoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nombreTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        telTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        telTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telTextFieldKeyPressed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("\"Enter\" para ingresar código");

        vehiculoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vehiculoComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehiculoComboBoxMouseClicked(evt);
            }
        });
        vehiculoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculoComboBoxActionPerformed(evt);
            }
        });

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIPCIÓN", "P. UNITARIO"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalle);

        eliminarProducto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        eliminarProducto.setText("Eliminar Producto");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });

        facturaCheckBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        facturaCheckBox.setText("¿Desea Factura?");
        facturaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaCheckBoxActionPerformed(evt);
            }
        });

        nuevo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        nuevo.setText("Nueva Venta");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interface.png"))); // NOI18N
        guardar.setText("Registrar Venta");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sucursal");

        sucursalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sucursalComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sucursalComboBoxMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Quality Coins");

        qcLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        qcLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total:");

        totalLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("$");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("QC generados");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("QC Futuros");

        qcGenerados.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        qcGenerados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        qcPorGanar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        qcPorGanar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Número de Servicios:");

        nServiciosLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nServiciosLabel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(telTextField)
                        .addComponent(nombreTextField)
                        .addComponent(apellidoTextField)
                        .addComponent(placasTextField)
                        .addComponent(codigoTextField)
                        .addComponent(vehiculoComboBox, 0, 180, Short.MAX_VALUE))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facturaCheckBox)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11))
                                .addComponent(eliminarProducto))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sucursalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(20, 20, 20))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(38, 38, 38)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qcPorGanar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qcGenerados, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(guardar)
                                .addGap(18, 18, 18)
                                .addComponent(nuevo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nServiciosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eliminarProducto)
                                .addGap(18, 18, 18)
                                .addComponent(facturaCheckBox)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(apellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(vehiculoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(placasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(sucursalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(nServiciosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addComponent(qcGenerados, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(guardar)
                        .addComponent(nuevo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(qcPorGanar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Fecha", "Nombre", "Apellido", "Celular", "N_Servicios", "Total"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telTextFieldKeyPressed

        if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            if (contadorChar < 9) {
                contadorChar++;
            } else if (contadorChar == 9) {

                try {
                    Conexion conect1 = new Conexion();
                    Connection con2 = conect1.getConnection();
                    Statement st = (Statement) con2.createStatement();
                    ResultSet rs2 = st.executeQuery("SELECT * FROM Clientes WHERE Tel_Celular LIKE '%" + telTextField.getText() + "%'");

                    while (rs2.next()) {
                        nombreTextField.setText(rs2.getString("Nombre"));
                        apellidoTextField.setText(rs2.getString("Ap_Paterno"));
                        qc1 = Integer.parseInt(rs2.getString("QC"));
                        int xx = (int) qc1;
                        qcLabel.setText(String.valueOf(xx));
                    }

                    llenarComboSucursal();
                    llenarComboVehiculos();
                    iniciado = true;

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Se produjo un error: " + ex);
                }
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

            if (contadorChar > 0) {
                contadorChar--;
            }
            vaciarComboVehiculos();
            vaciarComboSucursal();

            nombreTextField.setText("");
            apellidoTextField.setText("");

            nServiciosLabel.setText("");
            totalLabel.setText("");
            qcLabel.setText("");
            qcGenerados.setText("");
            qcPorGanar.setText("");

            placasTextField.setText("");
            codigoTextField.setText("");
            facturaCheckBox.setSelected(false);
            vaciarTabla2();

        }
    }//GEN-LAST:event_telTextFieldKeyPressed

    private void vehiculoComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiculoComboBoxMouseClicked
        if (contadorChar < 9) {
            JOptionPane.showMessageDialog(null, "Introduzca un número de celular válido");
        }
    }//GEN-LAST:event_vehiculoComboBoxMouseClicked

    private void sucursalComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sucursalComboBoxMouseClicked
        if (contadorChar < 9) {
            JOptionPane.showMessageDialog(null, "Introduzca un número de celular válido");
        }
    }//GEN-LAST:event_sucursalComboBoxMouseClicked

    private void vehiculoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculoComboBoxActionPerformed
        vehiculoComboBox.transferFocus();

        if (iniciado == true) {
            try {
                ResultSet rs = null;
                Connection con2 = null;
                Conexion conect2 = new Conexion();
                con2 = conect2.getConnection();

                Statement Sent = con2.createStatement();
                ResultSet rs1 = Sent.executeQuery("select * from CarrosdeClientes where Carro = '" + this.vehiculoComboBox.getSelectedItem().toString() + "'");

                rs1.next();
                /*
                char[] placas = new char[9];

                int i1 = 0;
                String plac="";

                for (int i = 0; i < 7; i++) {
                    System.out.println(i1);
                    
                    if (i == 3) {
                        placas[i1] = '-';
                        i1=i1+1;
                    } else if (i == 6) {
                        placas[i1] = '-';
                        i1=i1+1;
                    } else {
                        placas[i1] = String.valueOf(rs1.getString("Placa")).charAt(i);
                        i1=i1+1;
                    }
                    
                    plac=plac+placas[i1];
                    
                }
                 */
                //String.valueOf(rs1.getString("Placa"));
                placasTextField.setText(String.valueOf(rs1.getString("Placa")));

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }


    }//GEN-LAST:event_vehiculoComboBoxActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        activar();
    }//GEN-LAST:event_nuevoActionPerformed

    private void codigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextFieldActionPerformed


    }//GEN-LAST:event_codigoTextFieldActionPerformed

    private void codigoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoTextFieldKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (Integer.parseInt(codigoTextField.getText()) >= 500 && Integer.parseInt(codigoTextField.getText()) <= 520) {
                introducirServicio();
                codigoTextField.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Introduzca un código válido");
                codigoTextField.setText("");
            }

        }
    }//GEN-LAST:event_codigoTextFieldKeyPressed

    private void codigoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoTextFieldKeyTyped

    }//GEN-LAST:event_codigoTextFieldKeyTyped

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed

        int fila = tablaDetalle.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tablaDetalle.getModel();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            int o = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar este servicio? ", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (o == JOptionPane.YES_OPTION) {
                int menos = Integer.parseInt(modelo.getValueAt(fila, 2).toString());
                int tot = Integer.parseInt(totalLabel.getText());
                int tota = tot - menos;
                totalLabel.setText(String.valueOf(tota));
                qc2 = tota * .2f;
                int xx = (int) qc2;
                qcGenerados.setText(String.valueOf(xx));
                qc3 = qc2 + qc1;
                int xy = (int) qc3;
                qcPorGanar.setText(String.valueOf(xy));
                modelo.removeRow(fila);
                contadorServicios--;
                nServiciosLabel.setText(String.valueOf(contadorServicios));
            }
        }
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        int opc = 0;
        boolean correcto = false;

        if (telTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduzca un número de teléfono válido", "Advertencia", JOptionPane.ERROR_MESSAGE);
        } else if (nombreTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduzca un nombre", "Advertencia", JOptionPane.ERROR_MESSAGE);
        } else if (apellidoTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduzca un apellido válido", "Advertencia", JOptionPane.ERROR_MESSAGE);
        } else if (vehiculoComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Introduzca un vehículo válido", "Advertencia", JOptionPane.ERROR_MESSAGE);
        } else if (placasTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduzca placas válidas", "Advertencia", JOptionPane.ERROR_MESSAGE);
        } else if (nServiciosLabel.getText().isEmpty() || Integer.parseInt(nServiciosLabel.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "Registre al menos un servicio", "Advertencia", JOptionPane.ERROR_MESSAGE);
        } else if (sucursalComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Introduzca una sucursal", "Advertencia", JOptionPane.ERROR_MESSAGE);
        } else {
            do {
                while (correcto == false) {
                    try {
                        opc = Integer.parseInt(JOptionPane.showInputDialog(this, "¿Cómo desea efectuar su pago?\n1° Quality Coins\n2° Tarjeta de Crédito/Débito\n3° Efectivo", "Introduzca método de pago"));
                        correcto = true;
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this, "Introduzca una opción válida", "Dato erróneo", JOptionPane.WARNING_MESSAGE);
                        correcto = false;
                    }
                }

                if (correcto == true) {

                    correcto = false;
                    switch (opc) {

                        case 1:
                            correcto = true;
                            pagarQC();
                            break;

                        case 2:
                            correcto = true;
                            pagarTarjta();
                            break;

                        case 3:
                            correcto = true;
                            pagarEfectivo();
                            break;

                        default:
                            JOptionPane.showMessageDialog(this, "Introduzca una opción válida", "Dato erróneo", JOptionPane.WARNING_MESSAGE);
                            correcto = false;
                            break;

                    }

                }
            } while (correcto == false);
        }


    }//GEN-LAST:event_guardarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked


    }//GEN-LAST:event_tablaMouseClicked

    private void facturaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaCheckBoxActionPerformed
        int to = 0;
        if (facturaCheckBox.isSelected()) {
            if (totalLabel.getText().isEmpty()) {
                to = 0 + 20;
            } else {
                to = Integer.parseInt(totalLabel.getText()) + 20;
            }
        } else {
            to = Integer.parseInt(totalLabel.getText()) - 20;
        }
        totalLabel.setText(String.valueOf(to));
    }//GEN-LAST:event_facturaCheckBoxActionPerformed

    private void pagarTarjta() {
        boolean check = false;
        if (facturaCheckBox.isSelected()) {
            check = true;
        } else {
            check = false;
        }

        String telcelular = telTextField.getText();
        String Nombre = nombreTextField.getText();
        String AP = apellidoTextField.getText();
        String Auto = vehiculoComboBox.getSelectedItem().toString();
        String Sucursal = sucursalComboBox.getSelectedItem().toString();
        String Placa = placasTextField.getText();
        int nServ = Integer.parseInt(nServiciosLabel.getText());
        int tota = Integer.parseInt(totalLabel.getText());

        boolean correcto = false;
        try {
            Connection con1 = null;
            PreparedStatement ps = null;
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();

            String Update = "UPDATE Clientes SET QC = QC+" + qcPorGanar.getText() + " WHERE Tel_Celular = '" + telTextField.getText() + "'";
            ps = con1.prepareStatement(Update);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "La venta fue realizada correctamente");
            correcto = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos:     " + ex);
            correcto = false;
        }

        if (correcto == true) {

            try {

                Connection con = null;
                Conexion conect = new Conexion();
                con = conect.getConnection();
                Statement st = con.createStatement();

                String sql = "INSERT INTO Venta (Fecha,Clientenombre,Clienteapellido,telcel,N_Servicios,Total,Factura,Placa) values (?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, Principal.getFechal().getText());
                pst.setString(2, nombreTextField.getText());
                pst.setString(3, apellidoTextField.getText());
                pst.setString(4, telTextField.getText());
                pst.setInt(5, Integer.parseInt(nServiciosLabel.getText()));
                pst.setInt(6, Integer.parseInt(totalLabel.getText()));
                pst.setBoolean(7, check);
                pst.setString(8, placasTextField.getText());
                int n1 = pst.executeUpdate();
                if (n1 > 0) {
                    iniciado = false;
                    contadorChar = 0;
                    contadorServicios = 0;

                    JOptionPane.showMessageDialog(this, "¡Datos guardados correctamente!");

                    desactivar();
                    limpiar();
                    vaciarTabla();
                    vaciarTabla2();
                    verDatos();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al registrar venta LINEA 785" + ex, "Advertencia", JOptionPane.ERROR_MESSAGE);
            }
            if (check == true) {
                try {
                    Connection con = null;
                    Conexion conect = new Conexion();
                    con = conect.getConnection();
                    Statement st = con.createStatement();

                    //Introducir dentro detalle de venta
                    String sql = "INSERT INTO DetalledeVenta (Folio,N_Servicio,T_Pago,Fecha,Total,Sucursal,telcelular,Nombre,AP,Auto,Placa) values (?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(sql);

                    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                    int ultimafila = tabla.getRowCount() - 1;

                    Object fol = modelo.getValueAt(ultimafila, 0);
                    pst.setInt(1, Integer.parseInt(fol.toString()));
                    pst.setInt(2, nServ);
                    pst.setString(3, "Tarjeta");
                    pst.setString(4, Principal.getFechal().getText());
                    pst.setInt(5, tota);
                    pst.setString(6, Sucursal);
                    pst.setString(7, telcelular);
                    pst.setString(8, Nombre);
                    pst.setString(9, AP);
                    pst.setString(10, Auto);
                    pst.setString(11, Placa);

                    int n1 = pst.executeUpdate();
                    if (n1 > 0) {
                        JOptionPane.showMessageDialog(null, "Detalle de venta guardado correctamente");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "El detalle de venta no se pudo guardar correctamente LINEA 818:          " + ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

    }

    private void pagarEfectivo() {
        boolean check = false;
        if (facturaCheckBox.isSelected()) {
            check = true;
        } else {
            check = false;
        }

        String telcelular = telTextField.getText();
        String Nombre = nombreTextField.getText();
        String AP = apellidoTextField.getText();
        String Auto = vehiculoComboBox.getSelectedItem().toString();
        String Sucursal = sucursalComboBox.getSelectedItem().toString();
        String Placa = placasTextField.getText();
        int nServ = Integer.parseInt(nServiciosLabel.getText());
        int tota = Integer.parseInt(totalLabel.getText());

        boolean correcto = false;
        try {
            Connection con1 = null;
            PreparedStatement ps = null;
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();

            String Update = "UPDATE Clientes SET QC = QC" + qcPorGanar.getText() + " WHERE Tel_Celular = '" + telTextField.getText() + "'";
            ps = con1.prepareStatement(Update);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "La venta fue realizada correctamente");
            correcto = true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos:     " + ex);
            correcto = false;
        }

        if (correcto == true) {

            try {

                Connection con = null;
                Conexion conect = new Conexion();
                con = conect.getConnection();
                Statement st = con.createStatement();

                String sql = "INSERT INTO Venta (Fecha,Clientenombre,Clienteapellido,telcel,N_Servicios,Total,Factura,Placa) values (?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, Principal.getFechal().getText());
                pst.setString(2, nombreTextField.getText());
                pst.setString(3, apellidoTextField.getText());
                pst.setString(4, telTextField.getText());
                pst.setInt(5, Integer.parseInt(nServiciosLabel.getText()));
                pst.setInt(6, Integer.parseInt(totalLabel.getText()));
                pst.setBoolean(7, check);
                pst.setString(8, placasTextField.getText());
                int n1 = pst.executeUpdate();
                if (n1 > 0) {
                    iniciado = false;
                    contadorChar = 0;
                    contadorServicios = 0;

                    JOptionPane.showMessageDialog(this, "¡Datos guardados correctamente!");

                    desactivar();
                    limpiar();
                    vaciarTabla();
                    vaciarTabla2();
                    verDatos();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al registrar venta LINEA 785" + ex, "Advertencia", JOptionPane.ERROR_MESSAGE);
            }
            if (check == true) {
                try {
                    Connection con = null;
                    Conexion conect = new Conexion();
                    con = conect.getConnection();
                    Statement st = con.createStatement();

                    //Introducir dentro detalle de venta
                    String sql = "INSERT INTO DetalledeVenta (Folio,N_Servicio,T_Pago,Fecha,Total,Sucursal,telcelular,Nombre,AP,Auto,Placa) values (?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(sql);

                    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                    int ultimafila = tabla.getRowCount() - 1;

                    Object fol = modelo.getValueAt(ultimafila, 0);
                    pst.setInt(1, Integer.parseInt(fol.toString()));
                    pst.setInt(2, nServ);
                    pst.setString(3, "Efectivo");
                    pst.setString(4, Principal.getFechal().getText());
                    pst.setInt(5, tota);
                    pst.setString(6, Sucursal);
                    pst.setString(7, telcelular);
                    pst.setString(8, Nombre);
                    pst.setString(9, AP);
                    pst.setString(10, Auto);
                    pst.setString(11, Placa);

                    int n1 = pst.executeUpdate();
                    if (n1 > 0) {
                        JOptionPane.showMessageDialog(null, "Detalle de venta guardado correctamente");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "El detalle de venta no se pudo guardar correctamente LINEA 818:          " + ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }

    private void pagarQC() {
        //Se pagará únicamente con Quality Coins

        boolean check = false;
        if (facturaCheckBox.isSelected()) {
            check = true;
        } else {
            check = false;
        }

        String telcelular = telTextField.getText();
        String Nombre = nombreTextField.getText();
        String AP = apellidoTextField.getText();
        String Auto = vehiculoComboBox.getSelectedItem().toString();
        String Sucursal = sucursalComboBox.getSelectedItem().toString();
        String Placa= placasTextField.getText();
        int nServ = Integer.parseInt(nServiciosLabel.getText());
        int tota = Integer.parseInt(totalLabel.getText());

        //Si sobran Quality coins
        if (Integer.parseInt(qcPorGanar.getText()) > Integer.parseInt(totalLabel.getText())) {
            //actualizar QualityCoins
            boolean correcto = false;
            try {
                Connection con1 = null;
                PreparedStatement ps = null;
                Conexion conect1 = new Conexion();
                con1 = conect1.getConnection();

                String Update = "UPDATE Clientes SET QC = " + qcPorGanar.getText() + "-" + totalLabel.getText() + " WHERE Tel_Celular = '" + telTextField.getText() + "'";
                ps = con1.prepareStatement(Update);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "La venta fue realizada correctamente");
                correcto = true;

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la base de datos:     " + ex);
                correcto = false;
            }

            //Insertar datos en la tabla de Ventas
            if (correcto == true) {

                try {

                    Connection con = null;
                    Conexion conect = new Conexion();
                    con = conect.getConnection();
                    Statement st = con.createStatement();

                    String sql = "INSERT INTO Venta (Fecha,Clientenombre,Clienteapellido,telcel,N_Servicios,Total,Factura,Placa) values (?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, Principal.getFechal().getText());
                    pst.setString(2, nombreTextField.getText());
                    pst.setString(3, apellidoTextField.getText());
                    pst.setString(4, telTextField.getText());
                    pst.setInt(5, Integer.parseInt(nServiciosLabel.getText()));
                    pst.setInt(6, Integer.parseInt(totalLabel.getText()));
                    pst.setBoolean(7, check);
                    pst.setString(8, placasTextField.getText());
                    int n1 = pst.executeUpdate();
                    if (n1 > 0) {
                        iniciado = false;
                        contadorChar = 0;
                        contadorServicios = 0;

                        JOptionPane.showMessageDialog(this, "¡Datos guardados correctamente!");

                        desactivar();
                        limpiar();
                        vaciarTabla();
                        vaciarTabla2();
                        verDatos();
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al registrar venta LINEA 785" + ex, "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
                if (check == true) {
                    try {
                        Connection con = null;
                        Conexion conect = new Conexion();
                        con = conect.getConnection();
                        Statement st = con.createStatement();

                        //Introducir dentro detalle de venta
                        String sql = "INSERT INTO DetalledeVenta (Folio,N_Servicio,T_Pago,Fecha,Total,Sucursal,telcelular,Nombre,AP,Auto,Placa) values (?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement pst = con.prepareStatement(sql);

                        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                        int ultimafila = tabla.getRowCount() - 1;

                        Object fol = modelo.getValueAt(ultimafila, 0);
                        pst.setInt(1, Integer.parseInt(fol.toString()));
                        pst.setInt(2, nServ);
                        pst.setString(3, "QC");
                        pst.setString(4, Principal.getFechal().getText());
                        pst.setInt(5, tota);
                        pst.setString(6, Sucursal);
                        pst.setString(7, telcelular);
                        pst.setString(8, Nombre);
                        pst.setString(9, AP);
                        pst.setString(10, Auto);
                        pst.setString(11, Placa);

                        int n1 = pst.executeUpdate();
                        if (n1 > 0) {
                            JOptionPane.showMessageDialog(null, "Detalle de venta guardado correctamente");
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "El detalle de venta no se pudo guardar correctamente LINEA 818:          " + ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }

            //Si faltaron Quality Coins
        } else if (Integer.parseInt(qcPorGanar.getText()) < Integer.parseInt(totalLabel.getText())) {

            int pagar = Integer.parseInt(totalLabel.getText()) - Integer.parseInt(qcPorGanar.getText());
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Falta por pagar: " + pagar + "\n¿Cómo desea hacer el resto de la compra?\n1* Efectivo\n2* Tarjeta\n3* Cancelar"));

            switch (opc) {
                case 1:

                    int n = JOptionPane.showConfirmDialog(this, "¿Desea continuar con la venta?");
                    if (n == JOptionPane.YES_OPTION) {
                        boolean correcto = false;

                        try {
                            Connection con1 = null;
                            PreparedStatement ps = null;
                            Conexion conect1 = new Conexion();
                            con1 = conect1.getConnection();
                            String Update = "UPDATE Clientes SET QC = 0 WHERE Tel_Celular = '" + telTextField.getText() + "'";
                            ps = con1.prepareStatement(Update);
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(this, "La venta fue realizada correctamente");
                            correcto = true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Error en la base de datos: LINEA 847 " + ex);
                            correcto = false;
                        }

                        if (correcto == true) {
                            //Introduciendo dentro de venta

                            try {

                                Connection con = null;
                                Conexion conect = new Conexion();
                                con = conect.getConnection();
                                Statement st = con.createStatement();

                                String sql = "INSERT INTO Venta (Fecha,Clientenombre,Clienteapellido,telcel,N_Servicios,Total,Factura,Placa) values (?,?,?,?,?,?,?,?)";
                                PreparedStatement pst = con.prepareStatement(sql);
                                pst.setString(1, Principal.getFechal().getText());
                                pst.setString(2, nombreTextField.getText());
                                pst.setString(3, apellidoTextField.getText());
                                pst.setString(4, telTextField.getText());
                                pst.setInt(5, Integer.parseInt(nServiciosLabel.getText()));
                                pst.setInt(6, Integer.parseInt(totalLabel.getText()));
                                pst.setBoolean(7, check);
                                pst.setString(8, placasTextField.getText());
                                int n1 = pst.executeUpdate();
                                if (n1 > 0) {
                                    iniciado = false;
                                    contadorChar = 0;
                                    contadorServicios = 0;

                                    JOptionPane.showMessageDialog(this, "¡Datos guardados correctamente!");

                                    desactivar();
                                    limpiar();
                                    vaciarTabla();
                                    vaciarTabla2();
                                    verDatos();
                                }

                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(this, "Error al registrar venta LINEA 886     " + ex, "Advertencia", JOptionPane.ERROR_MESSAGE);
                            }
                            if (check == true) {
                                try {
                                    Connection con = null;
                                    Conexion conect = new Conexion();
                                    con = conect.getConnection();
                                    Statement st = con.createStatement();

                                    //Introducir dentro detalle de venta
                                    String sql = "INSERT INTO DetalledeVenta (Folio,N_Servicio,T_Pago,Fecha,Total,Sucursal,telcelular,Nombre,AP,Auto,Placa) values (?,?,?,?,?,?,?,?,?,?,?)";
                                    PreparedStatement pst = con.prepareStatement(sql);

                                    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                                    int ultimafila = tabla.getRowCount() - 1;

                                    Object fol = modelo.getValueAt(ultimafila, 0);
                                    pst.setInt(1, Integer.parseInt(fol.toString()));
                                    pst.setInt(2, nServ);
                                    pst.setString(3, "QC y Efectivo");
                                    pst.setString(4, Principal.getFechal().getText());
                                    pst.setInt(5, tota);
                                    pst.setString(6, Sucursal);
                                    pst.setString(7, telcelular);
                                    pst.setString(8, Nombre);
                                    pst.setString(9, AP);
                                    pst.setString(10, Auto);
                                    pst.setString(11, Placa);

                                    int n1 = pst.executeUpdate();
                                    if (n1 > 0) {
                                        JOptionPane.showMessageDialog(null, "Detalle de venta guardado correctamente");
                                    }
                                } catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(this, "El detalle de venta no se pudo guardar correctamente: LINEA 919         " + ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }

                    } else if (n == JOptionPane.NO_OPTION) {
                        break;
                    }
                    break;

                case 2:
                    int n3 = JOptionPane.showConfirmDialog(this, "¿Desea continuar con la venta?");
                    if (n3 == JOptionPane.YES_OPTION) {
                        boolean correcto = false;
                        try {
                            Connection con1 = null;
                            PreparedStatement ps = null;
                            Conexion conect1 = new Conexion();
                            con1 = conect1.getConnection();
                            String Update = "UPDATE Clientes SET QC = 0 WHERE Tel_Celular = '" + telTextField.getText() + "'";
                            ps = con1.prepareStatement(Update);
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(this, "La venta fue realizada correctamente");
                            correcto = true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Error en la base de datos:    LINEA 944 " + ex);
                            correcto = false;
                        }
                        if (correcto == true) {

                            //Introduciendo datos dentro de venta
                            try {

                                Connection con = null;
                                Conexion conect = new Conexion();
                                con = conect.getConnection();
                                Statement st = con.createStatement();

                                String sql = "INSERT INTO Venta (Fecha,Clientenombre,Clienteapellido,telcel,N_Servicios,Total,Factura,Placa) values (?,?,?,?,?,?,?,?)";
                                PreparedStatement pst = con.prepareStatement(sql);
                                pst.setString(1, Principal.getFechal().getText());
                                pst.setString(2, nombreTextField.getText());
                                pst.setString(3, apellidoTextField.getText());
                                pst.setString(4, telTextField.getText());
                                pst.setInt(5, Integer.parseInt(nServiciosLabel.getText()));
                                pst.setInt(6, Integer.parseInt(totalLabel.getText()));
                                pst.setBoolean(7, check);
                                pst.setString(8, placasTextField.getText());
                                int n1 = pst.executeUpdate();
                                if (n1 > 0) {
                                    iniciado = false;
                                    contadorChar = 0;
                                    contadorServicios = 0;

                                    JOptionPane.showMessageDialog(this, "¡Datos guardados correctamente!");

                                    desactivar();
                                    limpiar();
                                    vaciarTabla();
                                    vaciarTabla2();
                                    verDatos();
                                }

                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(this, "Error al registrar venta LINEA 982" + ex, "Advertencia", JOptionPane.ERROR_MESSAGE);
                            }
                            if (check == true) {
                                try {
                                    Connection con = null;
                                    Conexion conect = new Conexion();
                                    con = conect.getConnection();
                                    Statement st = con.createStatement();

                                    //Introducir dentro detalle de venta
                                    String sql = "INSERT INTO DetalledeVenta (Folio,N_Servicio,T_Pago,Fecha,Total,Sucursal,telcelular,Nombre,AP,Auto,Placa) values (?,?,?,?,?,?,?,?,?,?,?)";
                                    PreparedStatement pst = con.prepareStatement(sql);

                                    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                                    int ultimafila = tabla.getRowCount() - 1;

                                    Object fol = modelo.getValueAt(ultimafila, 0);
                                    pst.setInt(1, Integer.parseInt(fol.toString()));
                                    pst.setInt(2, nServ);
                                    pst.setString(3, "QC y tarjeta");
                                    pst.setString(4, Principal.getFechal().getText());
                                    pst.setInt(5, tota);
                                    pst.setString(6, Sucursal);
                                    pst.setString(7, telcelular);
                                    pst.setString(8, Nombre);
                                    pst.setString(9, AP);
                                    pst.setString(10, Auto);
                                    pst.setString(11, Placa);

                                    int n1 = pst.executeUpdate();
                                    if (n1 > 0) {
                                        JOptionPane.showMessageDialog(null, "Detalle de venta guardado correctamente");
                                    }
                                } catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(this, "El detalle de venta no se pudo guardar correctamente: LINEA 1015         " + ex, "Advertencia", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }
                    } else if (n3 == JOptionPane.NO_OPTION) {
                        break;
                    }
                    break;
                case 3:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Introduzca una opción válida", "Advertencia", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private void llenarComboVehiculos() {
        try {
            vehiculoComboBox.removeAllItems();
            vehiculoComboBox.addItem("Seleccione un vehículo");
            ResultSet rs = null;
            Connection con3 = null;
            Conexion conect3 = new Conexion();
            con3 = conect3.getConnection();
            Statement Sent = con3.createStatement();
            rs = Sent.executeQuery("SELECT * FROM CarrosdeClientes WHERE Tel_Celular LIKE '%" + telTextField.getText() + "%'");
            while (rs.next()) {
                vehiculoComboBox.addItem(rs.getString("Carro"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al agregar datos al ComboBox de vehículos:    " + ex);
        }
    }

    private void llenarComboSucursal() {
        try {
            sucursalComboBox.removeAllItems();
            sucursalComboBox.addItem("Seleccione una sucursal");
            ResultSet rs = null;
            Connection con3 = null;
            Conexion conect3 = new Conexion();
            con3 = conect3.getConnection();
            Statement Sent = con3.createStatement();
            rs = Sent.executeQuery("select * from Sucursales");
            while (rs.next()) {
                sucursalComboBox.addItem(rs.getString("Sucursal"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al agregar datos al ComboBox" + ex);
        }
    }

    private void vaciarComboVehiculos() {
        vehiculoComboBox.removeAllItems();
        vehiculoComboBox.addItem("Seleccione un vehículo");
    }

    private void vaciarComboSucursal() {
        sucursalComboBox.removeAllItems();
        sucursalComboBox.addItem("Seleccione una sucursal");
    }

    //Vaciar de todo a todo
    private void limpiar() {
        vaciarComboVehiculos();
        vaciarComboSucursal();
        telTextField.setText("");
        nombreTextField.setText("");
        apellidoTextField.setText("");

        nServiciosLabel.setText("");
        totalLabel.setText("");
        qcLabel.setText("");
        qcGenerados.setText("");
        qcPorGanar.setText("");

        placasTextField.setText("");
        codigoTextField.setText("");
        facturaCheckBox.setSelected(false);

        resetear();
    }

    private void resetear() {
        contadorChar = 0;
        total = 0;
        contadorServicios = 0;

        qc1 = 0.0f;
        qc2 = 0.0f;
        qc3 = 0.0f;
    }

    private void activar() {
        telTextField.setEnabled(true);
        nombreTextField.setEnabled(true);
        apellidoTextField.setEnabled(true);
        nombreTextField.setEditable(false);
        apellidoTextField.setEditable(false);
        vehiculoComboBox.setEnabled(true);
        placasTextField.setEnabled(true);
        placasTextField.setEditable(false);
        codigoTextField.setEnabled(true);
        sucursalComboBox.setEnabled(true);
    }

    private void desactivar() {
        telTextField.setEnabled(false);
        nombreTextField.setEnabled(false);
        apellidoTextField.setEnabled(false);
        vehiculoComboBox.setEnabled(false);
        placasTextField.setEnabled(false);
        codigoTextField.setEnabled(false);
        sucursalComboBox.setEnabled(false);
    }

    private void introducirServicio() {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String dts[] = new String[3];
            String sql = "select * from Servicios where T_Servicio=" + codigoTextField.getText();

            DefaultTableModel modelo = (DefaultTableModel) tablaDetalle.getModel();

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            dts[0] = rs.getString("T_Servicio");
            dts[1] = rs.getString("Descripcion");
            dts[2] = rs.getString("precio");
            if (primerIntroducido == false) {
                total = total + Integer.parseInt(rs.getString("precio"));
                totalLabel.setText(String.valueOf(total));
                qc2 = qc2 + total * .02f;
                int xx = (int) qc2;
                qcGenerados.setText(String.valueOf(xx));
                primerIntroducido = true;
                qc3 = qc2 + qc1;
                int xy = (int) qc3;
                qcPorGanar.setText(String.valueOf(xy));

            } else {
                if (totalLabel.getText().isEmpty()) {
                    total = 0;
                } else {
                    total = Integer.parseInt(totalLabel.getText());
                }
                total = total + Integer.parseInt(rs.getString("precio"));
                totalLabel.setText(String.valueOf(total));
                qc2 = total * .02f;
                int xx = (int) qc2;
                qcGenerados.setText(String.valueOf(xx));
                qc3 = qc2 + qc1;
                int xy = (int) qc3;
                qcPorGanar.setText(String.valueOf(xy));
            }

            modelo.addRow(dts);
            contadorServicios++;
            nServiciosLabel.setText(String.valueOf(contadorServicios));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hubo un error al obtener los servicios         " + ex);
        }
    }

    private void vaciarTabla() {
        DefaultTableModel Modelo = (DefaultTableModel) tabla.getModel();
        String titulos[] = {"FOLIO", "FECHA", "NOMBRE", "APELLIDO", "CELULAR", "N_SERVICIOS", "FACTURADO", "TOTAL"};
        Modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(Modelo);
    }

    private void vaciarTabla2() {
        DefaultTableModel Modelo = (DefaultTableModel) tablaDetalle.getModel();
        String titulos[] = {"CÓDIGO", "DESCRIPCIÓN", "P.UNITARIO"};
        Modelo = new DefaultTableModel(null, titulos);
        tablaDetalle.setModel(Modelo);
    }

    private void verDatos() {
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) tabla.getModel();
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();

            //Seleccionando todos los datos de la tabla ventas 
            String dts[] = new String[8];
            String sql = "select * from Venta";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                dts[0] = rs.getString("folio");
                dts[1] = rs.getString("Fecha");
                dts[2] = rs.getString("Clientenombre");
                dts[3] = rs.getString("Clienteapellido");
                dts[4] = rs.getString("telcel");
                dts[5] = rs.getString("N_Servicios");
                if (rs.getBoolean("Factura") == true) {
                    dts[6] = "Sí";
                } else {
                    dts[6] = "No";
                }
                dts[7] = rs.getString("Total");
                miModelo.addRow(dts);
            }
            tabla.setModel(miModelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pueden visualizar los datos: " + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JCheckBox facturaCheckBox;
    private javax.swing.JButton guardar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nServiciosLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextField placasTextField;
    private javax.swing.JLabel qcGenerados;
    private javax.swing.JLabel qcLabel;
    private javax.swing.JLabel qcPorGanar;
    private javax.swing.JComboBox<String> sucursalComboBox;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField telTextField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JComboBox<String> vehiculoComboBox;
    // End of variables declaration//GEN-END:variables
}
