package operationsandciclicfunctions;

import java.util.Scanner;

public class ComparisonOperationsExample {
    public static void main(String [] args)
    {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Citeste de la tastatura a:");
        a = sc.nextInt();
        System.out.println("CIteste de la tastatura b:");
        b = sc.nextInt();

        boolean variabila = a == b;
        System.out.println("Egal cu:" + variabila);

        variabila = a != b;
        System.out.println("Diferit de:" + variabila);

        variabila = a > b;
        System.out.println("Mai mare decit:" + variabila);

        variabila = a < b;
        System.out.println("Mai mic decit:" + variabila);

        variabila = a >= b;
        System.out.println("Mai mare sau egal:" + variabila);

        variabila = a <= b;
        System.out.println("Mai mic sau egal:" + variabila);
    }
}
