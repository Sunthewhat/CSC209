package stackqueuelab;

public class CSQueue {
    int[] q;
    int fst, lst;

    public CSQueue(int cap) {
        q = new int[cap];
        fst = lst = -1;
    }

    public void enQueue(int el) {
        if (!isFull()) {
            if (lst == q.length - 1) {
                lst = 0;
            } else {
                lst++;
            }
            q[lst] = el;
            if (fst == -1)
                fst++;
        } else
            System.out.println("Queue is full.");
    }

    public int deQueue() {
        int tmp = -1;
        if (!isEmpty()) {
            tmp = q[fst];
            if (fst == lst) {
                fst = lst = -1;
            } else if (fst == q.length - 1)
                fst = 0;
            else
                fst++;
        } else
            System.out.println("Queue is empty.");
        return tmp;
    }

    public int firstEl() {
        if (isEmpty())
            System.out.println("Queue is empty.");
        return isEmpty() ? -1 : q[fst];
    }

    public boolean isEmpty() {
        return fst == -1;
    }

    public boolean isFull() {
        return (fst == 0 && lst == q.length - 1) || (lst == fst - 1);
    }
}
