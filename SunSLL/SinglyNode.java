/**
 * SinglyNode
 */
public class SinglyNode {

    // Attributes
    int info;
    SinglyNode next;

    // Constructor
    public SinglyNode(int info, SinglyNode next) {
        this.info = info;
        this.next = next;
    }

    // Methods
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }

}