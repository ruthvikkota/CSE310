import java.util.*;
public class Solution {
     static void prime(int n) {
        int flag=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            flag=1;
            break;   
        }
            if(flag==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    static void fact(int p) {
        int i,f=1;
        for(i=1;i<=p;i++){
            f=f*i;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int choice=sc.nextInt();
        switch(choice)
      {
        case 1:
          if(a%2==0)
          {
              System.out.println("YES");
          }
          else
          {
              System.out.println("NO");
          }
          break;
          
        case 2:
          if(a%2!=0)
          {
              System.out.println("YES");
          }
          else
          {
              System.out.println("NO");
          }
          break;
        case 3:
          prime(a);
          break;
        case 4:
          fact(a);
          break;
        
        }
              
        
    }
}
