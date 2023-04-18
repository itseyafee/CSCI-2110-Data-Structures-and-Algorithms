import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        LinkedList<String> list=new LinkedList<String>();
        String input;

        while(!(input=in.nextLine()).equals("quit")){
            list.add(input);
        }
        displayEven(list);
        displayOdd(list);
        reverse(list);
        removeMiddle(list);
    }

    //method to display even-numbered nodes
    public static void displayEven(LinkedList<String> LinkedList){
        System.out.println("Here is the linked list with even number nodes:");
        for(int i=0; i< LinkedList.size(); i++){
            if(i%2==0){
                System.out.println(LinkedList.getAt(i) + " " );
            }
        }
    }
    //method to display odd-numbered nodes
    public static void displayOdd(LinkedList<String> LinkedList){
        System.out.println("Here is the linked list with odd number nodes:");
        for(int i=0; i<LinkedList.size(); i++ ){
            if(i%2 != 0){
                System.out.println(LinkedList.getAt(i) + " " );
            }
        }
    }
    //method to create a reversed linked list
    public static LinkedList<String> reverse(LinkedList<String> LinkedList){
        LinkedList<String> linkyListy = new LinkedList<String>();
        System.out.println("Here is the reversed linked list");
        for(int i=0; i<LinkedList.size(); i++ ){
            linkyListy.add(LinkedList.getAt(i));
        }
        for(int i=0; i< LinkedList.size(); i++){
            System.out.println(linkyListy.getAt(i));
        }
        return linkyListy;
    }
    //method to remove the middle node in the linked list
    public static void removeMiddle(LinkedList<String> LinkedList){
        System.out.println("Here is the linked list removing middle one");
        int midVal= (int)(Math.ceil((LinkedList.size()-1)/2));

       LinkedList.removeAt(midVal);
       LinkedList.enumerate();
    }
}
