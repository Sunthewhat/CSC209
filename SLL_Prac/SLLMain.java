public class SLLMain {
    public static void main(String[] args) {
        SLinkList ll1 = new SLinkList();
        System.out.println(ll1.isEmpty());
        ll1.addToHead(10);
        ll1.addToHead(40);
        System.out.println(ll1);
        ll1.addToTail(43);
        ll1.addToHead(23);
        System.out.println(ll1);
        System.out.println(ll1.length());
        ll1.insertNodeInMiddle(3, 24);
        System.out.println(ll1);
    }
}