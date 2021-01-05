package ICPC_Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author ranais
 * Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=2307
 */
public class L1_1_SummingDigits_11332
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> answers = new ArrayList<>();
        while(true)
        {
            int input = Integer.parseInt(br.readLine());
            if(input == 0)
                break;
            else
                answers.add(recursiveSum(input));
        }

        for(int i: answers)
            System.out.println(i);
    }

    static int recursiveSum(int input)
    {
        if(input<10)
            return input;
        else
        {
            int sum = 0;
            while (input > 0)
            {
                sum += input % 10;
                input = input/10;
            }
            return recursiveSum(sum);
        }
    }
}
