/*
    Given an array of size n, find the majority element. The majority element is the element that appears more 
    than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.

    Example 1:
    Input: [3,2,3]
    Output: 3

    Example 2:
    Input: [2,2,1,1,1,2,2]
    Output: 2
*/

import java.util.HashMap;

class MajorityElem 
{
    public int majorityElement(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int res = 0;

        for(int j: map.keySet())
        {
            int val = map.get(j);
            if(max < val)
            {
                max = Math.max(val, max);
                res = j;
            }
        }

        return res;
    }
}