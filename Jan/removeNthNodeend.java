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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int fromFirst=size-n+1;
        ListNode curr=head;

         if (n == size) {
            return head.next;
        }


        int i=1;


        while(i<size-n){
            curr=curr.next;
            i++;
        }
       curr.next=curr.next.next;

        return head;
    }
}