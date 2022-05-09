package vistas;

import clases.conexion;
import clases.sqlGeneral;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Software_Max(JDV)
 */
public class FrmRegVehiculos extends javax.swing.JInternalFrame {

    PreparedStatement ps;
    ResultSet rs;
    String plk ;
    public static String rv;
    FrmMenuPpal ppal = new FrmMenuPpal();

    public FrmRegVehiculos() {
        initComponents();
        listarVehiculo();

        mostrar();
        //Nos faltaria hacer las funciones para detectar los tiempos de vencimiento de cada color de conversion
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoRegVehi = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        pnlRegistroVehi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtKM = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFechaAct = new javax.swing.JLabel();
        pnlTablaVehiReg = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new rojerusan.RSTableMetro();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1165, 600));
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        pnlFondoRegVehi.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoRegVehi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVehiculo.setForeground(new java.awt.Color(18, 108, 48));
        lblVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehiculo.setText("REGISTRO DE  VEHICULOS");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegVehi.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1080, 40));

        pnlRegistroVehi.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroVehi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PANEL REGISTRO VEHICULOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(18, 108, 48))); // NOI18N
        pnlRegistroVehi.setPreferredSize(new java.awt.Dimension(500, 520));
        pnlRegistroVehi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 108, 48));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLACA: ");
        pnlRegistroVehi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 108, 48));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MARCA:");
        pnlRegistroVehi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 108, 48));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MODELO:");
        pnlRegistroVehi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 108, 48));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("KM / VEHICULO:");
        pnlRegistroVehi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 150, -1));

        txtPlaca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(18, 108, 48));
        txtPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlaca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtPlaca.setPreferredSize(new java.awt.Dimension(150, 30));
        txtPlaca.setSelectionColor(new java.awt.Color(255, 204, 0));
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });
        pnlRegistroVehi.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtMarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(18, 108, 48));
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMarca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtMarca.setPreferredSize(new java.awt.Dimension(150, 30));
        txtMarca.setSelectionColor(new java.awt.Color(255, 204, 0));
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        pnlRegistroVehi.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        txtModelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(18, 108, 48));
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModelo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtModelo.setPreferredSize(new java.awt.Dimension(150, 30));
        txtModelo.setSelectionColor(new java.awt.Color(255, 204, 0));
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });
        pnlRegistroVehi.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, -1));

        txtKM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtKM.setForeground(new java.awt.Color(18, 108, 48));
        txtKM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtKM.setPreferredSize(new java.awt.Dimension(150, 30));
        txtKM.setSelectionColor(new java.awt.Color(255, 204, 0));
        txtKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKMKeyTyped(evt);
            }
        });
        pnlRegistroVehi.add(txtKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 204, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(18, 108, 48));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPreferredSize(new java.awt.Dimension(110, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlRegistroVehi.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(18, 108, 48));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(110, 30));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlRegistroVehi.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 204, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(18, 108, 48));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setPreferredSize(new java.awt.Dimension(110, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlRegistroVehi.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(255, 204, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(18, 108, 48));
        btnActualizar.setText("MODIFICAR");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setPreferredSize(new java.awt.Dimension(110, 30));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlRegistroVehi.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        lblID.setText("id");
        pnlRegistroVehi.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 60, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 108, 48));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("FECHA :");
        pnlRegistroVehi.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, -1));

        lblFechaAct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFechaAct.setForeground(new java.awt.Color(18, 108, 48));
        lblFechaAct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaAct.setText("resp. fecha ");
        pnlRegistroVehi.add(lblFechaAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 130, 20));

        pnlFondoRegVehi.add(pnlRegistroVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        pnlTablaVehiReg.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaVehiReg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE VEHICULOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(18, 108, 48))); // NOI18N
        pnlTablaVehiReg.setPreferredSize(new java.awt.Dimension(630, 520));
        pnlTablaVehiReg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 108, 48));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><center>En la tabla aparecen los vehiculos que estan registrados en la empresa,<p> si desea eliminar o modificar alguno solo debe seleccionarlo<p> y hacer dicho cambio en el panel de registro.");
        pnlTablaVehiReg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 351, 610, 141));

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tblVehiculos.setAltoHead(30);
        tblVehiculos.setColorBackgoundHead(new java.awt.Color(255, 204, 0));
        tblVehiculos.setColorFilasBackgound2(new java.awt.Color(255, 255, 153));
        tblVehiculos.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblVehiculos.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblVehiculos.setColorForegroundHead(new java.awt.Color(18, 108, 48));
        tblVehiculos.setColorSelBackgound(new java.awt.Color(18, 108, 48));
        tblVehiculos.setColorSelForeground(new java.awt.Color(255, 204, 0));
        tblVehiculos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblVehiculos.setFuenteFilas(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblVehiculos.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblVehiculos.setFuenteHead(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblVehiculos.setMultipleSeleccion(false);
        tblVehiculos.setRowHeight(25);
        tblVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVehiculos);

        pnlTablaVehiReg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 47, 610, 283));

        pnlFondoRegVehi.add(pnlTablaVehiReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegVehi, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegVehi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehiculosMouseClicked
        int seleccion = tblVehiculos.getSelectedRow();

        lblID.setText(tblVehiculos.getValueAt(seleccion, 0).toString());
        txtPlaca.setText(tblVehiculos.getValueAt(seleccion, 1).toString());
        txtMarca.setText(tblVehiculos.getValueAt(seleccion, 2).toString());
        txtModelo.setText(tblVehiculos.getValueAt(seleccion, 3).toString());
        txtKM.setText(tblVehiculos.getValueAt(seleccion, 4).toString());

        int filas = seleccion;
        btnGuardar.setVisible(false);

    }//GEN-LAST:event_tblVehiculosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Aca llamamos el metodo guardarUser para que nos guarde la info en la BD cuando le demos clic en el boton
        plk = txtPlaca.getText();
        if (txtPlaca.getText().isEmpty() || txtMarca.getText().isEmpty() || txtModelo.getText().isEmpty()
                || txtKM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion del vehiculo esta incompleta, por favor verifique");
        } else {
 
            guardarVehiculo();
            JOptionPane.showMessageDialog(null, "<html><center>Por favor dirijase al boton <b>Reg.Seguros Vehiculos</b>, para completar el registro del vehiculo de placas "+ plk +"");
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        plk = txtPlaca.getText();
        if (txtPlaca.getText().isEmpty() || txtMarca.getText().isEmpty() || txtModelo.getText().isEmpty()
                || txtKM.getText().isEmpty() || lblID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion del vehiculo esta incompleta, por favor verifique");
        } else {

            // confirmar si en realidad desea eliminar el registro, lo hacemos con este codigo
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el vehiculo de placas "+plk+" ?",//<- EL MENSAJE
                    "Alerta!"/*<- El título de la ventana*/, JOptionPane.YES_NO_OPTION/*Las opciones (si o no)*/, JOptionPane.WARNING_MESSAGE/*El tipo de ventana, en este caso WARNING*/);

            if (resp == 0) {

                eliminarVehiculo();
                listarVehiculo();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (txtPlaca.getText().isEmpty() || txtMarca.getText().isEmpty() || txtModelo.getText().isEmpty()
                || txtKM.getText().isEmpty() || lblID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion del vehiculo esta incompleta, por favor verifique");
        } else {
            modificarVehiculo();
            listarVehiculo();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtKMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKMKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");
            evt.consume();

        }
    }//GEN-LAST:event_txtKMKeyTyped

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        rv = null;
        dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (txtPlaca.getText().length() >= 6) {
            JOptionPane.showMessageDialog(null, "Has exedido el número de caractéres permitido ¡¡¡");
            evt.consume();
        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");
            evt.consume();

        }
        if (txtModelo.getText().length() >= 4) {
            JOptionPane.showMessageDialog(null, "Has exedido el número de caractéres permitido ¡¡¡");
            evt.consume();
        }
    }//GEN-LAST:event_txtModeloKeyTyped

