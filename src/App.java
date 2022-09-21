import DRY.BarkRecognizer;
import DRY.DogDoor;
import DRY.Remote;
import LSP.Rectangle;
import LSP.Square;

public class App {
    public static void main(String[] args) throws Exception {

        /* LSP  
        Rectangle r = new Rectangle(3, 4);
        r.setLength(5);
        System.out.println(r.area());

        r = new Square(5);
        r.setLength(3);
        System.out.println(r.area());
        */

        // DRY 

        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        
        recognizer.recognize("Woof");
        //remote.pressButton();

        //
    }
}
