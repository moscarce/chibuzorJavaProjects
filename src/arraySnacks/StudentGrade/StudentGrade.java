package arraySnacks.StudentGrade;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        String[][] studentSize = collectStudentSize();
        String[][] scores = grades(studentSize);
        String[][] grades = position(scores);
        System.out.println("=".repeat(grades[0].length*12));
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%10s", grades[i][j]);
            }
            System.out.println();
            if (i == 0) System.out.println("=".repeat(grades[0].length*12));
        }
        System.out.println("=".repeat(grades[0].length*12));
        System.out.println("=".repeat(grades[0].length*12));
        subjectSummary(grades);
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
    public static String[][] position(String[][] grades){
        Integer[] score = new Integer[grades.length-1];
        for (int i = 1; i < grades.length; i++) {
            score[i-1] = Integer.parseInt(String.valueOf(grades[i][(grades[0].length - 3)] ));
        }
        Arrays.sort(score, Collections.reverseOrder());
        for (int i = 1; i < grades.length; i++) {
            for (int j = 0; j < score.length; j++) {
                int answer = Integer.parseInt(String.valueOf(grades[i][(grades[0].length - 3)] ));
                if(answer == score[j]){
                    grades[i] [(grades[0].length - 1)]= "" + (j+1);
                }

            }
        }
        return grades;
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
        for (int column = 1; column < grades[0].length - 3; column++) {
            for (int row = 1; row < grades.length; row++) {
               int score = Integer.parseInt(String.valueOf(grades[row][column]));
               totalScore += score;
               average = (double) totalScore /row;
               if (score < lowestScoringStudent){
                   lowestScoringStudent = score;
                   lowestStudentNumber = "";
                   lowestStudentNumber += row;
               }
               if (score > highestScoringStudent) {
                   highestScoringStudent = score;
                   highestStudentNumber = "";
                   highestStudentNumber += row;
               }
               if (score < 50) numberOfFails++;
               else numberOfPasses++;
            }
            System.out.printf("""
                    Subject %d
                    Highest scoring student is: Student %s scoring %d
                    lowest scoring student is: Student %s scoring %d
                    Total score is: %d
                    Average score is: %.2f
                    Number of passes: %d
                    Number of fails: %d

                    """,column,highestStudentNumber,highestScoringStudent,lowestStudentNumber,lowestScoringStudent,totalScore,
                    average,numberOfPasses,numberOfFails
            );
            highestScoringStudent = Integer.MIN_VALUE;
            lowestScoringStudent = Integer.MAX_VALUE;
            totalScore = 0;
            average = 0;
            numberOfPasses = 0;
            numberOfFails = 0;

        }
    }
}
