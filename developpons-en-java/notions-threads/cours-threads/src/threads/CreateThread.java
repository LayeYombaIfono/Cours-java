package threads;

public class CreateThread {

    public  void testThread(){
        Thread t = new Thread(() -> System.out.println("Traitement d'un thread----------> "));

        t.start();

    }
}
