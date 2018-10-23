public class Knight extends  Piece {

    int x1,y1,x2,y2;

    Knight()
    {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }
    public  Knight(int x1,int y1,int x2,int y2)
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

        if((a==1 && b==2)|| (b==1 || a==2))
        {
            System.out.println("Knight can move");
        }
        else {
            System.out.println("Knight can't move");
        }
    }
}
