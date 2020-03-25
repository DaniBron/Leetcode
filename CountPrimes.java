import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
    Count the number of prime numbers less than a non-negative number, n.

Example:
Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

*/

class CountPrimes {
    public static void main(final String[] args)
    {
        int n = 10;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        int res = 0;

        boolean[] b_primes = new boolean[n];
        for(int i = 0; i < b_primes.length; i++)
            b_primes[i] = true;

        for(int i = 2; i < b_primes.length; i++)
        {
            if(b_primes[i])
            {
                for(int j = i; j*i < b_primes.length; j++)
                {
                    b_primes[j * i] = false;
                }
            }
        }

        for(int i = 2; i < b_primes.length; i++)
        {
            if(b_primes[i])
                res++;
        }

        return res;
    }
}