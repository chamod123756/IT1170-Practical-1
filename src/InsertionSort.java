import java.util.Scanner;

public class InsertionSort {
    public static void sortAscending(int[] A){
        for (int j = 1; j < A.length; j++){
            int key = A[j];
            int i = j -1;
            while (i >=0 && A[i] > key){
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }

    }
    public static void sortDescending(int[] A){
        for(int j = 1; j < A.length;j++){
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] < key){
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
    }

    public static void printArray(int[] A){
        System.out.print("[");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i]);
            if (i < A.length - 1)
                System.out.print(" , ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Element: ");
        int elements = input.nextInt();

        int[] arr = new int[elements];
        for (int i = 0; i  < arr.length; i++){
            System.out.print("Elements " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        sortAscending(arr);
        System.out.print("Ascending:  ");
        printArray(arr);

        sortDescending(arr);
        System.out.print("Descending:  ");
        printArray(arr);

    }
}
