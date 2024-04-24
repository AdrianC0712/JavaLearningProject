package operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String [] args)
    {
        int a =10;
        int b =5;

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
