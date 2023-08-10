 package treedemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int val){
        this.data=val;
    }
 }
public class BinaryTree{
    static int index=-1;

     static Node buildTree(int arr[]){
           index++;
             if(arr[index]==-1){  return null;   }

             Node root=new Node(arr[index]);
             root.left=buildTree(arr);
             root.right=buildTree(arr);
             return root;
        }
        /*-------------Depth first Search (DFS)--------------- */
        static void preOrder(Node root){
            if(root==null){
                 return ;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
         static void postOrder(Node root){
            if(root==null){
                 return ;
            }
          
            preOrder(root.left);
            preOrder(root.right);
              System.out.print(root.data+" ");
        }
         static void inOrder(Node root){
            if(root==null){
                 return ;
            }
            
            preOrder(root.left);
            System.out.print(root.data+" ");
            preOrder(root.right);
        }
         static List<Integer> preorderTraversal(Node root,List<Integer> list){

            if(root==null)
            return list;
            list.add(root.data);
            preorderTraversal(root.left, list);
            preorderTraversal(root.right, list);
           return list;

        } 
        /*----------------  Breath First Search (BFS)-------------------------- */
        public static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                 q.add(currNode.left);

                 if(currNode.right!=null)
                 q.add(currNode.right);
            }

      }        

    }
    /* ------------- Operation on tree ---------------- */
        public static int  countofNode( Node root){
            if(root==null)
            return 0;
            int leftNode=countofNode(root.left);
            int rightNode=countofNode(root.right);
            return leftNode+rightNode+1;
    
        }
        public static int  SumofNode( Node root){
            if(root==null)
            return 0;
            int leftNode=SumofNode(root.left);
            int rightNode=SumofNode(root.right);
            return leftNode+rightNode+root.data;
    
        }
        public static int height(Node root){
            if(root==null)
            return 0;
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            int myHeight=Math.max(leftheight, rightheight)+1;
            return myHeight;
        }


    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       Node root=  buildTree(arr);
       System.out.println("Preorder traversal");
       preOrder(root);
       System.out.println("\nPostorder traversal");
       postOrder(root);
       System.out.println("\ninorder traversal");
       inOrder(root);
       List<Integer> l=new ArrayList<>();
       preorderTraversal(root,l);
       System.out.println("\nstoring tree data in list\n"+l);
       int count= countofNode(root);
       System.out.println("Total node in : "+ count);
      int sum= SumofNode(root);
      System.out.println("Total sum of all node : "+sum);
    
      levelOrder(root);
      System.out.println("level Order Traversal");



        
    }
}
