package com.hust.zuoshen.book.lianbiao;

import com.hust.ListNode;

/**
 * @author xuxinyu06
 */
public class question4 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
