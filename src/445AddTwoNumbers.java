/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();        
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        Stack<Integer> s2 = new Stack<Integer>();
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        ListNode head = null;
        int carry = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            
            if(!s1.isEmpty()) {
                carry += s1.pop();    
            }

            if(!s2.isEmpty()) {
                carry += s2.pop();                    
            }
            
            ListNode newNode = new ListNode(carry % 10); // second digit
            newNode.next = head;
            head = newNode;
            carry /= 10;            
        }

        return head;

    }
}
