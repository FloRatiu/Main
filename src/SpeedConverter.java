import java.util.Scanner;

public class SpeedConverter {
    //Exercitiul 9 lab10
    //metoda returneaza m/s, km/h, miles/h
    public static Object conversie(){
        Scanner Meters= new Scanner(System.in);
        Scanner Hours= new Scanner(System.in);
        Scanner Minutes= new Scanner(System.in);
        Scanner Seconds= new Scanner(System.in);

        //unitatile de masura pentru distanta este metrul, iar pentru timp sunt secundele

        System.out.println("Introduceti valoarea distantei D: "); //distanta in metri
        double D= Meters.nextInt();

        System.out.println("Introduceti ora H: "); //introducere valoare ora
        double H= Hours.nextInt();

        System.out.println("Introduceti minutele MM: "); //introducere valoare minute
        double MM= Minutes.nextInt();

        System.out.println("Introduceti secundele SS: "); //introducere valoare secunde
        double SS= Seconds.nextInt();

        double time= H*3600 + MM*60 + SS; //formula de calcul pentru transformare ore:minute:secunde in secunde

        double V1= D / time; //formula matematica a vitezei( viteza= distanta/ timp)
        //rezultatul va fi in metri/secunda

        double V2= V1*3.6; // formula de conversie din m/s in km/h
        double V3= V1*2.236936; // formula de conversie din m/s in miles/h

        System.out.println(V1 + " m/s"); //afisare rezultat viteza in m/s
        System.out.println(V2 + " km/h"); //afisare conversie in km/h
        System.out.println(V3 + " miles per hour"); //afisare conversie in miles/h
        return "\n";
    }
}
