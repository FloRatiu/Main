public class MathCalc {
    //Exercitiul 2 lab10

    //metoda adunare
    public static int sum(int x, int y){
        int sum= x + y;
        return sum;
    }

    //metoda scadere
    public static int subtraction(int x, int y){
        int subtraction= x - y;
        return subtraction;
    }

    //metoda inmultire
    public static int multiplication(int x, int y){
        int multiplication= x * y;
        return multiplication;
    }

    //metoda impartire
    public static int division(int x, int y){
        int division= x / y;
        return division;
    }

    //Exercitiul 4 lab10
    //metoda media numerelor
    public static int average(int x, int y, int z){
        int average= (x + y + z) /3;
        return average;
    }

    //Exercitiul 6 lab10
    //metoda returneaza restul impartirii
    public static double rest(double x, double y){
        double rest= x % y;
        return rest;
    }
}
