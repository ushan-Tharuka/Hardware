
package supplier;

import JDBC.Jdbc;

import java.sql.ResultSet;
import java.util.Vector;
import java.awt.Font;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class supplier extends javax.swing.JFrame {

     //create jdbc object
    Jdbc db = new Jdbc();
    
    public supplier() {
        initComponents();
        tableDataLoader();
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
        s_txt = new javax.swing.JTextField();
        n_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        a_txt = new javax.swing.JTextArea();
        s_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        search_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();
        u_btn = new javax.swing.JButton();
        d_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Supplier ID");

        s_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s_txtMouseClicked(evt);
            }
        });
        s_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_txtActionPerformed(evt);
            }
        });
        s_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                s_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                s_txtKeyReleased(evt);
            }
        });

        n_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        n_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_txtActionPerformed(evt);
            }
        });
        n_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                n_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n_txtKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Name");

        t_txt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_txtActionPerformed(evt);
            }
        });
        t_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_txtKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Telephone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Address");

        a_txt.setColumns(20);
        a_txt.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        a_txt.setRows(5);
        jScrollPane1.setViewportView(a_txt);

        s_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        s_btn.setText("Save");
        s_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_btnActionPerformed(evt);
            }
        });

        supplierTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Supplier ID", "Name", "Address", "Telephone"
            }
        ));
        supplierTable.setRowHeight(40);
        supplierTable.getTableHeader().setFont(new Font("Serif",Font.BOLD, 25));
        supplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierTableMouseClicked(evt);
            }
        });
        supplierTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplierTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(supplierTable);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Supplier ID");

        search_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        u_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        u_btn.setText("Update");
        u_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_btnActionPerformed(evt);
            }
        });

        d_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_btn.setText("Delete");
        d_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(s_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(u_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(d_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(332, 332, 332)
                            .addComponent(jLabel6)
                            .addGap(62, 62, 62)
                            .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(n_txt)
                                .addComponent(s_txt))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(s_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95))
                        .addComponent(jScrollPane1)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SUPPLIERS");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back3.jpg"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void d_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_btnActionPerformed
        if(!s_txt.getText().isEmpty()){
            int sup_id = Integer.parseInt(s_txt.getText());
            try {
                db.putdata("DELETE FROM supplier WHERE sup_id = '"+sup_id+"'");
                tableDataClear();
                tableDataLoader();
                clear();

            } catch (Exception e) {
                System.out.println("Delete: "+e);
            }
        }
    }//GEN-LAST:event_d_btnActionPerformed

    private void u_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_btnActionPerformed
        String supId = s_txt.getText();
        String name = n_txt.getText();
        String tp = t_txt.getText();
        String address = a_txt.getText();

        if("".equals(supId) || supId.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Supllier ID.");
        }else if("".equals(name) || name.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Name.");
        }else if("".equals(tp) || tp.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Telephone.");
        }else if("".equals(address) || address.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Address.");
        }else{
            try {
                db.putdata("UPDATE supplier SET name='"+name+"',"
                    + "address='"+address+"',tp='"+tp+"' "
                    + "WHERE sup_id = '"+supId+"' ");

                JOptionPane.showMessageDialog(rootPane, "Save Success...");
                clear();
                tableDataClear();
                tableDataLoader();

            } catch (Exception e) {
                System.out.println("Error :"+e);
            }
        }
    }//GEN-LAST:event_u_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        if(!search_txt.getText().isEmpty()){
            int sup_id = Integer.parseInt(search_txt.getText());

            try {
                ResultSet r = db.getdata("SELECT * FROM supplier WHERE sup_id ='"+sup_id+"'");

                if(!r.isFirst()){
                    clear();
                }
                while(r.next()){
                    s_txt.setText(r.getString("sup_id"));
                    n_txt.setText(r.getString("name"));
                    t_txt.setText(r.getString("tp"));
                    a_txt.setText(r.getString("address"));

                    s_txt.setEditable(false);

                    search_txt.setText("");
                    s_btn.setEnabled(false);
                    u_btn.setEnabled(true);
                }
            } catch (Exception e) {
                System.out.println("Search button :"+e);
            }
        }else{
            clear();
        }
    }//GEN-LAST:event_search_btnActionPerformed

    private void supplierTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierTableKeyPressed

    private void supplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTableMouseClicked
        int x =  supplierTable.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) supplierTable.getModel();

        s_txt.setText(table.getValueAt(x,0).toString());
        n_txt.setText(table.getValueAt(x,1).toString());
        a_txt.setText(table.getValueAt(x,2).toString());
        t_txt.setText(table.getValueAt(x,3).toString());

        s_btn.setEnabled(false);
        s_txt.setEditable(false);
        u_btn.setEnabled(true);
    }//GEN-LAST:event_supplierTableMouseClicked

    private void s_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_btnActionPerformed

        String supId = s_txt.getText();
        String name = n_txt.getText();
        String tp = t_txt.getText();
        String address = a_txt.getText();

        if("".equals(supId) || supId.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Supllier ID.");
        }else if("".equals(name) || name.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Name.");
        }else if("".equals(tp) || tp.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Telephone.");
        }else if("".equals(address) || address.isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter Address.");
        }else{
            try {
                db.putdata("INSERT INTO supplier VALUES('"+supId+"','"+name+"','"+address+"','"+tp+"')");

                clear();

                tableDataClear();
                tableDataLoader();

            } catch (Exception e) {
                System.out.println("Error :"+e);
            }
        }
    }//GEN-LAST:event_s_btnActionPerformed

    private void t_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_txtKeyReleased
        if (!t_txt.getText().isEmpty()) {

            for (int i = 0; i < t_txt.getText().length(); i++) {
                char c = t_txt.getText().charAt(i);
                if (!Character.isDigit(c)) {
                    String s = t_txt.getText().substring(0, i);
                    t_txt.setText(null);
                    t_txt.setText(s);
                }
            }
        }
    }//GEN-LAST:event_t_txtKeyReleased

    private void t_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_txtActionPerformed

    private void n_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_txtKeyReleased
        if (!n_txt.getText().isEmpty()) {

            for (int i = 0; i < n_txt.getText().length(); i++) {
                char c = n_txt.getText().charAt(i);
                if (Character.isDigit(c)) {
                    String s = n_txt.getText().substring(0, i);
                    n_txt.setText(null);
                    n_txt.setText(s);
                }
            }
        }
    }//GEN-LAST:event_n_txtKeyReleased

    private void n_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_txtKeyPressed

    private void n_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_txtActionPerformed

    private void s_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_txtKeyReleased
        if (!s_txt.getText().isEmpty()) {

            for (int i = 0; i < s_txt.getText().length(); i++) {
                char c = s_txt.getText().charAt(i);
                if (!Character.isDigit(c)) {
                    String s = s_txt.getText().substring(0, i);
                    s_txt.setText(null);
                    s_txt.setText(s);
                }
            }
        }
    }//GEN-LAST:event_s_txtKeyReleased

    private void s_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_txtKeyPressed
        u_btn.setEnabled(false);
    }//GEN-LAST:event_s_txtKeyPressed

    private void s_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_txtActionPerformed

    private void s_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_txtMouseClicked

    }//GEN-LAST:event_s_txtMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new dashbord.dashbord().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    // Supplier Data load to Jtable
    private void tableDataLoader(){
        try {
            ResultSet result = db.getdata("SELECT * FROM supplier");
            DefaultTableModel table = (DefaultTableModel) supplierTable.getModel();
            
            int x  = 0;
            while(result.next()){
                Vector v = new Vector();
                v.add(null);
                table.addRow(v);
                
                String supId = result.getString("sup_id");
                String name = result.getString("name");
                String address = result.getString("address");
                String tp = result.getString("tp");
                
                table.setValueAt(supId, x, 0);
                table.setValueAt(name, x, 1);
                table.setValueAt(address, x, 2);
                table.setValueAt(tp, x, 3);
                
                x++;
            }
            
        } catch (Exception e) {
            System.out.println("TableDataLoader :"+e);
        }
    }
    
    // Supplier jTable Data Clear
    private void tableDataClear(){
        try {
            while (0 < supplierTable.getRowCount()) {                
                DefaultTableModel table = (DefaultTableModel) supplierTable.getModel();
                table.removeRow(supplierTable.getRowCount()-1);
            }
        } catch (Exception e) {
           System.out.println("TableDataClear :"+e); 
        } 
    }
    
    
    //text field clear
    private void  clear(){
        s_txt.setText("");
        n_txt.setText("");
        a_txt.setText("");
        t_txt.setText("");
        s_txt.setEditable(true);
        s_btn.setEnabled(true);
    }
    
    
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
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a_txt;
    private javax.swing.JButton d_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField n_txt;
    private javax.swing.JButton s_btn;
    private javax.swing.JTextField s_txt;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_txt;
    private javax.swing.JTable supplierTable;
    private javax.swing.JTextField t_txt;
    private javax.swing.JButton u_btn;
    // End of variables declaration//GEN-END:variables
}
