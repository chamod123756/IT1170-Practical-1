import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps happened, array is sorted
            if (!swapped)
                break;
        }
    }

    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        System.out.println("Enter 8 numbers:");

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}