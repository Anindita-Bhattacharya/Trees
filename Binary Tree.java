import java.util.*;
class Node 
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Binary_Tree 
{
    static int idx=-1;
    public static Node binary_tree(int nodes[])
    {
        idx++;
        if(nodes[idx]==-1)
            return null;
        Node n=new Node(nodes[idx]);
        n.left=binary_tree(nodes);
        n.right=binary_tree(nodes);
    
    return n;
        
    }
    public static void inorder(Node root) {
       if(root == null) {
           return ;
       }
       inorder(root.left);
       System.out.print(root.data+" ");
       inorder(root.right);
   }
  

}
public class Main
{
	public static void main(String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

		Binary_Tree b=new Binary_Tree();
		Node root=b.binary_tree(nodes);
		b.inorder(root);
		
		
		
	}
}
