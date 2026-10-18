import java.util.Scanner;
import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Original array: "
                + Arrays.toString(arr1));
        System.out.println("Copied array: "
                + Arrays.toString(arr2));

        sc.close();
    }
}
