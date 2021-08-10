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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // dummy head of returning list
        int carry = 0; // initialize carry to 0
        ListNode p = l1, q = l2;
        ListNode current = dummyHead;
        
        while(p != null | q != null){
            int x = (p != null ? p.val : 0);
            int y = (q != null ? q.val : 0);
            int sum = x + y + carry; 
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry == 1) current.next = new ListNode(1);
        return dummyHead.next;
    }
    
}