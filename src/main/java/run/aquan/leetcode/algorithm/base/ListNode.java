package run.aquan.leetcode.algorithm.base;

import lombok.Builder;

/**
 * @Class ListNode
 * @Description TODO add-two-numbers BASE > Definition for singly-linked list.
 * @Author Aquan
 * @Date 2019/11/25 10:45
 * @Version 1.0
 **/
@Builder
public class ListNode {

    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

}
