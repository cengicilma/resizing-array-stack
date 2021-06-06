package resizing.array.stack;

public class Stack<Item> {
    private Item [] s = (Item[]) new Object[1];

    private int top = 0;
    private int length = 0;

    //Push an item onto the stack
    public void push(Item item) {
        if(s.length == length) {
            resize(2 * s.length);
        }

        s[length++] = item;
        top = (top + 1) % s.length;
    }

    //Check if stack is empty
    public boolean isEmpty() {
        return length == 0;
    }

    //Remove the top item from the stack, and return its data
    public Item pop() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("The stack is empty.");
        }
        Item item = s[top - 1];
        s[top - 1] = null;
        length--;
        top = (top - 1) % s.length;

        if(length > 0 && length == s.length / 4) {
            resize(s.length / 2);
        }
        return item;
    }

    //Return the current size of the stack
    public int size() {
        return length;
    }


    // Create a new internal array with a given capacity
    @SuppressWarnings("unchecked")
    public void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < length; i++) {
            copy[i] = s[(i)];
        }
        top = length;
        s = copy;
    }
}
