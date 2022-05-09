package vistas;

import clases.conexion;
import clases.propiedadesCBX;
import clases.sqlGeneral;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Software_Max(JDV)
 */
public class FrmRegSeguros extends javax.swing.JInternalFrame {

    FrmMenuPpal ppal = new FrmMenuPpal();
    public static String rsg;
    PreparedStatement ps;
    ResultSet rs;

    public FrmRegSeguros() {
        initComponents();
        cbxPers();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoRegVehi = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        pnlRegistroVehi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFechaAct = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        dcVencimientoSoat = new com.toedter.calendar.JDateChooser();
        dcVencimientoTecno = new com.toedter.calendar.JDateChooser();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbxPlaca = new javax.swing.JComboBox<>();
        lblID = new javax.swing.JLabel();
        pnlTablaVehiReg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeguros = new rojerusan.RSTableMetro();

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

        pnlFondoRegVehi.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoRegVehi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVehiculo.setForeground(new java.awt.Color(18, 108, 48));
        lblVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehiculo.setText("REGISTRO DE  SEGUROS OBLIGATORIOS");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegVehi.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1120, 40));

        pnlRegistroVehi.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroVehi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE SEGUROS VEHICULARES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(18, 108, 48))); // NOI18N
        pnlRegistroVehi.setPreferredSize(new java.awt.Dimension(500, 520));
        pnlRegistroVehi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 108, 48));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLACA: ");
        pnlRegistroVehi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 108, 48));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESPONSABLE");
        pnlRegistroVehi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 140, -1));

        lblFechaAct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFechaAct.setForeground(new java.awt.Color(18, 108, 48));
        lblFechaAct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaAct.setText("resp. fecha ");
        pnlRegistroVehi.add(lblFechaAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 150, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 108, 48));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SOAT VENCE ");
        pnlRegistroVehi.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 108, 48));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TECNOMECANICA VENCE");
        pnlRegistroVehi.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 150, -1));

        txtResponsable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtResponsable.setForeground(new java.awt.Color(18, 108, 48));
        txtResponsable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResponsable.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtResponsable.setPreferredSize(new java.awt.Dimension(150, 30));
        txtResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResponsableKeyTyped(evt);
            }
        });
        pnlRegistroVehi.add(txtResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        dcVencimientoSoat.setForeground(new java.awt.Color(18, 108, 48));
        dcVencimientoSoat.setDateFormatString("yyyy-MM-dd");
        dcVencimientoSoat.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(dcVencimientoSoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        dcVencimientoTecno.setForeground(new java.awt.Color(18, 108, 48));
        dcVencimientoTecno.setDateFormatString("yyyy-MM-dd");
        dcVencimientoTecno.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(dcVencimientoTecno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

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
        pnlRegistroVehi.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

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
        pnlRegistroVehi.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

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
        pnlRegistroVehi.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 108, 48));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FECHA :");
        pnlRegistroVehi.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, -1));

        cbxPlaca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbxPlaca.setForeground(new java.awt.Color(18, 108, 48));
        cbxPlaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        pnlRegistroVehi.add(cbxPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 30));

        lblID.setText("jLabel8");
        pnlRegistroVehi.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        pnlFondoRegVehi.add(pnlRegistroVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        pnlTablaVehiReg.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaVehiReg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO SUGUROS  DE VEHICULOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(18, 108, 48))); // NOI18N
        pnlTablaVehiReg.setPreferredSize(new java.awt.Dimension(630, 520));
        pnlTablaVehiReg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 255, 0));
        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("15 DIAS PARA VENCERSE");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 180, -1));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(255, 0, 0));
        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("5  DIAS PARA VENCERSE");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 180, -1));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(0, 204, 0));
        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setText("30 DIAS PARA VENCERSE");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 108, 48));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><center>ESTA ES LA CONVERSION DE COLORES DE ACURDO <p>AL TIEMPO QUE LE RESTA PARA VENCERSE EL SEGURO.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 233, 89));

        pnlTablaVehiReg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 590, 120));

        tblSeguros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSeguros.setAltoHead(30);
        tblSeguros.setColorBackgoundHead(new java.awt.Color(255, 204, 0));
        tblSeguros.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblSeguros.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblSeguros.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblSeguros.setColorForegroundHead(new java.awt.Color(18, 108, 48));
        tblSeguros.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        tblSeguros.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblSeguros.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblSeguros.setFuenteFilas(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblSeguros.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblSeguros.setFuenteHead(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblSeguros.setMultipleSeleccion(false);
        tblSeguros.setRowHeight(25);
        tblSeguros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSegurosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSeguros);

        pnlTablaVehiReg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 610, 283));

        pnlFondoRegVehi.add(pnlTablaVehiReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegVehi, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegVehi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        rsg = null;
        dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void tblSegurosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSegurosMouseClicked
        int seleccion = tblSeguros.getSelectedRow();

        lblID.setText(tblSeguros.getValueAt(seleccion, 0).toString());
        cbxPlaca.setSelectedItem(tblSeguros.getValueAt(seleccion, 1).toString());
        txtResponsable.setText(tblSeguros.getValueAt(seleccion, 2).toString());
        String fecha1 = tblSeguros.getValueAt(seleccion, 3).toString();
        Date f1 = sqlGeneral.convtFecCadenaADate(fecha1);
        dcVencimientoSoat.setDate(f1);
        String fecha2 = tblSeguros.getValueAt(seleccion, 4).toString();
        Date f2 = sqlGeneral.convtFecCadenaADate(fecha2);
        dcVencimientoTecno.setDate(f2);

        int filas = seleccion;
        btnGuardar.setVisible(false);
    }//GEN-LAST:event_tblSegurosMouseClicked

    private void txtResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsableKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (!Character.isLetter(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta letras ");
            evt.consume();

        }

    }//GEN-LAST:event_txtResponsableKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
          if (cbxPlaca.getSelectedItem().equals("Seleccione")|| txtResponsable.getText().isEmpty() || dcVencimientoSoat.getDate()==null
                || dcVencimientoTecno.getDate()==null) {
            JOptionPane.showMessageDialog(null, "La informacion de los seguros esta incompleta, por favor verifique");
        } else {
            guardarSeguros();
            listarSeguros();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String plk = cbxPlaca.getSelectedItem().toString();   
        if (cbxPlaca.getSelectedItem().equals("Seleccione")|| txtResponsable.getText().isEmpty() || dcVencimientoSoat.getDate()==null
                || dcVencimientoTecno.getDate()==null||lblID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion de los seguros esta incompleta, por favor verifique");
        }else {

            // confirmar si en realidad desea eliminar el registro, lo hacemos con este codigo
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar los seguros de la placa "+ plk +" ?",//<- EL MENSAJE
                    "Alerta!"/*<- El título de la ventana*/, JOptionPane.YES_NO_OPTION/*Las opciones (si o no)*/, JOptionPane.WARNING_MESSAGE/*El tipo de ventana, en este caso WARNING*/);

            if (resp == 0) {

                eliminarSeguros();
                listarSeguros();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
           if ( txtResponsable.getText().isEmpty() || dcVencimientoSoat.getDate()==null
                || dcVencimientoTecno.getDate()==null) {
            JOptionPane.showMessageDialog(null, "La informacion de los seguros esta incompleta, por favor verifique");
        } else {
            modificarSeguros();
            listarSeguros();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

//***************************************** TODOS LOS METODOS ******************************************************
//***************************************** METODO GUARDAR *********************************************************
    public void guardarSeguros() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO seguros (placa, responsable, soat, tecno, fecha, registra) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, cbxPlaca.getSelectedItem().toString());
            ps.setString(2, txtResponsable.getText());
            Date soat = dcVencimientoSoat.getDate();
            long st = soat.getTime();
            java.sql.Date fecSoat = new java.sql.Date(st);
            ps.setDate(3, fecSoat);
            Date tecno = dcVencimientoTecno.getDate();
            long tcn = tecno.getTime();
            java.sql.Date fecTecno = new java.sql.Date(tcn);
            ps.setDate(4, fecTecno);
            ps.setString(5, lblFechaAct.getText());
            ps.setString(6, ppal.lblNomUser.getText());

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, " Seguros registrados con exito !!!");
                limpiar();//creamos el metodo limpiar para limpiar los textfield

            } else {

                JOptionPane.showMessageDialog(null, "Error con el registro de los seguros !!!");
                limpiar();
            }

            con.close();//Cerramos la conexion con la BD por seguridad

        } catch (HeadlessException | SQLException e) {

            System.err.println(e);
        }

    }

