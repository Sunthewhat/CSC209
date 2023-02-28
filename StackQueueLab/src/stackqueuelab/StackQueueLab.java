/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackqueuelab;

/**
 *
 * @author sunthewhat
 */
public class StackQueueLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(50);
        s1.push(100);
        s1.push(26);
        // System.out.println(s1.topEl());
        s1.push(90);
        System.out.println(s1.topEl());
        s1.reverse();
        System.out.println(s1.topEl());
        // s1.pop();
        // System.out.println(s1.topEl());
        s1.reverse2();
        System.out.println(s1.topEl());
        BigNumber b1 = new BigNumber("123456789");
        BigNumber b2 = new BigNumber("5432109876");
        System.out.println(b1.add(b2));
        CSQueue q1 = new CSQueue(5);
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(60);
        q1.enQueue(2);
        q1.enQueue(70);
        System.out.println(q1.firstEl());
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        System.out.println(q1.firstEl());
        q1.deQueue();
        q1.deQueue();
        System.out.println(q1.firstEl());
    }

}
