package vistas;

import clases.conexion;
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
 *
 */
public class FrmCompraRepstos extends javax.swing.JInternalFrame {

    public static String cr;
    PreparedStatement ps;
    ResultSet rs;
    FrmMenuPpal ppal = new FrmMenuPpal();

    public FrmCompraRepstos() {
        initComponents();
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpTipoRegistro = new javax.swing.ButtonGroup();
        pnlFondoRegConductores = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        pnlRegistroConductor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCantidadCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        txtValorCompra = new javax.swing.JTextField();
        rbtIngreso = new javax.swing.JRadioButton();
        rbtCompra = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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
        lblVehiculo.setText("REGISTRO DE COMPRA DE REPUESTOS");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegConductores.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1100, 40));

        pnlRegistroConductor.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroConductor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 108, 48));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("N° FACTURA");
        pnlRegistroConductor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 108, 48));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VALOR");
        pnlRegistroConductor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 108, 48));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DESCRIPCION DE LA COMPRA");
        pnlRegistroConductor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 320, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 108, 48));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TIPO DE REGISTRO");
        pnlRegistroConductor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 150, -1));

        txtNumFactura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNumFactura.setForeground(new java.awt.Color(18, 108, 48));
        txtNumFactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumFactura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtNumFactura.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroConductor.add(txtNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

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
        pnlRegistroConductor.add(txtResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

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
        pnlRegistroConductor.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

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
        pnlRegistroConductor.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(18, 108, 48));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("fecha actual");
        pnlRegistroConductor.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 108, 48));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CANTIDAD");
        pnlRegistroConductor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 150, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(18, 108, 48));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("RESPONSABLE");
        pnlRegistroConductor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 150, -1));

        txtCantidadCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCantidadCompra.setForeground(new java.awt.Color(18, 108, 48));
        txtCantidadCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtCantidadCompra.setPreferredSize(new java.awt.Dimension(150, 30));
        txtCantidadCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadCompraKeyTyped(evt);
            }
        });
        pnlRegistroConductor.add(txtCantidadCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(18, 108, 48));
        jScrollPane1.setViewportView(txtDescripcion);

        pnlRegistroConductor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 330, 170));

        txtValorCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtValorCompra.setForeground(new java.awt.Color(18, 108, 48));
        txtValorCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(18, 108, 48)));
        txtValorCompra.setPreferredSize(new java.awt.Dimension(120, 30));
        txtValorCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorCompraKeyTyped(evt);
            }
        });
        pnlRegistroConductor.add(txtValorCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        btngrpTipoRegistro.add(rbtIngreso);
        rbtIngreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtIngreso.setForeground(new java.awt.Color(18, 108, 48));
        rbtIngreso.setText("INGRESO");
        rbtIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtIngresoMouseClicked(evt);
            }
        });
        pnlRegistroConductor.add(rbtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        btngrpTipoRegistro.add(rbtCompra);
        rbtCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtCompra.setForeground(new java.awt.Color(18, 108, 48));
        rbtCompra.setText("COMPRA");
        rbtCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtCompraMouseClicked(evt);
            }
        });
        pnlRegistroConductor.add(rbtCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 108, 48));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("$");
        pnlRegistroConductor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 20, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 108, 48));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FECHA");
        pnlRegistroConductor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 80, -1));

        pnlFondoRegConductores.add(pnlRegistroConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1160, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegConductores, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegConductores, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cr = null;
        dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtValorCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorCompraKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");
            evt.consume();

        }
        if (txtValorCompra.getText().length() >= 10) {

            JOptionPane.showMessageDialog(null, "Has exedido el número de caractéres permitido ¡¡¡");
        }
    }//GEN-LAST:event_txtValorCompraKeyTyped

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

    private void txtCantidadCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadCompraKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_ENTER && c != KeyEvent.VK_BACK_SPACE) {

            JOptionPane.showMessageDialog(null, "Este campo solo acepta números ");
            evt.consume();

        }
        if (txtCantidadCompra.getText().length() >= 8) {

            JOptionPane.showMessageDialog(null, "Has exedido el número de caractéres permitido ¡¡¡");
        }
    }//GEN-LAST:event_txtCantidadCompraKeyTyped

    private void rbtIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtIngresoMouseClicked
       selectIngreso();
    }//GEN-LAST:event_rbtIngresoMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtCantidadCompra.getText().isEmpty() || txtCantidadCompra.getText().isEmpty() || txtCantidadCompra.getText().isEmpty()
                || txtCantidadCompra.getText().isEmpty() || txtCantidadCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La informacion de la compra esta incompleta, por favor verifique ¡¡¡");

        } else if (rbtCompra.isSelected() == false && rbtIngreso.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado el tipo de registro, por favor seleccione uno ¡¡¡");

        } else {
            guardarCompraRepts();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void rbtCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtCompraMouseClicked
        selectCompra();
    }//GEN-LAST:event_rbtCompraMouseClicked

//***************************************** METODO SELECT COMPRA *********************************************************
    void selectCompra() {
        txtNumFactura.setText("");
        txtValorCompra.setText("");
        txtNumFactura.setEditable(true);
        txtValorCompra.setEditable(true);
    }
//***************************************** METODO SELECT INGRESO *********************************************************
    void selectIngreso() {
        txtNumFactura.setText("0");
        txtValorCompra.setText("0");
        txtNumFactura.setEditable(false);
        txtValorCompra.setEditable(false);
    }

//***************************************** METODO GUARDAR *********************************************************
    public void guardarCompraRepts() {

        conexion conn = new conexion();
        Connection con = conn.getConnection();

        String sql = "INSERT INTO compra_repts (tipo, factura, valor, responsable, cantidad, descrip, fecha, registra) VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            if (rbtCompra.isSelected()) {
                ps.setString(1, "COMPRA");
            } else if (rbtIngreso.isSelected()) {
                ps.setString(1, "INGRESO");
            }
            ps.setString(2, txtNumFactura.getText());
            ps.setInt(3, Integer.parseInt(txtValorCompra.getText()));
            ps.setString(4, txtResponsable.getText());
            ps.setString(5, txtCantidadCompra.getText());
            ps.setString(6, txtDescripcion.getText());
            ps.setString(7, lblFecha.getText());
            ps.setString(8, ppal.lblNomUser.getText());

            int res = ps.executeUpdate();

            if (res > 0) {

                JOptionPane.showMessageDialog(null, "Registro exitoso !!!");
                limpiar();//creamos el metodo limpiar para limpiar los textfield

            } else {

                JOptionPane.showMessageDialog(null, "Error con el registro !!!");
                limpiar();
            }

            con.close();//Cerramos la conexion con la BD por seguridad

        } catch (HeadlessException | SQLException e) {

            System.err.println(e);
        }

    }

//******************************************** METODO LIMPIAR *********************************************
    public void limpiar() {

        txtValorCompra.setText("");
        txtNumFactura.setText("");
        txtCantidadCompra.setText("");
        txtDescripcion.setText("");
        txtResponsable.setText("");
        btngrpTipoRegistro.clearSelection();
        selectCompra();

    }

//****************************************** COMBOBOX PERSONALIZADOS ***************************************************************    
    void mostrar() {

        String fec = sqlGeneral.FecActStr();
        lblFecha.setText(fec);
        cr = "cr";

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup btngrpTipoRegistro;
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
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JPanel pnlFondoRegConductores;
    private javax.swing.JPanel pnlRegistroConductor;
    private javax.swing.JRadioButton rbtCompra;
    private javax.swing.JRadioButton rbtIngreso;
    private javax.swing.JTextField txtCantidadCompra;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables
}
