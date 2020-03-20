
/*
Leetcode problem: 237
https://leetcode.com/problems/delete-node-in-a-linked-list/
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null){
            return;
        }else{
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
