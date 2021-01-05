package ICPC_Challenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ranais
 * Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1365
 */
public class L1_1_LoveCalculator_10424
{
    static int recursiveSum(int input)
    {
        if (input < 10)
            return input;
        else
        {
            int sum = 0;
            while (input > 0)
            {
                sum += input % 10;
                input = input / 10;
            }
            return recursiveSum(sum);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            if(s.length() == 0)
                break;
            s = s.toUpperCase();
            int sum1 = 0;
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) - 64 > 0 && s.charAt(i) - 64 <= 26)
                    sum1 += s.charAt(i) - 64;
            }
            sum1 = recursiveSum(sum1);

            int sum2 = 0;
            String s2 = sc.nextLine();
            s2 = s2.toUpperCase();
            for (int i = 0; i < s2.length(); i++)
            {
                if (s2.charAt(i) - 64 > 0 && s2.charAt(i) - 64 <= 26)
                    sum2 += s2.charAt(i) - 64;
            }
            sum2 = recursiveSum(sum2);

            list.add((double)Math.min(sum1, sum2)/(double)Math.max(sum1, sum2));
        }

        for (double d : list)
        {
            d = d*100;
            System.out.printf("%.2f %%\n", d);
        }

    }
}
