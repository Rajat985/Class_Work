package OOPS;
import java.util.*;
class Solution 
{
  
    public static int checkPassword (String str, int n) 
    {
        if (n < 4)//At least Four characters
            return 0;
        if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
            return 0;

        int num = 0, cap = 0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt (i) == ' ' || str.charAt (i) == '/')//Must not have space or slash 
                return 0;
            if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')//counting capital letters
                cap++;
            if (str.charAt (i) >= '0' && str.charAt (i) <= '9')//counting numeric digit
                num++;
        }
        if (cap > 0 && num > 0)
            return 1;
        else
            return 0;
    }
 
    public static void main (String[]args) 
    {
    	System.out.print("Enter The Password: ");
        Scanner sc = new Scanner (System.in);
        String str = sc.next ();
        System.out.println (checkPassword (str, str.length ()));
    } 
}
