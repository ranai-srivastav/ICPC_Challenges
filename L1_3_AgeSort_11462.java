package ICPC_Challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=2457
 */
public class L1_3_AgeSort_11462
{
    public static void main(String[] args) throws IOException
    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ranai\\IdeaProjects\\untitled\\src\\input.txt"));
        while (true)
        {
            int max = -1;
            int numElems = Integer.parseInt(br.readLine());
            if (numElems == 0)
                break;
//
            String string = br.readLine();
            int[] elements = new int[100];

            for (int i = 0; i < string.length(); i++)
            {
                int num = nextInt(string, i);
                elements[num - 1]++;
                if (max < num)
                {
                    max = num;
                }
                i += (num + "").length();
            }

            for (int i = 0; i < 99; i++)
            {
                if(i+1 == max)
                {
                    while (elements[i] > 1)
                    {
                        System.out.print(i + 1 + " ");
                        elements[i]--;
                    }
                    System.out.println(i+1);
                }
                else
                {
                    while (elements[i] > 0)
                    {
                        System.out.print(i + 1 + " ");
                        elements[i]--;
                    }
                }
            }
        }
    }

    public static int nextInt(String string, int index)
    {
        if (string.indexOf(" ", index) == -1)
        {
            return Integer.parseInt(string.substring(index).trim());
        }
        return Integer.parseInt(string.substring(index, string.indexOf(" ", index)).trim());
    }
}
