public class QueueArray {

    private int[] queue;
    private int front;
    private int rear;
    private int count;
    private int maxSize;

    public QueueArray(int size) {
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
            System.out.println("Queue is Full");
            return;
        }

        rear++;
        queue[rear] = item;
        count++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int temp = queue[front];
        front++;
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
}