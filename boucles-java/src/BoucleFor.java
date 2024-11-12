public class BoucleFor {
    static String[] customers = {
            "Jean",
            "Finda",
            "Hawa",
            "Marie",
            "Christine",
            "Laye Yomba",
            "Paul",
            "Michel"
    };

    /**
     * Methode principale qui retourne 2 methodes
     * @param args :
     */
    public static void main(String[] args) {

        displayCustomersList();
        customersList();
    }

    /*
     * Cette methode affiche la liste des clients en
     * utilisant la boucle for avec iteration de i
     *
     */
    private static void displayCustomersList(){
        for (int i = 0; i < customers.length; i++) {
         greentingCustomer(customers[i]);
        }
        System.out.println("-------Fin de la premiere boucle iteree avec i --------");
    }

    /**
     * Cette methode affiche la liste des clients en
     *   utilisant la boucle for optimiser
     */
    private static void customersList(){
        for (String customer: customers){
            greentingCustomer(customer);
        }
    }


    /**
     * Cette methode affiche hello + le nom de client
     * @param customer: Passer le nom du client
     */
    private static void greentingCustomer(String customer){
        String greeting = "Hello " + customer;
        System.out.println(greeting);
    }
}