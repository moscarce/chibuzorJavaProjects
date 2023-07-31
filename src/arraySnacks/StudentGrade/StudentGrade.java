package arraySnacks.StudentGrade;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        String[][] studentSize = collectStudentSize();
        String[][] grades = grades(studentSize);
        String print = "";
        for (int row = 0; row < grades.length; row++) {
            if (row == 0) print += "=".repeat((grades[0].length) * 10) + "\n";
            for (int column = 0; column < grades[row].length; column++) {
                print += grades[row][column] + "    ";
            }
            print += "\n";
        }
        System.out.println(print);
    }
    public static String[][] collectStudentSize(){
        Scanner input = new Scanner(System.in);
        for (; true; ) {
            System.out.println("How many Student do you have? ");
            String studentSize = input.nextLine();
            System.out.println("How many subject do they offer");
            String gradeSize = input.nextLine();
            if ((gradeSize.matches("\\d+")) && (gradeSize.matches("\\d+"))){
                int noOfStudents = Integer.parseInt(String.valueOf(studentSize));
                int noOfGrades = Integer.parseInt(String.valueOf(gradeSize));
                if (noOfGrades == 0 || noOfStudents == 0){
                    System.out.println("Invalid record");
                    System.exit(1);
                }
                String[][] student = new String[noOfStudents + 1][noOfGrades+4];
                for (int i = 0; i < student.length; i++) {
                    if (i == 0)student[i][0] = "STUDENT";
                    else student[i][0] = "Student " + (i);
                }
                for (int i = 1; i < (student[0].length - 3); i++) {
                    student[0][i] = "SUB" + i;
                }
                student[0][(student[0].length - 3)] = "TOT";
                student[0][(student[0].length - 2)] = "AVE";
                student[0][(student[0].length - 1)] = "POS";
                System.out.print("Saving "+">".repeat(150) +
                        "\nSaved successfully \n");
                return student;
            }
            System.out.println("Invalid student size or grade");
        }
    }

    public static String[][] grades(String[][] studentList){
        Scanner input = new Scanner(System.in);
        int total = 0;
        double average = 0;
        for (int row = 1; row < studentList.length; row++) {
            for (int column = 1; column < studentList[row].length-3; ) {
                System.out.println("Entering score for student " + (row));
                System.out.println("Enter score for subject " + column);
                String score = input.nextLine();
                if (score.matches("^(?:100|[1-9]?[0-9])$")){
                    studentList[row][column] = score;
                    int grade = Integer.parseInt(String.valueOf(score));
                    total += grade;
                    average = (double) total /column;
                    column++;
                    System.out.print("Saving "+">".repeat(150) +
                            "\nSaved successfully \n");
                }else System.out.println("Invalid Score");
            }
            String totalAsString = "" + total;
            String averageAsString = String.format("%.2f",average);
            studentList[row][((studentList[row].length)-3)] = totalAsString;
            studentList[row][((studentList[row].length)-2)] = averageAsString;
            total = 0;
            average = 0;
        }
        return studentList;
    }
    public static void subjectSummary(String[][] grades){
        int highestScoringStudent = Integer.MIN_VALUE;
        int lowestScoringStudent = Integer.MAX_VALUE;
        int totalScore = 0;
        double average = 0;
        int numberOfPasses = 0;
        int numberOfFails = 0;
        String highestStudentNumber = "";
        String lowestStudentNumber = "";
        for (int row = 1; row < grades[row].length - 3; row++) {
            for (int col = 1; col < grades.length; col++) {
               int score = Integer.parseInt(String.valueOf(grades[col][row]));
                lowestStudentNumber = "";
               totalScore += score;
               average = (double) totalScore /col;
               if (score < lowestScoringStudent){
                   lowestScoringStudent = score;
                   lowestStudentNumber += col;
               }
               if (score > highestScoringStudent) highestScoringStudent = score;
               if (score < 50) numberOfFails++;
               else numberOfPasses++;
            }
//            System.out.printf("""
//                    Subject %i
//
//                    """,row );
            highestScoringStudent = Integer.MIN_VALUE;
            lowestScoringStudent = Integer.MAX_VALUE;
            totalScore = 0;
            average = 0;
            numberOfPasses = 0;
            numberOfFails = 0;

        }
    }
}
