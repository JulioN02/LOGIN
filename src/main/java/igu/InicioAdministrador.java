package igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Usuario;

public class InicioAdministrador extends javax.swing.JFrame {

    Controladora control;
    Usuario user;
    public InicioAdministrador(Controladora control, Usuario user) {
        initComponents();
        this.control = control;
        this.user=user;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        botonCrearUsuario = new javax.swing.JButton();
        botonEditarUsuario = new javax.swing.JButton();
        botonBorrarUsuario = new javax.swing.JButton();
        botonRecargarTabla = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 96, 53));

        jPanel4.setBackground(new java.awt.Color(6, 48, 26));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERS ADMINISTRATION");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(493, Short.MAX_VALUE))
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

        tableUsuarios.setBackground(new java.awt.Color(138, 206, 171));
        tableUsuarios.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        tableUsuarios.setForeground(new java.awt.Color(6, 48, 26));
        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableUsuarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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

        botonEditarUsuario.setBackground(new java.awt.Color(138, 206, 171));
        botonEditarUsuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonEditarUsuario.setForeground(new java.awt.Color(6, 48, 26));
        botonEditarUsuario.setText("Edit User");
        botonEditarUsuario.setBorder(null);
        botonEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarUsuarioActionPerformed(evt);
            }
        });

        botonBorrarUsuario.setBackground(new java.awt.Color(138, 206, 171));
        botonBorrarUsuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonBorrarUsuario.setForeground(new java.awt.Color(6, 48, 26));
        botonBorrarUsuario.setText("Delet User");
        botonBorrarUsuario.setBorder(null);
        botonBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarUsuarioActionPerformed(evt);
            }
        });

        botonRecargarTabla.setBackground(new java.awt.Color(138, 206, 171));
        botonRecargarTabla.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        botonRecargarTabla.setForeground(new java.awt.Color(6, 48, 26));
        botonRecargarTabla.setText("Reload Table");
        botonRecargarTabla.setBorder(null);
        botonRecargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecargarTablaActionPerformed(evt);
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
                    .addComponent(botonCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEditarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(botonBorrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(botonRecargarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(botonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(botonEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(botonBorrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(botonRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNombreUser.setText(user.getNombreUsuario());
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecargarTablaActionPerformed
        cargarTabla();
    }//GEN-LAST:event_botonRecargarTablaActionPerformed

    private void botonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearUsuarioActionPerformed
        CrearUsuario pCrearUsuario = new CrearUsuario(control, user);
        pCrearUsuario.setVisible(true);
        pCrearUsuario.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_botonCrearUsuarioActionPerformed

    private void botonBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarUsuarioActionPerformed
        if (tableUsuarios.getRowCount()>0){
            if (tableUsuarios.getSelectedRow()!=-1){
                int id_usuario = Integer.parseInt(String.valueOf(tableUsuarios.getValueAt(tableUsuarios.getSelectedRow(), 0)));
                control.borrarUsuario(id_usuario);
                mostrarMensaje("El usuario seleccionado ha sido eliminado exitosamente", "Info", "USUARIO ELIMINADO");
                cargarTabla();
            } else {
                mostrarMensaje("Ningun usuario seleccionado", "Error", "ERROR SELECCION");
            }
        } else {
            mostrarMensaje("Tabla sin registros por eliminar", "Error", "ERROR REGISTROS");
        }
    }//GEN-LAST:event_botonBorrarUsuarioActionPerformed

    private void botonEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarUsuarioActionPerformed
        if (tableUsuarios.getRowCount()>0){
            if (tableUsuarios.getSelectedRow()!=-1){
                int id_usuario = Integer.parseInt(String.valueOf(tableUsuarios.getValueAt(tableUsuarios.getSelectedRow(), 0)));
                EditarUsuario pEdicion = new EditarUsuario(control, id_usuario);
                pEdicion.setVisible(true);
                pEdicion.setLocationRelativeTo(null);
                
            } else {
                mostrarMensaje("No se selecciono ningun usuario", "Error", "SELECCION INVALIDA");
            }
        } else {
            mostrarMensaje("No hay usuario registrado para ser editado", "Error", "SIN REGISTROS");
        }
    }//GEN-LAST:event_botonEditarUsuarioActionPerformed
    
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
    
    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        
        String titulos[] = {"ID","USUARIO","CONTRASEÑA","CARGO"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        List<Usuario> listaUsuarios = control.traerUsuarios();
        if (listaUsuarios!=null){
            for (Usuario usu : listaUsuarios){
                Object[] objeto = {usu.getId(),usu.getNombreUsuario(),usu.getContrasena(),usu.getCargo().getNombreCargo()};
                modeloTabla.addRow(objeto);
            }
        }
        tableUsuarios.setModel(modeloTabla);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarUsuario;
    private javax.swing.JButton botonCrearUsuario;
    private javax.swing.JButton botonEditarUsuario;
    private javax.swing.JButton botonRecargarTabla;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JLabel txtNombreUser;
    // End of variables declaration//GEN-END:variables

    
}
