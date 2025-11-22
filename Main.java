public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 4, 7};

        System.out.println("=== Live Demo Addition ===");

        System.out.println("=== Basic Feature ===");
        NumberProcessor.processArray(numbers);

        System.out.println("\n=== Advanced Feature ===");
        NumberProcessor.advancedProcess(numbers);
    }
}
