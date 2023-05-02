import java.io.*;
import java.util.*;

class Employee {
    int id,age;
    Employee(int id,int age)
    {
        this.id = id;
        this.age = age;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1 || n>10)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        Employee empArr[] = new Employee[n];
        for(int i = 0;i<n;i++)
        {
            int id = sc.nextInt();
            int age = sc.nextInt();
            if(id<10 || id>1000 || age<18 || age>50)
            {
                System.out.println("Invalid data");
                System.exit(0);
            }
            else
                empArr[i] = new Employee(id,age);
        }
        int mini = 0;
        for(int i = 0;i<n;i++)
        {
            if(empArr[i].age<empArr[mini].age)
                mini = i;
        }
        if(empArr[mini].age<30)
            System.out.println(empArr[mini].id+" "+empArr[mini].age);
        
    }
}
