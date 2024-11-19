
public class MountainBike extends Bicycle {

    // La sous-classe MountainBike ajoute un champ supplémentaire
    public int seatHeight; // Hauteur de siège

    // Constructor
   public  MountainBike(int gear, int speed, int startHeight){
       super(gear, speed);
       seatHeight = startHeight;
   }

   // Méthode suplémentaire de la sous-classe MountainBite
    public void setHeight(int newValue){
       seatHeight = newValue;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nLa hauteur est : " + seatHeight);
    }
}
