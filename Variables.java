public class Variables {

    public static void main(String[] args) {
       
        // Declaration de la variable
        int length = 180;
        int width = 120;
        int surface = length * width;

        double perimeter = (double) 2 * (length + width);

      
        // Affichage de la variable
        String messageDisplaySurface = "La surface de la voiture est de : ";
        
        String color = "Noire";
        String messageDisplayColor = "La couleur  de la voiture est : ";

        System.out.println("La longueur de la voiture est de : " + length + " cm");
        System.out.println("La largeur de la voiture est de : " + width + " cm");
        
        System.out.println("Le perimetre de la voiture est de : " + perimeter + " cm");

        System.out.println(messageDisplaySurface + surface + " " +" \n"  + messageDisplayColor + color);

    }
}