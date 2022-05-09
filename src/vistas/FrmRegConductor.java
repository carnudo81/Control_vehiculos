package vistas;

import clases.conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import clases.sqlGeneral;
import clases.propiedadesCBX;
import java.awt.event.KeyEvent;

/**
 *
 * @author Software_Max(JDV)
 */
public class FrmRegConductor extends javax.swing.JInternalFrame {

    public static String rc;
    PreparedStatement ps;
    ResultSet rs;
    FrmMenuPpal ppal = new FrmMenuPpal();
    String plak;
    String selecPlaca;

    public FrmRegConductor() {
        initComponents();
        cbxPers();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoRegConductores = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        pnlRegistroConductor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        txtNumDocumento = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        cbxVehicAsignado = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblPlacas2 = new javax.swing.JLabel();
        pnlTablaConducReg = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConductores = new rojerusan.RSTableMetro();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1165, 600));
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

        pnlFondoRegConductores.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoRegConductores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVehiculo.setForeground(new java.awt.Color(18, 108, 48));
        lblVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehiculo.setText("REGISTRO DE  CONDUCTORES");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegConductores.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1060, 40));

        pnlRegistroConductor.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroConductor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO CONDUCTORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(18, 108, 48))); // NOI18N
        pnlRegistroConductor.setPreferredSize(new java.awt.Dimension(500, 520));
        pnlRegistroConductor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 108, 48));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRES");
        pnlRegistroConductor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 108, 48));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APELLIDOS");
        pnlRegistroConductor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 108, 48));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTACTO");
        pnlRegistroConductor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 108, 48));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("N° DOCUMENTO");
        pnlRegistroConductor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 108, 48));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ASIGNAR VEHICULO");
        pnlRegistroConductor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 108, 48));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FECHA");
        pnlRegistroConductor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 150, -1));

        txtNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(18, 108, 48));
        txtNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtNombres.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        pnlRegistroConductor.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(18, 108, 48));
        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtApellidos.setPreferredSize(new java.awt.Dimension(150, 30));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        pnlRegistroConductor.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        txtContacto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtContacto.setForeground(new java.awt.Color(18, 108, 48));
        txtContacto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContacto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtContacto.setPreferredSize(new java.awt.Dimension(150, 30));
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });
        pnlRegistroConductor.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        txtNumDocumento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNumDocumento.setForeground(new java.awt.Color(18, 108, 48));
        txtNumDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumDocumento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtNumDocumento.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNumDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumDocumentoKeyTyped(evt);
            }
        });
        pnlRegistroConductor.add(txtNumDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

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
        pnlRegistroConductor.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

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
        pnlRegistroConductor.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

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
        pnlRegistroConductor.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

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
        pnlRegistroConductor.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        cbxVehicAsignado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxVehicAsignado.setForeground(new java.awt.Color(18, 108, 48));
        cbxVehicAsignado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        pnlRegistroConductor.add(cbxVehicAsignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, 30));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(18, 108, 48));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("FECHA");
        pnlRegistroConductor.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 150, 30));

        lblID.setText("id");
        pnlRegistroConductor.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 70, -1));

        lblPlacas2.setText("jLabel8");
        pnlRegistroConductor.add(lblPlacas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        pnlFondoRegConductores.add(pnlRegistroConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        pnlTablaConducReg.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaConducReg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO CONDUCTORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(18, 108, 48))); // NOI18N
        pnlTablaConducReg.setPreferredSize(new java.awt.Dimension(630, 520));
        pnlTablaConducReg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 108, 48));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><center>En la tabla aparecen los conductores que estan registrados en la empresa,<p> si desea modificar alguno, solo debe seleccionarlo y hacer dicho cambio en el panel de registro,<p>pero si desea cambiarlo de vehiculo debe eliminar el conductor del programa y volver a ingresarlo.");
        pnlTablaConducReg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 337, 590, 160));

        tblConductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tblConductores.setAltoHead(30);
        tblConductores.setColorBackgoundHead(new java.awt.Color(255, 204, 0));
        tblConductores.setColorFilasBackgound2(new java.awt.Color(255, 255, 153));
        tblConductores.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblConductores.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblConductores.setColorForegroundHead(new java.awt.Color(18, 108, 48));
        tblConductores.setColorSelBackgound(new java.awt.Color(18, 108, 48));
        tblConductores.setColorSelForeground(new java.awt.Color(255, 204, 0));
        tblConductores.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblConductores.setFuenteFilas(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblConductores.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblConductores.setFuenteHead(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblConductores.setMultipleSeleccion(false);
        tblConductores.setRowHeight(25);
        tblConductores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConductoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConductores);

        pnlTablaConducReg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 610, 283));

        pnlFondoRegConductores.add(pnlTablaConducReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegConductores, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegConductores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblConductoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConductoresMouseClicked
        int seleccion = tblConductores.getSelectedRow();

        lblID.setText(tblConductores.getValueAt(seleccion, 0).toString());
        txtNombres.setText(tblConductores.getValueAt(seleccion, 1).toString());
        txtApellidos.setText(tblConductores.getValueAt(seleccion, 2).toString());
        txtNumDocumento.setText(tblConductores.getValueAt(seleccion, 3).toString());
        txtContacto.setText(tblConductores.getValueAt(seleccion, 4).toString());
        lblPlacas2.setText(tblConductores.getValueAt(seleccion, 5).toString());
        cbxVehicAsignado.setEnabled(false);

        int filas = seleccion;
        btnGuardar.setVisible(false);

    }//GEN-LAST:event_tblConductoresMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        rc = null;
        dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta letras ");
            evt.consume();

        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta letras ");
            evt.consume();

        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNumDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocumentoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");
            evt.consume();

        }
        if (txtNumDocumento.getText().length() >= 10) {

            JOptionPane.showMessageDialog(null, "Has exedido el número de caractéres permitido ¡¡¡");
        }
    }//GEN-LAST:event_txtNumDocumentoKeyTyped

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");
            evt.consume();

        }
    }//GEN-LAST:event_txtContactoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtNumDocumento.getText().isEmpty()
                || txtContacto.getText().isEmpty() || cbxVehicAsignado.getSelectedItem().equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, "La informacion del conductor esta incompleta, por favor verifique");
        } else {
            selecPlaca = cbxVehicAsignado.getSelectedItem().toString();
            guardarConductor();
            cabiarEstadoVehic(plak, "ASIGNADO");
            listarConductor();
            cbxVehicAsignado.removeItem(selecPlaca);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtNumDocumento.getText().isEmpty()
                || txtContacto.getText().isEmpty() || lblID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion del conductor esta incompleta, por favor verifique");
        } else {
        String plk = lblPlacas2.getText();
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el conductor?",//<- EL MENSAJE
                    "Alerta!"/*<- El título de la ventana*/, JOptionPane.YES_NO_OPTION/*Las opciones (si o no)*/, JOptionPane.WARNING_MESSAGE/*El tipo de ventana, en este caso WARNING*/);

            if (resp == 0) {
                String plkDel = lblPlacas2.getText();
                eliminarConductor();
                cabiarEstadoVehic(plkDel, "DISPONIBLE");
                listarConductor();
                cbxVehicAsignado.setEnabled(true);
                cbxVehicAsignado.addItem(plk);
            }
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtNumDocumento.getText().isEmpty()
                || txtContacto.getText().isEmpty() || lblID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion del conductor esta incompleta, por favor verifique");
        } else {
            cbxVehicAsignado.setEnabled(true);
            modificarConductor();
            listarConductor();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

//***************************************** TODOS LOS METODOS ******************************************************
    void mostrar() {
        listarConductor();
        lblID.setVisible(false);
        lblPlacas2.setVisible(false);
        sqlGeneral.llenarVehiDispon(cbxVehicAsignado);
        String fec = sqlGeneral.FecActStr();
        lblFecha.setText(fec);
        rc = "rc";
    }

//***************************************** METODO GUARDAR *********************************************************
    public void cabiarEstadoVehic(String plk, String est) {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("UPDATE vehiculos SET estado = '" + est + "' WHERE placa = '" + plk + "' ");

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "La actualizacion del vehiculo fue exitosa!!!");

            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error con la actualizacion del vehiculo!!!");

            }

            con.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            System.err.println(e);
        }

    }

