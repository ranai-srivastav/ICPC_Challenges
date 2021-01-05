package ICPC_Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href = "https://onlinejudge.org/external/116/11614.pdf"> Link to pdf specsheet</a>
 * <a href = "https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2661"> Link to problem</a>
 *
 * @author ranais
 */
class MainOther
{

    public static void main(String[] args) throws IOException
    {
        MainOther main = new MainOther();
        main.myCode();
    }

    void myCode() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(br.readLine());
        int[] answers = new int[numCases];
        for (int i = 0; i < numCases; i++)
        {
            long numWars = Long.parseLong(br.readLine());
            int numRows = 1;
            while (numWars > 0)
            {
                numWars -= numRows;
                if (numWars > numRows)
                    numRows++;
            }
            answers[i] = numRows;

//            int numRows = 1;
//            while (numWars > 0)
//            {
//                numWars -= numRows;
//                if (numWars > numRows)
//                    numRows++;
//            }

        }

        System.out.println();
        for (int i : answers)
        {
            System.out.println(i);
        }
    }
}
