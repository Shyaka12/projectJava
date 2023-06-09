/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academics.view;

import com.academics.data.Staffs;
import com.academics.data.Stakeholders;
import com.academics.data.Students;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.*;

/**
 *
 * @author Joe
 */
public class AcademicSignUpForm extends javax.swing.JFrame {

    /**
     * Creates new form AcademicSignUpForm
     */
    public AcademicSignUpForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Firstname = new javax.swing.JTextField();
        Lastname = new javax.swing.JTextField();
        Username = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Telephone = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Comfirmpassword = new javax.swing.JPasswordField();
        Signupbtn = new javax.swing.JButton();
        Backtologinbtn = new javax.swing.JButton();
        Uploadbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Signupchoice = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACADEMICS SIGNUP FORM");

        jLabel2.setText("Firstname:");

        jLabel3.setText("Lastname:");

        jLabel4.setText("Username:");

        jLabel5.setText("Email:");

        jLabel6.setText("Telephone:");

        jLabel8.setText("Password:");

        jLabel9.setText("Comfirm Password:");

        Firstname.setBackground(new java.awt.Color(204, 204, 255));
        Firstname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Lastname.setBackground(new java.awt.Color(204, 204, 255));
        Lastname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Username.setBackground(new java.awt.Color(204, 204, 255));
        Username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Email.setBackground(new java.awt.Color(204, 204, 255));
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Telephone.setBackground(new java.awt.Color(204, 204, 255));
        Telephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Password.setBackground(new java.awt.Color(204, 204, 255));
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Comfirmpassword.setBackground(new java.awt.Color(204, 204, 255));
        Comfirmpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        Signupbtn.setText("SignUp");
        Signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupbtnActionPerformed(evt);
            }
        });

        Backtologinbtn.setText("BACK TO LOGIN PAGE");
        Backtologinbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BacktologinbtnMouseClicked(evt);
            }
        });

        Uploadbtn.setText("Upload");

        jLabel10.setText("SignUp As:");

        Signupchoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Staff", "Stakeholder" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Uploadbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(Telephone)
                                    .addComponent(Email))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Comfirmpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Signupchoice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Backtologinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Comfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Signupchoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Signupbtn)
                    .addComponent(Uploadbtn))
                .addGap(18, 18, 18)
                .addComponent(Backtologinbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void SignupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupbtnActionPerformed
        if(Signupchoice.getSelectedItem()== "student"){
            if(Firstname.getText().isEmpty()||Lastname.getText().isEmpty()||Username.getText().isEmpty()||Email.getText().isEmpty()||Telephone.getText().isEmpty()||Password.getText().isEmpty()||Comfirmpassword.getText().isEmpty()){
                String msg = "Fill All Empty Fields";
                JOptionPane.showMessageDialog(null, msg,"Data missing",JOptionPane.WARNING_MESSAGE);
            }else{
                Session session = StudHibernateUtil.getSessionFactory().openSession();
                Students student = new Students();
                student.setFirstname(Firstname.getText());
                student.setLastname(Lastname.getText());
                student.setUsername(Username.getText());
                student.setEmail(Email.getText());
                student.setTelephone(Telephone.getText());
                student.setPassword(Password.getText());
                student.setComfirmpassword(Comfirmpassword.getText());
                Transaction tx = session.beginTransaction();
                session.save(student);
                tx.commit();
                session.close();
                JOptionPane.showMessageDialog(null, "Successfull Saved","Student Registered",JOptionPane.INFORMATION_MESSAGE);
                if(JOptionPane.OK_OPTION==0){
                Firstname.setText("");
                Lastname.setText("");
                Username.setText("");
                Email.setText("");
                Telephone.setText("");
                Password.setText("");
                Comfirmpassword.setText("");
                }
    }//GEN-LAST:event_SignupbtnActionPerformed
    }else if(Signupchoice.getSelectedItem()== "staff"){
        if(Firstname.getText().isEmpty()||Lastname.getText().isEmpty()||Username.getText().isEmpty()||Email.getText().isEmpty()||Telephone.getText().isEmpty()||Password.getText().isEmpty()||Comfirmpassword.getText().isEmpty()){
                String msg = "Fill All Empty Fields";
                JOptionPane.showMessageDialog(null, msg,"Data missing",JOptionPane.WARNING_MESSAGE);
            }else{
        Session session = StafHibernateUtil.getSessionFactory().openSession();
                Staffs staff = new Staffs();
                staff.setFirstname(Firstname.getText());
                staff.setLastname(Lastname.getText());
                staff.setUsername(Username.getText());
                staff.setEmail(Email.getText());
                staff.setTelephone(Telephone.getText());
                staff.setPassword(Password.getText());
                staff.setComfirmpassword(Comfirmpassword.getText());
                Transaction tx = session.beginTransaction();
                session.save(staff);
                tx.commit();
                session.close();
                JOptionPane.showMessageDialog(null, "Successfull Saved","Student Registered",JOptionPane.INFORMATION_MESSAGE);
                if(JOptionPane.OK_OPTION==0){
                Firstname.setText("");
                Lastname.setText("");
                Username.setText("");
                Email.setText("");
                Telephone.setText("");
                Password.setText("");
                Comfirmpassword.setText("");
                }
        }
    }else if(Signupchoice.getSelectedItem()== "stakeholder"){
            if(Firstname.getText().isEmpty()||Lastname.getText().isEmpty()||Username.getText().isEmpty()||Email.getText().isEmpty()||Telephone.getText().isEmpty()||Password.getText().isEmpty()||Comfirmpassword.getText().isEmpty()){
                String msg = "Fill All Empty Fields";
                JOptionPane.showMessageDialog(null, msg,"Data missing",JOptionPane.WARNING_MESSAGE);
            }else{
        Session session = StakHibernateUtil.getSessionFactory().openSession();
                Stakeholders stakeholder = new Stakeholders();
                stakeholder.setFirstname(Firstname.getText());
                stakeholder.setLastname(Lastname.getText());
                stakeholder.setUsername(Username.getText());
                stakeholder.setEmail(Email.getText());
                stakeholder.setTelephone(Telephone.getText());
                stakeholder.setPassword(Password.getText());
                stakeholder.setComfirmpassword(Comfirmpassword.getText());
                Transaction tx = session.beginTransaction();
                session.save(stakeholder);
                tx.commit();
                session.close();
                JOptionPane.showMessageDialog(null, "Successfull Saved","Student Registered",JOptionPane.INFORMATION_MESSAGE);
                if(JOptionPane.OK_OPTION==0){
                Firstname.setText("");
                Lastname.setText("");
                Username.setText("");
                Email.setText("");
                Telephone.setText("");
                Password.setText("");
                Comfirmpassword.setText("");
                
    }
    }
    }
    }
    private void BacktologinbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BacktologinbtnMouseClicked
        AcademicLoginForm adf = new AcademicLoginForm();
        adf.setVisible(true);
        dispose();
    }//GEN-LAST:event_BacktologinbtnMouseClicked

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
            java.util.logging.Logger.getLogger(AcademicSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcademicSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcademicSignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (java.lang.InstantiationException ex) {
            Logger.getLogger(AcademicSignUpForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcademicSignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backtologinbtn;
    private javax.swing.JPasswordField Comfirmpassword;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Firstname;
    private javax.swing.JTextField Lastname;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Signupbtn;
    private javax.swing.JComboBox<String> Signupchoice;
    private javax.swing.JTextField Telephone;
    private javax.swing.JButton Uploadbtn;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
