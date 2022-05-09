package vistas;

import clases.conexion;
import clases.propiedadesCBX;
import clases.sqlGeneral;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Software_Max(JDV)
 */
public class FrmRegMantenimientos extends javax.swing.JInternalFrame {
    FrmMenuPpal ppal = new FrmMenuPpal();
    public static String rm;
    PreparedStatement ps;
    ResultSet rs;

    public FrmRegMantenimientos() {
        initComponents();
        mostrar();
        cbxPers();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpTipoManten = new javax.swing.ButtonGroup();
        pnlFondoRegConductores = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        pnlRegistroConductor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRespMarca = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        txtKmMantenim = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cbxPlaca = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblRespModelo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbtPreventivo = new javax.swing.JRadioButton();
        rbtCorrectivo = new javax.swing.JRadioButton();
        rbtOtro = new javax.swing.JRadioButton();
        txtValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1170, 600));
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
        lblVehiculo.setText("REGISTRO DE  MANTENIMIENTO VEHICULAR");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegConductores.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1090, 40));

        pnlRegistroConductor.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroConductor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 108, 48));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLACA");
        pnlRegistroConductor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 108, 48));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("N° FACTURA");
        pnlRegistroConductor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 108, 48));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VALOR");
        pnlRegistroConductor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 108, 48));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DESCRIPCION");
        pnlRegistroConductor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 220, -1));

        lblRespMarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRespMarca.setForeground(new java.awt.Color(18, 108, 48));
        lblRespMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespMarca.setText("resp. marca");
        pnlRegistroConductor.add(lblRespMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 108, 48));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FECHA");
        pnlRegistroConductor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 150, -1));

        txtNumFactura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNumFactura.setForeground(new java.awt.Color(18, 108, 48));
        txtNumFactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumFactura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtNumFactura.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroConductor.add(txtNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        txtKmMantenim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtKmMantenim.setForeground(new java.awt.Color(18, 108, 48));
        txtKmMantenim.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKmMantenim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtKmMantenim.setPreferredSize(new java.awt.Dimension(150, 30));
        txtKmMantenim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKmMantenimKeyTyped(evt);
            }
        });
        pnlRegistroConductor.add(txtKmMantenim, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, -1, -1));

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
        pnlRegistroConductor.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

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
        pnlRegistroConductor.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, -1, -1));

        cbxPlaca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxPlaca.setForeground(new java.awt.Color(18, 108, 48));
        cbxPlaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxPlaca.setToolTipText("Seleccione una placa y presione ENTER");
        cbxPlaca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxPlaca.setPreferredSize(new java.awt.Dimension(150, 30));
        cbxPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxPlacaKeyPressed(evt);
            }
        });
        pnlRegistroConductor.add(cbxPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(18, 108, 48));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("fecha actual");
        pnlRegistroConductor.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 108, 48));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TIPO DE MANTENIMIENTO :");
        pnlRegistroConductor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 180, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 108, 48));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MARCA");
        pnlRegistroConductor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 150, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 108, 48));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MODELO");
        pnlRegistroConductor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 150, -1));

        lblRespModelo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRespModelo.setForeground(new java.awt.Color(18, 108, 48));
        lblRespModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespModelo.setText("resp.modelo");
        pnlRegistroConductor.add(lblRespModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 150, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(18, 108, 48));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("KM / MANTENIMIENTO");
        pnlRegistroConductor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, 150, -1));

        btngrpTipoManten.add(rbtPreventivo);
        rbtPreventivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtPreventivo.setForeground(new java.awt.Color(18, 108, 48));
        rbtPreventivo.setText("PREVENTIVO");
        pnlRegistroConductor.add(rbtPreventivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, -1));

        btngrpTipoManten.add(rbtCorrectivo);
        rbtCorrectivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtCorrectivo.setForeground(new java.awt.Color(18, 108, 48));
        rbtCorrectivo.setText("CORRECTIVO");
        pnlRegistroConductor.add(rbtCorrectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        btngrpTipoManten.add(rbtOtro);
        rbtOtro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtOtro.setForeground(new java.awt.Color(18, 108, 48));
        rbtOtro.setText("OTRO");
        pnlRegistroConductor.add(rbtOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 70, -1));

        txtValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtValor.setForeground(new java.awt.Color(18, 108, 48));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtValor.setPreferredSize(new java.awt.Dimension(120, 30));
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        pnlRegistroConductor.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(18, 108, 48));
        jScrollPane1.setViewportView(txtDescripcion);

        pnlRegistroConductor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 220, 150));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 108, 48));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("$");
        pnlRegistroConductor.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 20, 30));

        pnlFondoRegConductores.add(pnlRegistroConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1160, 530));

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

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        rm = null;
        dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");
            evt.consume();

        }
        if (txtValor.getText().length() >= 10) {

            JOptionPane.showMessageDialog(null, "Has exedido el número de caractéres permitido ¡¡¡");
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtKmMantenimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKmMantenimKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");
            evt.consume();

        }
        if (txtKmMantenim.getText().length() >= 15) {

            JOptionPane.showMessageDialog(null, "Has exedido el número de caractéres permitido ¡¡¡");
        }
    }//GEN-LAST:event_txtKmMantenimKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (cbxPlaca.getSelectedItem().equals("Seleccione")||txtNumFactura.getText().isEmpty()||txtDescripcion.getText().isEmpty()||txtKmMantenim.getText().isEmpty()||
                txtValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion del mantenimiento esta incompleta, por favor verifique ¡¡¡");
            
        }else if(rbtCorrectivo.isSelected()== false && rbtPreventivo.isSelected()== false && rbtOtro.isSelected()== false){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado el tipo de mantenimiento, por favor seleccione uno ¡¡¡");
            
        }else{
            guardarMantenimiento();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbxPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxPlacaKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                
            if (cbxPlaca.getSelectedItem().equals("Seleccione")) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una placa, luego presione ENTER par cargar informacion del vehiculo");
            } else {
                mostrarDatosPlaca();
            }

        }
    }//GEN-LAST:event_cbxPlacaKeyPressed

