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
 * @author owner
 */
public class Acmaster extends javax.swing.JFrame {
    public int index=0;
    /**
     * Creates new form a
     */
    public Acmaster() {
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

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        adddata = new javax.swing.JPanel();
        acname = new javax.swing.JTextField();
        aname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cno = new javax.swing.JTextField();
        conno = new javax.swing.JLabel();
        atype = new javax.swing.JLabel();
        actype = new javax.swing.JComboBox();
        address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add1 = new javax.swing.JTextArea();
        add2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JPanel();
        txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        BtnEdit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        view = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        actype1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(102, 102, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("                                   Add");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 310, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("                                    Search");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 310, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("                                     View");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 310, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject1/Images/Undo_35px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        jPanel2.setLayout(new java.awt.CardLayout());

        adddata.setBackground(new java.awt.Color(255, 255, 255));
        adddata.setForeground(new java.awt.Color(255, 51, 102));
        adddata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acnameActionPerformed(evt);
            }
        });
        adddata.add(acname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 160, 30));

        aname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aname.setText("Account Name");
        adddata.add(aname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 188, 25));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("Add");
        adddata.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnoActionPerformed(evt);
            }
        });
        adddata.add(cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 160, 30));

        conno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        conno.setText("Contact Number");
        adddata.add(conno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 188, 25));

        atype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        atype.setText("Account Type");
        adddata.add(atype, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 188, 25));

        actype.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        actype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select type", "Buyer", "Seller" }));
        actype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actypeActionPerformed(evt);
            }
        });
        adddata.add(actype, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, -1));

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.setText("Address");
        adddata.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 188, 25));

        add1.setColumns(20);
        add1.setLineWrap(true);
        add1.setRows(5);
        jScrollPane1.setViewportView(add1);

        adddata.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 414, 110));

        add2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add2.setText("Add");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        adddata.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 90, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel19.setText("Account Master");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_20px.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20))
            .addComponent(jSeparator1)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel19)
                .addGap(0, 239, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(1, 1, 1)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adddata.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Images/add.jpg"))); // NOI18N
        adddata.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 240, 260));

        jPanel2.add(adddata, "card2");

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCaretUpdate(evt);
            }
        });
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyPressed(evt);
            }
        });
        search.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 143, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACId", "Name", "Contact Number", "Address", "Ac_Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        search.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 460, 130));

        BtnEdit.setText("Edit");
        BtnEdit.setEnabled(false);
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        search.add(BtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 63, -1));

        delete.setText("Delete");
        delete.setEnabled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        search.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Name:");
        search.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 40, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setText(" Search");
        search.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel16.setText("Account Master");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_20px.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 226, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(215, 215, 215)
                .addComponent(jLabel15))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        search.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 110));

        jPanel2.add(search, "card3");

        view.setBackground(new java.awt.Color(255, 255, 255));
        view.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setText("Account View");
        view.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        actype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buyer", "Seller" }));
        actype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actype1ActionPerformed(evt);
            }
        });
        view.add(actype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 110, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Account Type:");
        view.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, 30));

        p1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Number"
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
        jScrollPane4.setViewportView(p1);

        view.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 515, 136));

        jButton1.setText("Fetch Data");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        view.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 169, 37));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Imprint MT Shadow", 1, 48)); // NOI18N
        jLabel17.setText("Account Master");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete_20px.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 227, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(204, 204, 204)
                .addComponent(jLabel13))
            .addComponent(jSeparator3)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        view.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 110));

        jPanel2.add(view, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        search.setVisible(true);
        adddata.setVisible(false);
        view.setVisible(false); 
                // TODO add your handling code here:
       
                
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        search.setVisible(false);
        adddata.setVisible(false);
        view.setVisible(true); 
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        search.setVisible(false);
        adddata.setVisible(true);
        view.setVisible(false);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void acnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acnameActionPerformed

    private void cnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnoActionPerformed

    private void actypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actypeActionPerformed
    
    public static int countIntegers(String input) { 
    int count = 0;
    for (int i = 0; i < input.length(); i++) {
        if (Character.isDigit(input.charAt(i))) {
            count++;
        }
    }
    return count;
    }
    
    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        jdbc c = new jdbc();
        int count;
        int flag=1,flag1=1;
        int record = 0;
        String Cname,address,query = null,query1 = null,query2 = null,query3=null,type,type1;
        Cname= acname.getText();
        long no1,no = Long.parseLong(cno.getText());
        address=add1.getText();
        type=(String) actype.getSelectedItem();
        count=countIntegers(String.valueOf(no));
        
        System.out.println(count);
        if(count!=10)
                {
                    JOptionPane.showMessageDialog(null, "Please Enter 10 digit Contact Number");
                    cno.setText("");
                    cno.grabFocus();
                }
        else
        {
            try
        {
            String q = "select contact from ac_detail;";
            c.st = c.con.createStatement();
            c.rs = c.st.executeQuery(q);
            while(c.rs.next())
            {
                no1=c.rs.getLong("contact");
                if(no==no1)
                {
                    flag=0;
                }
            }
            if(flag==1)
            {
                String q1 = "insert into ac_detail(Name,contact,Address,Date) values('"+Cname+"',"+no+",'"+address+"',NOW())";
                c.st = c.con.createStatement();
                c.st.executeUpdate(q1);
                String q2 = "select acid from ac_detail where name='"+Cname+"';";
                c.st =c.con.createStatement();
                c.rs =c.st.executeQuery(q2);
                if(c.rs.next())
                {
                    record = c.rs.getInt("acid");
                    
                }
                String q3 = "insert into ac_type(acid,actype) values("+record+",'"+type+"');";
                c.st = c.con.createStatement();
                c.st.executeUpdate(q3);
                JOptionPane.showMessageDialog(null, "Record Addedd Successfully !");
                acname.setText("");
                add1.setText("");
                cno.setText("");
                actype.setSelectedIndex(0);
            }
            if(flag==0)
            {
                String q2 = "select acid from ac_detail where contact="+no+";";
                c.st =c.con.createStatement();
                c.rs =c.st.executeQuery(q2);
                if(c.rs.next())
                {
                    record = c.rs.getInt("acid");
                    System.out.println("Record:::"+record);
                    String q4="select actype from ac_type where acid="+record+" ";
                    c.st=c.con.createStatement();
                    c.rs=c.st.executeQuery(q4);
                    while(c.rs.next())
                    {
                        
                        type1=c.rs.getString("actype");
                        System.out.println("type::"+type);
                        System.out.println("type1:::"+type1);
                        if(type1.equals(type))
                        {
                            System.out.println("Inside If::"+flag1);
                             flag1=0;
                             System.out.println("Inside If::"+flag1);
                        }
                    }
                        if(flag1!=0)
                        {
                            String q3 = "insert into ac_type(acid,actype) values("+record+",'"+type+"');";
                            c.st = c.con.createStatement();
                            c.st.executeUpdate(q3);
                            JOptionPane.showMessageDialog(null, "Record Addedd Successfully !");
                              acname.setText("");
                                add1.setText("");
                                cno.setText("");
                                actype.setSelectedIndex(0);
                        }     
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Record already present");
                        }
                    
                }
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        }
        

    }//GEN-LAST:event_add2ActionPerformed

    private void txtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCaretUpdate
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCaretUpdate

    private void txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyPressed
        // TODO add your handling code here:
        jdbc j=new jdbc();
        String query=null,key=null;

        DefaultTableModel model=(DefaultTableModel)table.getModel();
        while(model.getRowCount()>0)
        {
            model.removeRow(0);
        }

        key=txt.getText();

        try
        {
            query="select a.Acid,a.name,a.contact,a.address,b.actype from Ac_detail a,ac_type b where a.name like '%"+key+"%' and a.ACId=b.ACId";
            j.rs=j.st.executeQuery(query);
            while(j.rs.next())
            {
                int d1=j.rs.getInt("ACId");
                String d2=j.rs.getString("Name");
                long d3=j.rs.getLong("contact");
                String d4=j.rs.getString("Address");
                String d5=j.rs.getString("actype");

                model.addRow(new Object[]{d1,d2,d3,d4,d5});
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_txtKeyPressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        BtnEdit.setEnabled(true);
        delete.setEnabled(true);
        index = (int) table.getValueAt(row,0);
        System.out.println("Mouse click:"+this.index);
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
       
        // TODO add your handling code here:
        // System.out.println(index);
        new AcEdit(index).setVisible(true);
    }//GEN-LAST:event_BtnEditActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String query;
        int i;
        jdbc j=new jdbc();
        System.err.println("Delete::"+index);
        try
        {
            query="delete from ac_detail where acid='"+index+"' ";
            j.st=j.con.prepareStatement(query);

            i=j.st.executeUpdate(query);

            if(i>0)
            {
                JOptionPane.showMessageDialog(null,"record Successfully Deleted");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error in Deleting Record");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void actype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actype1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actype1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jdbc j=new jdbc();

        DefaultTableModel model=(DefaultTableModel)p1.getModel();
        while(model.getRowCount()>0)
        {
            model.removeRow(0);
        }

        String type=(String)actype1.getSelectedItem();

        try
        {
            String query="select * from Ac_detail,ac_type where ac_type.ACId=Ac_detail.ACId and ac_type.actype='"+type+"'";
            j.rs=j.st.executeQuery(query);
            while(j.rs.next())
            {
                int d1=j.rs.getInt("ACId");
                String d2=j.rs.getString("Name");
                long d3=j.rs.getLong("contact");

                model.addRow(new Object[]{d1,d2,d3});
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.hide();
        Home frm=new Home();
        frm.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Acmaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acmaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acmaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acmaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acmaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEdit;
    private javax.swing.JTextField acname;
    private javax.swing.JComboBox actype;
    private javax.swing.JComboBox<String> actype1;
    private javax.swing.JTextArea add1;
    private javax.swing.JButton add2;
    private javax.swing.JPanel adddata;
    private javax.swing.JLabel address;
    private javax.swing.JLabel aname;
    private javax.swing.JLabel atype;
    private javax.swing.JTextField cno;
    private javax.swing.JLabel conno;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable p1;
    private javax.swing.JPanel search;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables
}
