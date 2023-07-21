package MBTI;

import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String[][] questions = {
                {"A. Expend energy, enjoy groups", "B. Conserve energy, one-on-one"},
                {"A. Interpret literally", "B. Look for meaning and possibilities"},
                {"A. Logical, thinking, questioning.", "B. Empathetic, feeling, accommodating"},
                {"A. Organized, orderly.", "B. Flexible, adaptable"},
                {"A. More outgoing, think out loud.", "B. More reserved, think to yourself."},
                {"A. Practical, realistic, experiential.", "B. Imagination, innovative, theoretical."},
                {"A. Candid, straight forward, frank.", "B. Tactful, kind, encouraging."},
                {"A. Plan, schedule.", "B. Unplanned, spontaneous"},
                {"A. seek many tasks, public activities, interaction with others", "B. seek private, solitary activities with quiet to concentrate."},
                {"A. standard, usual, conventional. ", "B. different, novel, unique."},
                {"A. firm, tend to criticize, hold the line.", "B. gentle, tend to appreciate, conciliate."},
                {"A.regulated, structured.", "B. easygoing, live  and let live"},
                {"A. external, communicative, express yourself.", "B. internal, reticent, keep to yourself."},
                {"A. focus on here-and-now.", "B. look to the future, global perspective, \"big picture\""},
                {"A. tough minded, just.", "B. tender-hearted, merciful"},
                {"A. preparation, plan ahead.", "B. go with the flow, adapt as you go."},
                {"A. active, initiate.", "B. reflective, deliberate"},
                {"A. facts, things, \"what is\"", "B. ideas, dreams, \"what could be\", philosophical"},
                {"A. matter of fact, issue oriented", "B. sensitive, people-oriented, compassionate"},
                {"A. control, govern", "B. latitude, freedom"}
        };
        String[][] answers = new String[4][5];
        for (int nameTryCount = 0; nameTryCount < 6; nameTryCount++) {
            System.out.println("What is your name: ");
            name = input.nextLine();
            if (name.matches("^[a-zA-Z ]+$")) break;
            else {
                System.out.println("Invalid name (The name contains symbol(s) or number(s))");
            }
            if (nameTryCount == 4) {
                System.exit(1);
            }
        }
        System.out.println(name);
        int scoreE = 0, scoreI = 0, scoreS = 0, scoreN = 0, scoreT = 0, scoreF = 0, scoreJ = 0, scoreP = 0;
        int scoreIorE = 0, scoreSorN = 0, scoreTorF = 0, scoreJorP = 0;

        for (int index = 0; index < questions.length; ) {
            System.out.print("Question " + (index + 1) + " : " + questions[index][0] + "    " + questions[index][1]);
            System.out.println();
            String answer = input.next();
            if ((answer.length() == 1) && ((answer.equalsIgnoreCase("A")) || (answer.equalsIgnoreCase("B")))) {
                switch (index) {
                    case 0, 4, 8, 12, 16 -> {
                        switch (answer) {
                            case "A", "a" -> {
                                answers[0][scoreIorE] = questions[index][0];
                                scoreIorE++;
                                scoreE++;
                            }
                            case "B", "b" -> {
                                answers[0][scoreIorE] = questions[index][1];
                                scoreIorE++;
                                scoreI++;
                            }
                        }
                    }
                    case 1, 5, 9, 13, 17 -> {
                        switch (answer) {
                            case "A", "a" -> {
                                answers[1][scoreSorN] = questions[index][0];
                                scoreSorN++;
                                scoreS++;
                            }
                            case "B", "b" -> {
                                answers[1][scoreSorN] = questions[index][1];
                                scoreSorN++;
                                scoreN++;
                            }
                        }
                    }
                    case 2, 6, 10, 14, 18 -> {
                        switch (answer) {
                            case "A", "a" -> {
                                answers[2][scoreTorF] = questions[index][0];
                                scoreTorF++;
                                scoreT++;
                            }
                            case "B", "b" -> {
                                answers[2][scoreTorF] = questions[index][1];
                                scoreTorF++;
                                scoreF++;
                            }
                        }
                    }
                    case 3, 7, 11, 15, 19 -> {
                        switch (answer) {
                            case "A", "a" -> {
                                answers[3][scoreJorP] = questions[index][0];
                                scoreJorP++;
                                scoreJ++;
                            }
                            case "B", "b" -> {
                                answers[3][scoreJorP] = questions[index][1];
                                scoreJorP++;
                                scoreP++;
                            }
                        }
                    }
                }
                index++;
            } else {
                System.out.println("Expected A or B as response \n I know this is an error, Please try again");
            }
        }
        System.out.println("Hello " + name + " you selected");
        for (int answerIndex = 0; answerIndex < answers.length; answerIndex++) {
            for (int answerInnerIndex = 0; answerInnerIndex < answers[answerIndex].length; answerInnerIndex++) {
                System.out.println(answers[answerIndex][answerInnerIndex]);
            }
            switch (answerIndex) {
                case 0 -> {
                    System.out.println("Number of A selected: " + scoreE);
                    System.out.println("Number of B selected: " + scoreI);
                }
                case 1 -> {
                    System.out.println("Number of A selected: " + scoreS);
                    System.out.println("Number of B selected: " + scoreN);
                }
                case 2 -> {
                    System.out.println("Number of A selected: " + scoreT);
                    System.out.println("Number of B selected: " + scoreF);
                }
                case 3 -> {
                    System.out.println("Number of A selected: " + scoreJ);
                    System.out.println("Number of B selected: " + scoreP);
                }
            }
        }
        input.close();
    }

}
