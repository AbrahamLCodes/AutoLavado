package Clases;

import Atxy2k.CustomTextField.RestrictedTextField;
import static Clases.Vehiculos.res;
import Conexiones.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Buscar extends javax.swing.JInternalFrame {

    private Image data;
    private FileInputStream Cargar_Archivo;

    public Buscar() {
        initComponents();
        RestrictedTextField r = new RestrictedTextField(buscarTextField);
        r.setOnlyNums(true);
        r.setLimit(10);

        vaciarTabla();
        verDatos();

        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        buscarTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelDetalle = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tPagoLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        folioLabel = new javax.swing.JLabel();
        nSeviciosLabel = new javax.swing.JLabel();
        celularLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        sucursalLabel = new javax.swing.JLabel();
        autoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Ventas");

        buscarTextField.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Introduzca el número de teléfono");

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Fecha", "Nombre", "Apellido", "Celular", "N° Servicios", "Facturado", "Total"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        panelDetalle.setBackground(new java.awt.Color(51, 51, 51));
        panelDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Detalle de la Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Folio:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("N° Servicios");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Pago");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sucursal:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Celular:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre:");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Apellido:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Auto:");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total:");

        tPagoLabel.setBackground(new Color(0,0,0,0));
        tPagoLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tPagoLabel.setForeground(new java.awt.Color(255, 255, 255));
        tPagoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        fechaLabel.setBackground(new Color(0,0,0,0));
        fechaLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(255, 255, 255));
        fechaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        folioLabel.setBackground(new Color(0,0,0,0));
        folioLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        folioLabel.setForeground(new java.awt.Color(255, 255, 255));
        folioLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        nSeviciosLabel.setBackground(new Color(0,0,0,0));
        nSeviciosLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nSeviciosLabel.setForeground(new java.awt.Color(255, 255, 255));
        nSeviciosLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        celularLabel.setBackground(new Color(0,0,0,0));
        celularLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        celularLabel.setForeground(new java.awt.Color(255, 255, 255));
        celularLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        nombreLabel.setBackground(new Color(0,0,0,0));
        nombreLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        totalLabel.setBackground(new Color(0,0,0,0));
        totalLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        apellidoLabel.setBackground(new Color(0,0,0,0));
        apellidoLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        apellidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        sucursalLabel.setBackground(new Color(0,0,0,0));
        sucursalLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        sucursalLabel.setForeground(new java.awt.Color(255, 255, 255));
        sucursalLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        autoLabel.setBackground(new Color(0,0,0,0));
        autoLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        autoLabel.setForeground(new java.awt.Color(255, 255, 255));
        autoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(autoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addComponent(apellidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celularLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nSeviciosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(folioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tPagoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sucursalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(folioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(nSeviciosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tPagoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(fechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(sucursalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDetalleLayout.createSequentialGroup()
                                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(celularLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(apellidoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(autoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("Reestablecer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(buscarTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panelDetalle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
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

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaKeyPressed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        int fila = tabla.getSelectedRow();
        Object folio = tabla.getValueAt(fila, 0);
        int fol = Integer.parseInt(folio.toString());
        //Sí No
        Object facturado = tabla.getValueAt(fila, 6);
        String fac = String.valueOf(facturado);
        if (fac.equals("Sí")) {
            llenarDetalle(fol);
        } else if (fac.equals("No")) {
            limpiarDetalleDeVenta();
        }
        Object plac = tabla.getValueAt(fila, 7);
        String pla = plac.toString();
        cargarfoto(pla);

    }//GEN-LAST:event_tablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String titulos[] = {"FOLIO", "FECHA", "NOMBRE", "APELLIDO", "CELULAR", "N_SERVICIOS", "FACTURADO", "PLACA", "TOTAL"};
        String[] registros = new String[9];

        String sql = "SELECT * FROM Venta WHERE telcel LIKE '%" + buscarTextField.getText() + "%'";
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        Conexion conect1 = new Conexion();
        Connection con2 = conect1.getConnection();

        try {
            Statement st = (Statement) con2.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("folio");
                registros[1] = rs.getString("Fecha");
                registros[2] = rs.getString("Clientenombre");
                registros[3] = rs.getString("Clienteapellido");
                registros[4] = rs.getString("telcel");
                registros[5] = rs.getString("N_Servicios");
                if (rs.getBoolean("Factura") == true) {
                    registros[6] = "Sí";
                } else {
                    registros[6] = "No";
                }
                registros[7] = rs.getString("Placa");
                registros[8] = rs.getString("Total");
                model.addRow(registros);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vaciarTabla();
        verDatos();
        limpiarDetalleDeVenta();
        buscarTextField.setText("");
        labelFoto.setIcon(frameIcon);
    }//GEN-LAST:event_jButton2ActionPerformed

    private Image ConvertirImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        return reader.read(0, param);
    }

    public Image recuperarfotos(String placa) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            PreparedStatement pst = con.prepareStatement("Select CarrosdeClientes.Foto From CarrosdeClientes where CarrosdeClientes.Placa= ?");
            pst.setString(1, placa);
            res = pst.executeQuery();
            int i = 0;
            while (res.next()) {
                byte[] b = res.getBytes("Foto");
                data = ConvertirImagen(b);
                i++;
            }
            res.close();
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Clases.Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public void cargarfoto(String id) {
        Image dtCat = recuperarfotos(id);
        ImageIcon icon = new ImageIcon(dtCat);
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(400, 269, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        if (newIcon == null) {
            JOptionPane.showMessageDialog(null, "El vehiculo no tiene foto", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            labelFoto.setIcon(newIcon);
            labelFoto.setSize(labelFoto.getWidth(), labelFoto.getWidth());
        }
    }

    private void llenarDetalle(int folio) {
        String folo = String.valueOf(folio);
        String sql = "SELECT * FROM DetalledeVenta WHERE Folio LIKE '%" + folo + "%'";
        Conexion conect1 = new Conexion();
        Connection con2 = conect1.getConnection();
        try {
            Statement st = (Statement) con2.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                folioLabel.setText(rs.getString("Folio"));
                nSeviciosLabel.setText(rs.getString("N_Servicio"));
                tPagoLabel.setText(rs.getString("T_Pago"));
                fechaLabel.setText(rs.getString("Fecha"));
                totalLabel.setText(rs.getString("Total"));
                sucursalLabel.setText(rs.getString("Sucursal"));
                celularLabel.setText(rs.getString("telcelular"));
                nombreLabel.setText(rs.getString("Nombre"));
                apellidoLabel.setText(rs.getString("AP"));
                autoLabel.setText(rs.getString("Auto"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron obtener los datos LINEA 308" + ex);
        }

    }

    private void vaciarTabla() {
        DefaultTableModel Modelo = (DefaultTableModel) tabla.getModel();
        String titulos[] = {"FOLIO", "FECHA", "NOMBRE", "APELLIDO", "CELULAR", "N_SERVICIOS", "FACTURADO", "PLACA", "TOTAL"};
        Modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(Modelo);
    }

    private void verDatos() {
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) tabla.getModel();
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();

            //Seleccionando todos los datos de la tabla ventas 
            String dts[] = new String[9];
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
                dts[7] = rs.getString("Placa");
                dts[8] = rs.getString("Total");
                miModelo.addRow(dts);
            }
            tabla.setModel(miModelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pueden visualizar los datos: " + ex);
        }
    }

    private void limpiarDetalleDeVenta() {
        folioLabel.setText("");
        nSeviciosLabel.setText("");
        tPagoLabel.setText("");
        fechaLabel.setText("");
        totalLabel.setText("");
        sucursalLabel.setText("");
        celularLabel.setText("");
        nombreLabel.setText("");
        apellidoLabel.setText("");
        autoLabel.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JLabel autoLabel;
    private javax.swing.JTextField buscarTextField;
    private javax.swing.JLabel celularLabel;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel folioLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel nSeviciosLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JLabel sucursalLabel;
    private javax.swing.JLabel tPagoLabel;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
