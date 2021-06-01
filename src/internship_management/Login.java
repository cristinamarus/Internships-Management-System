
package internship_management;
import javax.swing.*;
import java.sql.*;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.lab1.setVisible(false);
        this.Lab2.setVisible(false);
        this.Lab3.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lab5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        pan6 = new javax.swing.JPanel();
        lab4 = new javax.swing.JLabel();
        Lab2 = new javax.swing.JPanel();
        Lab3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internship_management/exit.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lab5.setForeground(new java.awt.Color(255, 255, 255));
        lab5.setText("Sign In ");
        jPanel4.add(lab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 56, 170, 60));

        jPanel5.setBackground(new java.awt.Color(0, 255, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 260, 10));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 230, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internship_management/lock.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 40, 40));

        jPasswordField1.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);
        jPanel4.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 230, 50));

        pan6.setBackground(new java.awt.Color(51, 51, 51));
        pan6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 102)));
        pan6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pan6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pan6MousePressed(evt);
            }
        });
        pan6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lab4.setForeground(new java.awt.Color(255, 255, 255));
        lab4.setText("Sign In ");
        pan6.add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, 40));

        Lab2.setBackground(new java.awt.Color(51, 51, 51));
        Lab2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 102)));
        Lab2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lab2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lab3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Lab3.setForeground(new java.awt.Color(255, 255, 255));
        Lab3.setText("Sign Up");
        Lab2.add(Lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, 40));

        pan6.add(Lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 60));

        jPanel4.add(pan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 270, 60));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 270, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 352, 270, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internship_management/users.png"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lab1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lab1.setForeground(new java.awt.Color(255, 255, 255));
        lab1.setText("  Sign up");
        jPanel4.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 400, 520));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("      Sign In ");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 150, 50));

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("      Sign Up");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 160, 50));

        jLabel1.setBackground(new java.awt.Color(0, 204, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

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

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        int p= this.jPanel4.getX();
        if (p>-1){
         
        }
        lab4.setVisible(false);
        lab5.setVisible(false);
        pan6.setVisible(false);
        lab1.setVisible(true);
        Lab2.setVisible(true);
        Lab3.setVisible(true);
        
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        int p= this.jPanel4.getX();
        if (p>-1){
        
        }
        Lab2.setVisible(false);
        Lab3.setVisible(false);
        pan6.setVisible(true);
        lab4.setVisible(true);
        lab5.setVisible(true);
        lab1.setVisible(false);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel10MousePressed

    private void pan6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pan6MousePressed
        // TODO add your handling code here:
        String sql = "use internSystem";
	String sql1 = "select * from slogin";
	String sql2 = "select * from alogin";
	String sql3 = "select * from ulogin";
        String name = jTextField1.getText();
        String password = jPasswordField1.getText();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "sara");
            Statement s = con.createStatement();
            s.executeQuery(sql);
            ResultSet rs = s.executeQuery(sql2);
            while(rs.next())
            {
                String username=rs.getString(1);
                String pwd=rs.getString(2);
                if(username.equals(name) && pwd.equals(password))
                {
                    this.dispose();
                    new Admin_Submit().setVisible(true);
                }
            }
            rs = s.executeQuery(sql3);
            while(rs.next())
            {
                String username=rs.getString(1);
                String pwd=rs.getString(2);
                if(username.equals(name) && pwd.equals(password))
                {
                    this.dispose();
                    new Admin_Submit().setVisible(true);
                }
            }
            rs = s.executeQuery(sql1);
            while(rs.next())
            {
                String username=rs.getString(1);
                String pwd=rs.getString(2);
                if(username.equals(name) && pwd.equals(password))
                {
                    this.dispose();
                    new Intern().setVisible(true);
                }
            }
	    rs.close();
            s.close();
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid Login Details.");
        }
        
    }//GEN-LAST:event_pan6MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lab2;
    private javax.swing.JLabel Lab3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JPanel pan6;
    // End of variables declaration//GEN-END:variables
}
