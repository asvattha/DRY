package DRY;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    static boolean open = false;

    public void open(){
        System.out.println("Dog door opens");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run(){
            close();
            timer.cancel();
            }
        }, 5000);

   } 

   public void close(){
    open=false;
    System.out.println("THe dog door closes");
   }
}
