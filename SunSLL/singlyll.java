public class singlyll {
    // Attributes
    SinglyNode head, tail;

    // Constructor
    public singlyll() {
        head = null;
        tail = null;
    }

    // Methods
    /*
     * ==
     * >
     * <
     */
    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        int length = 0;
        for (SinglyNode i = head; i.next != null; i = i.next, length++)
            ;
        return length;
    }

    public void addToHead(int Data) {
        if (isEmpty()) {
            head = new SinglyNode(Data, null);
            tail = head;
        }

        else {
            SinglyNode temp = new SinglyNode(Data, head);
            head = temp;
        }
    }

    public void addToTail(int Data) {
        if (isEmpty()) {
            head = new SinglyNode(Data, null);
            tail = head;
        }

        else {
            tail.next = new SinglyNode(Data, null);
            tail = tail.next;
        }
    }

    public void addToIthNode(int Data, int index) {
        SinglyNode temp = new SinglyNode(Data, null);
        SinglyNode i;
        int pos = 0;
        for (i = head; pos++ != index - 1; i = i.next) {

        }
        SinglyNode temp2 = i.next;
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
        if (tail == head) {
            head = tail = null;
        } else {
            SinglyNode temp;
            for (temp = head; temp.next.next != null; temp = temp.next)
                ;
            temp.next = null;
            tail = temp;
        }
        return data;
    }

    public int delete(int index) {
        SinglyNode temp;
        int pos = 0;
        for (temp = head; pos++ != index - 1; temp = temp.next)
            ;
        int data = temp.next.info;
        temp.next = temp.next.next;
        return data;
    }

    public String toString() {
        String res = "";
        for (SinglyNode i = head; i != null; i = i.next) {
            res += i.info + " ";
        }
        return res;
    }
}
