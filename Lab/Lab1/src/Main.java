public class Main {
    public static void main(String[] args) {

//Constructor for rectangle 1
        Rectangle rectangle1 = new Rectangle(1.0, 1.0, 5.0, 5.0);

//Constructor for rectangle 2
        Rectangle rectangle2 = new Rectangle(2.0, 2.0, 4.0, 4.0);

//prints the coordinates of rectangle 1
        System.out.println("The first Rectangle's top corner is: " + rectangle1.toString());

//prints the coordinates of rectangle 2
        System.out.println("The second Rectangle's top corner is: " + rectangle2.toString());

//prints the value true or false if the coordinates are within the rectangle
        System.out.println("The contains method returns: "+ rectangle1.contains(rectangle2));

//prints the value true or false if the coordinates are touching the rectangle
        System.out.println("The touches method returns: "+rectangle1.touches(rectangle2));

    }
}
