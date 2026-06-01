public class Node {

    int empNo;
    String name;

    Node left;
    Node right;

    public Node(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void displayNode() {
        System.out.println(
                "Emp No: " + empNo +
                        ", Name: " + name);
    }
}