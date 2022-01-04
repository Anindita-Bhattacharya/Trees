//Implementing a Binary Search Tree
class Node
    //creating a node for the tree
    {
        int data;
        Node left;
        Node right;
        public Node(int x)
        {
            data=x;
            this.left=null;
            this.right=null;
        }
    }
class Main{
static Node insert(Node root,int x)
{
    Node n=new Node(x);
    if(root==null)
        return n;
    Node temp=root;
    while(temp!=null)
    {
        if(x<temp.data)
        {
            if(temp.left==null){
                temp.left=n;
                break;
            }
            temp=temp.left;
        }
        else
        {
            if(temp.right==null)
            {
                temp.right=n;
                break;
            }
            temp=temp.right;
        }
                
    }
    return root;
        
    }
    public static void inorder(Node root)
    {
        if(root==null)
            return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[])
    {
         Node root=null;
        root=insert(root,10);
        root=insert(root,20);
        root=insert(root,30);
        inorder(root);
        
    }



}