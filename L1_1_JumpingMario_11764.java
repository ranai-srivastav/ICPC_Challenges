package ICPC_Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ranais
 * Link = https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&category=117&page=show_problem&problem=2864
 * pdf = https://onlinejudge.org/external/117/p11764.pdf
 */
class JumpingMario
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTest = Integer.parseInt(br.readLine());
        int[] high = new int[numTest];
        int[] low = new int[numTest];

        for (int i = 0; i < numTest; i++)
        {
            int numWalls = Integer.parseInt(br.readLine());
            String hts = br.readLine();
            String[] wallHts = hts.split(" ");

            for (int j = 0; j < numWalls - 1; j++)
            {
                if (Integer.parseInt(wallHts[j]) > Integer.parseInt(wallHts[j + 1]))
                {
                    low[i]++;
                }
                else if (Integer.parseInt(wallHts[j]) < Integer.parseInt(wallHts[j + 1]))
                {
                    high[i]++;
                }
            }
        }

        for (int i = 0; i < numTest; i++)
        {
            System.out.printf("Case %d: %d %d\n", i+1, high[i], low[i]);
        }


    }
}
