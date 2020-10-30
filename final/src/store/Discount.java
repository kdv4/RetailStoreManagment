package store;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanisha
 */
public class Discount extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public Discount() {
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

        jPanel1 = new javax.swing.JPanel();
        itemcode = new javax.swing.JLabel();
        icode = new javax.swing.JTextField();
        productname = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pcost = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        scost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtDis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemcode.setText("Item Code");
        jPanel1.add(itemcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 199, 25));

        icode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                icodeKeyPressed(evt);
            }
        });
        jPanel1.add(icode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 199, -1));

        productname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productname.setText("Product Name");
        jPanel1.add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 199, 25));

        pname.setEnabled(false);
        jPanel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 199, -1));

        add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add.setText("Submit");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Purchase Cost");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 95, 25));

        pcost.setEnabled(false);
        jPanel1.add(pcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Selling Cost");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 160, 25));

        scost.setEnabled(false);
        jPanel1.add(scost, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Discount");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 199, 23));
        jPanel1.add(TxtDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 199, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List_48px.png"))); // NOI18N
        jLabel4.setText("View Products List");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject1/Images/Undo_35px.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 540));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Add");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_20px.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 20, 20));

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 1, 72)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Discount");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 5, 610, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 600, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        setSize(new java.awt.Dimension(822, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
       String query=null;
        jdbc a = new jdbc();
        int Icode,Dis;
        
        Icode=Integer.parseInt(icode.getText());
        Dis=Integer.parseInt(TxtDis.getText());
       
        try
        {
            query="update discount set discount=? where item_code=?";
            a.stmt=a.con.prepareStatement(query);
            a.stmt.setInt(2,Icode);
            a.stmt.setInt(1,Dis);
            
                    
           int i= a.stmt.executeUpdate();  
           if(i>0)
           {
               JOptionPane.showMessageDialog(null,"Data is Updated");
               
           }
           else
            {
                JOptionPane.showMessageDialog(null, "data is  not updated");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

        
                       
    }//GEN-LAST:event_addActionPerformed

    private void icodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_icodeKeyPressed
        // TODO add your handling code here:
            jdbc a=new jdbc();
            String query;
            int item;
            item=Integer.parseInt(icode.getText());
            
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
            try
            {
                query="select a.pname,b.selling_cost,b.purchase_cost,c.discount from inventory a,stock b,discount c where a.item_code="+item+" and a.item_code=b.item_code and a.item_code=c.item_code";
                a.stmt=a.con.prepareStatement(query);
                a.rs=a.stmt.executeQuery();
                if(a.rs.next())
                {
                    pname.setText(a.rs.getString("a.pname"));
                    scost.setText(""+a.rs.getFloat("b.selling_cost"));
                    pcost.setText(""+a.rs.getFloat("b.purchase_cost"));
                    TxtDis.setText(""+a.rs.getInt("c.discount"));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No Item Present");
                    icode.grabFocus();
                    icode.setText("");
                }
                
                        
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_icodeKeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new DiscoutView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        this.hide();
        Home frm=new Home();
        frm.setVisible(true);
    }//GEN-LAST:event_jLabel27MouseClicked

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
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Discount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDis;
    private javax.swing.JButton add;
    private javax.swing.JTextField icode;
    private javax.swing.JLabel itemcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField pcost;
    private javax.swing.JTextField pname;
    private javax.swing.JLabel productname;
    private javax.swing.JTextField scost;
    // End of variables declaration//GEN-END:variables
}
