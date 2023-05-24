/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IMS;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

/**
 *
 * @author Raidi
 */
public class CustomerLogin extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLogin
     */
    public CustomerLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernamelogin = new javax.swing.JTextField();
        gotoregister = new javax.swing.JButton();
        confirmtologin = new javax.swing.JButton();
        passwordlogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");

        usernamelogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gotoregister.setText("Register");
        gotoregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoregisterActionPerformed(evt);
            }
        });

        confirmtologin.setText("Confirm");
        confirmtologin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmtologinActionPerformed(evt);
            }
        });

        passwordlogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(gotoregister)
                                .addGap(18, 18, 18)
                                .addComponent(confirmtologin))
                            .addComponent(usernamelogin)
                            .addComponent(passwordlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(519, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernamelogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gotoregister)
                    .addComponent(confirmtologin))
                .addContainerGap(508, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gotoregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoregisterActionPerformed
        // Sends user to register form
        dispose();
        CustomerRegister logintoreg = new CustomerRegister();
        logintoreg.setVisible(true);
    }//GEN-LAST:event_gotoregisterActionPerformed

    private void confirmtologinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmtologinActionPerformed
        // Sends user to his/her profile
        String usernamelog = usernamelogin.getText();
        String passwordlog = new String(passwordlogin.getPassword());
        String filepath = "C:\\Users\\Raidi\\Documents\\ComProgProject\\trunk\\Downloads\\Inventory Management System and POS\\src\\IMS\\";
        File path = new File(filepath);
        
        if(!path.exists() || !path.isDirectory()){
            JOptionPane.showMessageDialog(null, "Error: Account doesn't exist");
            return;
        }
        
        boolean accounthere = false;
        
        File[] thisfile = path.listFiles();
        if(thisfile != null){
            for(File reading : thisfile){
                if(reading.isFile()){
                    try (BufferedReader readthefile = new BufferedReader(new FileReader(reading))){
                        String usernamefile = null;
                        String passwordfile = null;
                        String eachline;
                        
                        while((eachline = readthefile.readLine()) != null){
                            if(eachline.startsWith("Username:")){
                                usernamefile = eachline.substring(eachline.indexOf(":") + 1).trim();
                            }
                            else if(eachline.startsWith("Password:")){
                                passwordfile = eachline.substring(eachline.indexOf(":") + 1).trim();
                            }
                        }
                        
                        if(usernamefile != null && passwordfile != null && usernamefile.equals(usernamelog) && passwordfile.equals(passwordlog)){
                            accounthere = true;
                            break;
                        }
                        
                    }
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
                        return;
                    }
                }
            }
        }
        
        if (accounthere) {
            JOptionPane.showMessageDialog(null, "Successfully Login");
            dispose();
            CustomerProfile logintoprofile = new CustomerProfile();
            logintoprofile.setusername(usernamelog);
            logintoprofile.setVisible(true);
           
        } else {
            JOptionPane.showMessageDialog(null, "Account does not Exist");
        }
    }//GEN-LAST:event_confirmtologinActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmtologin;
    private javax.swing.JButton gotoregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordlogin;
    private javax.swing.JTextField usernamelogin;
    // End of variables declaration//GEN-END:variables
}
