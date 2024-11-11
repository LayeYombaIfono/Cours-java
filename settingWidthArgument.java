public class settingWidthArgument   {

    /**
     * Ceci est la fonction principale d'un programme java
     * @param args Represente les donnees passees en parametre lors du lancement du programme
     */
    public static void main(String[] args) {

        sayHello(args);
    }

    /**
     * Methode permettant d'acceuillir et de presenter les services a l'utilisateur
     * @param args Represente le nom de l'utilisateur
     */
    private static void sayHello(String[] args) {
        // Variable avec arguments
        String welcomeMessage = "Bonjour " + args[0] + ", Bienvenue au parking Zerofiltre";
        String service = "Nous offrons les services suivants : Gardienage, Laverie";
        String warning = "Dépechez-vous d'entrer car il n'y aura bientôt plus de places";

        System.out.println(welcomeMessage);
        System.out.println(service);
        System.out.println(warning.toUpperCase());
    }
}
