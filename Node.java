package dsa.bookshop;


public class Node {
    
    int id;
    String Name;
    String author;
    String surname;
    String title;
    Node left;
    Node right;
  
    public Node(int id,String Name,String author,String surname,String title,Node left,Node right){
        
        this.id = id;
        this.Name=Name;
        this.author=author;
        this.surname=surname;
        this.title=title;
        this.left = left;
        this.right = right;
        
    }
    
        public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   
 
}
    
    

