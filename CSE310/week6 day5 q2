import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student {
    String name;
    int registrationNo;

    void show() {
        System.out.println(name + "," + registrationNo);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                student.name = scanner.next();
                student.registrationNo = scanner.nextInt();
                while (student.registrationNo <= 0) {
                    student.registrationNo = scanner.nextInt();
                }
                student.show();
                break;
            case 2:
                student.show();
                break;
            default:
                System.out.println("Wrong Choice");
        }
        scanner.close();
    }
}
