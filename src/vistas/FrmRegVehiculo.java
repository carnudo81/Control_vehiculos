
package vistas;

/**
 *
 * @author Software_Max(JDV)
 */

public class FrmRegVehiculo extends javax.swing.JInternalFrame {

    public static String rv;
    
    public FrmRegVehiculo() {
        initComponents();
//******************************************nos sirve para centrar el internalframe dentro del destokpane****************************
        int a = FrmMenuPpal.escritorio.getWidth() - this.getWidth();
        int b = FrmMenuPpal.escritorio.getHeight() - this.getHeight();
        setLocation(a / 2, b / 2);
//************************************************************************************************************************************
        rv = "rv";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtKM = new javax.swing.JTextField();
        dcVencimientoSoat = new com.toedter.calendar.JDateChooser();
        dcVencimientoTecno = new com.toedter.calendar.JDateChooser();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        pnlTablaVehiReg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new rojerusan.RSTableMetro();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1170, 600));

        pnlFondoRegVehi.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoRegVehi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVehiculo.setForeground(new java.awt.Color(255, 204, 0));
        lblVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVehiculo.setText("REGISTRO DE  VEHICULOS");
        lblVehiculo.setPreferredSize(new java.awt.Dimension(1200, 610));
        pnlFondoRegVehi.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 40));

        pnlRegistroVehi.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroVehi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLACA: ");
        pnlRegistroVehi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MARCA:");
        pnlRegistroVehi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MODELO:");
        pnlRegistroVehi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Km:");
        pnlRegistroVehi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SOAT VENCE ");
        pnlRegistroVehi.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TECNOMECANICA VENCE");
        pnlRegistroVehi.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 150, -1));

        txtPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlaca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtPlaca.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMarca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtMarca.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModelo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtModelo.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        txtKM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 204, 0)));
        txtKM.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(txtKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        dcVencimientoSoat.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(dcVencimientoSoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        dcVencimientoTecno.setPreferredSize(new java.awt.Dimension(150, 30));
        pnlRegistroVehi.add(dcVencimientoTecno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 204, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroVehi.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 204, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroVehi.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 204, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroVehi.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 204, 0));
        btnActualizar.setText("MODIFICAR");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setPreferredSize(new java.awt.Dimension(110, 30));
        pnlRegistroVehi.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        pnlFondoRegVehi.add(pnlRegistroVehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 530, 520));

        pnlTablaVehiReg.setBackground(new java.awt.Color(255, 255, 255));

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVehiculos.setColorBackgoundHead(new java.awt.Color(255, 204, 0));
        jScrollPane1.setViewportView(tblVehiculos);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><center>En la tabla aparecen los vehiculos que estan registrados en la empresa, si desea eliminar o modificar alguno solo debe seleccionarlo y hacer dicho cambio en el panel de registro.");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(255, 204, 0)));

        javax.swing.GroupLayout pnlTablaVehiRegLayout = new javax.swing.GroupLayout(pnlTablaVehiReg);
        pnlTablaVehiReg.setLayout(pnlTablaVehiRegLayout);
        pnlTablaVehiRegLayout.setHorizontalGroup(
            pnlTablaVehiRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaVehiRegLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlTablaVehiRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTablaVehiRegLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTablaVehiRegLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        pnlTablaVehiRegLayout.setVerticalGroup(
            pnlTablaVehiRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaVehiRegLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaVehiRegLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private com.toedter.calendar.JDateChooser dcVencimientoSoat;
    private com.toedter.calendar.JDateChooser dcVencimientoTecno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
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
