class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null && t2!=null)
        {
            if(t1.val<=t2.val)
            {
                temp.next=t1;
                temp=temp.next;
                t1=t1.next;
            }
            else if(t2.val<=t1.val)
            {
                temp.next=t2;
                temp=temp.next;
                t2=t2.next;
            }
        }
        if(t1!=null)
        {
            temp.next=t1;
        }
         if(t2!=null)
        {
            temp.next=t2;
        }
        return dummy.next;
    }
}