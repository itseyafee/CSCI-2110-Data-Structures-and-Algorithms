public class fastFlexible extends fastPiece {
    public fastFlexible(String name, String color, int p, int q) {
        super(name, color, p, q);
    }
    @Override
    public String toString() {
        return name+ colour+ "FF";
    }

    public void move(String direction,int x) {
        if(direction.equals("left")) {
            if(y-x>=0) {
                Board.board[this.x][y-x]=Board.board[this.x][y];
                Board.board[this.x][y]=null;
                this.y = y-x;
            }
        }
        else if(direction.equals("right")) {
            if(y+x<=7) {
                Board.board[this.x][y+x]=Board.board[this.x][y];
                Board.board[this.x][y]=null;
                this.y=y+x;
            }
        }
        else if(direction.equals("up")) {
            if(this.x -x>=0) {
                Board.board[this.x -x][y]=Board.board[this.x][y];
                Board.board[this.x][y]=null;
                this.x= this.x -x;
            }
        }
        else
        if(this.x +x<=7) {
            Board.board[this.x +x][this.x]=Board.board[this.x][y];
            Board.board[this.x][y]=null;
            this.x= this.x +x;
        }
    }
}
