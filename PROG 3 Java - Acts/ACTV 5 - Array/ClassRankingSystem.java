/*
ACT 5-4 :: Class Ranking System
@Author: Carl Didal
*/
import java.util.Arrays;

public class ClassRankingSystem {
    public static class Student {
        private String name;
        private int[] quizzes;
        private double average;
        private int rank;

        public Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
            this.average = calculateAverage();
        }

        private double calculateAverage() {
            if (quizzes == null || quizzes.length == 0) return 0.0;
            int sum = 0;
            for (int score : quizzes) {
                sum += score;
            }
            return (double) sum / quizzes.length;
        }

        // Getters
        public String getName() { return name; }
        public int[] getQuizzes() { return quizzes; }
        public double getAverage() { return average; }
        public int getRank() { return rank; }
        public void setRank(int rank) { this.rank = rank; }
    }

    public static void main(String[] args) {
        String[][] rawData = {
            {"Alice", "85", "90", "92", "88"},
            {"Bob", "78", "82", "80", "84"},
            {"Charlie", "95", "92", "96", "94"},
            {"Diana", "85", "90", "92", "88"},
            {"Ethan", "70", "75", "72", "78"}
        };

        Student[] students = new Student[rawData.length];
        for (int i = 0; i < rawData.length; i++) {
            String name = rawData[i][0];
            int[] quizzes = new int[rawData[i].length - 1];
            for (int j = 1; j < rawData[i].length; j++) {
                quizzes[j - 1] = Integer.parseInt(rawData[i][j]);
            }
            students[i] = new Student(name, quizzes);
        }

        customSort(students);

        assignRanks(students);

        printLeaderboard(students);

        String searchTarget = "Diana";
        int foundRank = customLinearSearch(students, searchTarget);
        if (foundRank != -1) {
            System.out.println("\nSearch Result: " + searchTarget + " is ranked #" + foundRank + ".");
        } else {
            System.out.println("\nSearch Result: " + searchTarget + " was not found in the leaderboard.");
        }
    }

    public static void customSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the adjacent student has a lower average
                if (students[j].getAverage() < students[j + 1].getAverage()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void assignRanks(Student[] students) {
        if (students.length == 0) return;

        students[0].setRank(1);
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() == students[i - 1].getAverage()) {
                students[i].setRank(students[i - 1].getRank());
            } else {
                students[i].setRank(i + 1);
            }
        }
    }

    public static int customLinearSearch(Student[] students, String targetName) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(targetName)) {
                return student.getRank();
            }
        }
        return -1;
    }
    
    public static void printLeaderboard(Student[] students) {
        System.out.println("==================================================================");
        System.out.printf("%-6s | %-12s | %-20s | %-8s%n", "Rank", "Name", "Quiz Scores", "Average");
        System.out.println("------------------------------------------------------------------");
        for (Student s : students) {
            StringBuilder scoresStr = new StringBuilder("[");
            int[] q = s.getQuizzes();
            for (int k = 0; k < q.length; k++) {
                scoresStr.append(q[k]);
                if (k < q.length - 1) scoresStr.append(", ");
            }
            scoresStr.append("]");

            System.out.printf("%-6d | %-12s | %-20s | %-8.2f%n", 
                s.getRank(), s.getName(), scoresStr.toString(), s.getAverage());
        }
        System.out.println("==================================================================");
    }
}
