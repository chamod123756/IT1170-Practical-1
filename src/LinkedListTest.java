public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertFirst(1, 80);
        list.insertFirst(2, 70);
        list.insertFirst(3, 90);

        System.out.println("Initial List:");
        list.displayList();

        list.insertAfter(2, 4, 85);

        System.out.println("\nAfter Insert After:");
        list.displayList();

        System.out.println("\nDelete First:");
        list.deleteFirst();
        list.displayList();

        System.out.println("\nDelete ID 2:");
        list.delete(2);
        list.displayList();
    }
}