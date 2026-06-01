public class CircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int count;
    private int maxSize;

    public CircularQueue(int size) {

        maxSize = size;
        queue = new int[maxSize];

        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public void insert(int item) {

        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }

        rear = (rear + 1) % maxSize;
        queue[rear] = item;
        count++;
    }

    public int remove() {

        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int temp = queue[front];
        front = (front + 1) % maxSize;
        count--;

        return temp;
    }

    public int peekFront() {

        if (isEmpty()) {
            return -1;
        }

        return queue[front];
    }

    public int getCount() {
        return count;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < count; i++) {
            System.out.print(
                    queue[(front + i) % maxSize] + " "
            );
        }

        System.out.println();
    }
}