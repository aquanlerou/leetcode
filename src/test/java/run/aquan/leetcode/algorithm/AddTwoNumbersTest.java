package run.aquan.leetcode.algorithm;

import org.junit.jupiter.api.Test;
import run.aquan.leetcode.algorithm.base.ListNode;

/**
 * @Class AddTwoNumbersTest
 * @Description TODO
 * @Author Aquang
 * @Version 1.0
 **/
public class AddTwoNumbersTest {

    @Test
    public void Test() {
        ListNode listNode = new ListNode(0);
    }

    @Test
    public void TestOne() {
        Node node= new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node temp = node;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(10);
    }
}

class Node<T> {
    Node next;
    T t;

    Node(T t) {
        this.t = t;
    }
}

