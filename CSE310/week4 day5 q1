import java.util.Scanner;

public class SubjectMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSubjects = scanner.nextInt();

        double[][] marks = new double[numSubjects][];
        for (int i = 0; i < numSubjects; i++) {
            int numTasks = scanner.nextInt();

            marks[i] = new double[numTasks];
            for (int j = 0; j < numTasks; j++) {
                marks[i][j] = scanner.nextDouble();
            }
        }

        int subjectNum = scanner.nextInt();

        double sum = 0.0;
        int numTasks = marks[subjectNum-1].length;
        for (int i = 0; i < numTasks; i++) {
            sum += marks[subjectNum-1][i];
        }
        double avg = sum / numTasks;

        System.out.println("Average in Subject-" + subjectNum + " is " +avg);
    }
}