//********************************************* TODOS LOS METODOS **************************************************
//***************************************** METODO GUARDAR *********************************************************
    public void guardarVehiculo() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO vehiculos (placa, marca, modelo, km, estado, fecha, registra ) VALUES(?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, txtPlaca.getText());
            ps.setString(2, txtMarca.getText());
            ps.setString(3, txtModelo.getText());
            ps.setString(4, txtKM.getText());
            ps.setString(5, "DISPONIBLE");
            ps.setString(6, lblFechaAct.getText());
            ps.setString(7, ppal.lblNomUser.getText());

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, " Vehiculo registrado con exito !!!");
                limpiar();//creamos el metodo limpiar para limpiar los textfield

            } else {

                JOptionPane.showMessageDialog(null, "Error con el registro del vehiculo !!!");
                limpiar();
            }

            con.close();//Cerramos la conexion con la BD por seguridad

        } catch (HeadlessException | SQLException e) {

            System.err.println(e);
        }

    }

//******************************************** METODO LIMPIAR *********************************************
    public void limpiar() {

        txtPlaca.setText("");// Ponemos los campos vacios
        txtMarca.setText("");
        txtModelo.setText("");
        txtKM.setText("");
        lblID.setText("");
        txtPlaca.requestFocus();
        btnGuardar.setVisible(true);

    }

