package igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Cargo;
import logica.Controladora;
import logica.Usuario;

public class CrearUsuario extends javax.swing.JFrame {

    Controladora control;
    Usuario user;

    public CrearUsuario(Controladora control, Usuario user) {
        initComponents();
        this.control = control;
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        labelUser = new javax.swing.JLabel();
        TFUsuario = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        labelUser1 = new javax.swing.JLabel();
        TFContrasena = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        labelUser2 = new javax.swing.JLabel();
        CBCargos = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        botonCrearUsuario = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 96, 53));

        jPanel4.setBackground(new java.awt.Color(6, 48, 26));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATED NEW USER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(582, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtNombreUser.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        txtNombreUser.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNombreUser.setText("USER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 160));

        jPanel3.setBackground(new java.awt.Color(13, 96, 53));

        jPanel8.setBackground(new java.awt.Color(138, 206, 171));

        labelUser.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setText("USER :");

        TFUsuario.setBackground(new java.awt.Color(6, 48, 26));
        TFUsuario.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        TFUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TFUsuario.setBorder(null);
        TFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(138, 206, 171));

        labelUser1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        labelUser1.setForeground(new java.awt.Color(255, 255, 255));
        labelUser1.setText("PASSWORD :");

        TFContrasena.setBackground(new java.awt.Color(6, 48, 26));
        TFContrasena.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        TFContrasena.setForeground(new java.awt.Color(255, 255, 255));
        TFContrasena.setBorder(null);
        TFContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labelUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBackground(new java.awt.Color(138, 206, 171));

        labelUser2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        labelUser2.setForeground(new java.awt.Color(255, 255, 255));
        labelUser2.setText("ROLE :");

        CBCargos.setBackground(new java.awt.Color(6, 48, 26));
        CBCargos.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        CBCargos.setForeground(new java.awt.Color(255, 255, 255));
        CBCargos.setBorder(null);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labelUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBCargos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(CBCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 770, 480));

        jPanel5.setBackground(new java.awt.Color(13, 96, 53));

        botonCrearUsuario.setBackground(new java.awt.Color(138, 206, 171));
        botonCrearUsuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonCrearUsuario.setForeground(new java.awt.Color(6, 48, 26));
        botonCrearUsuario.setText("Created User");
        botonCrearUsuario.setBorder(null);
        botonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearUsuarioActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(138, 206, 171));
        botonSalir.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(6, 48, 26));
        botonSalir.setText("Exit");
        botonSalir.setBorder(null);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonLimpiar.setBackground(new java.awt.Color(138, 206, 171));
        botonLimpiar.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(6, 48, 26));
        botonLimpiar.setText("Clean");
        botonLimpiar.setBorder(null);
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(botonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 160, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed

    }//GEN-LAST:event_TFUsuarioActionPerformed

    private void botonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearUsuarioActionPerformed
        String usuario = TFUsuario.getText();
        String contrasena = TFContrasena.getText();
        StringBuilder mensajesError = new StringBuilder();
        if (usuario == null || usuario.isEmpty()) {
            mensajesError.append("Falta nombre de usuario por ingresar.\n");
        }
        if (contrasena == null || contrasena.isEmpty()) {
            mensajesError.append("Falta contraseña por ingresar.\n");
        }
        String cargo = (String) CBCargos.getSelectedItem();
        if (cargo == null || cargo.equals("- - - - -")) {
            mensajesError.append("Debe seleccionar un cargo válido.\n");
        }
        if (mensajesError.length() > 0) {
            mostrarMensaje(mensajesError.toString(), "Error", "DATOS INVALIDOS");
        } else {
            control.crearUsuario(usuario, contrasena, cargo);
            mostrarMensaje("Usuario creado exitosamente", "Info", "USUARIO CREADO");
        }

        /*
        String usuario = TFUsuario.getText();
        String contrasena = TFContrasena.getText();
        String cargo = (String) CBCargos.getSelectedItem();
        control.crearUsuario(usuario, contrasena, cargo);
        mostrarMensaje("Usuario creado exitosamente", "Info", "USUARIO CREADO");
         */

    }//GEN-LAST:event_botonCrearUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNombreUser.setText(user.getNombreUsuario());
        List<Cargo> listaCargos = control.traerCargos();
        if (listaCargos != null) {
            for (Cargo cargo : listaCargos) {
                CBCargos.addItem(cargo.getNombreCargo());
            }
        }
        CBCargos.setSelectedItem("- - - - -");
    }//GEN-LAST:event_formWindowOpened

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        TFUsuario.setText("");
        TFContrasena.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void TFContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFContrasenaActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBCargos;
    private javax.swing.JTextField TFContrasena;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JButton botonCrearUsuario;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel labelUser1;
    private javax.swing.JLabel labelUser2;
    private javax.swing.JLabel txtNombreUser;
    // End of variables declaration//GEN-END:variables
}
