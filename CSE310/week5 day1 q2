import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 5 || n > 15) {
            System.out.println("Invalid");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int choice = sc.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid");
            return;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int[] sortedArr = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            sortedArr[idx++] = num;
        }
        Arrays.sort(sortedArr);
        if (choice == 2) {
            for (int i = sortedArr.length - 1; i >= 0; i--) {
                System.out.print(sortedArr[i] + " ");
            }
        } else {
            for (int i = 0; i < sortedArr.length; i++) {
                System.out.print(sortedArr[i] + " ");
            }
        }
    }
}