//***************************************** METODO GUARDAR *********************************************************
    public void guardarConductor() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO conductores (nombre, apellido, documento, contacto, vehi_asig, fecha, registra) VALUES(?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, txtNombres.getText());  //tomamos el valor desde el textField nombres
            ps.setString(2, txtApellidos.getText());//tomamos el valor desde el textField apellidos
            ps.setString(3, txtNumDocumento.getText());//tomamos el valor desde el textField numdocumento
            ps.setString(4, txtContacto.getText());//tomamos el valor desde el textField contacto
            plak = cbxVehicAsignado.getSelectedItem().toString();
            ps.setString(5, plak);//tomamos el valor desde el textField usuario
            ps.setString(6, lblFecha.getText());//tomamos el valor desde el textField contraseña 
            ps.setString(7, ppal.lblNomUser.getText());//tomamos el valor desde el textField contraseña 

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, " Conductor registrado con exito !!!");
                limpiar();//creamos el metodo limpiar para limpiar los textfield

            } else {

                JOptionPane.showMessageDialog(null, "Error con el registro del conductor !!!");
                limpiar();
            }

            con.close();//Cerramos la conexion con la BD por seguridad

        } catch (HeadlessException | SQLException e) {

            System.err.println(e);
        }

    }

//******************************************** METODO LIMPIAR *********************************************
    public void limpiar() {

        txtNombres.setText("");// Ponemos los campos vacios
        txtApellidos.setText("");
        txtContacto.setText("");
        txtNumDocumento.setText("");
        cbxVehicAsignado.setSelectedItem("Seleccione");
        lblID.setText("");
        lblPlacas2.setText("");
        txtNombres.requestFocus();
        btnGuardar.setVisible(true);

    }

