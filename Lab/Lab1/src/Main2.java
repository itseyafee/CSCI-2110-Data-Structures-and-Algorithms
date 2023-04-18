public class Main2 {
    public static void main(String[] args) {

//Constructor for circle 1
        Circle circle1 = new Circle(5.0, 5.0, 4.0);

//Constructor for circle 2
        Circle circle2 = new Circle(10.0, 2.0, 3.0);

//Prints the coordinates of the first Circle
        System.out.println("The first Circle's centre is: " + circle1);

//Prints the coordinates of the second Circle
        System.out.println("The second Circle's centre is: " + circle2);

//Prints true or false if the coordinates are within the circle
        System.out.println("The 'contains' method returns: "+circle1.contains(circle2));

//Prints the true or false if the coordinate touches the circle
        System.out.println("The 'touches' method returns: "+circle1.touches(circle2));

    }
}