//******************************************** METODO LIMPIAR *********************************************
    public void limpiar() {

        cbxPlaca.setSelectedItem("Seleccione");
        txtResponsable.setText("");
        dcVencimientoSoat.setDate(null);
        dcVencimientoTecno.setDate(null);
        lblID.setText("");
        btnGuardar.setVisible(true);

    }

//***************************************** METODO LISTAR *********************************************************
    public void listarSeguros() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            tblSeguros.setModel(modelo);

            conexion conn = new conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT * FROM  seguros";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData resultadoMD = rs.getMetaData();
            int cantidadColumnas = resultadoMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("PLACA");
            modelo.addColumn("RESPONSABLE");
            modelo.addColumn("VEN/SOAT");
            modelo.addColumn("VEN/TECNO");
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
    public void modificarSeguros() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("UPDATE seguros SET  responsable = ?, soat = ?, tecno = ?, fecha = ?, registra = ? WHERE idS = ? ");

            ps.setString(1, txtResponsable.getText());
            Date soat = dcVencimientoSoat.getDate();
            long st = soat.getTime();
            java.sql.Date fecSoat = new java.sql.Date(st);
            ps.setDate(2, fecSoat);
            Date tecno = dcVencimientoTecno.getDate();
            long tcn = tecno.getTime();
            java.sql.Date fecTecno = new java.sql.Date(tcn);
            ps.setDate(3, fecTecno);
            ps.setString(4, lblFechaAct.getText());
            ps.setString(5, ppal.lblNomUser.getText());
            ps.setInt(6, Integer.parseInt(lblID.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "La actualizacion de los seguros fue exitosa!!!");
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error con la actualizacion de los seguros!!!");
                limpiar();
            }

            con.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            System.err.println(e);
        }

    }

