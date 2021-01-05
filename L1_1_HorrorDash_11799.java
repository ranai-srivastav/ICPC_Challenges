package ICPC_Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ranais
 * Link = https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=2899
 */
public class L1_1_HorrorDash_11799
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTestCases = Integer.parseInt(br.readLine());
        int[] answers  = new int[numTestCases];
        for (int i = 0; i < numTestCases; i++)
        {
            String[] line = br.readLine().split(" ");
            int max = Integer.parseInt(line[1]);
            for (int j = 2; j < line.length; j++)
            {
                int currNum = Integer.parseInt(line[j]);
                if(currNum > max)
                    max = currNum;
            }
            answers[i] = max;
        }

        for (int i = 0; i < numTestCases; i++)
        {
            System.out.printf("Case %d: %d\n",i+1, answers[i]);
        }
    }
}
