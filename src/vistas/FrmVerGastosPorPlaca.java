
package vistas;

/**
 *
 * @author Software_Max(JDV)
 */
public class FrmVerGastosPorPlaca extends javax.swing.JInternalFrame {

    public static String vgp;
    FrmMenuPpal ppal = new FrmMenuPpal();

    public FrmVerGastosPorPlaca() {
        initComponents();
        vgp = "vgp";
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoRegVehi = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        pnlTablaVehiReg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMantenimientoPlaca = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        cbxPlaca = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxTipoGasto = new javax.swing.JComboBox<>();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);

        pnlFondoRegVehi.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoRegVehi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVehiculo.setForeground(new java.awt.Color(255, 204, 0));
        lblVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehiculo.setText("VER GASTOS DE VEHICULO");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegVehi.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1110, 40));

        pnlTablaVehiReg.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaVehiReg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMantenimientoPlaca.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMantenimientoPlaca.setColorBackgoundHead(new java.awt.Color(255, 204, 0));
        jScrollPane1.setViewportView(tblMantenimientoPlaca);

        pnlTablaVehiReg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1140, 390));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIPO DE GASTO");
        pnlTablaVehiReg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, -1));

        cbxPlaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        pnlTablaVehiReg.add(cbxPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 150, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VALOR TOTAL  ");
        pnlTablaVehiReg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 30, 140, -1));

        txtValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtValorTotal.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlTablaVehiReg.add(txtValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" PLACA");
        pnlTablaVehiReg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 150, -1));

        cbxTipoGasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Mantenimiento", "Combustible" }));
        pnlTablaVehiReg.add(cbxTipoGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 150, 30));

        pnlFondoRegVehi.add(pnlTablaVehiReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1160, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegVehi, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoRegVehi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxPlaca;
    private javax.swing.JComboBox<String> cbxTipoGasto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JPanel pnlFondoRegVehi;
    private javax.swing.JPanel pnlTablaVehiReg;
    private rojerusan.RSTableMetro tblMantenimientoPlaca;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
