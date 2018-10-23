import java.beans.BeanInfo;

public class Prb5 {
    public  static  void main(String args[])
    {
            // Queen q = new Queen(5,5,6,1);
           // q.isLegalMove();
        King k = new King(5,5,5,6);
        k.isLegalMove();

        Bishop bs = new Bishop(2,6,7,1);
        bs.isLegalMove();

        Knight kng = new Knight(1,1,2,3);
        kng.isLegalMove();

        Queen q = new Queen(5,4,2,1);
        q.isLegalMove();

        Rook rk = new Rook(1,1,1,8);
        rk.isLegalMove();

    }
}
