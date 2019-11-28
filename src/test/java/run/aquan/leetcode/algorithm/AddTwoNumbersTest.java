package run.aquan.leetcode.algorithm;

import org.junit.Test;
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
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        l1.setNext(l2);
        l2.setNext(l3);

        // ListNode temp = l1;
        AddTwoNumbers.addTwoNumbers(l1, l1);
    }

}