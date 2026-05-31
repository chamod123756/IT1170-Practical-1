
    import java.util.Scanner;

    public class MaximumOfThree {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = input.nextInt();

            System.out.print("Enter second number: ");
            int b = input.nextInt();

            System.out.print("Enter third number: ");
            int c = input.nextInt();

            int max = a;

            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }

            System.out.println("Maximum number is: " + max);

            input.close();
        }
    }









