public class Rectangle{
    private double positionP;
    private double positionQ;
    private double height;
    private double width;

    public Rectangle(double positionP,double positionQ, double Height, double Width ){
        this.positionP = positionP;
        this.positionQ = positionQ;
        this.width  = Width;
        this.height = Height;
    }
    public void setP(double positionP){
        this.positionP = positionP;
    }
    public void setQ(double positionQ){
        this.positionQ = positionQ;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    //    Getters
    public double getpositionP(){
        return positionP;
    }
    public double getpositionQ(){
        return positionQ;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    //    To String method
    public String toString(){
        return this.getpositionP() +","+ this.getpositionQ()+" " +"\n" + "It's width is: " + this.getWidth()+ "\n" + "It's height is: "+  this.getHeight();
    }
    //contains method: returns true if a point (pP, positionQ) is contained within this rectangle //contains also returns true if the point touches the rectangle
    public boolean contains(double pP, double pQ) {
        return (pP > positionP && pP < positionP + width && pQ > positionQ && pQ < positionQ + height);
    }
    //    touches method: returns true if a point (pP, pQ) is equal to the rectangle //contains also returns true if the point touches the rectangle
    public boolean touches(double pP, double pQ) {
        return (pP == positionP || pP == positionP +width || pQ == positionQ || pQ == positionQ + height);
    }
    //contains method: returns true if another rectangle x is contained within this rectangle //returns true if the rectangle touches the boundaries
    //it uses the point contains method
    public boolean contains(Rectangle x) {
        return(this.contains(x.getpositionP() , x.getpositionQ()) && this.contains(x.getpositionP() + x.getWidth(), x.getpositionQ() + x.getHeight()));
    }
    public boolean touches(Rectangle x) {
        return(this.touches(x.getpositionP(),x.getpositionQ())||
                this.touches(x.getpositionP() + x.getWidth(), x.getpositionQ() + x.getHeight()));
    }
}