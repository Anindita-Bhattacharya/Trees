import java.util.*;
class Main
{
  public static Node insert (Node root, int x)
  {
    Node n = new Node (x);
    Node temp = root;
    if (root == null)
      return n;
    while (temp != null)
      {
	if (x > temp.data)
	  {
	    if (temp.right == null)
	      {
		temp.right = n;
		break;
	      }
	    temp = temp.right;
	  }
	else
	  {
	    if (temp.left == null)
	      {
		temp.left = n;
		break;
	      }
	    temp = temp.left;
	  }
      }
    return root;
  }
  public static void inorder (Node root)
  {
    if (root == null)
      return;
    inorder (root.left);
    System.out.print (root.data + " ");
    inorder (root.right);
  }
  public static void path (Node root, int key)
  {
    ArrayList < Character > a = new ArrayList <> ();
    Node num = root;
    while (num != null)
      {
	if (num.data == key)
	  {
	    for (int i = 0; i < a.size (); i++)
	      {
		System.out.print (a.get (i) + " ");
	      }
	    break;
	  }
	if (num.data > key)
	  {
	    a.add ('L');
	    num = num.left;
	  }
	if (num.data < key)
	  {
	    a.add ('R');
	    num = num.right;
	  }
      }
  }
  public static void main (String args[])
  {
    Node root = null;
    root = insert (root, 10);
    root = insert (root, 30);
    root = insert (root, 10);
    root = insert (root, 5);
    root = insert (root, 25);
    root = insert (root, 60);
    inorder (root);
    path (root, 5);

  }

}

class Node
{
  int data;
  Node left, right;
    Node (int data)
    //creating a node and in that node data is there
  {
    this.data = data;
    this.left = null;
    //left side is null
    this.right = null;
    //right side is null
  }

}
