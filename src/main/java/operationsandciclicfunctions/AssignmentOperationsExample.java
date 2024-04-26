package operationsandciclicfunctions;

import java.util.Scanner;

public class AssignmentOperationsExample {
    public static void main(String [] args)
    {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Citeste de la tastatura a:");
        a = sc.nextInt();
        System.out.println("CIteste de la tastatura b:");
        b = sc.nextInt();

        int rezultat = a;
        System.out.println("Atribuirea simpla:"+rezultat);

        rezultat  += b;
        System.out.println("Atribuirea cu adunare:"+rezultat);

        rezultat -= b;
        System.out.println("Atribuirea cu scadere:"+rezultat);

        rezultat *= b;
        System.out.println("Atribuirea cu inmultire:"+rezultat);

        rezultat /= b;
        System.out.println("Atribuirea cu impartire:"+rezultat);

        rezultat %= b;
        System.out.println("Atribuirea cu restul impartirii:"+rezultat);

    }
}
