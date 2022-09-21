package DRY;

public class BarkRecognizer {

    DogDoor door;
    
    public BarkRecognizer(DogDoor door){
        this.door = door;
    }

    public void recognize(String bark) {
        System.out.println("Bark Recognizer: Heard a" + bark);
        if (bark == "Woof"){
            door.open();
        }
        
        else{
            System.out.println("The animal is not allowed");
        }
    }
    
}
