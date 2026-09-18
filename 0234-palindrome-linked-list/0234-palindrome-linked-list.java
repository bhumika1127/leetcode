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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!= null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre=null;
        ListNode cur=slow;
        while(cur !=null){
            ListNode next = cur.next;
            cur.next= pre;
            pre=cur;
            cur=next;
        }

        ListNode cur1=pre;
        ListNode cur2=head;
        while(cur1!=null){
            if(cur1.val!=cur2.val){
                return false;
            }
            cur1=cur1.next;
            cur2=cur2.next;
     }
        
        return true;
    }
}