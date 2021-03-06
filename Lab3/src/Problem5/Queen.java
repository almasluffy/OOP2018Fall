package Problem5;

import java.lang.management.MemoryType;

public class Queen extends Piece
{
    int x1,x2,y1,y2;

    Queen()
    {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;

    }

    Queen(int x1,int y1,int x2,int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2  =y2;
    }

    @Override
    public void isLegalMove() {
        int a = Math.abs(x1 - x2);
        int b = Math.abs(y1- y2);
        if(a==b || y1 ==y2 || x1 == x2)
        {
            System.out.println("Can move");
        }
        else {
            System.out.println("Can't move");
        }
    }
}
