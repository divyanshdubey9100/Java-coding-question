package in.problems.code.commons;

public class LinkedListNode {
    public int val;
    public LinkedListNode next;

    // Constructor for the dummy node or a node with a specific value
    public LinkedListNode(int val) {
        this.val = val;
    }

    // Optional: Constructor for a node with both value and next reference
    LinkedListNode(int val, LinkedListNode next) {
        this.val = val;
        this.next = next;
    }

    // Optional: Helper method to print the list (for verification)
    @Override
    public String toString() {
        if (next == null) return String.valueOf(val);
        return val + " -> " + next.toString();
    }
}
