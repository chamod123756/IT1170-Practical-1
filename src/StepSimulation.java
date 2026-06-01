import java.util.Scanner;

public class StepSimulation {

    static String arrayToString(int[] A) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < A.length; i++) {
            sb.append(A[i]);
            if (i < A.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    static void insertionSortSteps(int[] A) {
        System.out.println("Initial List: " + arrayToString(A));

        int step = 1;
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
            System.out.println("Step " + step + " : " + arrayToString(A));
            step++;
        }

        System.out.println();
        System.out.println("Sorted List: " + arrayToString(A));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i+1) + " elements: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        insertionSortSteps(arr);


    }
}