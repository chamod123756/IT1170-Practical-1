public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    // Insert node
    public void insert(int empNo, String name) {
        root = insertRec(root, empNo, name);
    }

    private Node insertRec(Node root,
                           int empNo,
                           String name) {

        if (root == null) {
            root = new Node(empNo, name);
            return root;
        }

        if (empNo < root.empNo)
            root.left = insertRec(root.left, empNo, name);
        else
            root.right = insertRec(root.right, empNo, name);

        return root;
    }

    // Inorder
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            root.displayNode();
            inorderRec(root.right);
        }
    }

    // Preorder
    public void preorder() {
        preorderRec(root);
    }

    private void preorderRec(Node root) {
        if (root != null) {
            root.displayNode();
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Postorder
    public void postorder() {
        postorderRec(root);
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            root.displayNode();
        }
    }

    // Find Recursive
    public Node findRecursive(int emp) {
        return findRec(root, emp);
    }

    private Node findRec(Node root, int emp) {

        if (root == null)
            return null;

        if (root.empNo == emp)
            return root;

        if (emp < root.empNo)
            return findRec(root.left, emp);
        else
            return findRec(root.right, emp);
    }

    // Delete all nodes
    public void deleteAll() {
        root = null;
    }

    // Display tree (inorder)
    public void display() {
        inorder();
    }
}