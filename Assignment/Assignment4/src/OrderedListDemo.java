import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class OrderedListDemo {
    public static void main(String[] args) throws IOException {
        OrderedList list1=new OrderedList();
        OrderedList list2=new OrderedList();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first filename to read from: ");
        String fileName = in.nextLine();

        File files = new File(fileName);
        Scanner inputFile = new Scanner(files);

        StringTokenizer token;

        while(inputFile.hasNext()){
            String line = inputFile.nextLine();
            token = new StringTokenizer(line," ");
            list1.add(token.nextToken());
        }
        System.out.print("Enter the second filename to read from: ");

        String fileName2 = in.nextLine();
        File file2 = new File(fileName2);
        Scanner inputFile2 = new Scanner(file2);

        while(inputFile2.hasNext()){
            String line = inputFile2.nextLine();
            token = new StringTokenizer(line, " ");
            list2.add(token.nextToken());
        }

        list1.enumerate();
        list2.enumerate();

        System.out.println("The merge list is: \n");
        OrderedList orderedList = merge(list1,list2);

        System.out.println("The difference is: \n");
        OrderedList difference= difference(list1,list2);

        System.out.println("The common list is: \n");
        OrderedList common = common(list1,list2);

        System.out.println("The merge operations are complete and the results are " +
                "in merged.txt, difference.txt and common.txt\n");

    }
    public static <T extends Comparable<T>>  OrderedList<T> merge(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> list3 = new OrderedList<T>();

        int c1 = 0;
        int c2 = 0;

        while (c1 < list1.size() && c2 < list2.size()) {
            if (list1.get(c1).compareTo(list2.get(c2)) < 0) {
                list3.add(list1.get(c1));
                c1++;
            }
            else if (list1.get(c1).compareTo(list2.get(c2)) > 0) {
                list3.add(list2.get(c2));
                c2++;
            }
            else {
                list3.add(list1.get(c1));
                c1++;
                c2++;
            }
        }
        if (c1 == list1.size()) {
            for (int i = c2; i < list2.size(); i++) {
                list3.add(list2.get(i));
            }
        }
        if (c2 == list2.size()) {
            for (int i = c1; i < list1.size(); i++) {
                list3.add(list1.get(i));
            }
        }
        list3.enumerate();
        return list3;
    }
    public static <T extends Comparable<T>> OrderedList<T> difference(OrderedList<T> list1, OrderedList<T> list2){
        OrderedList <T> list3 = new OrderedList<T>();
        for(int i=0; i < list1.size(); i++){
            if(list2.binarySearch(list1.get(i))<0){
                list3.add(list1.get(i));
            }
        }
        list3.enumerate();
        return list3;
    }
    public static <T extends Comparable<T>> OrderedList<T> common(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList <T> list3 = new OrderedList<T>();

        for (int i = 0; i < list1.size(); i++) {
            if (list2.binarySearch(list1.get(i)) > 0) {
                list3.add(list1.get(i));
            }
        }
        list3.enumerate();
        return list3;
    }
}

