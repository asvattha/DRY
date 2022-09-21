package DRY;

public class Remote {
    DogDoor door;

    public Remote(DogDoor door){
        this.door = door;
    }
   public void pressButton(){
        System.out.println("Pressing the remote control buttion to open the door");

        door.open();
   } 
}
