public class QueueTest {

    public static void main(String[] args) {

        QueueArray queue = new QueueArray(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);

        System.out.println("Front: " + queue.peekFront());
        System.out.println("Removed: " + queue.remove());
        System.out.println("Front After Remove: " + queue.peekFront());
        System.out.println("Count: " + queue.getCount());
    }
}