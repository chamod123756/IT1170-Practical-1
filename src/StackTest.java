public class StackTest {

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        stack.display();
    }
}