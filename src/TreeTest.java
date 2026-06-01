import java.util.Scanner;

public class TreeTest {

    public static void main(String[] args) {

        Tree tree = new Tree();

        // i. Create tree of 10 nodes
        tree.insert(10, "John");
        tree.insert(5, "Alice");
        tree.insert(15, "Bob");
        tree.insert(3, "David");
        tree.insert(7, "Emma");
        tree.insert(12, "Chris");
        tree.insert(18, "Sophia");
        tree.insert(1, "Mark");
        tree.insert(6, "James");
        tree.insert(8, "Lily");

        // ii. Traversals
        System.out.println("Inorder Traversal:");
        tree.inorder();

        System.out.println("\nPreorder Traversal:");
        tree.preorder();

        System.out.println("\nPostorder Traversal:");
        tree.postorder();

        // iii. Search
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter employee number to search: ");
        int key = sc.nextInt();

        Node found = tree.findRecursive(key);

        if (found != null)
            found.displayNode();
        else
            System.out.println("Employee not found");

        // iv. Delete all nodes
        tree.deleteAll();
        System.out.println("\nAll nodes deleted.");

        // v. Display after deletion
        System.out.println("Tree after deletion:");
        tree.display();
    }
}