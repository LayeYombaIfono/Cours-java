public class Bicycle {
    // La class Bicycle a deux champs
    public int gear; // Embrayage
    public int speed; // Vitesse

    // constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Methode pour appliquer le freinnage
    public  void applyBreak( int decrement){
        speed -= decrement;
    }

    // Methode pour accélération
    public void setSpeed( int increment){
        speed += increment;
    }

    // Méthode toString() pour imprimer les informations du vélo
    @Override
    public String toString() {
        return ("Le nombre d'engrenages est : " + gear + "\n" +
                "La vitesse du vélo est : " + speed

                );
    }
}