//***************************************** METODO ELIMINAR *******************************************************
    public void eliminarSeguros() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("DELETE FROM seguros WHERE idS = ?");

            ps.setInt(1, Integer.parseInt(lblID.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "Eliminacion de seguros exitosa !!!");
                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error con la eliminacion de los seguros !!!");
                limpiar();
            }

            con.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            System.err.println(e);
        }

    }
//***************************************** TODOS LOS METODOS ******************************************************

    void mostrar() {
        listarSeguros();
        lblID.setVisible(false);
        sqlGeneral.llenarTodosVehic(cbxPlaca);
        String fec = sqlGeneral.FecActStr();
        lblFechaAct.setText(fec);
        rsg = "rsg";
    }
//****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    

    void cbxPers() {

        //Le damos las propiedadesCBX de la clase a los cbx
        cbxPlaca.setUI(propiedadesCBX.createUI(rootPane));

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxPlaca;
    private com.toedter.calendar.JDateChooser dcVencimientoSoat;
    private com.toedter.calendar.JDateChooser dcVencimientoTecno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JLabel lblFechaAct;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JPanel pnlFondoRegVehi;
    private javax.swing.JPanel pnlRegistroVehi;
    private javax.swing.JPanel pnlTablaVehiReg;
    private rojerusan.RSTableMetro tblSeguros;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
