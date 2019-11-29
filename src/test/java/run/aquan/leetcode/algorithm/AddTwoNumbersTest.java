package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import run.aquan.leetcode.algorithm.base.ListNode;

/**
 * @Class AddTwoNumbersTest
 * @Description TODO
 * @Author Aquang
 * @Version 1.0
 **/
@Slf4j
public class AddTwoNumbersTest {

    @Test
    public void Test() {
        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(9);
        ListNode l11 = new ListNode(9);

        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l5);
        l5.setNext(l6);
        l6.setNext(l7);
        l7.setNext(l8);
        l8.setNext(l9);
        l9.setNext(l10);
        l10.setNext(l11);

        // ListNode temp = l1;
        ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);
        log.warn(listNode.toString());
    }

}