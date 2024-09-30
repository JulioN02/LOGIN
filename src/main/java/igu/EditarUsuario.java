package igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Cargo;
import logica.Controladora;
import logica.Usuario;

public class EditarUsuario extends javax.swing.JFrame {

    Controladora control;
    int id_usuario;
    Usuario usu;

    public EditarUsuario(Controladora control, int id_usuario) {
        initComponents();
        this.control = control;
        this.id_usuario = id_usuario;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        botonGuardarCambios = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 96, 53));

        jPanel4.setBackground(new java.awt.Color(6, 48, 26));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT USER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(780, Short.MAX_VALUE))
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

        jPanel5.setBackground(new java.awt.Color(13, 96, 53));

        botonGuardarCambios.setBackground(new java.awt.Color(138, 206, 171));
        botonGuardarCambios.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonGuardarCambios.setForeground(new java.awt.Color(6, 48, 26));
        botonGuardarCambios.setText("Save Changes");
        botonGuardarCambios.setBorder(null);
        botonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarCambiosActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonGuardarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(botonGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 160, 480));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed

    }//GEN-LAST:event_TFUsuarioActionPerformed

    private void TFContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFContrasenaActionPerformed

    private void botonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarCambiosActionPerformed
        
        String usuario = TFUsuario.getText();
        String contrasena = TFContrasena.getText();
        String cargo = (String) CBCargos.getSelectedItem();

        control.editarUsuario(usu, usuario, contrasena, cargo);
        
        mostrarMensaje("Los cambios en el usuario seleccionado se guardaron exitosamente", "Info", "CAMBIO EXITOSAMENTE GUARDADO");
        
    }//GEN-LAST:event_botonGuardarCambiosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        usu=control.traerUsuario(id_usuario);
        TFUsuario.setText(usu.getNombreUsuario());
        TFContrasena.setText(usu.getContrasena());
        List<Cargo> listaCargos = control.traerCargos();
        if (listaCargos != null) {
            for (Cargo cargo : listaCargos) {
                CBCargos.addItem(cargo.getNombreCargo());
            }
        }
        String cargo = usu.getCargo().getNombreCargo();
        int cantidadItems = CBCargos.getItemCount();
        for (int i = 0; i < cantidadItems; i++) {
            if (String.valueOf(CBCargos.getItemAt(i)).equals(cargo)) {
                CBCargos.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JButton botonGuardarCambios;
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
