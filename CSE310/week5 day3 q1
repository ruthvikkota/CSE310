import java.io.*;
import java.util.*;

class student
{
    String name;
    int regno;
    student()
    {
        name="null";
        regno=0;
    }
    student(String name, int regno)
    {
        this.name=name;
        this.regno=regno;
    }
    void display()
    {
        System.out.println(this.name+','+this.regno);
        
    }
}
public class Solution {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String nam;
        int reg;
        student s=new student();
        if(n==1)
        {
            nam=input.next();
            
            reg=input.nextInt();
            s=new student(nam,reg);
            System.out.println(s.name+','+s.regno);
        }
        else if(n==2)
        {
            s.display();
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }
}
