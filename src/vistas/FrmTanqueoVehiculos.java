

package vistas;

/**
 *
 * @author Software_Max(JDV)
 */
public class FrmTanqueoVehiculos extends javax.swing.JInternalFrame {

    public  static String rt;
    
    public FrmTanqueoVehiculos() {
        initComponents();
        rt= "rt";
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngpTipManten = new javax.swing.ButtonGroup();
        pnlFondoRegConductores = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        pnlRegistroConductor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCantidadGalones = new javax.swing.JTextField();
        cbxTipoCombust = new javax.swing.JComboBox<>();
        txtKMalTanquear = new javax.swing.JTextField();
        cbxPlaca = new javax.swing.JComboBox<>();
        txtValorGalon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

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
        lblVehiculo.setForeground(new java.awt.Color(255, 204, 0));
        lblVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehiculo.setText("REGISTRO TANQUEO DE VEHICULOS");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegConductores.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1130, 40));

        pnlRegistroConductor.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroConductor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLACA");
        pnlRegistroConductor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIPO COMBUSTIBLE");
        pnlRegistroConductor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VALOR / GALON");
        pnlRegistroConductor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Km / AL TANQUEAR");
        pnlRegistroConductor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FECHA");
        pnlRegistroConductor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 150, -1));

        txtResponsable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResponsable.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtResponsable.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroConductor.add(txtResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 204, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroConductor.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 204, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroConductor.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 204, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroConductor.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 204, 0));
        btnActualizar.setText("MODIFICAR");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroConductor.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, -1, -1));

        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("fecha actual");
        pnlRegistroConductor.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CANTIDAD / GALONES");
        pnlRegistroConductor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 150, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("RESPONSABLE");
        pnlRegistroConductor.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 200, 150, -1));

        txtCantidadGalones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadGalones.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtCantidadGalones.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroConductor.add(txtCantidadGalones, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        cbxTipoCombust.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ruedas", "Lubricantes", "Mecanicos", "Ruedas", " " }));
        pnlRegistroConductor.add(cbxTipoCombust, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 150, 30));

        txtKMalTanquear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKMalTanquear.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtKMalTanquear.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroConductor.add(txtKMalTanquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        cbxPlaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ruedas", "Lubricantes", "Mecanicos", "Ruedas", " " }));
        pnlRegistroConductor.add(cbxPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, 30));

        txtValorGalon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorGalon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtValorGalon.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroConductor.add(txtValorGalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VALOR  TOTAL");
        pnlRegistroConductor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 150, -1));

        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtTotal.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroConductor.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, -1));

        pnlFondoRegConductores.add(pnlRegistroConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1190, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegConductores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegConductores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        rt = null;
        dispose();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup btngpTipManten;
    private javax.swing.JComboBox<String> cbxPlaca;
    private javax.swing.JComboBox<String> cbxTipoCombust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JPanel pnlFondoRegConductores;
    private javax.swing.JPanel pnlRegistroConductor;
    private javax.swing.JTextField txtCantidadGalones;
    private javax.swing.JTextField txtKMalTanquear;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValorGalon;
    // End of variables declaration//GEN-END:variables
}
