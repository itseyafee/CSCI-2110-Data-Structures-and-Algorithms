package E2;
import java.util.Scanner;

public class GenericStackDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        GenericStack<String> stack1 = new GenericStack<String>();
        GenericStack<Integer> stack2 = new GenericStack<Integer>();

//Adding elements to the stack
        String input1 = in.next();

        while (!input1.equals("quit")) {
            stack1.push(input1);
            input1 = in.next();
        }

//Adding elements to the stack

        int input2 = in.nextInt();
        while (input2 != -1) {
            stack2.push(input2);
            input2 = in.nextInt();
        }

        System.out.println();

//Printing the stack1 elements
        int stringStack = stack1.size();

        System.out.println("String Stack Contents:");
        for (int i = 0; i < stringStack; i++) {
            System.out.println(stack1.pop());
        }

        System.out.println();

//Printing the stack2 elements
        int integerStack = stack2.size();
        System.out.println("Integer Stack Contents:");
        for (int i = 0; i < integerStack; i++) {
            System.out.println(stack2.pop());
        }
    }
}
