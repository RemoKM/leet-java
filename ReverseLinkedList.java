
/*
leetcode problem : 206
https://leetcode.com/problems/reverse-linked-list/
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;

    }
}
