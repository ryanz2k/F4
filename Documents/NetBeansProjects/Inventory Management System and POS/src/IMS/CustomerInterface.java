/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package IMS;
/**
 *
 * @author Raidi
 */
public class CustomerInterface extends javax.swing.JPanel {

    /**
     * Creates new form CustomerInterface
     */
    public CustomerInterface() {
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CustomerRegisterForm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CustomerUsernameRegister = new javax.swing.JTextField();
        CustomerPasswordRegister = new javax.swing.JTextField();
        CustomerEmailRegister = new javax.swing.JTextField();
        CustomerBirthdayDayRegister = new javax.swing.JTextField();
        CustomerBirthdayMonhtRegister = new javax.swing.JTextField();
        CustomerBirthdayYearRegister = new javax.swing.JTextField();
        ConfirmRegister = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel2");

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        setAlignmentX(0.0F);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setAlignmentX(0.0F);

        CustomerRegisterForm.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        CustomerRegisterForm.setText("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(CustomerRegisterForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(CustomerRegisterForm)
                .addGap(28, 28, 28))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.setMaximumSize(new java.awt.Dimension(69, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(69, 22));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel4.setMaximumSize(new java.awt.Dimension(69, 22));
        jLabel4.setMinimumSize(new java.awt.Dimension(69, 22));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.setMaximumSize(new java.awt.Dimension(69, 22));
        jLabel5.setMinimumSize(new java.awt.Dimension(69, 22));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Birthday:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.setMaximumSize(new java.awt.Dimension(69, 22));
        jLabel6.setMinimumSize(new java.awt.Dimension(69, 22));

        CustomerUsernameRegister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerUsernameRegister.setText("Enter Username");
        CustomerUsernameRegister.setAlignmentX(0.0F);
        CustomerUsernameRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CustomerUsernameRegister.setPreferredSize(new java.awt.Dimension(42, 42));

        CustomerPasswordRegister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerPasswordRegister.setText("*********");
        CustomerPasswordRegister.setAlignmentX(0.0F);
        CustomerPasswordRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CustomerPasswordRegister.setPreferredSize(new java.awt.Dimension(42, 42));

        CustomerEmailRegister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerEmailRegister.setText("imadrunkard123@email.com");
        CustomerEmailRegister.setAlignmentX(0.0F);
        CustomerEmailRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CustomerEmailRegister.setPreferredSize(new java.awt.Dimension(42, 42));

        CustomerBirthdayDayRegister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerBirthdayDayRegister.setText("Day");
        CustomerBirthdayDayRegister.setAlignmentX(0.0F);
        CustomerBirthdayDayRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CustomerBirthdayDayRegister.setPreferredSize(new java.awt.Dimension(42, 42));
        CustomerBirthdayDayRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBirthdayDayRegisterActionPerformed(evt);
            }
        });

        CustomerBirthdayMonhtRegister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerBirthdayMonhtRegister.setText("Month");
        CustomerBirthdayMonhtRegister.setAlignmentX(0.0F);
        CustomerBirthdayMonhtRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CustomerBirthdayMonhtRegister.setPreferredSize(new java.awt.Dimension(42, 42));
        CustomerBirthdayMonhtRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBirthdayMonhtRegisterActionPerformed(evt);
            }
        });

        CustomerBirthdayYearRegister.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CustomerBirthdayYearRegister.setText("Year");
        CustomerBirthdayYearRegister.setAlignmentX(0.0F);
        CustomerBirthdayYearRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CustomerBirthdayYearRegister.setPreferredSize(new java.awt.Dimension(42, 42));
        CustomerBirthdayYearRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBirthdayYearRegisterActionPerformed(evt);
            }
        });

        ConfirmRegister.setText("Confirm");
        ConfirmRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerUsernameRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerPasswordRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerEmailRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerBirthdayDayRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerBirthdayMonhtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerBirthdayYearRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfirmRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(373, 373, 373))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerUsernameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerEmailRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerBirthdayMonhtRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerBirthdayYearRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerBirthdayDayRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(ConfirmRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerBirthdayMonhtRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBirthdayMonhtRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerBirthdayMonhtRegisterActionPerformed

    private void CustomerBirthdayDayRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBirthdayDayRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerBirthdayDayRegisterActionPerformed

    private void CustomerBirthdayYearRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBirthdayYearRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerBirthdayYearRegisterActionPerformed

    private void ConfirmRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmRegisterActionPerformed
        // User Confirmed his/her Registration
        
    }//GEN-LAST:event_ConfirmRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmRegister;
    private javax.swing.JTextField CustomerBirthdayDayRegister;
    private javax.swing.JTextField CustomerBirthdayMonhtRegister;
    private javax.swing.JTextField CustomerBirthdayYearRegister;
    private javax.swing.JTextField CustomerEmailRegister;
    private javax.swing.JTextField CustomerPasswordRegister;
    private javax.swing.JLabel CustomerRegisterForm;
    private javax.swing.JTextField CustomerUsernameRegister;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}