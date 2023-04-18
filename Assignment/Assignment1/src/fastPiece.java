public class fastPiece extends Piece{

    public fastPiece(String name, String colour, int x, int y) {
        super(name, colour, x, y);

    }

    @Override
    public String toString() {
        return name+colour+"FP";
    }
    public void move(String direction,int n) {

        if(direction.equalsIgnoreCase("left")) {
            if(y-n >= 0) {
                Board.board[x][y-n]=Board.board[x][y];
                Board.board[x][y]=null;
                this.y=y-n;
            }
        }
        else {
            if(y+n<=7) {
                Board.board[x][y+n]=Board.board[x][y];
                Board.board[x][y]=null;
                this.y=y+n;
            }
        }
    }
}
