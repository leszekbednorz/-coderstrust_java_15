import java.util.Random;

public class TestHello {

    public static void main(String[] args) {
//
//        if(args.length > 0) {
//            if(args[0].equals("go")) {
//                System.out.println("OK GO");
//            }
//        }
//
//        Osoba osoba1 = new Osoba();
//        Osoba osoba2 = new Osoba();
//
//
//
//        osoba1.imie = "adam";
//        osoba1.wiek = 23;
//
//        osoba2.imie = "Jan";
//        osoba2.wiek = 30;
//
//        osoba1.printInfo();
//        System.out.println("----------------------------");
//        osoba2.printInfo();

        Statistics stat = new Statistics();
        int[] liczby = new int[3];
        liczby[0] = 12;
        liczby[1] = 20;
        liczby[2] = 30;

        double wynik = stat.getAverage(liczby);
        System.out.println(wynik);

        Random rand = new Random();
        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextInt(100));
        System.out.println(rand.nextInt(100));


    }
}
