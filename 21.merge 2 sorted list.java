/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) {
                    return null;}//if the two singly linked list are all empty
        if(l1==null)  {
            return l2;}
        if(l2==null) {
        return l1;}
        ListNode mergelist=new ListNode(0);//sentinel 0 is useless
        ListNode result=mergelist;
        
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
            result.next=l1;
            l1=l1.next;
        }
            else{
            result.next=l2;
            l2=l2.next;
            }
            result=result.next;
        }
        if(l1==null){
            result.next=l2;
        }
        if(l2==null){
            result.next=l1;
        }
   return mergelist.next; }
}