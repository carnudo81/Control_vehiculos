package vistas;

import clases.conexion;
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
public class FrmRegUsuario extends javax.swing.JInternalFrame {

    public static String ru;
    PreparedStatement ps;
    ResultSet rs;
    FrmMenuPpal ppal = new FrmMenuPpal();

    public FrmRegUsuario() {
        initComponents();
        listarUsers();
        lblID.setVisible(false);
        ru = "ru";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoRegConductores = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        pnlRegistroUsuario = new javax.swing.JPanel();
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
        txtContraseña = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        pnlTablaConducReg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new rojerusan.RSTableMetro();
        jLabel7 = new javax.swing.JLabel();

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
        lblVehiculo.setText("REGISTRO DE  USUARIOS");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegConductores.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 930, 40));

        pnlRegistroUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO USUARIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(18, 108, 48))); // NOI18N
        pnlRegistroUsuario.setPreferredSize(new java.awt.Dimension(500, 520));
        pnlRegistroUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 108, 48));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRES");
        pnlRegistroUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 108, 48));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APELLIDOS");
        pnlRegistroUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 108, 48));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTACTO");
        pnlRegistroUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 108, 48));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("N° DOCUMENTO");
        pnlRegistroUsuario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 108, 48));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("USUARIO");
        pnlRegistroUsuario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 108, 48));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTRASEÑA");
        pnlRegistroUsuario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 150, -1));

        txtNombres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(18, 108, 48));
        txtNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtNombres.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNombres.setSelectionColor(new java.awt.Color(255, 204, 0));
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        pnlRegistroUsuario.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(18, 108, 48));
        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtApellidos.setPreferredSize(new java.awt.Dimension(150, 30));
        txtApellidos.setSelectionColor(new java.awt.Color(255, 204, 0));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        pnlRegistroUsuario.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        txtContacto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContacto.setForeground(new java.awt.Color(18, 108, 48));
        txtContacto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContacto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtContacto.setPreferredSize(new java.awt.Dimension(150, 30));
        txtContacto.setSelectionColor(new java.awt.Color(255, 204, 0));
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });
        pnlRegistroUsuario.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        txtNumDocumento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumDocumento.setForeground(new java.awt.Color(18, 108, 48));
        txtNumDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumDocumento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtNumDocumento.setPreferredSize(new java.awt.Dimension(150, 30));
        txtNumDocumento.setSelectionColor(new java.awt.Color(255, 204, 0));
        txtNumDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumDocumentoKeyTyped(evt);
            }
        });
        pnlRegistroUsuario.add(txtNumDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

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
        pnlRegistroUsuario.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

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
        pnlRegistroUsuario.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

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
        pnlRegistroUsuario.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

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
        pnlRegistroUsuario.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(18, 108, 48));
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtContraseña.setPreferredSize(new java.awt.Dimension(150, 30));
        txtContraseña.setSelectionColor(new java.awt.Color(255, 204, 0));
        pnlRegistroUsuario.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(18, 108, 48));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtUsuario.setPreferredSize(new java.awt.Dimension(150, 30));
        txtUsuario.setSelectionColor(new java.awt.Color(255, 204, 0));
        pnlRegistroUsuario.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        lblID.setText("id");
        pnlRegistroUsuario.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 60, 20));

        pnlFondoRegConductores.add(pnlRegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        pnlTablaConducReg.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaConducReg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE USUARIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(18, 108, 48))); // NOI18N
        pnlTablaConducReg.setPreferredSize(new java.awt.Dimension(630, 520));
        pnlTablaConducReg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUsuarios.setAltoHead(30);
        tblUsuarios.setColorBackgoundHead(new java.awt.Color(255, 204, 0));
        tblUsuarios.setColorFilasBackgound2(new java.awt.Color(255, 255, 153));
        tblUsuarios.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblUsuarios.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblUsuarios.setColorForegroundHead(new java.awt.Color(18, 108, 48));
        tblUsuarios.setColorSelBackgound(new java.awt.Color(18, 108, 48));
        tblUsuarios.setColorSelForeground(new java.awt.Color(255, 204, 0));
        tblUsuarios.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblUsuarios.setFuenteFilas(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblUsuarios.setFuenteFilasSelect(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblUsuarios.setFuenteHead(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblUsuarios.setMultipleSeleccion(false);
        tblUsuarios.setRowHeight(25);
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        pnlTablaConducReg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 610, 283));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 108, 48));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><center>En la tabla aparecen los usuarios registrados en el programa, si desea eliminar o modificar alguno, solo debe seleccionarlo y hacer dicho cambio en el panel de registro.");
        pnlTablaConducReg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 590, 141));

        pnlFondoRegConductores.add(pnlTablaConducReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Aca llamamos el metodo guardarUser para que nos guarde la info en la BD cuando le demos clic en el boton
        if (txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtNumDocumento.getText().isEmpty()
                || txtContacto.getText().isEmpty() || txtUsuario.getText().isEmpty() || txtContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion del ususrio esta incompleta, por favor verifique");
        } else {
            guardarUser();
            listarUsers();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtNumDocumento.getText().isEmpty()
                || txtContacto.getText().isEmpty() || txtUsuario.getText().isEmpty() || txtContraseña.getText().isEmpty() || lblID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion para la actualizacion esta incompleta, por favor verifique");
        } else {
            modificarUser();
            listarUsers();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtNumDocumento.getText().isEmpty()
                || txtContacto.getText().isEmpty() || txtUsuario.getText().isEmpty() || txtContraseña.getText().isEmpty() || lblID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion de eliminacion esta incompleta, por favor verifique");
        } else {
            
            // confirmar si en realidad desea eliminar el registro, lo hacemos con este codigo
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el usuario?",//<- EL MENSAJE
                    "Alerta!"/*<- El título de la ventana*/, JOptionPane.YES_NO_OPTION/*Las opciones (si o no)*/, JOptionPane.WARNING_MESSAGE/*El tipo de ventana, en este caso WARNING*/);

            if (resp == 0) {

                eliminarUser();
                listarUsers();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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

    private void txtNumDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDocumentoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");
            evt.consume();

        }
    }//GEN-LAST:event_txtNumDocumentoKeyTyped

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");

            evt.consume();

        }
    }//GEN-LAST:event_txtContactoKeyTyped

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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int seleccion = tblUsuarios.getSelectedRow();

        lblID.setText(tblUsuarios.getValueAt(seleccion, 0).toString());
        txtNombres.setText(tblUsuarios.getValueAt(seleccion, 1).toString());
        txtApellidos.setText(tblUsuarios.getValueAt(seleccion, 2).toString());
        txtNumDocumento.setText(tblUsuarios.getValueAt(seleccion, 3).toString());
        txtContacto.setText(tblUsuarios.getValueAt(seleccion, 4).toString());
        txtUsuario.setText(tblUsuarios.getValueAt(seleccion, 5).toString());
        txtContraseña.setText(tblUsuarios.getValueAt(seleccion, 6).toString());
        
        int filas = seleccion;
        btnGuardar.setVisible(false);
        
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        ru = null;
        dispose();
    }//GEN-LAST:event_formInternalFrameClosing

