/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
        //reverse an linked list
        public ListNode reverse (ListNode head){
            if(head==null || head.next ==null) return head;
            ListNode temp =head;
            ListNode front = head;
            ListNode prev = null;
            while(temp!=null){
                front =temp.next;
                temp.next = prev;
                prev = temp;
                temp = front;

            }
            return prev;
        }
    public boolean isPalindrome(ListNode head){
        if(head==null || head.next ==null) return true;
        // finding the middle element
        ListNode slow =head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        } 
        //reversing the second half of the list
        ListNode newHead = reverse(slow.next);

        ListNode ptr1 = head;
        ListNode ptr2 = newHead;

        while(ptr2!=null){
            if(ptr1.val != ptr2.val){
                reverse(newHead);
                return false;
            }
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }

        reverse(newHead);
        return true;


        

    }
}