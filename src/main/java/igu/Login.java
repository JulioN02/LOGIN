package igu;

import logica.Controladora;
import logica.Usuario;

public class Login extends javax.swing.JFrame {

    Controladora control;
    
    public Login() {
        initComponents();
        control = new Controladora();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        labelPassword = new javax.swing.JLabel();
        PFContrasena = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        labelUser = new javax.swing.JLabel();
        TFUsuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAMensaje = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(138, 206, 171));

        labelPassword.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password:");

        PFContrasena.setBackground(new java.awt.Color(6, 48, 26));
        PFContrasena.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        PFContrasena.setForeground(new java.awt.Color(255, 255, 255));
        PFContrasena.setBorder(null);
        PFContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(labelPassword)
                .addGap(18, 18, 18)
                .addComponent(PFContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 600, 60));

        jPanel8.setBackground(new java.awt.Color(138, 206, 171));

        labelUser.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setText("User :");

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
                .addGap(105, 105, 105)
                .addComponent(labelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addComponent(TFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 600, 60));

        jPanel3.setBackground(new java.awt.Color(6, 48, 26));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(609, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 160, 700));

        jPanel5.setBackground(new java.awt.Color(13, 96, 53));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 130));

        jPanel2.setBackground(new java.awt.Color(13, 96, 53));

        botonGuardar.setBackground(new java.awt.Color(138, 206, 171));
        botonGuardar.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(6, 48, 26));
        botonGuardar.setText("SAVE");
        botonGuardar.setBorder(null);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonLimpiar.setBackground(new java.awt.Color(138, 206, 171));
        botonLimpiar.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(6, 48, 26));
        botonLimpiar.setText("CLEAN");
        botonLimpiar.setBorder(null);
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 600, 130));

        TAMensaje.setEditable(false);
        TAMensaje.setBackground(new java.awt.Color(138, 206, 171));
        TAMensaje.setColumns(20);
        TAMensaje.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        TAMensaje.setForeground(new java.awt.Color(255, 255, 255));
        TAMensaje.setLineWrap(true);
        TAMensaje.setRows(5);
        TAMensaje.setBorder(null);
        jScrollPane1.setViewportView(TAMensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 290, -1));

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

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed

    }//GEN-LAST:event_TFUsuarioActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        String usuario=TFUsuario.getText();
        String contrasena=PFContrasena.getText();
        Usuario user = control.validarUsuario(usuario, contrasena);
        if(user!=null){
            String Cargo = user.getCargo().getNombreCargo();
            if(Cargo.equals("Admin")){
                InicioAdministrador pAdmin = new InicioAdministrador(control, user);
                pAdmin.setVisible(true);
                pAdmin.setLocationRelativeTo(null);
                this.dispose();
            }
            if(Cargo.equals("User") || Cargo.equals("CEO")){
                InicioUsuario pUser = new InicioUsuario(control, user);
                pUser.setVisible(true);
                pUser.setLocationRelativeTo(null);
                this.dispose();
            }
        } else {
            TAMensaje.setText("Usuario o contraseña incorrectos");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        TFUsuario.setText("");
        PFContrasena.setText("");
        TAMensaje.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void PFContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFContrasenaActionPerformed
        
    }//GEN-LAST:event_PFContrasenaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PFContrasena;
    private javax.swing.JTextArea TAMensaje;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUser;
    // End of variables declaration//GEN-END:variables
}
