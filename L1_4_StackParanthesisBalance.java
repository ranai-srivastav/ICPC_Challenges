package ICPC_Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Scanner;

public class L1_4_StackParanthesisBalance
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("C:\\Users\\ranai\\IdeaProjects\\untitled\\src\\input.txt"));
//        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCases; i++)
        {
            String c = sc.nextLine();
            System.out.println(isBalanced(c));
        }

    }

    public static String isBalanced(String s)
    {
        if(s.length()==0)
        {
            return "Yes";
        }
        ArrayDeque<Character> list = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='('|| c=='[')
            {
                list.push(c);
                continue;
            }
            else
            {
                if(list.isEmpty())
                    return "No";

                if(c == ')')
                {
                    if(list.pop() != '(')
                        return "No";
                }
                else if(c == ']')
                {
                    if(list.pop() != '[')
                        return "No";
                }
            }
        }

        if(list.isEmpty())
            return "Yes";
        else
            return "No";
    }
}
