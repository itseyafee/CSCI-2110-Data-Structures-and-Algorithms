public class slowFlexible extends slowPiece {
    public slowFlexible(String name, String colour, int x, int y) {
        super(name, colour, x, y);
    }
    @Override
    public String toString() {
        return name+colour+"SF";
    }
    public void move(String direction) {
        if(direction.equalsIgnoreCase("left")) {
            if(y-1>=0) {
                Board.board[x][y-1]=Board.board[x][y];
                Board.board[x][y]=null;
                this.y=y-1;
            }
        }
        else if(direction.equalsIgnoreCase("right")) {
            if(y+1<=7) {
                Board.board[x][y+1]=Board.board[x][y];
                Board.board[x][y]=null;
                this.y=y+1;
            }
        }
        else if(direction.equalsIgnoreCase("up")) {
            if(x-1>=0) {
                Board.board[x-1][y]=Board.board[x][y];
                Board.board[x][y]=null;
                this.x=x-1;
            }
        }
        else
        if(x+1<=7) {
            Board.board[x+1][y]=Board.board[x][y];
            Board.board[x][y]=null;
            this.x=x+1;
        }
    }
}
