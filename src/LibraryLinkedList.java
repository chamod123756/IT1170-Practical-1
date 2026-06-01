public class LibraryLinkedList {

    private LibraryLink first;

    public LibraryLinkedList() {
        first = null;
    }

    public void insertFirst(int id, String title, int copies) {
        LibraryLink newLink =
                new LibraryLink(id, title, copies);

        newLink.next = first;
        first = newLink;
    }

    public LibraryLink find(int key) {

        LibraryLink current = first;

        while (current != null) {
            if (current.bookID == key)
                return current;
            current = current.next;
        }

        return null;
    }

    public void insertAfter(int key, int id,
                            String title, int copies) {

        LibraryLink current = find(key);

        if (current == null) {
            System.out.println("Book not found");
            return;
        }

        LibraryLink newLink =
                new LibraryLink(id, title, copies);

        newLink.next = current.next;
        current.next = newLink;
    }

    public void deleteFirst() {
        if (first != null)
            first = first.next;
    }

    public void delete(int key) {

        if (first == null) return;

        if (first.bookID == key) {
            first = first.next;
            return;
        }

        LibraryLink current = first;
        LibraryLink prev = null;

        while (current != null &&
                current.bookID != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) return;

        prev.next = current.next;
    }

    public void display() {

        LibraryLink current = first;

        while (current != null) {
            current.displayBook();
            current = current.next;
        }
    }
}