public class Main {

   /**
    *  Méthode créer avec un mot clé static
    *  STATIC signifie que la méthode appartient à la classe Main et non
    *  à un objet de la classe Main
    *  VOID siginifie que cette méthode n'a pas de valeur de retour.
    *  
    */


   static void myMethod() {
      System.out.println("Hello world !, \nJe suis une méthode static qui appartient à la classe Main");
   }

   public static void main(String[] args) {
      myMethod();
   }
}
