import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Lab9Methods lab9 = new Lab9Methods();// obiectul creat pentru clasa Lab9Methods
        //exercitiul 1
        System.out.println(lab9.hello());
        System.out.println(lab9.sum());
        System.out.println(lab9.subtrac());
        System.out.println(lab9.calcul());

        MathCalc calc = new MathCalc(); //obiectul creat pentru clasa MathCalc

        //exercitiul 2
        System.out.println("Rezultatul este: " + calc.sum(10, 5));
        System.out.println("Rezultatul este: " + calc.subtraction(10, 5));
        System.out.println("Rezultatul este: " + calc.multiplication(10, 5));
        System.out.println("Rezultatul este: " + calc.division(10, 5));

        //exercitiul 3
        Print afisare = new Print(); // obiectul creat pentru clasa Print
        System.out.println(afisare.string());

        //exercitiul 4
        System.out.println("Rezultatul este: " + calc.average(10, 5, 6));

        //exercitiul 5
        Print afisare2 = new Print();
        System.out.println(afisare.string1());

        //exercitiul 6
        System.out.println("Rezultatul este: " + calc.rest(15.0, 6));

        //exercitiul 7
        TempConversion temp = new TempConversion(); //obiectul pentru clasa TempConversion
        System.out.println("Introduceti valoarea F: ");
        System.out.println("Rezultatul este C= " + temp.calculTemp() + " grade celsius");

        //exercitiul 8
        InchConverter meterinch = new InchConverter(); //Obiectul pentru InchConverter
        System.out.println("Introduceti valoare I: ");
        System.out.println("Rezultatul este M= " + meterinch.calculMetru() + " metri");

        //exercitiul 9
        SpeedConverter speed = new SpeedConverter(); //Obiectul pentru SpeedConverter
        System.out.println(speed.conversie());

    }
}
