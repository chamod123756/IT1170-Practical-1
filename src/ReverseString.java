import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] stack = new char[input.length()];
        int top = -1;

        for (int i = 0; i < input.length(); i++) {
            stack[++top] = input.charAt(i);
        }

        System.out.print("Reversed String: ");

        while (top >= 0) {
            System.out.print(stack[top--]);
        }
    }
}