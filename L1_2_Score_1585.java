package ICPC_Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author ranais
 * Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=4460
 */
public class L1_2_Score_1585
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numTests = Integer.parseInt(br.readLine());
        ArrayList<Integer> answers = new ArrayList<>();
        for(int i = 0; i<numTests; i++)
        {
            String line = br.readLine();
            int counter = 1, sum = 0;
            int index = 0;

            while(index < line.length())
            {
                if(line.charAt(index) == 'O')
                {
                    sum += counter;
                    counter += 1;
                }
                else
                {
                    counter = 1;
                }
                index++;
            }

            answers.add(sum);
        }

        for(int i : answers)
        {
            System.out.println(i);
        }
    }
}
