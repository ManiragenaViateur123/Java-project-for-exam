/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Manager.ManagerDashBoard;
import StoreKeeper.StoreKeeperDashBoard;
import cashier.CashierDashBoard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author AMIFAH
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();
        PassWord = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        Sshowpass = new javax.swing.JCheckBox();
        loginbttn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WINE LIQUOR STORE  LOGIN FORM");

        jPanel1.setBackground(new java.awt.Color(0, 29, 32));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        UserName.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("UserName");

        PassWord.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        PassWord.setForeground(new java.awt.Color(255, 255, 255));
        PassWord.setText("PassWord");

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        Sshowpass.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        Sshowpass.setForeground(new java.awt.Color(255, 255, 255));
        Sshowpass.setText("Show Password");
        Sshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SshowpassActionPerformed(evt);
            }
        });

        loginbttn.setBackground(new java.awt.Color(0, 153, 153));
        loginbttn.setFont(new java.awt.Font("Footlight MT Light", 1, 18)); // NOI18N
        loginbttn.setForeground(new java.awt.Color(255, 255, 255));
        loginbttn.setText("LOGIN");
        loginbttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbttnMouseClicked(evt);
            }
        });
        loginbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbttnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN FORM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(loginbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Sshowpass))))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Sshowpass)
                .addGap(39, 39, 39)
                .addComponent(loginbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

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

    private void loginbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbttnActionPerformed
        
            String Username=userfield.getText();
            String password=PasswordField.getText();
            
        
        try {
            // TODO add your handling code here:
            
            

            Class.forName("com.mysql.jdbc.Driver");
            Connection connectme=DriverManager.getConnection("jdbc:mysql://localhost:3306/wine_liquor_store", "root","");

            PreparedStatement login = (PreparedStatement) connectme
                    .prepareStatement("select User_Name,Password,Position,User_ID from user_login join employees on user_login.Employee_ID=employees.Employee_ID where User_Name=? and Password=?");
          
            
            login.setString(1, Username);
            login.setString(2, password);
            ResultSet rslt = login.executeQuery();
                        
            /*String show="select User_Name,Password from user_login where User_Name=? and Password=?";
            PreparedStatement loginbutton=connectme.prepareStatement(show);
            loginbutton.setString(1,"userfield");
            loginbutton.setString(2,"PasswordField");
            ResultSet rslt=loginbutton.executeQuery();*/

            if(rslt.next()){
                
                String Position = rslt.getString("Position");
                String postion0="Cashier";
                String postion1="Store Keeper";
                String postion2="Manager";
                
                
                if(Position.equals(postion0)){
                    
                CashierDashBoard cdb= new CashierDashBoard();
                cdb.setVisible(true);
                cdb.pack();
                cdb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
                
                CashierDashBoard.UserText.setText(rslt.getString("User_ID"));
                
                JOptionPane.showMessageDialog(null,"The Cashier");
                }
                
                else if(Position.equals(postion1)){
                    
                StoreKeeperDashBoard cdb= new StoreKeeperDashBoard();
                cdb.setVisible(true);
                cdb.pack();
                cdb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
                StoreKeeperDashBoard.UserText.setText(rslt.getString("User_ID"));
                
                JOptionPane.showMessageDialog(null,"The Store Keeper");
                }
                
                else if(Position.equals(postion2)){
                    
                ManagerDashBoard cdb= new ManagerDashBoard();
                cdb.setVisible(true);
                cdb.pack();
                cdb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
                ManagerDashBoard.UserText.setText(rslt.getString("User_ID"));
                
                JOptionPane.showMessageDialog(null,"The Manager");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Check If Your Username And Password are Correct!");
                userfield.setText("");
                PasswordField.setText("");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_loginbttnActionPerformed

    private void SshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SshowpassActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==Sshowpass){
            if(Sshowpass.isSelected()){
                PasswordField.setEchoChar((char)0);
            }
            else{
                PasswordField.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_SshowpassActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void loginbttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbttnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbttnMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PassWord;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JCheckBox Sshowpass;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginbttn;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables

    private static class rslt {

        private static String getString(String user_ID) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public rslt() {
        }
    }
}
