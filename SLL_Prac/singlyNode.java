public class singlyNode {

    // Attribute
    int info;
    singlyNode next;

    // Contructor
    public singlyNode(int info, singlyNode next) {
        this.info = info;
        this.next = next;
    }

    public singlyNode(int info) {
        this(info, null);
    }

    // Methods
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public singlyNode getNext() {
        return next;
    }

    public void setNext(singlyNode next) {
        this.next = next;
    }
}