//***************************************** METODO LISTAR *********************************************************
    public void listarConductor() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            tblConductores.setModel(modelo);

            conexion conn = new conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT * FROM  conductores";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData resultadoMD = rs.getMetaData();
            int cantidadColumnas = resultadoMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("CONTACTO");
            modelo.addColumn("VEHI/ASIGNADO");
            modelo.addColumn("FECHA");
            modelo.addColumn("REGISTRA");

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
    public void modificarConductor() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("UPDATE conductores SET nombre = ?, apellido = ?, documento = ?, contacto = ?, registra = ? WHERE idC = ? ");

            ps.setString(1, txtNombres.getText());  //tomamos el valor desde el textField nombres
            ps.setString(2, txtApellidos.getText());//tomamos el valor desde el textField apellidos
            ps.setString(3, txtNumDocumento.getText());//tomamos el valor desde el textField numdocumento
            ps.setString(4, txtContacto.getText());//tomamos el valor desde el textField contacto
            ps.setString(5, ppal.lblNomUser.getText());//tomamos el valor desde el textField contraseña 
            ps.setInt(6, Integer.parseInt(lblID.getText()));//tomamos el valor desde el label ID 

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "La actualizacion del conductor fue exitosa!!!");
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error con la actualizacion del conductor!!!");
                limpiar();
            }

            con.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            System.err.println(e);
        }

    }

//***************************************** METODO ELIMINAR *******************************************************
    public void eliminarConductor() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("DELETE FROM conductores WHERE idC = ?");

            ps.setInt(1, Integer.parseInt(lblID.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "Eliminacion del conductorexitosa!!!");
                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error con la eliminacion del conductor!!!");
                limpiar();
            }

            con.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            System.err.println(e);
        }

    }

//****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    
    void cbxPers() {

        //Le damos las propiedadesCBX de la clase a los cbx
        cbxVehicAsignado.setUI(propiedadesCBX.createUI(rootPane));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxVehicAsignado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPlacas2;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JPanel pnlFondoRegConductores;
    private javax.swing.JPanel pnlRegistroConductor;
    private javax.swing.JPanel pnlTablaConducReg;
    private rojerusan.RSTableMetro tblConductores;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumDocumento;
    // End of variables declaration//GEN-END:variables
}
