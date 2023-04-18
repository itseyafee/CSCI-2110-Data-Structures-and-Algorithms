public abstract class Piece {
    String name;
    String colour;
    int x,y;

    public Piece(String name,String colour,int x,int y) {

        this.name=name;
        this.colour=colour;
        this.x=x;
        this.y=y;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getColour() {

        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.y = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return name+colour;
    }

    public void move(String direction) {
    }

    public void move(String direction,int n) {
    }
}
