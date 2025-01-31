package runnable;

import java.util.ArrayList;
import java.util.List;

public class Person implements Runnable {

    @Override
    public void run() {
        threadAddPerson();

    }

    private static void threadAddPerson() {
        List<String> person = new ArrayList<>();

        person.add("Personne 1");
        person.add("Personne 2");
        person.add("Personne 3");
        person.add("Personne 4");
        person.add("Personne 5");

        for (String p : person){
            System.out.println(p);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
