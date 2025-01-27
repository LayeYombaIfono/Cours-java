package threads;

public class InstanceTypeRunnablePlusieurThreads {
    Runnable runnable = new MonThreadImplRunnable();

    public void typeRunnablePlusieurThreads(){
        for (int i = 0 ; i < 10; i++){
            Thread thread = new Thread(runnable);
            thread.start();

        }
    }
}
