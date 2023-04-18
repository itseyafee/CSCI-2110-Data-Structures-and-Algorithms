package E3;
import E2.GenericStack;
import java.util.*;
import java.io.*;

/**
 * Some part of this lab is copied from lab document on brightspace.
 */
public class StudentRecordDemo {
        public static void main(String[] args) throws IOException {
//Building stack1 to hold StudentRecord Objects

            GenericStack<StudentRecord> stack1 = new GenericStack<StudentRecord>();

            Scanner in = new Scanner(System.in);

            System.out.print("Enter the filename to read from: ");

            String fileName = in.nextLine();
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            StringTokenizer token;

            while (sc.hasNext()) {
                String line = sc.nextLine();
                token = new StringTokenizer(line, " ");
                String firstName = token.nextToken();
                String lastName = token.nextToken();
                String IDString = token.nextToken();

//Converting String String ID to an Integer Object ID
                Integer IDNumber = Integer.valueOf(IDString);

//Creating a Student Record Object
                StudentRecord student = new StudentRecord(firstName, lastName, IDNumber);

//Pushing the StudentRecord object into stack1
                stack1.push(student);
            }
            sc.close();

//Creating stack object to store String objects
            GenericStack<String> stack2 = new GenericStack<String>();

//Pushing the last name which is afflicated  with each Student Record object
            int Stack1Size = stack1.size();

            for (int i = 0; i < Stack1Size; i++) {

                String lastName = stack1.pop().getLastName();
                stack2.push(lastName);
            }

//Printing the data inside stack2 to
            int Stack2size = stack2.size();
            System.out.println();

            for (int i = 0; i < Stack2size; i++) {
                System.out.println(stack2.pop());
            }
        }
}
