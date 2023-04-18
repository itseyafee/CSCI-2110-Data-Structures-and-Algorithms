import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a starting value: ");
        int input = in.nextInt();

        int startingNumber=0;
        int longestSequence=0;

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        for(int i=1; i<=input; i++){
            if(collatzSequence(i) > longestSequence){
                longestSequence = collatzSequence(i);
                startingNumber = i;
            }
        }
        System.out.println(input + " " + startingNumber + " " + longestSequence + " " + executionTime);
    }
    public static int collatzSequence(int number ){

        int counter = 1;
        while(number != 1){
            if(number % 2 == 0){
                number=number / 2;
            }
            else {
                number = (3 * number)+1;
            }
            counter++;

        }
        return counter;
    }
}
