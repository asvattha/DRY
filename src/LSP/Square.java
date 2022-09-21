package LSP;
public class Square extends Rectangle{
    
    int side;

    public Square(int side){
        super(side, side);
    }

    void setSide(int side){
        super.setLength(side);
        super.setWidth(side);
    }
}
