package E1;

public class Point<T> {
    private T xpos;
    private T ypos;

//Constructor
    public Point(T xpos, T ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

//Getters and Setters

    public T getXpos() {
        return xpos;
    }

    public T getYpos() {
        return ypos;
    }

    public void setXpos(T xpos) {
        this.xpos = xpos;
    }

    public void setYpos(T ypos) {
        this.ypos = ypos;
    }

//toString method
    public String toString() {
        return "XPOS: " + xpos + "    " + "YPOS: " + ypos;
    }
}
