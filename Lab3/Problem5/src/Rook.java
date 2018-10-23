public class Rook extends  Piece {
    int x1,y1,x2,y2;

    Rook()
    {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }
    public  Rook(int x1,int y1,int x2,int y2)
    {
        this.x1  = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void isLegalMove() {
        int a = Math.abs(x1 - x2);
        int b = Math.abs(y1 - y2);

        if(x1 == x2 || y1 == y2)
        {
            System.out.println("Rook can move");
        }
        else {
            System.out.println("Rook can't move");
        }
    }
}
