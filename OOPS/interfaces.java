public class interfaces {
    public static void main(String[] args) {
        Queen q= new Queen();
        q.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
        
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal - (BY one step)");
    }
}