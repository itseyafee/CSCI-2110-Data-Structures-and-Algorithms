public class Board {

    static Piece[][] board=new Piece[8][8];

    public static void addPiece(Piece a) {
        if(board[a.x][a.y]!=null) {
            System.out.println("Piece is already in place");
        }
        else{
            board[a.x][a.y]=a;
        }
    }

    public static void print() {
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(board[i][j]==null) {
                    System.out.print("- ");
                }
                else
                    System.out.println(board[i][j]);
            }
            System.out.println();
        }
    }
    // To move the piece
    public static void move(int i,int j,String direction,int n)
    {
        try
        {
// Checking if piece at location or not
            if(board[i][j]==null)
            {
                System.out.println("Error: no piece at "+i+","+j);
            }

            else
            {
// If found piece calling respective move method
                if(board[i][j] instanceof slowFlexible)
                    board[i][j].move(direction, n);
                else if(board[i][j] instanceof fastFlexible)
                    board[i][j].move(direction, n);
                else if(board[i][j] instanceof slowPiece )
                    board[i][j].move(direction);
                else if(board[i][j] instanceof fastPiece)
                    board[i][j].move(direction,n);

            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter correct index i,j");
        }
    }
}
