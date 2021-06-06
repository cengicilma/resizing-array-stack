package resizing.array.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(2);
        stack.push(8);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(10);
        System.out.println("stack size: " + stack.size());
    }
}
