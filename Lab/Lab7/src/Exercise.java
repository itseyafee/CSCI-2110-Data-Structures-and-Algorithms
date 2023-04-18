import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.print("Enter int or 0: ");
        int inputElement = in.nextInt();

        BinarySearchTree BST= new BinarySearchTree();

        while (inputElement!=0){
            BST.insert(inputElement);

            System.out.print("Enter int or 0: ");
            inputElement = in.nextInt();
        }
        System.out.println("The max data value in the BST is: " + BST.findMax());
        System.out.println("The min data value in the BST is: " + BST.findMin());
        System.out.print("What key would you like to search for? ");

        int searchInput=in.nextInt();
        BinaryTree output=BST.recursiveSearch(searchInput);

        if(output==null){
            System.out.println("Not Found!");
        }
        else{
            System.out.println("Found!");
        }
    }
}
