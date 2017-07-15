package org.mi.jdkbase.chapter2;

/**
 *  链表
 */
public class LinkedList {
    private Node root;

    // 暴露给外部的添加方法
    public void add(int data) {
        if (root == null) {
            this.root = new Node(data);
        }else {
            this.root.addNode(data);
        }
    }
    // 暴露给外部的打印方法
    public void print() {
        if (root != null) {
            System.out.println(root.getData() + "、");
            this.root.printNode();
        }
    }

    // 暴露给外部的删除方法
    public void del(int data) {
        if (this.root.getData() == data) {
            this.root = this.root.next;
        }else {
            this.root.delNode(data);
        }
    }

    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }

        private int getData() {
            return data;
        }

        // 添加节点
        private void addNode(int data) {
            if (this.next == null) {  // 出口
                this.next = new Node(data);
            }else {
                this.next.addNode(data); // 递归
            }
        }

        // 打印节点
        private void printNode() {
            if (this.next != null) {    // 出口
                System.out.println(this.next.getData() + "、");
                this.next.printNode(); // 递归
            }
        }

        // 删除节点
        private void delNode(int data) {
            if (this.next != null) {
                if (this.next.getData() == data) {
                    this.next = this.next.next;
                }else {
                    this.next.delNode(data);
                }
            }
        }
    }
}
