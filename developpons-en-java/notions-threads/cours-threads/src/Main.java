import threads.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Création du thread
        CreateThread testThread = new CreateThread();
        testThread.testThread();

//        Héritage du thread
        MonThreadHerite monThreadHerite = new MonThreadHerite();
        monThreadHerite.start();

//        Implémentation de l'interface Runnable
        Thread thread = new Thread(new MonThreadImplRunnable());
        thread.start();

//        Utilisation de l'instance de de type Runnable pour plusieur traitement
        InstanceTypeRunnablePlusieurThreads type = new InstanceTypeRunnablePlusieurThreads();
        type.typeRunnablePlusieurThreads();

//        Traitement du thread avec la boucle while
        ArretThread arret = new ArretThread();
        arret.start();

    }
}