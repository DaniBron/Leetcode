/*
Given a singly linked list, determine if it is a palindrome.

Example 1:
Input: 1->2
Output: false

Example 2:
Input: 1->2->2->1
Output: true
*/

import java.util.HashMap;

class ListNode
{
    int val;
    ListNode next;

    public ListNode(int x)
    {
        val = x;
        next = null;
    }
}

class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;

        HashMap<Integer, Integer> map = new HashMap<>();  
        int index = 0;  
        int q = 0;        
        //1->2->2->1
        while(head != null)
        {
            map.put(index, head.val);
            head = head.next;
            index++;
        }

        index--;
        int first = 0;
        int second = 0;
        
        while(q < index)
        {
            first = map.get(q);
            second = map.get(index);
            if(first != second)
                return false;
            q++;
            index--;
        }

        return true;
    }
}