import java.util.Scanner;

public class InchConverter {
    //Exercitiul 8 lab10
    //metoda returneaza distanta in Metri din Inch
    public static double calculMetru(){
        Scanner Inch = new Scanner(System.in);
        int I = Inch.nextInt();
        double M= I * 0.0254;
        return M;
    }
}
