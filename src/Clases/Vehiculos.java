package Clases;

import Atxy2k.CustomTextField.RestrictedTextField;
import Conexiones.Conexion;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Vehiculos extends javax.swing.JInternalFrame {

    private Image data;
    FileInputStream Cargar_Archivo;
    int contador = 0;
    static ResultSet res;

    public Vehiculos() {
        initComponents();
        nuevo.setEnabled(true);
        guardar.setEnabled(false);
        editar.setEnabled(false);
        eliminar.setEnabled(false);
        imagen.setEnabled(false);
        reestablecer.setEnabled(false);
        
        
        
        desabilitar();
        vaciarTabla();
        verDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        carroTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        placasTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        editar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        urlFoto = new javax.swing.JLabel();
        imagen = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        buscarTextField = new javax.swing.JTextField();
        nuevo1 = new javax.swing.JButton();
        reestablecer = new javax.swing.JButton();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(1200, 720));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehículos");

        jTable1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carro");

        carroTextField.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Placas");

        placasTextField.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono Celular");

        telTextField.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar por número de teléfono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        editar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-document.png"))); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        nuevo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dvavd.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("URL");

        urlFoto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        urlFoto.setForeground(new java.awt.Color(255, 255, 255));
        urlFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imagen.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        imagen.setText("Agregar Imágen");
        imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save-disk.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        buscarTextField.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buscarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTextFieldActionPerformed(evt);
            }
        });
        buscarTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarTextFieldKeyTyped(evt);
            }
        });

        nuevo1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nuevo1.setText("Buscar");
        nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo1ActionPerformed(evt);
            }
        });

        reestablecer.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        reestablecer.setText("Reestablecer");
        reestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reestablecerActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carroTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(placasTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(telTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(editar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(urlFoto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(imagen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(guardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(buscarTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nuevo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(reestablecer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(carroTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(placasTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(53, 172, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addGap(111, 111, 111))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nuevo1))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(nuevo)
                                        .addGap(18, 18, 18)
                                        .addComponent(editar)
                                        .addGap(18, 18, 18)
                                        .addComponent(eliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(guardar))
                                    .addComponent(jLabel5)
                                    .addComponent(reestablecer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(urlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(imagen))
                                .addGap(70, 70, 70))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(carroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(20, 20, 20)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(placasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(telTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editar)
                                    .addComponent(nuevo)
                                    .addComponent(eliminar)
                                    .addComponent(guardar))
                                .addGap(18, 18, 18)
                                .addComponent(buscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nuevo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(urlFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imagen)
                    .addComponent(reestablecer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        limpiar();
        habilitar();
        nuevo.setEnabled(false);
        guardar.setEnabled(true);
        imagen.setEnabled(true);
        editar.setEnabled(false);
        eliminar.setEnabled(false);
        vaciarTabla();
        verDatos();
    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        if (carroTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar el modelo del vehículo");
            carroTextField.requestFocus();
        } else if (placasTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar las placas del vehículo");
            placasTextField.requestFocus();
        } else if (telTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar el telefono del propietario");
            telTextField.requestFocus();
        } else if (urlFoto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta ingresar la foto del vehículo");
        } else {
            try {
                Connection con = null;
                Conexion conect = new Conexion();
                con = conect.getConnection();
                Statement st = con.createStatement();

                String sql = "insert into CarrosdeClientes (Tel_Celular,Carro,Placa,Url,Foto) values (?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, telTextField.getText());
                pst.setString(2, carroTextField.getText());
                pst.setString(3, placasTextField.getText());
                pst.setString(4, urlFoto.getText());
                Cargar_Archivo = new FileInputStream(urlFoto.getText());
                pst.setBinaryStream(5, Cargar_Archivo);

                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "¡Datos guardados correctamente!");
                    limpiar();
                    vaciarTabla();
                    verDatos();
                    nuevo.setEnabled(true);
                    guardar.setEnabled(false);
                    editar.setEnabled(false);
                    eliminar.setEnabled(false);
                    imagen.setEnabled(false);                    
                    desabilitar();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "El número telefónico para asignarn no existe o las placas introducidas ya han sido registradas por otro vehículo", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenActionPerformed

        FileFilter filter = new FileNameExtensionFilter("JPG", "jpg");
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selccionar Imagen de entrada");
        chooser.setFileFilter(filter);

        int Open = chooser.showOpenDialog(null);

        if (Open == JFileChooser.APPROVE_OPTION) {
            File Archivo = chooser.getSelectedFile();
            urlFoto.setText(String.valueOf(Archivo));
            Image Imagen = getToolkit().getImage(urlFoto.getText());
            Imagen = Imagen.getScaledInstance(376, 326, Image.SCALE_SMOOTH);
            labelFoto.setIcon(new ImageIcon(Imagen));
        }


    }//GEN-LAST:event_imagenActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "update CarrosdeClientes set Tel_Celular = ?, Carro= ?, Url=?, Foto=? where Placa=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, telTextField.getText());
            pst.setString(2, carroTextField.getText());
            pst.setString(3, urlFoto.getText());
            Cargar_Archivo = new FileInputStream(urlFoto.getText());
            pst.setBinaryStream(4, Cargar_Archivo);
            pst.setString(5, placasTextField.getText());
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(this, "¡Datos actualizados correctamente!");
                limpiar();
                vaciarTabla();
                verDatos();
                nuevo.setEnabled(true);
                guardar.setEnabled(false);
                editar.setEnabled(false);
                eliminar.setEnabled(false);
                imagen.setEnabled(false);
                    reestablecer.setEnabled(false);
                desabilitar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Los datos no han sido guardados correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            int opc = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar este registro?", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (opc == JOptionPane.YES_OPTION) {
                try {
                    Connection con = null;
                    Conexion conect = new Conexion();
                    con = conect.getConnection();
                    Statement st = con.createStatement();

                    String sql = "delete from CarrosdeClientes where Placa=?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, placasTextField.getText());

                    int n = pst.executeUpdate();
                    if (n > 0) {
                        JOptionPane.showMessageDialog(this, "Datos eliminados correctamente.");
                        limpiar();
                        vaciarTabla();
                        verDatos();
                        nuevo.setEnabled(true);
                        guardar.setEnabled(false);
                        editar.setEnabled(false);
                        eliminar.setEnabled(false);
                        imagen.setEnabled(false);
                    reestablecer.setEnabled(false);
                        desabilitar();
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Los datos no han sido eliminados correctamente", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        }


    }//GEN-LAST:event_eliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try {

            int fila = jTable1.getSelectedRow();
            String placa = jTable1.getValueAt(fila, 1).toString();
            carroTextField.setText(jTable1.getValueAt(fila, 0).toString());
            placasTextField.setText(jTable1.getValueAt(fila, 1).toString());
            telTextField.setText(jTable1.getValueAt(fila, 2).toString());
            urlFoto.setText(jTable1.getValueAt(fila, 3).toString());

            cargarfoto(placa);
            nuevo.setEnabled(false);
            guardar.setEnabled(false);
            editar.setEnabled(true);
            eliminar.setEnabled(true);
            imagen.setEnabled(true);
            habilitar();

        } catch (Exception ex) {
            System.out.println("Error al seleccionar un equipo: " + ex.getMessage());
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed

    private void nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo1ActionPerformed
        String titulos[] = {"VEHÍCULO", "PLACAS", "TELÉFONO_DEL_DUEÑO", "URL_FOTO"};
        String[] registros = new String[1000];
        
        String sql = "SELECT * FROM CarrosdeClientes WHERE Tel_Celular LIKE '%" + buscarTextField.getText() + "%'";
        
        
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        
        Conexion conect1 = new Conexion();
        Connection con2 = conect1.getConnection();

        try {
            Statement st = (Statement) con2.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("Carro");
                registros[1] = rs.getString("Placa");
                registros[2] = rs.getString("Tel_Celular");
                registros[3] = rs.getString("Url");
                model.addRow(registros);
            }
            jTable1.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_nuevo1ActionPerformed

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited

    }//GEN-LAST:event_jTable1MouseExited

    private void reestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reestablecerActionPerformed
        buscarTextField.setText("");
        vaciarTabla();
        verDatos();
        reestablecer.setEnabled(false);
    }//GEN-LAST:event_reestablecerActionPerformed

    private void buscarTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTextFieldKeyPressed

    }//GEN-LAST:event_buscarTextFieldKeyPressed

    private void buscarTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTextFieldKeyTyped
        if (buscarTextField.getText().isEmpty()) {
            
        } else {
            reestablecer.setEnabled(true);
        }
    }//GEN-LAST:event_buscarTextFieldKeyTyped

    private void buscarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarTextFieldActionPerformed

    public void desabilitar() {
        carroTextField.setEditable(false);
        placasTextField.setEditable(false);
        telTextField.setEditable(false);
    }

    public void habilitar() {
        carroTextField.setEditable(true);
        placasTextField.setEditable(true);
        telTextField.setEditable(true);
    }

    public void limpiar() {
        carroTextField.setText("");
        placasTextField.setText("");
        telTextField.setText("");
        urlFoto.setText("");
        labelFoto.setIcon(null);
    }

    public void vaciarTabla() {
        DefaultTableModel Modelo = (DefaultTableModel) jTable1.getModel();
        String titulos[] = {"VEHÍCULO", "PLACAS", "TELÉFONO_DEL_DUEÑO", "URL_FOTO"};
        Modelo = new DefaultTableModel(null, titulos);
        jTable1.setModel(Modelo);
    }

    public void verDatos() {
        try {
            Connection con1 = null;
            DefaultTableModel miModelo = (DefaultTableModel) jTable1.getModel();
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();

            String dts[] = new String[4];
            String sql = "select * from CarrosdeClientes";
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                dts[0] = rs.getString("Carro");
                dts[1] = rs.getString("Placa");
                dts[2] = rs.getString("Tel_Celular");
                dts[3] = rs.getString("Url");
                miModelo.addRow(dts);
            }
            jTable1.setModel(miModelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pueden visualizar los datos: " + ex);
        }

    }

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
        Image newimg = img.getScaledInstance(376, 326, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        if (newIcon == null) {
            JOptionPane.showMessageDialog(null, "El equipo no tiene foto", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            labelFoto.setIcon(newIcon);
            labelFoto.setSize(labelFoto.getWidth(), labelFoto.getWidth());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarTextField;
    private javax.swing.JTextField carroTextField;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton imagen;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton nuevo1;
    private javax.swing.JTextField placasTextField;
    private javax.swing.JButton reestablecer;
    private javax.swing.JTextField telTextField;
    private javax.swing.JLabel urlFoto;
    // End of variables declaration//GEN-END:variables
}
