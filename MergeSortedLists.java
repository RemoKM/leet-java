/*
https://leetcode.com/problems/merge-two-sorted-lists/submissions/
21
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1 == null && l2 == null){
            return null;
        }
        ListNode h1 = null;
        ListNode h2 = null;
        ListNode prev = l1;
        boolean ret = false;
        if(l1.val <= l2.val){
            h1 = l1;
            prev = l1;
            h2 = l2;
            ret = true;
        }else{
            h1 = l2;
            prev = l2;
            h2 = l1;
        }

        while(h1 != null && h2 != null){
            if(h1.val <= h2.val){
                prev = h1;
                h1 = h1.next;


            }else{
                ListNode temp = prev.next;
                prev.next = h2;
                prev = h2;
                h2 = h2.next;
                prev.next = temp;


            }
        }
        if(h2 != null){
            prev.next = h2;
        }
        if(ret){
            return l1;
        }
        return l2;

    }
}
