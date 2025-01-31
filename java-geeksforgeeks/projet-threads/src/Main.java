import runnable.Person;
import threads.Thread1;
import threads.Thread2;
import threads.Thread3;
import threads.Thread4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



       /* Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();*/

        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();

        System.out.println("<------------------------>");
        thread3.start();
        thread4.start();


        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();

        t3.start();
        t4.show();
        System.out.println("<--------------------->");

        Runnable person = new Person();
        Thread t = new Thread(person);
        t.start();
    }
}