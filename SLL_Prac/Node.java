public class Node {
    int info; // Data
    Node next; // Next node

    public Node(int info, Node next) { // Have .next pointer
        this.info = info;
        this.next = next;
    }

    public Node(int info) { // Don't have .next pointer
        this(info, null);
    }

    // GETTER AND SETTER
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}