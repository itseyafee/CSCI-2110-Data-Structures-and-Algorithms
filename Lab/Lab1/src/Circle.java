public class Circle {
    private double positionP;
    private double positionQ;
    private double radius;

    public Circle(double positionP, double positionQ, double radius){
        this.positionP = positionP;
        this.positionQ = positionQ;
        this.radius=radius;
    }
    //    Gets the positionP value
    public double getpositionP() {
        return positionP;
    }
    //    gets the positionQ value
    public double getpositionQ() {
        return positionQ;
    }
    //    gets the radius
    public double getRadius() {
        return radius;
    }
    //    gets the area of the Circle
    public double getArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }
    //    gets the circumference of the circle
    public double getCircumference(double radius){
        return 2*Math.PI*radius;
    }
    //    Sets the Centre of the circle
    public void setCenter(double p, double q) {
        this.positionP = p;
        this.positionQ = q;
    }
    //    Sets the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //    To String method used to return value to the main
    public String toString(){
        return positionP + ", " +positionQ +"\n"+"It's radius is: "+radius;
    }
    //    Contains method used to check if the coordinates are within the circle

    /**
     * @param pP
     * @param pQ
     * @return
     */
    public boolean contains(double pP, double pQ) {
        return (pP > positionP && radius + radius < Math.pow((pP - positionP),2) && pQ > positionQ && radius + radius<Math.pow((pQ-positionQ),2));
    }
    //    Touches method used to check if the coordinates are equal to the coordinate of the other
    public boolean touches(double pP, double pQ) {
        return (pP==positionP || radius+radius<Math.pow((pP-positionP),2) || pQ>positionQ || radius+radius<Math.pow((pQ-positionQ),2));
    }
    //contains method: returns true if another Circle c is contained within this circle //returns true if the circle touches the boundaries
    //it uses the point contains method
    public boolean contains(Circle c) {
        return(this.contains(c.getpositionP(),c.getpositionQ())&&
                this.contains(c.getpositionP() + c.getRadius(), c.getpositionQ()+c.getRadius()));
    }
    //    touches method: return true of the another Circle touches another coordinate or another circle. It returns the value true or false
    public boolean touches(Circle c) {
        return(this.touches(c.getpositionP(),c.getpositionQ())||
                this.touches(c.getpositionP() + c.getRadius(), c.getpositionQ()+c.getRadius()));
    }
}
