/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Dashboard extends javax.swing.JFrame {

    private static String adname, adpass, type = "member", types;

    private static String filepath2 = "C:\\Users\\Admin\\Documents\\NetBeansProjects\\AT4_Villacampa(1A)\\src\\data.json";
    private static JSONParser jsonParser2 = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();
    private static JSONObject user = new JSONObject();
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        welcome = new javax.swing.JLabel();
        updatestudent = new javax.swing.JButton();
        Addstudent = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        deletestu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("Welcome ");
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 46));

        updatestudent.setText("Update Student");
        updatestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestudentActionPerformed(evt);
            }
        });
        getContentPane().add(updatestudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 112, 150, 62));

        Addstudent.setText("Add Student");
        Addstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddstudentActionPerformed(evt);
            }
        });
        getContentPane().add(Addstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 112, 150, 62));

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 186, 150, 62));

        deletestu.setText("Delete Student");
        deletestu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestuActionPerformed(evt);
            }
        });
        getContentPane().add(deletestu, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 186, 150, 62));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\yeha.gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Loginwindow().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void AddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddstudentActionPerformed
        // TODO add your handling code here:
    Add z = new Add();
    z.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_AddstudentActionPerformed

    private void updatestudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestudentActionPerformed
        // TODO add your handling code here:
        Update y = new Update();
        y.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_updatestudentActionPerformed

    private void deletestuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestuActionPerformed
        // TODO add your handling code here:
        Delete a = new Delete();
        a.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_deletestuActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    private static Dashboard instance;

public static Dashboard getInstance() {
    if (instance == null) {
        instance = new Dashboard();
    }
    return instance;
}
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addstudent;
    private javax.swing.JButton deletestu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton updatestudent;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
