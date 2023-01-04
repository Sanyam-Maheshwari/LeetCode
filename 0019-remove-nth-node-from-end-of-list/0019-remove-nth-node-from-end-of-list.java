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
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        System.out.println(len);
        temp=head;
        ListNode temphead=temp;
        if(n==len)
        {
            return temphead.next;
        }
        if(n==1)
        {
            if(len==1)
            {
                temphead=null;
                return temphead;
            }
            else
        // if(n==1 )
        {
            while(temp.next!=null && temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
            return temphead;
        }
        }
        for(int i=1;i<len-n;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return temphead;
    //     int i=1;
    //     while(i<len-n)
    //     {
    //         temp=temp.next;
    //         i++;
    //     }
    //     temp.next=temp.next.next;
    // return temphead;
    }
}