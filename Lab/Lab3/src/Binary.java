import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long startTime, endTime, executionTime; //accessed from Lab3 pdf, Brightspace
        startTime = System.currentTimeMillis(); //accessed from Lab3 pdf, Brightspace

        int input = in.nextInt();

        generateBinary(input);

        endTime = System.currentTimeMillis(); //accessed from Lab3 pdf, Brightspace
        executionTime = endTime - startTime;// accessed from Lab3 pdf, Brightspace

        System.out.println("The execution time to generate binary numbers from 0 to" + " " + (Math.pow(2, input)-1) + " is " + executionTime + "ms");

    }

    public static void generateBinary(int number) {
        int counter = 0;
        int range = (int)Math.pow(2,number) - 1;

        while(counter <= range){
            String binaryNumber = Integer.toBinaryString(counter);
            counter++;
        }
    }
}
