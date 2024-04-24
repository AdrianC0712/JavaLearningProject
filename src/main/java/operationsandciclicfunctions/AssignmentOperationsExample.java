package operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String [] args)
    {
        int a = 8;
        int b = 4;

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
