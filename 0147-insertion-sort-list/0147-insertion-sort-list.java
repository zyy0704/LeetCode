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
    public ListNode insertionSortList(ListNode curr) {
        ListNode dummy = new ListNode(0);
        ListNode preInsert, toInsert = new ListNode(0);
        dummy.next = curr;
        
        while(curr != null && curr.next != null){
            if(curr.val <= curr.next.val){
                curr = curr.next;
            }else{
                toInsert = curr.next;
                preInsert = dummy;
                while(preInsert.next.val < toInsert.val){
                    preInsert = preInsert.next;
                }
                
                curr.next = toInsert.next;
                toInsert.next = preInsert.next;
                preInsert.next = toInsert;
                
            }
            
        }
        return dummy.next;
        
    }
}