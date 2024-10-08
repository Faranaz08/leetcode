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
    public int findGcd(int a,int b){
        if(b==0) return a;
        return findGcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode curr=head;
        while(curr.next!=null){
            int max=Math.max(curr.val,curr.next.val);
            int min=Math.min(curr.val,curr.next.val);
            int gcd=findGcd(max,min);
            ListNode gcdNode=new ListNode(gcd);
            gcdNode.next=curr.next;
            curr.next=gcdNode;
            curr=gcdNode.next;
            
        }
        return head;
    }
}