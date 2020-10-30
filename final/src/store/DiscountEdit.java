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
public class DiscountEdit extends javax.swing.JFrame {
    public int index;
    /**
     * Creates new form Inventory
     */
    public DiscountEdit() {
        initComponents();
    }
    
    public DiscountEdit(int x) {
        initComponents();
        index=x;
        System.out.println("Discount Edit :::"+index);;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemcode.setText("Item Code");
        getContentPane().add(itemcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 199, 25));

        icode.setEnabled(false);
        icode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icodeActionPerformed(evt);
            }
        });
        icode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                icodeKeyPressed(evt);
            }
        });
        getContentPane().add(icode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 199, -1));

        productname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        productname.setText("Product Name");
        getContentPane().add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 199, 25));

        pname.setEnabled(false);
        getContentPane().add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 199, -1));

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("Save");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Purchase Cost");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 95, 25));

        pcost.setEnabled(false);
        getContentPane().add(pcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Selling Cost");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 160, 25));

        scost.setEnabled(false);
        getContentPane().add(scost, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Discount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 199, 23));
        getContentPane().add(TxtDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 199, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject1/Images/Undo_35px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 64)); // NOI18N
        jLabel5.setText("Update Discount");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 540, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 570, 500));

        pack();
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
            query="update discount set discount=? where item_code=?;";
            a.stmt=a.con.prepareStatement(query);
            a.stmt.setInt(1,Dis);
            a.stmt.setInt(2,Icode);
            
                    
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
            
    }//GEN-LAST:event_icodeKeyPressed

    private void icodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icodeActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jdbc a = new jdbc();
        
        String query;
        try
        {
            query="select a.pname,b.selling_cost,b.purchase_cost,c.discount from inventory a,stock b,discount c where a.item_code="+index+" and a.item_code=b.item_code and a.item_code=c.item_code";
            a.st = a.con.createStatement();
            a.rs = a.st.executeQuery(query);
           while(a.rs.next())
            {
                System.out.println("Inside While");
                icode.setText(""+index);
                scost.setText(""+a.rs.getFloat("b.Selling_cost"));
                pcost.setText(""+a.rs.getFloat("b.purchase_cost"));
                pname.setText(a.rs.getString("a.pname"));
                TxtDis.setText(""+a.rs.getInt("c.discount"));
            }
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }       
    }//GEN-LAST:event_formWindowOpened

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.hide();
        Discount frm=new Discount();
        frm.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(DiscountEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiscountEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiscountEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiscountEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiscountEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDis;
    private javax.swing.JButton add;
    private javax.swing.JTextField icode;
    private javax.swing.JLabel itemcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pcost;
    private javax.swing.JTextField pname;
    private javax.swing.JLabel productname;
    private javax.swing.JTextField scost;
    // End of variables declaration//GEN-END:variables
}
