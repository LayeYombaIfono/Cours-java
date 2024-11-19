public class Main {

    public static void main(String[] args) {

        mountainBike();

    }

    private static void mountainBike() {
        MountainBike mb1 = new MountainBike(3, 300, 30);
        MountainBike mb2 = new MountainBike(10, 150, 200);

        System.out.println("Information du premier vélo. ");
        System.out.println(mb1);
        System.out.println("Information du deuxième vélo. ");
        System.out.println(mb2);
    }
}