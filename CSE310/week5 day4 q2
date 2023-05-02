import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        
        int stringCount = 0, integerCount = 0;
        for (String element : arr) {
            try {
                Integer.parseInt(element);
                integerCount++;
            } catch (NumberFormatException e) {
                stringCount++;
            }
        }
        
        System.out.println(integerCount);
        System.out.println(stringCount);
    }
}
