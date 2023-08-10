package treedemo;
class Node{
    int data;
    Node left,right;
    Node (int val){
        this.data=val;
    }
}

public class BST {
   static  Node insert_data(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val)  root.left=insert_data(root.left, val);

        else   root.right=insert_data(root.right, val);

        return root;
     }
     static void inoOrder(Node root){
         if(root==null) return;
         inoOrder(root.left);
         System.out.print(root.data+ " ");
         inoOrder(root.right);
     }
     public static boolean search(Node root,int key){

        if(root==null)  return false;

        if(root.data>key)  return search(root.left, key);
        
        else if(root.data==key)  return true;
    
        else   return search(root.right, key);

        }
        static Node build_BST(int values[] ){
            Node root=null;
            for(int i=0;i<values.length;i++)
               root=insert_data(root, values[i]);
            return root;
        }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root= build_BST(values);
        System.out.println("Inorder Traversal of BST");
        inoOrder(root);
        boolean found=search(root, 9);
        System.out.println("\nkey values in present :"+found);
    
  }
}
