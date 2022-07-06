class Solution  
{ 
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)  
    { 
        ListNode l1=list1; 
        ListNode l2=list2; 
        ListNode l3=null; 
        ListNode current=null; 
        while (l1!=null && l2!=null) 
        { 
            if (l1.val<=l2.val) 
            { 
                if (l3==null) 
                { 
                    l3=l1; 
                    current=l1; 
                } 
                else 
                { 
                    current.next=l1; 
                    current=current.next; 
                } 
                l1=l1.next; 
            } 
            else 
            { 
                if (l3==null) 
                { 
                    l3=l2; 
                    current=l2; 
                } 
                else 
                { 
                    current.next=l2; 
                    current=current.next; 
                } 
                l2=l2.next; 
            }             
        } 
         
        while (l1!=null) 
        { 
            if (l3==null) 
            { 
                l3=l1; 
                current=l1; 
            } 
            else 
            { 
                current.next=l1; 
                current=current.next; 
            } 
            l1=l1.next; 
        } 
        while (l2!=null) 
        { 
            if (l3==null) 
            { 
                l3=l2; 
                current=l2; 
            } 
            else 
            { 
                current.next=l2; 
                current=current.next; 
            } 
            l2=l2.next; 
        } 
        return l3; 
    } 
}