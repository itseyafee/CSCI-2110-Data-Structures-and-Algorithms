package E1;
import java.util.Scanner;

public class PointDemo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

//Inputs and messages in the console
        System.out.print("Enter integer coordinates x and y: ");

        int intX = in.nextInt();
        int intY = in.nextInt();

        System.out.print("Enter double coordinates x and y: ");

        double doubleX = in.nextDouble();
        double doubleY = in.nextDouble();

        System.out.print("Enter String coordinates x and y: ");
        String strX = in.next();
        String strY = in.next();

//Creating the Point Objects
        Point<Integer> point1 = new Point<Integer>(intX, intY);
        Point<Double> point2 = new Point<Double>(doubleX, doubleY);
        Point<String> point3 = new Point<String>(strX, strY);

//Printing the Point Objects
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }
}
