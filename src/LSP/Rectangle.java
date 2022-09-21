package LSP;
public class Rectangle {
   
    int length; 
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void setLength(int l) {
        length = l;
    }

    void setWidth(int w){
        width = w;
    }

    public int area(){
        return length * width;
    }
}