//****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    
    void mostrarDatosPlaca() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {
            ps = con.prepareStatement("SELECT marca, modelo FROM  vehiculos WHERE placa = ?");
            ps.setString(1, cbxPlaca.getSelectedItem().toString());

            rs = ps.executeQuery();

            if (rs.next()) {
                lblRespMarca.setText(rs.getString("marca"));
                lblRespModelo.setText(rs.getString("modelo"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registros con esa placa");
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);

        }

    }
    
//***************************************** METODO GUARDAR *********************************************************
    public void guardarMantenimiento() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO mantenimientos (placa, descrip, factura, valor, km_mante, tipo, fecha, registra) VALUES(?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, cbxPlaca.getSelectedItem().toString());  
            ps.setString(2, txtDescripcion.getText());
            ps.setString(3, txtNumFactura.getText());
            ps.setInt(4, Integer.parseInt(txtValor.getText()));
            ps.setString(5, txtKmMantenim.getText());
            if(rbtCorrectivo.isSelected()){
            ps.setString(6, "CORRECTIVO");
            }else if(rbtPreventivo.isSelected()){
            ps.setString(6, "PREVENTIVO");   
            }else if(rbtOtro.isSelected()){
            ps.setString(6, "OTRO");
            }
            ps.setString(7, lblFecha.getText());
            ps.setString(8, ppal.lblNomUser.getText());

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, " Mantenimiento registrado con exito !!!");
                limpiar();//creamos el metodo limpiar para limpiar los textfield

            } else {

                JOptionPane.showMessageDialog(null, "Error con el registro del mantenimiento !!!");
                limpiar();
            }

            con.close();//Cerramos la conexion con la BD por seguridad

        } catch (HeadlessException | SQLException e) {

            System.err.println(e);
        }

    }

//******************************************** METODO LIMPIAR *********************************************
    public void limpiar() {

        txtValor.setText("");// Ponemos los campos vacios
        txtNumFactura.setText("");
        txtKmMantenim.setText("");
        txtDescripcion.setText("");
        cbxPlaca.setSelectedItem("Seleccione");
        lblRespMarca.setText("");
        lblRespModelo.setText("");
        btngrpTipoManten.clearSelection();
        btnGuardar.setVisible(true);

    }


//****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    
    void cbxPers() {

        //Le damos las propiedadesCBX de la clase a los cbx
        cbxPlaca.setUI(propiedadesCBX.createUI(rootPane));

    }
//****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    

    void mostrar() {

        sqlGeneral.llenarTodosVehic(cbxPlaca);
        String fec = sqlGeneral.FecActStr();
        lblFecha.setText(fec);
        rm = "rm";

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup btngrpTipoManten;
    private javax.swing.JComboBox<String> cbxPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblRespMarca;
    private javax.swing.JLabel lblRespModelo;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JPanel pnlFondoRegConductores;
    private javax.swing.JPanel pnlRegistroConductor;
    private javax.swing.JRadioButton rbtCorrectivo;
    private javax.swing.JRadioButton rbtOtro;
    private javax.swing.JRadioButton rbtPreventivo;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtKmMantenim;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
