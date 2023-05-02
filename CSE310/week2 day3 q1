import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input= new Scanner(System.in);
        int choice;
        double c,f;
        choice=input.nextInt();
        switch(choice)
        {
            case 1:f=input.nextDouble();
                   c=((f-32)*5)/9;
                   String sf1=String.format("%.2f",c);  
                   System.out.println(sf1);
                   break;
            case 2:c=input.nextDouble();
                   f=(1.8*c)+32;
                   String sf2=String.format("%.1f",f);
                   System.out.println(sf2);
                   break;
            default:System.out.println("INVALID CHOICE");
        }
    }
}
