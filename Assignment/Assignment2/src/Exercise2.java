import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        while (input != 0) {
            collatzCousin(input);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println(executionTime);
            input = in.nextInt();
        }
    }
    public static void collatzCousin(int input) {
        int counter, longestNumber = 0, number = 0;

        for (int i = 1; i <= input; i++) {
            int n = i;
            counter = 1;
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                }
                else if (n % 4 == 1){
                    n = n * 7 + 1;
                }
                else{
                    n = n * 7 - 1;
                }
                counter++;
            }
            if (counter > longestNumber){
                longestNumber = counter;
                number = i;
            }
        }
        System.out.print(input + " " + number + " " + longestNumber + " ");
    }
}