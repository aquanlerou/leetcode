package run.aquan.leetcode.algorithm;

import org.springframework.util.StringUtils;
import run.aquan.leetcode.algorithm.base.ListNode;

/**
 * @Class AddTwoNumbers
 * @Description TODO 两数相加
 * @Author Aquan
 * @Date 2019/11/25 10:48
 * @Version 1.0
 **/
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = Integer.parseInt(convertTo(l1).toString());
        int b = Integer.parseInt(convertTo(l2).toString());
        System.out.println(a + "+" + b + "=" + (a+b) );
        return null;
    }

    private static StringBuilder convertTo(ListNode listNode) {
        StringBuilder stringBuilder = new StringBuilder();
        while (listNode.getNext() != null || !StringUtils.isEmpty(String.valueOf(listNode.getVal()))) {
            // System.out.println(listNode.getVal());
            stringBuilder.insert(0, listNode.getVal());
            listNode = listNode.getNext();
            if (listNode == null) break;
        }
        return stringBuilder;
    }


}
