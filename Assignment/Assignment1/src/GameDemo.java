import java.util.Scanner;
public class GameDemo {

        public static void main(String[] args) {

            Scanner obj=new Scanner(System.in);
            String command="";

            while(!command.equalsIgnoreCase("exit"))
            {

                System.out.println("Enter a command (type help for details):");
                command=obj.nextLine();

                String[] cArr=command.split(" ");

                switch(cArr[0]) {

                    case "help": System.out.println("Possible commands are as follows:");
                        System.out.println("create location [fast] [flexible]: creates a new piece");
                        System.out.println("move location direction [spaces]: Moves a piece");
                        System.out.println("Print: Displays the board");
                        System.out.println("Help: Displays help");
                        System.out.println("Exits the program");
                        break;

                    case "exit": System.out.println("Thank you Bye...");
                        break;

                    case "create": try{
                        int i=Integer.parseInt(cArr[1]);
                        int j=Integer.parseInt(cArr[2]);

                        if(i <=7 && i>=0 && j<=7 && j>=0)
                        {
                            System.out.println("Enter name:");
                            String name=obj.next();
                            System.out.println("Enter colour");
                            String colour=obj.next();
                            switch(cArr[3])
                            {
                                case "slow": Board.addPiece(new slowFlexible(name,colour,i,j)); break;
                                case "fast": Board.addPiece(new fastFlexible(name,colour,i,j)); break;

                            }
                        }
                        else
                            System.out.println("Error: Enter correct indexes 0-7");
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Error: Command incorrect");
                    }
                        break;

                    case "move": try
                    {
                        int i=Integer.parseInt(cArr[1]);
                        int j=Integer.parseInt(cArr[2]);
                        String direction=cArr[3];
                        int n=Integer.parseInt(cArr[4]);
                        Board.move(i,j,direction,n);
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println("Error: Enter correct command");
                    }
                        break;
                    case "print":Board.print(); break;

                }
            }

            obj.close();

        }

    }


