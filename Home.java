
package dsa.bookshop;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Home extends javax.swing.JFrame {
    
    
   String Book[]={"id","name","author","surname","title"};
   private Object[][] types = null;
  
   DefaultTableModel dtm;
   
    int id;
    String name;
    String author;
    String surname;
    String title;
    
    Tree mytree = new Tree();
 
    public Home() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        txtsearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        btnadd.setBounds(194, 230, 104, 20);

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
        btnsearch.setBounds(142, 356, 104, 20);

        btndelete.setText("DELETE");
        btndelete.setBorder(null);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(256, 356, 104, 20);

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

        txtsearch.setToolTipText("enter search criteria");
        txtsearch.setBorder(null);
        txtsearch.setOpaque(false);
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtsearch);
        txtsearch.setBounds(180, 325, 144, 14);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 260, 104, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/bookshop/DSAbackground.PNG"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 980, 420);

        pack();
    }// </editor-fold>                        

    private void txtisbnActionPerformed(java.awt.event.ActionEvent evt) {                                        

    }                                       

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {                                       

              
id = Integer.parseInt(txtisbn.getText());
name=txtbook.getText();
author=txtauthor.getText();
surname=txtsurname.getText();
title = cmbtitle.getSelectedItem().toString();
        
 Node f1 = mytree.searchNode(id);
        
         if(f1 != null){
                JOptionPane.showMessageDialog(null,+id+" "+"ISBN is already inserted");
            
                         }
        else{
                 mytree.insert(id,name,author,surname,title);
                 fillTable();
      }
     
        clear();
       
    }                                      

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //Tree mytree = new Tree();
           
        
        int c = Integer.parseInt(txtsearch.getText());
        Node R1 = mytree.searchNode(c);
        //System.out.println(""+R1);
         
        
        if (R1 !=null){
            System.out.println("Node "+R1.id+" Found");
                System.out.println("Name:-"+R1.Name);
                System.out.println("Author:-"+R1.author);
                System.out.println("Surname:-"+R1.surname);  
                
            JOptionPane.showMessageDialog(null,"Found Element "+"\n-------------------------"+"\n ISBN - "+R1.getId()+"\n Author -"+R1.getAuthor()+"\n Surname - "+R1.getSurname()+"\n Title - "+R1.getTitle()+"\n Book Name - "+R1.getName());
                               }
        
        else{
             System.out.println("Node not found"); 
            JOptionPane.showMessageDialog(null,"\n ID is not in current Tree");
        } 
            clear();

    }                                         

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int del = Integer.parseInt(txtsearch.getText());
        mytree.delete(del);
        clear();
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        fillTable();
    }                                        

    
        public void clear(){
        
        txtisbn.setText("");
        txtauthor.setText("");
        txtsurname.setText("");
        txtbook.setText("");
        txtsearch.setText("");
                    
    }
        
                                                  
    public void fillTable(){ 
        
        dtm=new DefaultTableModel(types,Book);
        jTable1.setModel(dtm);
        Node root=mytree.getRoot();                   //assign root node
        inOrder(root);                                 //pasising value to root node
        
    }
    
    public void inOrder(Node root){
        
        if(root!=null){            
            inOrder(root.getLeft());
            dtm.addRow(new Object[]{root.id,root.Name,root.author,root.surname,root.title});
            inOrder(root.getRight());           
            
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
               Home hw =new Home();
                       hw.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox cmbtitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtbook;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsurname;
    // End of variables declaration                   
}
