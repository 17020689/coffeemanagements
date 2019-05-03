package employeePackage;


import employeePackage.LogIn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class EditInforMation extends javax.swing.JFrame {

    /**
     * Creates new form EditInforMation
     */
    public EditInforMation() {
        initComponents();
        loadInfor();
        newpasswordE.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nameE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        employeenumberE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phonenumberE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressE = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        newpasswordE = new javax.swing.JTextField();
        renewpasswordE = new javax.swing.JPasswordField();
        passwordE = new javax.swing.JPasswordField();
        updateButtonE = new javax.swing.JButton();
        clearButtonE = new javax.swing.JButton();
        errorE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chỉnh sửa thông tin cá nhân");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(370, 150));
        setResizable(false);

        jLabel1.setText("Họ và Tên:");

        nameE.setEditable(false);

        jLabel2.setText("Mã nhân viên: ");

        employeenumberE.setEditable(false);

        jLabel3.setText("Email:");

        emailE.setEditable(false);

        jLabel4.setText("Số điện thoại: ");

        phonenumberE.setEditable(false);
        phonenumberE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberEActionPerformed(evt);
            }
        });

        jLabel5.setText("Địa chỉ:");

        addressE.setEditable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Mật khẩu mới: ");

        jLabel8.setText("Nhập lại mật khẩu mới:");

        jLabel9.setText("Mật khẩu hiện tại: ");

        newpasswordE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newpasswordEKeyPressed(evt);
            }
        });

        renewpasswordE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                renewpasswordEKeyPressed(evt);
            }
        });

        updateButtonE.setText("Cập Nhật");
        updateButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonEActionPerformed(evt);
            }
        });

        clearButtonE.setText("Xóa");
        clearButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonEActionPerformed(evt);
            }
        });

        errorE.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        errorE.setForeground(new java.awt.Color(204, 0, 0));
        errorE.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updateButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(newpasswordE)
                            .addComponent(renewpasswordE)
                            .addComponent(passwordE))
                        .addGap(107, 107, 107))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorE, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(newpasswordE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(renewpasswordE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(passwordE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButtonE)
                    .addComponent(clearButtonE))
                .addGap(27, 27, 27))
        );

        jLabel6.setText("Thay đổi mật khẩu đăng nhập:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(nameE, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2)
                                        .addGap(7, 7, 7)
                                        .addComponent(employeenumberE, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(39, 39, 39)
                                        .addComponent(emailE, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4)
                                        .addGap(6, 6, 6)
                                        .addComponent(phonenumberE, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(34, 34, 34)
                                        .addComponent(addressE, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeenumberE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonenumberE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phonenumberEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberEActionPerformed

    private void updateButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonEActionPerformed

updatePassword();        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonEActionPerformed

    private void clearButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonEActionPerformed
        newpasswordE.setText("");
        renewpasswordE.setText("");
        passwordE.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonEActionPerformed

    private void newpasswordEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newpasswordEKeyPressed
            if(evt.getKeyCode() ==10){
                renewpasswordE.requestFocus();
            }        // TODO add your handling code here:
    }//GEN-LAST:event_newpasswordEKeyPressed

    private void renewpasswordEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_renewpasswordEKeyPressed
if(evt.getKeyCode()==10){
passwordE.requestFocus();}        // TODO add your handling code here:
    }//GEN-LAST:event_renewpasswordEKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void editPassword() {
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
            java.util.logging.Logger.getLogger(EditInforMation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditInforMation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditInforMation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditInforMation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInforMation().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField addressE;
    javax.swing.JButton clearButtonE;
    javax.swing.JTextField emailE;
    javax.swing.JTextField employeenumberE;
    javax.swing.JTextField errorE;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JTextField jTextField1;
    javax.swing.JTextField nameE;
    javax.swing.JTextField newpasswordE;
    javax.swing.JPasswordField passwordE;
    javax.swing.JTextField phonenumberE;
    javax.swing.JPasswordField renewpasswordE;
    javax.swing.JButton updateButtonE;
    // End of variables declaration//GEN-END:variables
public  void loadInfor(){
try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection(Main.url, Main.usernameSQL, Main.passwordSQL);
           String sql = "SELECT * FROM employees WHERE employeenumbers =?";
           PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, LogIn.saveIdString);
			ResultSet rs = stm.executeQuery();
                        if(rs.next()){
                            employeenumberE.setText(rs.getString(1));
                  nameE.setText(rs.getString(2));
                  addressE.setText(rs.getString(3));
                  emailE.setText(rs.getString(4));
                  phonenumberE.setText(rs.getString(7));
                    }
        
        con.close();
        
        
        }catch(Exception e){
            
        e.printStackTrace();}
        
    }

    public void updatePassword(){
        Connection con;
        String presentPasswordString= null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
          con  = DriverManager.getConnection(Main.url, Main.usernameSQL, Main.passwordSQL);
           String sql = "SELECT * FROM employees WHERE employeenumbers =?";
           PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, LogIn.saveIdString);
			ResultSet rs = stm.executeQuery();
                        if(rs.next()){
                            presentPasswordString = rs.getString(6);
                           
                    }
                        con.close();
         }catch(Exception e){
            
        e.printStackTrace();}
        
        if(newpasswordE.getText().compareTo("")!=0||renewpasswordE.getText().compareTo("")!=0){
            if(newpasswordE.getText().compareTo(renewpasswordE.getText())==0&&passwordE.getText().compareTo(presentPasswordString)==0){
                PreparedStatement preStmt = null;
                try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(Main.url, Main.usernameSQL, Main.passwordSQL);
					preStmt =con.prepareStatement("update employees set password = ? WHERE employeenumbers =?");
							preStmt.setString(1, newpasswordE.getText());
							preStmt.setString(2, LogIn.saveIdString);
							preStmt.execute();
                                                        errorE.setText("");
							JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
							
                                                        con.close();
                }
				catch(Exception e) {
					System.out.println(e);
				}
            }
            else{
               errorE.setText("Cập nhật không thành công. Kiểm tra những mật khẩu bạn vừa nhập.");
            }
        }
        
        
        
        
        
        
    }



}
