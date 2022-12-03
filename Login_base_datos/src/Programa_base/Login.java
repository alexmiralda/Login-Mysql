/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programa_base;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Text_user = new javax.swing.JTextField();
        Boton_login = new javax.swing.JButton();
        Boton_reg = new javax.swing.JButton();
        Boton_salir = new javax.swing.JButton();
        Text_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Conexión a BD");

        Text_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_userActionPerformed(evt);
            }
        });

        Boton_login.setBackground(new java.awt.Color(255, 153, 102));
        Boton_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Boton_login.setText("Acceder");
        Boton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_loginActionPerformed(evt);
            }
        });

        Boton_reg.setBackground(new java.awt.Color(255, 153, 102));
        Boton_reg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Boton_reg.setText("Registrarse");
        Boton_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_regActionPerformed(evt);
            }
        });

        Boton_salir.setBackground(new java.awt.Color(255, 102, 102));
        Boton_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Boton_salir.setText("Salir");
        Boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Boton_salir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Text_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Boton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(Boton_reg))
                        .addComponent(Text_user, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(229, 229, 229))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Text_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_userActionPerformed

    private void Boton_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_regActionPerformed
        // TODO add your handling code here:
        
        Registro ventana = new Registro();
        ventana.setVisible(true);
    }//GEN-LAST:event_Boton_regActionPerformed

    private void Boton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_loginActionPerformed
        // TODO add your handling code here:
        
        try{
            Conexion CON = new Conexion();
            String user = Text_user.getText();
            String pass = Text_pass.getText();
            CON.getConectar();
            
            String SQL1 = "SELECT id, Usuario FROM registro"
                    + " WHERE Usuario = '"+user+"'AND Contraseña = '"+pass+"'";
            
            CON.resultado = CON.sentencia.executeQuery(SQL1);
            
            if(CON.resultado.next()){
            
             JOptionPane.showMessageDialog(null, "Bienvenido "+user+" disfrute su estadía.");
            
            }else{
            
            
            JOptionPane.showMessageDialog(null, "El usuario o la contraseña son invalidos");
            
            }
            
            
        }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
    }//GEN-LAST:event_Boton_loginActionPerformed

    private void Boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Boton_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        
        
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_login;
    private javax.swing.JButton Boton_reg;
    private javax.swing.JButton Boton_salir;
    private javax.swing.JPasswordField Text_pass;
    private javax.swing.JTextField Text_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
