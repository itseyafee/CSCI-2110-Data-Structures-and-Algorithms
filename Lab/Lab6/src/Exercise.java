import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<BinaryTree<String>> list = new ArrayList<BinaryTree<String>>();

        System.out.println("Enter name or done");
        String input = in.nextLine();

        while(!input.equals("done")){
            BinaryTree<String> node  = new BinaryTree<String>();
            node.makeRoot(input);
            list.add(node);

            System.out.println("Enter name or done: ");
            input = in.nextLine();
        }
        BinaryTree<String> tree = generateBinaryTree(list, 0);

        System.out.println();
        System.out.printf("Height of the tree is: %d \n", BinaryTree.height(tree));

        System.out.printf("Number of nodes in the tree is: %d \n", BinaryTree.nodes(tree));
        System.out.println();

        System.out.print("Inorder: \t");
        BinaryTree.inorder(tree);
        System.out.println();

        System.out.print("Preorder: \t");
        BinaryTree.preorder(tree);
        System.out.println();

        System.out.print("Postorder: \t");
        BinaryTree.postorder(tree);
        System.out.println();

        System.out.print("Level order: \t");
        BinaryTree.levelOrder(tree);
        System.out.println();
        System.out.println();

        System.out.printf("And is it height balanced... %s \n", BinaryTree.heightBalanced(tree) ? "Yes!" : "No.");
        System.out.println();
    }
    public static BinaryTree<String> generateBinaryTree(ArrayList<BinaryTree<String>> list, int i){
        BinaryTree<String> root = null;
        if(i < list.size()){
            root = list.get(i);
            root.attachLeft(generateBinaryTree(list, 2*i+1));
            root.attachRight(generateBinaryTree(list, 2*i+2));
        }
        return root;
    }
}
