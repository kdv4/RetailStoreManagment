/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vaish
 */
public class History extends javax.swing.JFrame {

    /**
     * Creates new form Search1
     */
    public History() {
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

        actype = new javax.swing.JComboBox<>();
        val = new javax.swing.JTextField();
        mainpanel = new javax.swing.JPanel();
        Product = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        seller = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SellTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        actype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Account", "Product" }));
        actype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                actypeItemStateChanged(evt);
            }
        });
        actype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actypeActionPerformed(evt);
            }
        });
        getContentPane().add(actype, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 146, 33));

        val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valActionPerformed(evt);
            }
        });
        val.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valKeyPressed(evt);
            }
        });
        getContentPane().add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 146, 35));

        mainpanel.setLayout(new java.awt.CardLayout());

        Product.setLayout(new java.awt.CardLayout());

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Name", "Contact No", "Account ID", "Address", "Date of Join"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ProductTable);

        Product.add(jScrollPane3, "card2");

        mainpanel.add(Product, "card4");

        SellTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Product ID", "Product Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(SellTable);

        javax.swing.GroupLayout sellerLayout = new javax.swing.GroupLayout(seller);
        seller.setLayout(sellerLayout);
        sellerLayout.setHorizontalGroup(
            sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        sellerLayout.setVerticalGroup(
            sellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        mainpanel.add(seller, "card3");

        getContentPane().add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 289, 860, 230));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject1/Images/Undo_35px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 590));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 72)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("History");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 850, 110));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 850, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_20px.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 840, Short.MAX_VALUE)
                .addComponent(jLabel20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(0, 570, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 860, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void actypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actypeActionPerformed

    private void actypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_actypeItemStateChanged

if(actype.getSelectedItem()=="Select Item")
{
    mainpanel.setVisible(false);
    
}

if(actype.getSelectedItem()=="Account")
{
    mainpanel.setVisible(true);
    Product.setVisible(true);
    seller.setVisible(false);
}
if(actype.getSelectedItem()=="Product")
{
    mainpanel.setVisible(true);
    Product.setVisible(false);
    seller.setVisible(true);
}
    }//GEN-LAST:event_actypeItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        mainpanel.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void valKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valKeyPressed
        // TODO add your handling code here:
       jdbc a=new jdbc();
        String query=null,item,key;
        
        DefaultTableModel modelS=(DefaultTableModel)SellTable.getModel();
         while(modelS.getRowCount()>0)
         {
             modelS.removeRow(0);
         }
         
         DefaultTableModel modelP=(DefaultTableModel)ProductTable.getModel();
         while(modelP.getRowCount()>0)
         {
             modelP.removeRow(0);
         }
         
        key=val.getText();
        item=(String)actype.getSelectedItem();
        try
        {
            if(item.equals("Account"))
            {
                query="select a.Acid,a.name,a.contact,a.date,a.Address from ac_history a where a.name like '%"+key+"%' ";
                a.stmt=a.con.prepareStatement(query);
                a.rs=a.stmt.executeQuery();
                while(a.rs.next())
                {
                    int d1=a.rs.getInt("a.ACId");
                    String d2=a.rs.getString("a.Name");
                    Long d3=a.rs.getLong("a.contact"); 
                    String d5=a.rs.getString("a.date"); 
                    String d4=a.rs.getString("a.Address");
                    
                    modelP.addRow(new Object[]{d1,d2,d3,d4,d5});  
                }
            }
      
            if(item.equals("Product"))
            {
                query="select a.item_code,a.pname,a.pid from inventory_history a where a.Pname like '%"+key+"%' ";
                a.stmt=a.con.prepareStatement(query);
                a.rs=a.stmt.executeQuery();
                while(a.rs.next())
                {
                    int d1=a.rs.getInt("a.Item_code");
                    String d3=a.rs.getString("a.PName");
                    String d2=a.rs.getString("a.PId");
                  
                   
                    modelS.addRow(new Object[]{d1,d2,d3});  
                }
            }
            if(item.equals("Select Item"))
            {
                JOptionPane.showMessageDialog(null,"Please select Item");
                actype.grabFocus();
            } 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }     
    }//GEN-LAST:event_valKeyPressed

    private void valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jdbc a=new jdbc();
        String query=null;
        
        DefaultTableModel modelS=(DefaultTableModel)SellTable.getModel();
         while(modelS.getRowCount()>0)
         {
             modelS.removeRow(0);
         }
         
         DefaultTableModel modelP=(DefaultTableModel)ProductTable.getModel();
         while(modelP.getRowCount()>0)
         {
             modelP.removeRow(0);
         }
        
        try
        {
              query="select a.Acid,a.name,a.contact,a.date,a.Address from ac_history a";
                a.stmt=a.con.prepareStatement(query);
                a.rs=a.stmt.executeQuery();
                while(a.rs.next())
                {
                    int d1=a.rs.getInt("a.ACId");
                    String d2=a.rs.getString("a.Name");
                    Long d3=a.rs.getLong("a.contact"); 
                    String d5=a.rs.getString("a.date"); 
                    String d4=a.rs.getString("a.Address");
                    
                    modelP.addRow(new Object[]{d1,d2,d3,d4,d5});  
                }
                
               
                
              query="select a.item_code,a.pname,a.pid from inventory_history a";
                a.stmt=a.con.prepareStatement(query);
                a.rs=a.stmt.executeQuery();
                while(a.rs.next())
                {
                    int d1=a.rs.getInt("a.Item_code");
                    String d3=a.rs.getString("a.PName");
                    String d2=a.rs.getString("a.PId");
                  
                   
                    modelS.addRow(new Object[]{d1,d2,d3});  
                }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_formWindowOpened

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.hide();
        Home frm=new Home();
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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Product;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTable SellTable;
    private javax.swing.JComboBox<String> actype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel seller;
    private javax.swing.JTextField val;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel DefaultTableModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
