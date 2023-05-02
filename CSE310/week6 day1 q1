import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<=10 || n>=50)
        {
            System.out.println("Invalid");
        }
        else
        {
            for(int i=2;i<n;i++) 
            {
                while(n%i==0)
                {
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
      
            if(n>2)
            {
                System.out.println(n);
            }
        }
    }
}
