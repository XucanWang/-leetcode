/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }

 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode flag=head;
        ListNode iterator=head;
        int Num=1;
        while(flag.next!=null)
        {flag=flag.next;
        Num++;
        }
        if(n==Num)  {head=head.next; return head;}
        else{
        for(int i=0;i<Num-n-1;i++)
        {iterator=iterator.next;}
        iterator.next=iterator.next.next;
        return head;
        }
    }
}
/*this is not the best solution since it go through the array for more than once!