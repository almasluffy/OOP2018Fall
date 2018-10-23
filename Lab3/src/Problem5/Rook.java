package Problem5;
public class Rook extends Piece {

        int x1,y1,x2,y2;

        public Rook()
        {
            x1 = 0;
            y1 = 0;
            x2 = 0;
            y2 = 0;
        }
        public Rook(int x1, int y1, int x2, int y2)
        {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2  = y2;
        }

        @Override
        public void isLegalMove() {


            if(y1==y2 || x1 == x2)
            {
                System.out.println("Can move");
            }
            else {
                System.out.println("Can't move");
            }
        }
    }


