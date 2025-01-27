package daemonThreads;

public class ObtenuThreadCourant implements Runnable{
    @Override
    public void run() {
        System.out.println("Mon traitement " + Thread.currentThread().getName());
    }

    public void traitementThread(){
        Runnable runnable = new ObtenuThreadCourant();

        for (int i = 0; i < 10; i++){
            Thread thread = new Thread(runnable);
            thread.setName("Mon traitement " + i);
            thread.start();
        }
    }
}
