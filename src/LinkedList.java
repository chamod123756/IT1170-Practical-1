public class LinkedList {

    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, int marks) {
        Link newLink = new Link(id, marks);
        newLink.next = first;
        first = newLink;
    }

    public Link find(int key) {
        Link current = first;

        while (current != null) {
            if (current.id == key)
                return current;
            current = current.next;
        }

        return null;
    }

    public void insertAfter(int key, int id, int marks) {
        Link current = find(key);

        if (current == null) {
            System.out.println("Key not found");
            return;
        }

        Link newLink = new Link(id, marks);
        newLink.next = current.next;
        current.next = newLink;
    }

    public void deleteFirst() {
        if (isEmpty()) return;
        first = first.next;
    }

    public void delete(int key) {

        if (isEmpty()) return;

        if (first.id == key) {
            first = first.next;
            return;
        }

        Link current = first;
        Link prev = null;

        while (current != null && current.id != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) return;

        prev.next = current.next;
    }

    public void displayList() {

        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}