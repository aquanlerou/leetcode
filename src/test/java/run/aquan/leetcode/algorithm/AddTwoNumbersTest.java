package run.aquan.leetcode.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import run.aquan.leetcode.algorithm.base.ListNode;

/**
 * @Class AddTwoNumbersTest
 * @Description TODO 两数相加测试类
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

        // 解法一
        // ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);
        // 解法二
        ListNode listNode = AddTwoNumbers.addTwoNumbersTwo(l1, l2);
        System.out.println(StringUtils.isNotBlank(String.valueOf(listNode.getVal()).trim()));
        try {
            while (listNode.getNext() != null || !StringUtils.isEmpty(String.valueOf(listNode.getVal()))) {
                System.out.print(listNode.getVal());
                listNode = listNode.getNext();
            }
        } catch (NullPointerException e) {
            log.error(e.getMessage());
        }
        log.warn(listNode.toString());
    }

}