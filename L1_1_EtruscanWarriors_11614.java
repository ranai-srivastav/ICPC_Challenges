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
class Main
{

    public static void main(String[] args) throws IOException
    {
        Main main = new Main();
        main.myCode();
    }

    void myCode() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numCases; i++)
        {
            long numWars = Long.parseLong(br.readLine());
            System.out.println(((Math.sqrt(8 * numWars + 1)-1)*0.5));
        }
    }
}
