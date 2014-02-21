
package dsa.bookshop;

import java.util.Arrays;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Home extends javax.swing.JFrame {
    Vector data=new Vector();
     Vector details;
 
    public Home() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtisbn = new javax.swing.JTextField();
        cmbtitle = new javax.swing.JComboBox();
        txtauthor = new javax.swing.JTextField();
        txtsurname = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txtbook = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(991, 432));
        setMinimumSize(new java.awt.Dimension(991, 432));
        setName("DSA-FI"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        txtisbn.setBorder(null);
        txtisbn.setOpaque(false);
        txtisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtisbnActionPerformed(evt);
            }
        });
        getContentPane().add(txtisbn);
        txtisbn.setBounds(180, 44, 144, 14);

        cmbtitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Title", "JAVA ", "PHP" }));
        getContentPane().add(cmbtitle);
        cmbtitle.setBounds(180, 73, 147, 20);

        txtauthor.setBorder(null);
        txtauthor.setOpaque(false);
        getContentPane().add(txtauthor);
        txtauthor.setBounds(180, 138, 144, 14);

        txtsurname.setBorder(null);
        txtsurname.setOpaque(false);
        getContentPane().add(txtsurname);
        txtsurname.setBounds(180, 169, 144, 14);

        btnadd.setText("ADD");
        btnadd.setBorder(null);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd);
        btnadd.setBounds(194, 230, 104, 30);

        btnsearch.setText("SEARCH");
        btnsearch.setBorder(null);
        btnsearch.setMaximumSize(new java.awt.Dimension(53, 23));
        btnsearch.setMinimumSize(new java.awt.Dimension(53, 23));
        btnsearch.setPreferredSize(new java.awt.Dimension(53, 23));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch);
        btnsearch.setBounds(142, 356, 104, 23);

        btndelete.setText("DELETE");
        btndelete.setBorder(null);
        getContentPane().add(btndelete);
        btndelete.setBounds(256, 356, 104, 24);

        txtbook.setBorder(null);
        txtbook.setOpaque(false);
        getContentPane().add(txtbook);
        txtbook.setBounds(182, 107, 144, 14);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Author", "Surname", "Book Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 40, 617, 215);

        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 325, 144, 14);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/bookshop/DSAbackground.PNG"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 980, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtisbnActionPerformed

    }//GEN-LAST:event_txtisbnActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

        details = new Vector(); // create main details object  for  add data 

        //add data into  details vector
        details.add(txtisbn.getText());
        details.add(txtbook.getText());
        details.add(txtauthor.getText());
        details.add(txtsurname.getText());
        details.add(cmbtitle.getSelectedItem());

        // add details as a object 
        data.add(details);

        //add data into jtable  
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.addRow(details);
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try{
for(int i=0;i<=data.size();i++)
{
  details= (Vector) data.elementAt(i);
  //get data inside of  vector  
     System.out.println(""+details.elementAt(0));
      //System.out.println(""+details.elementAt(1));
        //System.out.println(""+details.elementAt(2));
      
}}catch(Exception ex)
{
    
}

    }//GEN-LAST:event_btnsearchActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox cmbtitle;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtbook;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtsurname;
    // End of variables declaration//GEN-END:variables
}
