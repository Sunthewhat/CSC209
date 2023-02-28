/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueuelab;

/**
 *
 * @author sunthewhat
 */
public class Stack {
    private int[] st;
    private int top;

    public Stack(int cap) {
        st = new int[cap];
        top = 0;
    }

    public Stack() {
        this(100);
    }

    public boolean isFull() {
        return top >= st.length;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(int newM) {
        if (isFull()) {
            System.out.println("Stack is full. Can't contain any more data.");
        } else
            st[top++] = newM;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else
            return st[top-- - 1];
    }

    public int topEl() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else
            return st[top - 1];
    }

    public int size() {
        return top;
    }

    public void reverse() {
        int temp[] = new int[st.length];
        for (int i = 0; i < top; i++) {
            temp[i] = st[top - (i + 1)];
        }
        st = temp;
    }

    public void reverse2() {
        int tmp;
        for (int i = 0; i < top / 2; i++) {
            tmp = st[i];
            st[i] = st[top - (i + 1)];
            st[top - (i + 1)] = tmp;
        }
    }
}
