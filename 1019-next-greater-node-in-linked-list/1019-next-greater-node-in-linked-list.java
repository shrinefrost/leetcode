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
    public int[] nextLargerNodes(ListNode head) {

        if(head.next==null) { 
            int[] arr={0};
            return arr;
        }
        ArrayList<Integer> result = new ArrayList<>();

        ListNode temp = head;
        ListNode flag = head;
        int count =0;
        while(temp!=null){
            flag = temp.next;
            count =0;
            while(flag!=null){
                if(temp.val <flag.val){
                    result.add(flag.val);
                    count=1;
                    break;
                }
                flag= flag.next;   
            }
            if(count==0) result.add(0);
            temp=temp.next;
        }
        int[] array = result.stream().mapToInt(i -> i).toArray();
        return array;
    }
}