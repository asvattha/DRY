package DRY;

import java.util.Timer;
import java.util.TimerTask;

public class BarkRecognizer {

    DogDoor door;
    
    public BarkRecognizer(DogDoor door){
        this.door = door;
    }

    public void recognize(String bark) {
        System.out.println("Bark Recognizer: Heard a" + bark);
        if (bark == "Woof"){
            door.open();
            
            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run(){
                door.close();
                timer.cancel();
                }
            }, 5000);
        }
        
        else{
            System.out.println("The animal is not allowed");
        }
    }
    
}
