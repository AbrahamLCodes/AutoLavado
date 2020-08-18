package Clases;

import Conexiones.Conexion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Principal extends javax.swing.JFrame {

    public InputStream foto = this.getClass().getResourceAsStream("/Imagenes/Fondo.jpg");

    Buscar buscar = new Buscar();
    Clientes clientes = new Clientes();
    Vehiculos vehiculos = new Vehiculos();
    Venta venta = new Venta();

    private Timer timer;
    Connection con = null;
    Conexion conect = new Conexion();

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sistema de Ventas");
        setSize(1200, 720);
        setResizable(false);
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        this.fechal.setText(fecha);
        cargarImagen(jDesktopPane1, foto);

        textArea.setEditable(false);
        verCumpleañeros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        fechal = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        horaLabel = new javax.swing.JLabel();
        horal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        minl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        segl = new javax.swing.JLabel();
        ampmTextField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        clientesMenuItem = new javax.swing.JMenuItem();
        vehiculosMenuItem = new javax.swing.JMenuItem();
        ventasMenuItem = new javax.swing.JMenuItem();
        buscarMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));

        fechal.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        fechal.setForeground(new java.awt.Color(255, 255, 255));
        fechal.setText("00/00/00");

        fechaLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(255, 255, 255));
        fechaLabel.setText("Fecha:");

        horaLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        horaLabel.setForeground(new java.awt.Color(255, 255, 255));
        horaLabel.setText("Hora:");

        horal.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        horal.setForeground(new java.awt.Color(255, 255, 255));
        horal.setText("00");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(":");

        minl.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        minl.setForeground(new java.awt.Color(255, 255, 255));
        minl.setText("00");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        segl.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        segl.setForeground(new java.awt.Color(255, 255, 255));
        segl.setText("00");

        ampmTextField.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        ampmTextField.setForeground(new java.awt.Color(255, 255, 255));
        ampmTextField.setText("AM");

        textArea.setBackground(new java.awt.Color(51, 51, 51));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Cumplañeros:");

        jDesktopPane1.setLayer(fechal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fechaLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(horaLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(horal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(minl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(segl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ampmTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(fechaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(fechal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 732, Short.MAX_VALUE)
                        .addComponent(horaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ampmTextField)
                        .addGap(18, 18, 18))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(horaLabel)
                        .addComponent(horal)
                        .addComponent(jLabel4)
                        .addComponent(minl)
                        .addComponent(jLabel7)
                        .addComponent(segl)
                        .addComponent(ampmTextField))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fechal)
                        .addComponent(fechaLabel)))
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logotype192.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wifi.png"))); // NOI18N
        jMenuItem1.setText("Probar Conexión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emergency-exit.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bill9.png"))); // NOI18N
        jMenu2.setText("Operaciones");
        jMenu2.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N

        clientesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        clientesMenuItem.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        clientesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/group.png"))); // NOI18N
        clientesMenuItem.setText("Clientes");
        clientesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(clientesMenuItem);

        vehiculosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        vehiculosMenuItem.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        vehiculosMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vehicle.png"))); // NOI18N
        vehiculosMenuItem.setText("Vehículos");
        vehiculosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculosMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(vehiculosMenuItem);

        ventasMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        ventasMenuItem.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        ventasMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sales.png"))); // NOI18N
        ventasMenuItem.setText("Ventas");
        ventasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(ventasMenuItem);

        buscarMenuItem.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        buscarMenuItem.setText("Buscar Ventas");
        buscarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(buscarMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exclamation11.png"))); // NOI18N
        jMenu3.setText("Ayuda");
        jMenu3.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/question.png"))); // NOI18N
        jMenuItem3.setText("Ayuda");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "Conexión Terminada");
        Conexion obj = new Conexion();
        obj.Desconexion();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void clientesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesMenuItemActionPerformed

        Clientes obj = new Clientes();
        jDesktopPane1.add(obj);
        obj.toFront();
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
            obj.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);

    }//GEN-LAST:event_clientesMenuItemActionPerformed

    private void vehiculosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculosMenuItemActionPerformed
        Vehiculos obj = new Vehiculos();
        jDesktopPane1.add(obj);
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
            obj.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
    }//GEN-LAST:event_vehiculosMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        con = conect.getConnection();
        JOptionPane.showMessageDialog(null, "¡Conexión Exitosa!");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(1000, new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void ventasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasMenuItemActionPerformed

        Venta obj = new Venta();
        jDesktopPane1.add(obj);
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
            obj.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);


    }//GEN-LAST:event_ventasMenuItemActionPerformed

    private void buscarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMenuItemActionPerformed

        Buscar obj = new Buscar();
        obj.toFront();
        jDesktopPane1.add(obj);
        obj.setLocation(jDesktopPane1.getWidth() / 2 - obj.getWidth() / 2, jDesktopPane1.getHeight() / 2 - obj.getHeight() / 2);
        try {
            obj.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);

    }//GEN-LAST:event_buscarMenuItemActionPerformed

    private void verCumpleañeros() {
        String nombre = "";
        String apellido = "";
        String nombreCompleto = "";
        String celular = "";
        char[] fecha = new char[5];

        for (int i = 0; i < 5; i++) {
            fecha[i] = fechal.getText().charAt(i);
        }
        String fechachida = String.valueOf(fecha);

        String sql = "SELECT * FROM Clientes  WHERE Cumple LIKE '%" + fechachida + "%'";
        Conexion conect1 = new Conexion();
        Connection con2 = conect1.getConnection();

        try {
            Statement st = (Statement) con2.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String batos = "";
            while (rs.next()) {
                nombre = rs.getString("Nombre");
                apellido = rs.getString("Ap_Paterno");
                celular = rs.getString("Tel_Celular");
                nombreCompleto = nombre + " " + apellido;
                batos = batos + nombreCompleto + ". Celular: " + celular + "\n";
                //reiniciarCumple();
                if (rs.getString("Regalado").equals("No")) {

                    regaloCumple(celular);
                    validarCumple(celular);
                }
            }
            textArea.setText(batos);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudieron verificar los cumpleañeros   " + ex);
        }

    }

    private void regaloCumple(String tel) {

        try {
            Connection con1 = null;
            PreparedStatement ps = null;
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();

            String Update = "UPDATE Clientes SET QC =  QC + 20 WHERE Tel_Celular = '" + tel + "'";
            ps = con1.prepareStatement(Update);
            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo asignar un regalo de cumpleaños  " + ex, "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void validarCumple(String tel) {
        try {
            Connection con = null;
            Conexion conect = new Conexion();
            con = conect.getConnection();
            Statement st = con.createStatement();

            String sql = "update Clientes set Regalado = ? where Tel_Celular like '%" + tel + "%'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setBoolean(1, true);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo confirmar el regalo");
        }

    }

    private void reiniciarCumple() {

        char[] fecha = new char[5];

        for (int i = 0; i < 5; i++) {
            fecha[i] = fechal.getText().charAt(i);
        }
        String fechachida = String.valueOf(fecha);

        String sql = "SELECT * FROM Clientes";
        Conexion conect1 = new Conexion();
        Connection con2 = conect1.getConnection();

        try {
            Statement st = (Statement) con2.createStatement();
           PreparedStatement ps= con2.prepareStatement(sql,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                if(rs.getString("Cumple").equals(String.valueOf(fechachida))==false){
                    rs.updateString("Regalado", "No");
                    rs.updateRow();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void cargarImagen(javax.swing.JDesktopPane jDeskp, InputStream fileImagen) {
        try {
            BufferedImage image = ImageIO.read(fileImagen);
            jDeskp.setBorder(new Fondo(image));
        } catch (Exception e) {
            System.out.println("Imagen no disponible");
        }
    }

    public class cronometro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            GregorianCalendar tiempo = new GregorianCalendar();
            int hora, minutos, segundos, am_pm;
            hora = tiempo.get(Calendar.HOUR);
            minutos = tiempo.get(Calendar.MINUTE);
            segundos = tiempo.get(Calendar.SECOND);
            am_pm = tiempo.get(Calendar.AM_PM);

            if (hora < 10) {
                horal.setText("0" + String.valueOf(hora));
            } else {
                horal.setText(String.valueOf(hora));
            }
            if (minutos < 10) {
                minl.setText("0" + String.valueOf(minutos));
            } else {
                minl.setText(String.valueOf(minutos));
            }
            if (segundos < 10) {
                segl.setText("0" + String.valueOf(segundos));
            } else {
                segl.setText(String.valueOf(segundos));
            }
            if (am_pm == 0) {
                ampmTextField.setText("AM");
            } else {
                ampmTextField.setText("PM");
            }

        }
    }

    public static JLabel getFechal() {
        return fechal;
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ampmTextField;
    private javax.swing.JMenuItem buscarMenuItem;
    private javax.swing.JMenuItem clientesMenuItem;
    private javax.swing.JLabel fechaLabel;
    private static javax.swing.JLabel fechal;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JLabel horal;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minl;
    private javax.swing.JLabel segl;
    private javax.swing.JTextArea textArea;
    private javax.swing.JMenuItem vehiculosMenuItem;
    private javax.swing.JMenuItem ventasMenuItem;
    // End of variables declaration//GEN-END:variables
}
