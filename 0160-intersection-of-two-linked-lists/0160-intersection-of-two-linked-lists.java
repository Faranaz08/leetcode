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
        if(headA==null || headB==null){
            return null;
        }
        ListNode a=headA;
        ListNode b=headB;
        HashSet<ListNode> st=new HashSet<>();
        while(a!=null){
            st.add(a);
            a=a.next;
        }
        while(b!=null){
            if(st.contains(b)){
                return b;
            }
            b=b.next;
        }
        return null;
    }
}