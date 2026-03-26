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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode curr=head;
        int count=1;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }
        ListNode last=curr;
        k=k%count;
        int pos=count-k;
        curr=head;
        for(int i=1;i<pos;i++){
            curr=curr.next;
        }
        last.next=head;
        ListNode next=curr.next;
        curr.next=null;
        return next;
        
    }
}