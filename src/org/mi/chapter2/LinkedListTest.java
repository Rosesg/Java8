package org.mi.chapter2;

/**
 * 测试链表类
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(9);
        linkedList.print();
        System.out.println("----------------------------------------");
        linkedList.del(3);
        linkedList.print();
    }
}
