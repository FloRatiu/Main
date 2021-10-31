public class Lab9Methods {

    // Exercitiul 1 lab10

    // metoda hello pt Exercitiul numarul 1
    public static String hello(){
        System.out.println("hello world"); // afisare pe aceeasi linie
        System.out.println("Hello\nFlorin"); // afisarea rezultatului pe 2 linii
        return "\n";
    }

    //metoda suma pt exercitiul numarul 2
    public static Object sum() {
        int a = 10; //definire variabile
        int b = 12;
        int s;
        System.out.println(a + b); // metoda rapida in care afisam suma a+b
        System.out.println(s = a + b); // utilizarea unei a 3-a variabile( s) pentru afisarea sumei
        return "\n";
    }

    //metoda substraction pentru exercitiul numarul 3
    public static Object subtrac() {
        double i;
        System.out.println(i=10 / 3); // afisare rezultat intreg
        System.out.println(i=10.0 / 3); // afisare rezultat corect
        System.out.printf("%n","%.4f", i); // afisare 4 zecimale
        return "\n";
    }

    //metoda calcul pentru exercitiul numarul 4
    public static Object calcul(){
        // Subpunct a
        int rez1,rez2,rez4,rez5;
        double rez3;
        rez1= -5 + 8 * 6;
        System.out.println(rez1);

        // Subpunct b
        rez2= (55 + 9) % 9;
        System.out.println(rez2);

        // Subpunct c
        rez3=20.0 + -3 * 5 / 8.0;
        System.out.println(rez3); // afisare rezultat cu zecimale
        rez4= 20 + -3 * 5 / 8;
        System.out.println(rez4); // afisare rezultat numar intreg

        // Subpunct d
        rez5= 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(rez5); // afisare rezultat numar intreg
        return "\n";
    }
}
