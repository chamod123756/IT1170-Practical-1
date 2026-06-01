public class LibraryTest {

    public static void main(String[] args) {

        LibraryLinkedList lib =
                new LibraryLinkedList();

        // i. Insert Initial Books
        lib.insertFirst(1, "Java Basics", 5);
        lib.insertFirst(2, "Data Structures", 3);
        lib.insertFirst(3, "Algorithms", 4);

        System.out.println("Initial Books:");
        lib.display();

        // ii. Add after specific book
        lib.insertAfter(2, 4,
                "Database Systems", 6);

        System.out.println("\nAfter Insert:");
        lib.display();

        // iii. Find book
        System.out.println("\nFind Book ID 2:");
        LibraryLink found = lib.find(2);
        if (found != null)
            found.displayBook();

        // iv. Remove a book
        lib.delete(1);
        System.out.println("\nAfter Deleting ID 1:");
        lib.display();

        // v. Delete first book
        lib.deleteFirst();
        System.out.println("\nAfter Deleting First:");
        lib.display();
    }
}