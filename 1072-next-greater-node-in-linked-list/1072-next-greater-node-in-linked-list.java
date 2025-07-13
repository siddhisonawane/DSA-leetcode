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
import java.util.*;
class Solution {
    public static int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        int result[]=new int[values.size()];
        Stack<Integer>s=new Stack<>();

        for(int i=values.size()-1;i>=0;i--){
            while(!s.isEmpty() && values.get(s.peek())<=values.get(i)){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]=0;
            }
            else{
                result[i]=values.get(s.peek());
            }
            s.push(i);
        }
        return result;
    }
}