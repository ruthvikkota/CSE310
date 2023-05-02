import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n % 100 != 0) {
      System.out.println("Invalid Input");
      return;
    }
    int numOf2000Notes = n / 2000;
    n = n % 2000;
    int numOf500Notes = n / 500;
    n = n % 500;
    int numOf200Notes = n / 200;
    n = n % 200;
    int numOf100Notes = n / 100;
      
    if (numOf100Notes > 0) {
      System.out.println(numOf100Notes + " 100 Notes");
    }
    if (numOf200Notes > 0) {
      System.out.println(numOf200Notes + " 200 Notes");
    }
    if (numOf500Notes > 0) {
      System.out.println(numOf500Notes + " 500 Notes");
    }
    if (numOf2000Notes > 0) {
      System.out.println(numOf2000Notes + " 2000 Notes");
    }

  }
}
