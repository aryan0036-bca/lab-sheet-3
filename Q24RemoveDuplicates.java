import java.util.Scanner;
import java.util.Arrays;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] a = new int[n];
        int[] result = new int[n];
        int size = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < size; j++) {
                if (result[j] == a[i]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result[size] = a[i];
                size++;
            }
        }

        System.out.println("Array without duplicates:");
        System.out.println(Arrays.toString(
                Arrays.copyOf(result, size)));

        sc.close();
    }
}
