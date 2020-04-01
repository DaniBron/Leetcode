import java.util.ArrayList;
import java.util.List;
/*
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
*/
class PascalsTriangle
{
    public static List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return result;

        List<Integer> first_row = new ArrayList<Integer>();
        first_row.add(1);
        result.add(first_row);

        for(int i = 1; i < numRows; i++)
        {
            List<Integer> pre_row = result.get(i - 1);
            List<Integer> curr = new ArrayList<Integer>();

            pre_row.add(1);

            for(int j =1; j < i; j++)
            {
                curr.add(pre_row.get(j) + pre_row.get(j - 1));
            }

            pre_row.add(1);
            result.add(curr);
        }
        return result;
    }
}