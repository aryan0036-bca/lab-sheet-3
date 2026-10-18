import java.util.Scanner;
import java.util.Arrays;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of rows must be positive.");
            sc.close();
            return;
        }

        int[][] a = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter length of row "
                    + (i + 1) + ": ");
            int length = sc.nextInt();

            if (length < 0) {
                System.out.println("Invalid row length.");
                sc.close();
                return;
            }

            a[i] = new int[length];

            System.out.println("Enter row elements:");
            for (int j = 0; j < length; j++) {
                a[i][j] = sc.nextInt();
            }

            Arrays.sort(a[i]);
        }

        System.out.println("Sorted jagged array:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

        sc.close();
    }
}
