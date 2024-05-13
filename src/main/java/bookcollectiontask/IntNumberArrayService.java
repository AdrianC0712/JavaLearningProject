package bookcollectiontask;

public class IntNumberArrayService
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 2, 9, 1, 7};

        // Calcularea valorii minime
        int minimum = findMinimum(numbers);
        System.out.println("Valoarea minimă din tablou este: " + minimum);

        // Calcularea valorii medii
        double average = findAverage(numbers);
        System.out.println("Valoarea medie din tablou este: " + average);
    }
    public static int findMinimum(int[] array)
    {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Metodă statică pentru a calcula valoarea medie dintr-un tablou de numere întregi
    public static double findAverage(int[] array)
    {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }


}
