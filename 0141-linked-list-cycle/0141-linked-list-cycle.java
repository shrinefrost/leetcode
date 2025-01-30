/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if(head.next == null) return false;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(temp.next!=null){
            if(fast == slow){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
            temp=temp.next;
        }
        return false;

    }
}