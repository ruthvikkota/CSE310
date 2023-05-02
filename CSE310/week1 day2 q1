import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i,m=0,flag=0,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
  
        m=n/2;      
        if(n==0||n==1)
        {  
            System.out.println("Not Prime Number");      
        }
        else
        {  
            for(i=2;i<=m;i++)
            {      
                if(n%i==0)
                {      
                    System.out.println("Not Prime Number");      
                    flag=1;      
                    break;      
                }      
            }      
   
            if(flag==0)  
            { 
                System.out.println("Prime Number");
            }  
        }//end of else  
    }
}
