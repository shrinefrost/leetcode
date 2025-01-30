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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next == null) return null;
        HashMap<ListNode,Integer> hash = new HashMap<>();
        ListNode temp = head;

        while(temp.next!=null){
            hash.merge(temp,1,Integer::sum);
            if(hash.get(temp)==2){
                return temp;
            }
            temp=temp.next;
        }
        return null;
        
    }
}