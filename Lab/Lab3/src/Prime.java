import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        long startTime, endTime, executionTime; //accessed from Lab3 pdf, Brightspace
        startTime = System.currentTimeMillis(); //accessed from Lab3 pdf, Brightspace

        Scanner in = new Scanner(System.in);

        long input = in.nextLong();

        nthPrime(input);

        endTime = System.currentTimeMillis(); //accessed from Lab3 pdf, Brightspace
        executionTime = endTime - startTime;// accessed from Lab3 pdf, Brightspace

        System.out.println(input + " " + nthPrime(input) + " " + executionTime);
    }

    public static long nthPrime(long inputNumber) {
        int counter = 0;
        int primenumber = 1;
        int i;

        while (counter < inputNumber){
            primenumber++;

            for(i=2; i<=primenumber; i++){
                if(primenumber%i == 0){
                    break;
                }
            }
            if(i == primenumber){
                counter++;
            }
        }
        return primenumber;
    }
}
