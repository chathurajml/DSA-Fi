package dsa.bookshop;

import javax.swing.JOptionPane;

public class Tree {
    
    Node root;
    int count;
    
    public Tree(){
        
        root = null;
        count = 0;
        
                 }
    
    public boolean isEmpty(){        
        
        return root == null;
        
                            }
    
    public void insert(int id,String name,String author,String surname,String title){
        
        Node newnode = new Node(id,name,author,surname,title,null,null);
        
        if(isEmpty())           
            root = newnode;
        
        else{
            
            Node temp = root;
            Node parent = root;
            
             while(temp != null)
             {
                 parent = temp;
                 if(temp.id > id)
                     temp = temp.left;
                  else
                     temp = temp.right;           
             }
             
             if (parent.id > id)
                 
                 parent.left = newnode;
             else
                 parent.right = newnode;             
                      
             count++;    
            
            } 
            
        }
    
    public void inOrderTraverse(Node n){
        if (n == null)
            return;
            else
              {
                inOrderTraverse(n.left);
                 JOptionPane.showMessageDialog(null,"Node"+n.id);
                System.out.println(n.id + "\t");                
                inOrderTraverse(n.right);                
                
              }          
                                         }
    
     public void preOrderTraverse(Node n){
        if (n == null)
            return;
            else
              {
                System.out.println(n.id + "\t");
                JOptionPane.showMessageDialog(null,"Node"+n.id);
                postOrderTraverse(n.left);
                postOrderTraverse(n.right);                
                
              }          
                                         }
    
    public void postOrderTraverse(Node n){
            
            if (n == null)
            return;
            else
              {
                postOrderTraverse(n.left);
                postOrderTraverse(n.right);
                System.out.println(n.id + "\t");
                  JOptionPane.showMessageDialog(null,"Node"+n.id);
                
                }  
                                          }
    
    public Node searchNode(int id){
        System.out.println("id="+id);
        Node temp = root;
        
        //System.out.println("Root="+temp.id);
        
        while(temp!=null){
            
            if(temp.id == id)
                break;
            else{
                if(temp.id>id){
                    temp = temp.left;
                    //System.out.println("left temp="+temp.id);
                        }
                else {
                    temp = temp.right;
                    //System.out.println("Right temp="+temp.id);
                }
            }
            
        }
        
        
        return temp;   
        
        
                                  }
    
    public void delete(int id)
    {
         if (isEmpty()){
             System.out.println("Tree is Empty");
                 JOptionPane.showMessageDialog(null,"Tree is Empty");
         }
         else if (searchNode(id) == null){
             System.out.println(+id+" "+"is not in the tree");
                 JOptionPane.showMessageDialog(null,+id+" "+"is not in the current tree");
         }
         else
         {
             root = delete(root, id);
             System.out.println(id+ " deleted from the tree");
              JOptionPane.showMessageDialog(null,+id+" "+" deleted from the tree");
         } 
         
         
    }
    
    
    
    
    private Node delete(Node root, int id)
     {
         Node r, r2, n;
         if (root.getId() == id)
         {
             Node left, right;
             left = root.getLeft();
             right = root.getRight();
             if (left == null && right == null)
                 return null;
             else if (left == null)
             {
                 r = right;
                 return r;
             }
             else if (right == null)
             {
                 r = left;
                 return r;
             }
             else
             {
                 r2 = right;
                 r = right;
                 while (r.getLeft() != null)
                     r = r.getLeft();
                 r.setLeft(left);
                 return r2;
             }
         }
         if (id < root.getId())
         {
             n = delete(root.getLeft(), id);
             root.setLeft(n);
         }
         else
         {
             n = delete(root.getRight(), id);
             root.setRight(n);             
         }
         return root;
     }
    
     public Node getRoot(){
         
         return root;
     }
}
   
