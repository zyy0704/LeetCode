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
        
        if(head == null){
            return false;
        } else{
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow != null && fast != null){
            if (slow == fast){
            return true;
            }
            
            if(slow.next != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            }else{
                return false;
            }
        
            
        }
        }
        

        return false;
        
    }
}