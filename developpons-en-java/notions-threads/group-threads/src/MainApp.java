import daemonThreads.ObtenuThreadCourant;
import daemonThreads.TestThreadDemon;

public class MainApp {
    public static void main(String[] args) {

        TestThreadDemon threadDemon = new TestThreadDemon();

        threadDemon.testdaemon();

        ObtenuThreadCourant threadCourant = new ObtenuThreadCourant();
        threadCourant.traitementThread();
    }
}
