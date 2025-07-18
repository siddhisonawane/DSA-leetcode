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
    public static ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    } 
    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }   
        ListNode mid=findMid(head);

        ListNode prev=null;
        ListNode curr=mid;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode right=prev;
        ListNode left=head;

        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
}