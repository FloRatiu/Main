import java.util.Scanner;

public class TempConversion {
    //Exercitiul 7 lab10
    //metoda returneaza temperatura in grade Celsius din Fahrenheit
    public static double calculTemp(){
        Scanner Fahrenheit = new Scanner(System.in);
        int F = Fahrenheit.nextInt();
        double C= (F-32) * 5.0/9;
        return C;
    }

}
