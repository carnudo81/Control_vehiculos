
package vistas;

/**
 *
 * @author Software_Max(JDV)
 */

public class FrmVerBodega extends javax.swing.JInternalFrame {

    public static String vb;
    
    public FrmVerBodega() {
        initComponents();
        vb = "vb";
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoRegVehi = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        pnlRegistroVehi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtArticulo = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrarSalida = new javax.swing.JButton();
        cbxPlaca = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        pnlTablaVehiReg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepuestosVehiculos = new rojerusan.RSTableMetro();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cbxCategorias = new javax.swing.JComboBox<>();

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
        lblVehiculo.setForeground(new java.awt.Color(255, 204, 0));
        lblVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehiculo.setText("BODEGA DE REPUESTOS PARA VEHICULOS");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegVehi.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1140, 40));

        pnlRegistroVehi.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroVehi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLACA: ");
        pnlRegistroVehi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANTIDAD");
        pnlRegistroVehi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ARTICULO");
        pnlRegistroVehi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RESPONSABLE");
        pnlRegistroVehi.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 150, -1));

        txtResponsable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResponsable.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtResponsable.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(txtResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtCantidad.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        txtArticulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtArticulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtArticulo.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(txtArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 204, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroVehi.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 180, -1));

        btnRegistrarSalida.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarSalida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarSalida.setForeground(new java.awt.Color(255, 204, 0));
        btnRegistrarSalida.setText("REGISTRAR SALIDA");
        btnRegistrarSalida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarSalida.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroVehi.add(btnRegistrarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 180, -1));

        cbxPlaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        pnlRegistroVehi.add(cbxPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 150, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("FECHA");
        pnlRegistroVehi.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, -1));

        lblFechaActual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFechaActual.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaActual.setText("resp. fecha");
        pnlRegistroVehi.add(lblFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 150, 30));

        pnlFondoRegVehi.add(pnlRegistroVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 530, 520));

        pnlTablaVehiReg.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaVehiReg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRepuestosVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRepuestosVehiculos.setColorBackgoundHead(new java.awt.Color(255, 204, 0));
        jScrollPane1.setViewportView(tblRepuestosVehiculos);

        pnlTablaVehiReg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 630, 230));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><center>En la tabla aparecen los repuestos que estan disponibles, para registrar la salida de alguno de ellos, solo debe seleccionarlo y registrarlo.");
        pnlTablaVehiReg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 377, 630, 100));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(255, 204, 0)));
        pnlTablaVehiReg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 10, 520));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELECCIONE LA CATEGORIA:  ");
        pnlTablaVehiReg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 36, 170, 20));

        cbxCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriasActionPerformed(evt);
            }
        });
        pnlTablaVehiReg.add(cbxCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 150, 30));

        pnlFondoRegVehi.add(pnlTablaVehiReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 660, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegVehi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegVehi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriasActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        vb = null;
        dispose();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JComboBox<String> cbxCategorias;
    private javax.swing.JComboBox<String> cbxPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JPanel pnlFondoRegVehi;
    private javax.swing.JPanel pnlRegistroVehi;
    private javax.swing.JPanel pnlTablaVehiReg;
    private rojerusan.RSTableMetro tblRepuestosVehiculos;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
