package sll_lab;

/**
 *
 * @author sunthewhat
 */
public class SLL_Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SLLNode node1 = new SLLNode(30);
        System.out.println(node1.info + " " + node1.next);
        SLLNode node2 = new SLLNode(40, node1);
        // node2 -> node1
        System.out.println(node2.info + " ");
        System.out.println(node2.next.info);
        // node2.next = node1 => node2.next.info = node1.info
        // = 30
        // System.out.println(node1.next.info);
        // node1.next.info = null.info => error
        SinglyLinkedList list1 = new SinglyLinkedList();
        System.out.println(list1.head);// null
        list1.addToTail(66);
        // head and tail qill point to node 66
        System.out.println(list1.head.info + " " + list1.tail.info);
        list1.addToTail(79);
        // 66->79
        System.out.println(list1.head.info + " " + list1.head.next.info);
        list1.addToHead(34);
        // 34 ->66 -> 79
        System.out.println(list1.head.info + " " + list1.head.next.next.info);
        list1.addToHead(71);
        // 71 -> 34 -> 66 -> 79
        System.out.println(list1.head.info +
                " 3rd=" + list1.head.next.next.info +
                " 4th=" + list1.head.next.next.next.info);
        list1.deleteFromHead();
        // () 71 ->) 34 -> 66 -> 79
        System.out.println(list1.head.info);
        System.out.println("\tPrint All Nodes");
        list1.printAllNodes();
        list1.addToHead(61);
        list1.addToHead(40);
        list1.addToTail(59);
        list1.addToHead(80);
        System.out.println("\tPrint all node after added");
        list1.printAllNodes();
        list1.deleteFromTail();
        System.out.println("\tPrint all node after deleted tail");
        list1.printAllNodes();

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addToHead(99);
        list2.printAllNodes();
        list2.deleteFromTail();
        list2.printAllNodes();
        System.out.println(list1.length());
        list1.printAllNodes();
        list1.deleteIthNode(3);
        list1.printAllNodes();
        list1.insertNodeInMiddle(4, 15);
        list1.printAllNodes();
    }

}