//******************************************** METODO LIMPIAR *********************************************
    public void mostrar() {

        lblID.setVisible(false);
        String fec = sqlGeneral.FecActStr();
        lblFechaAct.setText(fec);
        rv = "rv";

    }
//***************************************** METODO LISTAR *********************************************************

    public void listarVehiculo() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            tblVehiculos.setModel(modelo);

            conexion conn = new conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT * FROM  vehiculos";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData resultadoMD = rs.getMetaData();
            int cantidadColumnas = resultadoMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("PLACA");
            modelo.addColumn("MARCA");
            modelo.addColumn("MODELO");
            modelo.addColumn("KM");
            modelo.addColumn("ESTADO");
            modelo.addColumn("FECHA");
            modelo.addColumn("REGISTRÓ");

            while (rs.next()) {

                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

//***************************************** METODOS ACTUALIZAR *****************************************************
    public void modificarVehiculo() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("UPDATE vehiculos SET placa = ?, marca = ?, modelo = ?, km = ?, fecha = ?, registra = ?  WHERE idV = ? ");

            ps.setString(1, txtPlaca.getText());
            ps.setString(2, txtMarca.getText());
            ps.setString(3, txtModelo.getText());
            ps.setString(4, txtKM.getText());
            ps.setString(5, lblFechaAct.getText());
            ps.setString(6, ppal.lblNomUser.getText());
            ps.setInt(7, Integer.parseInt(lblID.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "La actualizacion del vehiculo fue exitosa!!!");
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error con la actualizacion del vehiculo!!!");
                limpiar();
            }

            con.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            System.err.println(e);
        }

    }

//***************************************** METODO ELIMINAR *******************************************************
    public void eliminarVehiculo() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("DELETE FROM vehiculos WHERE idV = ?");

            ps.setInt(1, Integer.parseInt(lblID.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "Eliminacion del vehiculo exitosa!!!");
                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error con la eliminacion del vehiculo!!!");
                limpiar();
            }

            con.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            System.err.println(e);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaAct;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JPanel pnlFondoRegVehi;
    private javax.swing.JPanel pnlRegistroVehi;
    private javax.swing.JPanel pnlTablaVehiReg;
    private rojerusan.RSTableMetro tblVehiculos;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
