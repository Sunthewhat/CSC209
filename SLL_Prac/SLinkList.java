public class SLinkList {
    Node head, tail; // Indicator of where it's begin and where its end.

    public SLinkList() {
        head = tail = null; // When created Linklist won't contain any data in it.
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        int len = 0;
        for (Node i = head; i != null; i = i.next) {
            len++;
        }
        return len;
    }

    public String toString() {
        String st = "";
        for (Node i = head; i != null; i = i.next) {
            st += i.info + " ";
        }
        return st;
    }

    public void addToHead(int dat) {
        if (isEmpty()) {
            head = tail = new Node(dat, head);
        } else
            head = new Node(dat, head); // new head next node = old head
    }

    public void addToTail(int dat) {
        if (isEmpty()) {
            head = tail = new Node(dat, head);
        } else {
            tail.next = new Node(dat, null);
            tail = tail.next; // new tail = old tail next node
        }
    }

    public int deleteFromHead() {
        int headInfo = head.info;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }

        return headInfo;
    }

    public int deleteFromTail() {
        int tailInfo = tail.info;

        if (head == tail) {
            head = tail = null;
        } else {
            Node i;
            for (i = head; i.next.next != null; i = i.next)
                ;
            tail = i;
            tail.next = null;
        }

        return tailInfo;
    }

    public int deleteIthNode(int i) {
        if (i == length() - 1) {
            return deleteFromTail();
        }

        else {
            int returnData;
            Node temp;
            int position = 0;
            for (temp = head; position++ != i - 1; temp = temp.next)
                ;
            returnData = temp.next.info;
            temp.next = temp.next.next;
            return returnData;
        }
    }

    public void insertNodeInMiddle(int i, int newValue) {
        if (i == 0) {
            addToHead(newValue);
        } else if (i == length()) {
            addToTail(newValue);
        } else {
            if (i > length()) {
                System.out.println("i exceed LinkedList length.");
                return;
            }
            Node temp;
            int position = 0;
            for (temp = head; position++ != i - 1; temp = temp.next)
                ;
            Node temporalyNode;
            temporalyNode = temp.next;
            temp.next = new Node(newValue, temporalyNode);
        }
    }
}
