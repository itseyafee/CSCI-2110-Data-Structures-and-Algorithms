public class slowPiece extends Piece {

    public slowPiece(String name, String colour, int p, int q) {
        super(name, colour, p, q);
    }
    public void move(String angle) {
        if(angle.equalsIgnoreCase("left")) {
            if(y-1 >= 0) {
                Board.board[x][y-1]=Board.board[x][y];
                Board.board[x][y]=null;
                this.y=y-1;
            }
        }
        else {
            if(y+1<=7) {
                Board.board[x][y+1]=Board.board[x][y];
                Board.board[x][y]=null;
                this.y=y+1;
            }
        }
    }
    @Override
    public String toString() {
        return name+colour+"SP";
    }
}
