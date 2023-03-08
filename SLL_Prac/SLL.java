public class SLL {
    // Attribute
    singlyNode head;
    singlyNode tail;

    // Constructor
    public SLL() {
        head = null;
        tail = null;
    }

    // Methods
    public boolean isEmpty() {
        return head == null;
    }

    public int lenght() {
        int lenght = 0;
        for (singlyNode i = head; i.next != null; i = i.next) {
            lenght++;
        }
        return lenght;
    }

    public void addToHead(int data) {
        if (isEmpty()) {
            head = tail = new singlyNode(data, null);
        } else {
            head = new singlyNode(data, head);
        }
    }

    public void addToTail(int data) {
        if (isEmpty()) {
            head = tail = new singlyNode(data, null);
        } else {
            tail.next = new singlyNode(data, null);
            tail = tail.next;
        }
    }

    public void addToIthNode(int data, int index) {
        singlyNode temp = new singlyNode(data, null);
        singlyNode i;
        int pos = 0;
        for (i = head; pos != index - 1; i = i.next) {

        }
        singlyNode temp2 = i.next;
        i.next = temp;
        i.next.next = temp2;
    }

    public int deleteFromHead() {
        int data = head.info;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return data;
    }

    public int deleteFromTail() {
        int data = tail.info;
        if (head == tail) {
            tail = head = null;
        } else {
            singlyNode temp;
            for (temp = head; temp.next.next != null; temp = temp.next) {

            }
            temp.next = null;
            tail = temp;
        }
        return data;
    }

    public int deleteFromIthNode(int index) {
        singlyNode temp;
        int pos = 0;
        for (temp = head; pos != index - 1; temp = temp.next) {
            pos++;
        }
        int data = temp.next.info;
        temp.next = temp.next.next;
        return data;
    }

    // public String toString() {
    // String res = "";

    // }

    public void prntAllNode() {
        singlyNode temp;
        for (temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.info + " ");
        }
    }
}
