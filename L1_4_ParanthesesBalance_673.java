package ICPC_Challenges;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//TODO DOES NOT WORK. It works for most test cases except ones where the order of brackets is mismatched ([)].
// Since this was made based on a counter, it has no scope to implement
//POSSIBLE SOLUTION: If the number of counters goes up unevenly. Like one goes up and then the other.
@Deprecated
public class L1_4_ParanthesesBalance_673
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("C:\\Users\\ranai\\IdeaProjects\\untitled\\src\\input.txt"));
//        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();

        //([()[]()])()
        //(
        //(])]][
        //(([[
        //)(]
        //[)[

        for (int i = 0; i < numCases; i++)
        {
            boolean changed = false;
            String c = sc.nextLine();
            if (c.length() == 0)
            {
                System.out.println("Yes");
                continue;
            }

            if (c.length() % 2 != 0 && !c.contains(" "))
            {
                System.out.println("No");
            }

            else
            {
                int counterP = 0;
                int counterS = 0;
                for (int j = 0; j < c.length(); j++)
                {
                    char b = c.charAt(j);
                    if (b == '(' && c.substring(j).contains(")"))
                    {
                        changed = true;
                        counterP++;
                    }
                    if(b == '[' && c.substring(j).contains("]"))
                    {
                        changed = true;
                        counterS++;
                    }
                    if (b == ')')
                    {
                        changed = true;
                        counterP--;
                    }
                    if(b == ']')
                    {
                        changed = true;
                        counterS--;
                    }
                }
                if (counterP == 0 && counterS == 0 && changed)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
