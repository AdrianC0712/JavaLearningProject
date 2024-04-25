package operationsandciclicfunctions;

public class AritmeticOperationExample {

    public static void main(String [] args)
    {
        int a = 43;
        int b = 3;

        int sum = a + b;
        System.out.println("Suma:" + sum);
        System.out.println("Suma:"+(a+b));

        int sub = a -b;
        System.out.println("Rezultatul:"+sub);

        int resultat = a * b;
        System.out.println("Inmultirea:"+resultat);

        resultat = a / b;
        System.out.println("Impartirea:"+resultat);

        resultat = a % b;
        System.out.println("Restul:"+resultat);
    }
}
