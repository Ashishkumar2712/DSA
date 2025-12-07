/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if (headA == null || headB == null) return null;
       ListNode y1 = headA;

     while (y1 != null) {
        ListNode y2 = headB;
         while (y2 != null) {
                if (y1 == y2) {   
                    return y1;
     }
                y2 = y2.next;
        }
            y1 = y1.next;
        }

    return null;
    }
}