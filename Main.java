//Binary Traversal 
public class Main{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20000);
        tree.root.left = new Node(15000);
        tree.root.right = new Node(18000);
        tree.root.left.left = new Node(12000);
        tree.root.left.right = new Node(13000);
        tree.root.right.left = new Node(14000);
        tree.root.right.right = new Node(19000);

        System.out.println(
            "Pre-Order Binary Tree pada harga : ");
        tree.printPreorder();

        System.out.println(
            "\nin-Order Binary Tree pada harga : ");
        tree.printInorder();

        System.out.println(
            "\nPost-Order Binary Tree pada harga :  ");
        tree.printPostorder();
    }
}
    
