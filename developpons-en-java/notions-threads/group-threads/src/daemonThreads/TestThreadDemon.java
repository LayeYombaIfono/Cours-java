package daemonThreads;

public class TestThreadDemon {

   public void testdaemon(){

       Thread daemonThread = new Thread(() -> {
           try {
               while (true){
                   System.out.println("Execution demon..........");
               }
           }  finally {
               System.out.println("Fin demon");
           }

       }, "Demon");


       daemonThread.setDaemon(true);
       daemonThread.start();
   }

}
