package run.aquan.leetcode.algorithm;

import org.apache.commons.lang3.StringUtils;
import run.aquan.leetcode.algorithm.base.ListNode;

import java.math.BigDecimal;

/**
 * @Class AddTwoNumbers
 * @Description TODO 两数相加
 * @Author Aquan
 * @Date 2019/11/25 10:48
 * @Version 1.0
 **/
public class AddTwoNumbers {

    // TODO: 2019/11/29 解法一：CTO见打法
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigDecimal a = new BigDecimal(convertToString(l1).trim());
        BigDecimal b = new BigDecimal(convertToString(l2).trim());
        BigDecimal c = a.add(b);
        String s = c.toString();
        String nodeString = new String();
        for (int i=s.length()-1; i>=0; i--) {
            char c1 = s.charAt(i);
            nodeString = nodeString + c1;
        }
        char[] arr = nodeString.toCharArray();
        ListNode listNode = new ListNode(Integer.parseInt(String.valueOf(arr[0])));
        ListNode temp = listNode;
        for (int j=1; j<arr.length; j++) {
            ListNode node = new ListNode(Integer.parseInt(String.valueOf(arr[j])));
            listNode.setNext(node);
            listNode = node;
        }
        return temp;
    }

    private static StringBuilder convertTo(ListNode listNode) {
        StringBuilder stringBuilder = new StringBuilder();
        while (listNode.getNext() != null || !StringUtils.isEmpty(String.valueOf(listNode.getVal()))) {
            stringBuilder.insert(0, listNode.getVal());
            listNode = listNode.getNext();
            if (listNode == null) break;
        }
        return stringBuilder;
    }

    private static String convertToString(ListNode listNode) {
        String s = new String();
        while (listNode.getNext() != null || (String.valueOf(listNode.getVal()) != null && !"".equals(String.valueOf(listNode.getVal()).trim())) ) {
            s = listNode.getVal() + s;
            listNode = listNode.getNext();
            if (listNode == null) break;
        }
        return s;
    }

    // TODO: 2019/12/2 解法二
    public static ListNode addTwoNumbersTwo(ListNode l1, ListNode l2) {
        ListNode temp = null;
        ListNode a = l1;
        ListNode b = l2;
        Integer carry = 0;// 用于计算进位标记
        while (a!=null || b!=null) {
            Integer val = (a==null ? 0:a.getVal()) + (b==null ? 0:b.getVal()) + carry;
            carry = val>=10 ? 1:0;
            val = val % 10;
            temp = (a==null ? b:a);
            temp.setVal(val);
            a = (a==null ? null:a.getNext());
            b = (b==null ? null:b.getNext());
            temp.setNext(a==null ? b:a);
        }
        if (carry > 0) {
            temp.setNext(new ListNode(1));
        }
        return l1;
    }



}
