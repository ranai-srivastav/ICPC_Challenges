package ICPC_Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class L2_2_GoogleIsFeelingLucky_12015
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<String>> answers = new ArrayList<>();

        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++)
        {
            ArrayList<String> ans = new ArrayList<>();
            int maxRep = 0;
            for (int j = 0; j < 10; j++)
            {
                String line = br.readLine();
                int rep = Integer.parseInt(line.substring(line.length() - 2).trim());

                if (maxRep == rep)
                {
                    ans.add(line);
                }

                if (maxRep < rep)
                {
                    ans.clear();
                    maxRep = rep;
                    ans.add(line.trim());
                }
            }
            answers.add(ans);
        }

        for (int i = 0; i < answers.size(); i++)
        {
            System.out.printf("Case #%d:\n", i + 1);
            for (String a : answers.get(i))
            {
                System.out.println(a.substring(0, a.length() - 2).trim());
            }
        }
    }
}
