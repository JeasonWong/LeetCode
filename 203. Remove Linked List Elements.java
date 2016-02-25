/**
 * Remove all elements from a linked list of integers that have value val.
 * 
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 *
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null) return null;
        
        while(head!=null){
            if(head.val == val){
                head = head.next;
            }else{
                break;
            }
        }
        
        ListNode p = head;
        
        if(p == null) return null;
        
        while(p.next != null){
            if(p.next.val == val){
                ListNode q = p.next;
                p.next = q.next;
            }else{
                p = p.next;
            }
        }
        return head;
        
    }
}