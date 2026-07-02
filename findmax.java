import java.util.Scanner;

public class findmax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        // Create the array
        int[] numbers = new int[size];

        // Input array elements
        System.out.println("\nEnter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }

        // Assume the first element is the largest
        int max = numbers[0];
        int maxIndex = 0;

        // Search for the largest value and its index
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        // Display the results
        System.out.println("\n=================================");
        System.out.println("      ARRAY SEARCH RESULTS");
        System.out.println("=================================");
        System.out.println("Largest Value : " + max);
        System.out.println("Index Position: " + maxIndex);
        System.out.println("=================================");

        input.close();
    }
}
