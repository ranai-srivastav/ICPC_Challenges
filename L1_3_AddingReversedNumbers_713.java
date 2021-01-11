package ICPC_Challenges;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=654
 */
public class L1_3_AddingReversedNumbers_713
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++)
        {

            BigInteger num1 = reverse(sc.nextBigInteger());
            BigInteger num2 = reverse(sc.nextBigInteger());

            System.out.println(reverse(num1.add(num2)));
        }
    }

    private static BigInteger reverse(BigInteger n)
    {
        BigInteger ans = n.mod(BigInteger.TEN);
        n = n.divide(BigInteger.TEN);

        while(n.compareTo(BigInteger.ONE) >= 0)
        {
            BigInteger lastDigit = n.mod(BigInteger.TEN);
            ans = (ans.multiply(BigInteger.TEN)).add(lastDigit);
            n = n.divide(BigInteger.TEN);
        }
        return ans;
    }
}
