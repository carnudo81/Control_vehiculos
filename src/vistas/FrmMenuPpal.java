package vistas;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static inicio.login.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Software_Max(JDV)
 */
public class FrmMenuPpal extends javax.swing.JFrame {

    public FrmMenuPpal() {
        initComponents();
        lblFechaAct.setText(fechaActual().toUpperCase());
        lblNomUser.setText(nom + " " + ape);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/Fondo.png"));
        Image image =icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this);

            }
        }
        ;
        pnlInfoEmpresa = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        lblLogoLeter = new javax.swing.JLabel();
        lblFechaAct = new javax.swing.JLabel();
        lblNomUser = new javax.swing.JLabel();
        lblFec = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnRegConductor = new javax.swing.JButton();
        btnRegVehiculos = new javax.swing.JButton();
        btnRegMantenimiento = new javax.swing.JButton();
        btnCompraRepuestos = new javax.swing.JButton();
        btnRegUsuarios = new javax.swing.JButton();
        btnRegSeguros = new javax.swing.JButton();
        btnRegTanqueo = new javax.swing.JButton();
        btnVerMantenimientos = new javax.swing.JButton();
        btnBodegaRepuestos = new javax.swing.JButton();
        btnVerGastosPlaca = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 1180, 610));

        pnlInfoEmpresa.setBackground(new java.awt.Color(18, 108, 48));
        pnlInfoEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 204, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(18, 108, 48));
        btnSalir.setText("X");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlInfoEmpresa.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, -1, -1));

        lblLogoLeter.setFont(new java.awt.Font("Trebuchet MS", 0, 60)); // NOI18N
        lblLogoLeter.setForeground(new java.awt.Color(255, 204, 0));
        lblLogoLeter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoLeter.setText("SOY CAMPO");
        pnlInfoEmpresa.add(lblLogoLeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 920, 100));

        lblFechaAct.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFechaAct.setForeground(new java.awt.Color(255, 204, 0));
        lblFechaAct.setText("   FECHA");
        lblFechaAct.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblFechaAct.setPreferredSize(new java.awt.Dimension(300, 30));
        pnlInfoEmpresa.add(lblFechaAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 200, -1));

        lblNomUser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblNomUser.setForeground(new java.awt.Color(255, 204, 0));
        lblNomUser.setText("NOM USER");
        lblNomUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblNomUser.setPreferredSize(new java.awt.Dimension(300, 30));
        pnlInfoEmpresa.add(lblNomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 200, -1));

        lblFec.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFec.setForeground(new java.awt.Color(255, 204, 0));
        lblFec.setText("FECHA :");
        lblFec.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblFec.setPreferredSize(new java.awt.Dimension(300, 30));
        pnlInfoEmpresa.add(lblFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, -1));

        lblUser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 204, 0));
        lblUser.setText("USUARIO :");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblUser.setPreferredSize(new java.awt.Dimension(300, 30));
        pnlInfoEmpresa.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        getContentPane().add(pnlInfoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1180, 100));

        pnlMenu.setBackground(new java.awt.Color(18, 108, 48));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegConductor.setBackground(new java.awt.Color(255, 204, 0));
        btnRegConductor.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRegConductor.setForeground(new java.awt.Color(18, 108, 48));
        btnRegConductor.setText("<html><center>Reg.<p> Conductor");
        btnRegConductor.setPreferredSize(new java.awt.Dimension(145, 40));
        btnRegConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegConductorActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRegConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 179, -1, -1));

        btnRegVehiculos.setBackground(new java.awt.Color(255, 204, 0));
        btnRegVehiculos.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRegVehiculos.setForeground(new java.awt.Color(18, 108, 48));
        btnRegVehiculos.setText("<html><center>Reg.<p> Vehiculo");
        btnRegVehiculos.setPreferredSize(new java.awt.Dimension(145, 40));
        btnRegVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegVehiculosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRegVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 121, -1, -1));

        btnRegMantenimiento.setBackground(new java.awt.Color(255, 204, 0));
        btnRegMantenimiento.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRegMantenimiento.setForeground(new java.awt.Color(18, 108, 48));
        btnRegMantenimiento.setText("<html><center>Reg.<p> Mantenimiento");
        btnRegMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegMantenimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegMantenimiento.setPreferredSize(new java.awt.Dimension(145, 40));
        btnRegMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMantenimientoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRegMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 237, -1, -1));

        btnCompraRepuestos.setBackground(new java.awt.Color(255, 204, 0));
        btnCompraRepuestos.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnCompraRepuestos.setForeground(new java.awt.Color(18, 108, 48));
        btnCompraRepuestos.setText("<html><center>Compra<p> Repuestos");
        btnCompraRepuestos.setPreferredSize(new java.awt.Dimension(145, 40));
        btnCompraRepuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraRepuestosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnCompraRepuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 295, -1, -1));

        btnRegUsuarios.setBackground(new java.awt.Color(255, 204, 0));
        btnRegUsuarios.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRegUsuarios.setForeground(new java.awt.Color(18, 108, 48));
        btnRegUsuarios.setText("<html><center>Reg.<p> Usuario");
        btnRegUsuarios.setPreferredSize(new java.awt.Dimension(145, 40));
        btnRegUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegUsuariosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRegUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 353, -1, -1));

        btnRegSeguros.setBackground(new java.awt.Color(255, 204, 0));
        btnRegSeguros.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRegSeguros.setForeground(new java.awt.Color(18, 108, 48));
        btnRegSeguros.setText("<html><center>Reg.<p> Seguros Vehiculo");
        btnRegSeguros.setPreferredSize(new java.awt.Dimension(145, 40));
        btnRegSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSegurosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRegSeguros, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 411, -1, -1));

        btnRegTanqueo.setBackground(new java.awt.Color(255, 204, 0));
        btnRegTanqueo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRegTanqueo.setForeground(new java.awt.Color(18, 108, 48));
        btnRegTanqueo.setText("<html><center>Reg.<p> Tanqueo");
        btnRegTanqueo.setPreferredSize(new java.awt.Dimension(145, 40));
        btnRegTanqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegTanqueoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRegTanqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 469, -1, -1));

        btnVerMantenimientos.setBackground(new java.awt.Color(255, 204, 0));
        btnVerMantenimientos.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnVerMantenimientos.setForeground(new java.awt.Color(18, 108, 48));
        btnVerMantenimientos.setText("<html><center>Ver<p> Mantenimientos");
        btnVerMantenimientos.setPreferredSize(new java.awt.Dimension(145, 40));
        btnVerMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMantenimientosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnVerMantenimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 527, -1, -1));

        btnBodegaRepuestos.setBackground(new java.awt.Color(255, 204, 0));
        btnBodegaRepuestos.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnBodegaRepuestos.setForeground(new java.awt.Color(18, 108, 48));
        btnBodegaRepuestos.setText("<html><center>Ver Bodega<p> Repuestos");
        btnBodegaRepuestos.setPreferredSize(new java.awt.Dimension(145, 40));
        btnBodegaRepuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBodegaRepuestosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnBodegaRepuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 585, -1, -1));

        btnVerGastosPlaca.setBackground(new java.awt.Color(255, 204, 0));
        btnVerGastosPlaca.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnVerGastosPlaca.setForeground(new java.awt.Color(18, 108, 48));
        btnVerGastosPlaca.setText("<html><center>Ver gastos<p> X Placa");
        btnVerGastosPlaca.setActionCommand("");
        btnVerGastosPlaca.setPreferredSize(new java.awt.Dimension(145, 40));
        btnVerGastosPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerGastosPlacaActionPerformed(evt);
            }
        });
        pnlMenu.add(btnVerGastosPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 643, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        lblMenu.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(18, 108, 48));
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(lblMenu)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblMenu)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 100));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Con este boton cerramos la aplicacion
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegUsuariosActionPerformed
        String ru = FrmRegUsuario.ru;
        if (ru == null) {
            FrmRegUsuario user = new FrmRegUsuario();
            escritorio.add(user);
            user.toFront();
            user.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg user ya abierta verifique");
        }
    }//GEN-LAST:event_btnRegUsuariosActionPerformed

    private void btnRegConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegConductorActionPerformed
        String rc = FrmRegConductor.rc;
        if (rc == null) {
            FrmRegConductor cond = new FrmRegConductor();
            escritorio.add(cond);
            cond.toFront();
            cond.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg conductor ya abierta verifique");
        }
    }//GEN-LAST:event_btnRegConductorActionPerformed

    private void btnRegVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegVehiculosActionPerformed
        String rv = FrmRegVehiculos.rv;
        if (rv == null) {
            FrmRegVehiculos vehi = new FrmRegVehiculos();
            escritorio.add(vehi);
            vehi.toFront();
            vehi.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg vehiculos ya abierta verifique");
        }
    }//GEN-LAST:event_btnRegVehiculosActionPerformed

    private void btnRegMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMantenimientoActionPerformed
        String rm = FrmRegMantenimientos.rm;
        if (rm == null) {
            FrmRegMantenimientos mante = new FrmRegMantenimientos();
            escritorio.add(mante);
            mante.toFront();
            mante.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg mantenimientso ya abierta verifique");
        }
    }//GEN-LAST:event_btnRegMantenimientoActionPerformed

    private void btnCompraRepuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraRepuestosActionPerformed
        String cr = FrmCompraRepstos.cr;
        if (cr == null) {
            FrmCompraRepstos compre = new FrmCompraRepstos();
            escritorio.add(compre);
            compre.toFront();
            compre.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg repuestos ya abierta verifique");
        }
    }//GEN-LAST:event_btnCompraRepuestosActionPerformed

    private void btnRegSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSegurosActionPerformed
        String rsg = FrmRegSeguros.rsg;
        if (rsg == null) {
            FrmRegSeguros segur = new FrmRegSeguros();
            escritorio.add(segur);
            segur.toFront();
            segur.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg seguros ya abierta verifique");
        }
    }//GEN-LAST:event_btnRegSegurosActionPerformed

    private void btnRegTanqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegTanqueoActionPerformed
        String rt = FrmTanqueoVehiculos.rt;
        if (rt == null) {
            FrmTanqueoVehiculos tanq = new FrmTanqueoVehiculos();
            escritorio.add(tanq);
            tanq.toFront();
            tanq.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg tanqueos ya abierta verifique");
        }
    }//GEN-LAST:event_btnRegTanqueoActionPerformed

    private void btnVerMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMantenimientosActionPerformed
        String vm = FrmVerMantenimientos.vm;
        if (vm == null) {
            FrmVerMantenimientos verman = new FrmVerMantenimientos();
            escritorio.add(verman);
            verman.toFront();
            verman.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg ver mantenimiento ya abierta verifique");
        }
    }//GEN-LAST:event_btnVerMantenimientosActionPerformed

    private void btnBodegaRepuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBodegaRepuestosActionPerformed
        String vb = FrmVerBodega.vb;
        if (vb == null) {
            FrmVerBodega bodega = new FrmVerBodega();
            escritorio.add(bodega);
            bodega.toFront();
            bodega.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg tanqueos ya abierta verifique");
        }
    }//GEN-LAST:event_btnBodegaRepuestosActionPerformed

    private void btnVerGastosPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerGastosPlacaActionPerformed
        String vgp = FrmVerGastosPorPlaca.vgp;
        if (vgp == null) {
            FrmVerGastosPorPlaca gaspla = new FrmVerGastosPorPlaca();
            escritorio.add(gaspla);
            gaspla.toFront();
            gaspla.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "reg tanqueos ya abierta verifique");
        }
    }//GEN-LAST:event_btnVerGastosPlacaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPpal().setVisible(true);
            }
        });
    }

//************************************************************* METODOS ***********************************************************************
//****************************************************** FECHA DEL SISTEMA (dia-mes-año) ******************************************************
    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE dd MMMM YYYY ");

        return formatoFecha.format(fecha);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBodegaRepuestos;
    public javax.swing.JButton btnCompraRepuestos;
    public javax.swing.JButton btnRegConductor;
    public javax.swing.JButton btnRegMantenimiento;
    public javax.swing.JButton btnRegSeguros;
    public javax.swing.JButton btnRegTanqueo;
    public javax.swing.JButton btnRegUsuarios;
    public javax.swing.JButton btnRegVehiculos;
    private javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVerGastosPlaca;
    public javax.swing.JButton btnVerMantenimientos;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblFec;
    private javax.swing.JLabel lblFechaAct;
    private javax.swing.JLabel lblLogoLeter;
    private javax.swing.JLabel lblMenu;
    public javax.swing.JLabel lblNomUser;
    public javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlInfoEmpresa;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
