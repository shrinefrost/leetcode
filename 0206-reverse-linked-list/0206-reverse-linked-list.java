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
    public ListNode reverseList(ListNode head) {
        //base case when linked list is empty
        if(head == null) return null;
        if(head.next==null) return head;
        
        ListNode temp =head;
        int data;
        ListNode reverse = null;
        ListNode newNode=null;

        while(temp!=null){
            newNode = new ListNode(temp.val,reverse);
            reverse =newNode;
            temp = temp.next;
        }
        return newNode;

    }
}