//***************************************** TODOS LOS METODOS ******************************************************
//***************************************** METODO GUARDAR *********************************************************
    public void guardarUser() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO usuarios (nombre, apellido, documento, contacto, user, password) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, txtNombres.getText());  //tomamos el valor desde el textField nombres
            ps.setString(2, txtApellidos.getText());//tomamos el valor desde el textField apellidos
            ps.setString(3, txtNumDocumento.getText());//tomamos el valor desde el textField numdocumento
            ps.setString(4, txtContacto.getText());//tomamos el valor desde el textField contacto
            ps.setString(5, txtUsuario.getText());//tomamos el valor desde el textField usuario
            ps.setString(6, txtContraseña.getText());//tomamos el valor desde el textField contraseña 

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, " Usuario registrado con exito !!!");
                limpiar();//creamos el metodo limpiar para limpiar los textfield

            } else {

                JOptionPane.showMessageDialog(null, "Error con el registro del usuario !!!");
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
        txtUsuario.setText("");
        txtContraseña.setText("");
        lblID.setText("");
        txtNombres.requestFocus();
        btnGuardar.setVisible(true);

    }

//***************************************** METODO LISTAR *********************************************************
    public void listarUsers() {

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            tblUsuarios.setModel(modelo);

            conexion conn = new conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT * FROM  usuarios";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData resultadoMD = rs.getMetaData();
            int cantidadColumnas = resultadoMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("DOCUMENTO");
            modelo.addColumn("CONTACTO");
            modelo.addColumn("USUARIO");
            modelo.addColumn("CONTRASEÑA");

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
    public void modificarUser() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("UPDATE usuarios SET nombre = ?, apellido = ?, documento = ?, contacto = ?, user = ?, password = ? WHERE idU = ? ");

            ps.setString(1, txtNombres.getText());  //tomamos el valor desde el textField nombres
            ps.setString(2, txtApellidos.getText());//tomamos el valor desde el textField apellidos
            ps.setString(3, txtNumDocumento.getText());//tomamos el valor desde el textField numdocumento
            ps.setString(4, txtContacto.getText());//tomamos el valor desde el textField contacto
            ps.setString(5, txtUsuario.getText());//tomamos el valor desde el textField usuario
            ps.setString(6, txtContraseña.getText());//tomamos el valor desde el textField contraseña 
            ps.setInt(7, Integer.parseInt(lblID.getText()));//tomamos el valor desde el label ID 

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "La actualizacion del usuario fue exitosa!!!");
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Hubo un error con la actualizacion del usuario!!!");
                limpiar();
            }

            con.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            System.err.println(e);
        }

    }

//***************************************** METODO ELIMINAR *******************************************************
    public void eliminarUser() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        try {

            ps = con.prepareStatement("DELETE FROM usuarios WHERE idU = ?");

            ps.setInt(1, Integer.parseInt(lblID.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "Eliminacion del usuario exitosa!!!");
                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error con la eliminacion del usuario!!!");
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JPanel pnlFondoRegConductores;
    private javax.swing.JPanel pnlRegistroUsuario;
    private javax.swing.JPanel pnlTablaConducReg;
    private rojerusan.RSTableMetro tblUsuarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumDocumento;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
