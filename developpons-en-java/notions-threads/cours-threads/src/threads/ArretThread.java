package threads;

public class ArretThread extends Thread{

    private volatile  boolean running = true;

   public void traiter(){
       this.running = false;
   }

    @Override
    public void run() {
        while (running){
            System.out.println("Traitement du thread avec une boucle");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
