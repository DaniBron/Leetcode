import java.util.HashSet;
import java.util.Set;

/*
    Write a program to find the node at which the intersection of two singly linked lists begins.

    For example, the following two linked lists:
    Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
    Output: Reference of the node with value = 8
    Input Explanation: The intersected node's value is 8 
*/

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x)
    {
        val = x;
        next = null;
    }
}

public class IntersectionofTwoLinkedLists
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        Set<ListNode> checked = new HashSet<>();

        while(headA != null)
        {
            checked.add(headA);
            headA = headA.next;
        }

        while(headB != null)
        {
            if(checked.contains(headB))
                return headB;
            
            headB = headB.next;
        }

        return null;
    }
}