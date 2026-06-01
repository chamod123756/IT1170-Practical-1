import java.util.Scanner;

public class CircularQueueTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

        CircularQueue queue =
                new CircularQueue(size);

        System.out.println(
                "Insert " + size + " values:");

        for (int i = 0; i < size; i++) {
            queue.insert(sc.nextInt());
        }

        queue.display();

        System.out.println(
                "Removed: " + queue.remove());

        System.out.println(
                "Removed: " + queue.remove());

        queue.display();

        System.out.print(
                "Enter two new values: ");

        queue.insert(sc.nextInt());
        queue.insert(sc.nextInt());

        queue.display();
    }
}