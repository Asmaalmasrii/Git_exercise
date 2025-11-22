public class NumberProcessor {

    // Feature 1:
    // Even numbers -> add
    // Odd numbers -> multiply
    public static void processArray(int[] numbers) {
        System.out.println("Running Feature 1: Basic even/odd processing");
        int sumEven = 0;
        int productOdd = 1;

        for (int n : numbers) {
            if (n % 2 == 0) {
                sumEven += n;               // Add even numbers
            } else {
                productOdd *= n;            // Multiply odd numbers
            }
        }

        System.out.println("Sum of even numbers = " + sumEven);
        System.out.println("Product of odd numbers = " + productOdd);
    }

    // Feature 2:
    // Even -> divided by 2
    // Odd  -> multiplied by 3
    public static void advancedProcess(int[] numbers) {
        System.out.println("Advanced processing:");

        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n + " is even → " + (n / 2));
            } else {
                System.out.println(n + " is odd → " + (n * 3));
            }
        }
    }
}
