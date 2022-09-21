package DRY;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
    DogDoor door;

    public Remote(DogDoor door){
        this.door = door;
    }
   public void pressButton(){
        System.out.println("Pressing the remote control buttion to open the door");

        door.open();

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run(){
            door.close();
            timer.cancel();
            }
        }, 5000);
   } 
}
