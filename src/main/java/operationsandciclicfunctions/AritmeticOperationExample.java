package operationsandciclicfunctions;

import java.util.Scanner;

public class AritmeticOperationExample {

    public static void main(String [] args)
    {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Citeste de la tastatura cifra a:");
        a = sc.nextInt();
        System.out.println("Citeste de la tastatura cifra a:");
        b = sc.nextInt();

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
