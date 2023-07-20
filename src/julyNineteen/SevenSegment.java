package julyNineteen;

public class SevenSegment {
 private char[][] sevenSegment;
 private String power;
 private boolean isValid;


    public void setSevenSegment(String socket) {
        for (int index = 0; index < socket.length(); index++) {
            if (socket.charAt(index) == '0' || socket.charAt(index) == '1'){
                isValid = true;
            }
            else {
                isValid = false;
                break;
            }
        }
        if ((socket.length() == 8) && isValid) {
            sevenSegment = sevenSegment = new char[][]{{' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' '}};
            power = socket;
            if (power.charAt(7) == '1') {
                if (power.charAt(0) == '1') {
                    for (int index = 0; index < sevenSegment[0].length; index++) {
                        sevenSegment[0][index] = '#';
                    }
                } else if (power.charAt(0) == '0') {
                    for (int index = 0; index < sevenSegment[0].length; index++) {
                        sevenSegment[0][index] = ' ';
                    }
                }
                if (power.charAt(1) == '1') {
                    sevenSegment[1][3] = '#';
                } else if (power.charAt(1) == '0') {
                    sevenSegment[1][3] = ' ';
                }

                if (power.charAt(2) == '1') {
                    sevenSegment[3][3] = '#';
                } else if (power.charAt(2) == '0') {
                    sevenSegment[3][3] = ' ';
                }
                if (power.charAt(3) == '1') {
                    for (int index = 0; index < sevenSegment[4].length; index++) {
                        sevenSegment[4][index] = '#';
                    }
                } else if (power.charAt(3) == '0') {
                    for (int index = 0; index < sevenSegment[4].length; index++) {
                        sevenSegment[4][index] = ' ';
                    }
                }
                if (power.charAt(4) == '1') {
                    sevenSegment[3][0] = '#';
                } else if (power.charAt(4) == '0') {
                    sevenSegment[3][0] = ' ';
                }
                if (power.charAt(5) == '1') {
                    sevenSegment[1][0] = '#';
                } else if (power.charAt(5) == '0') {
                    sevenSegment[1][0] = ' ';
                }
                if (power.charAt(6) == '1') {
                    for (int index = 0; index < sevenSegment[2].length; index++) {
                        sevenSegment[2][index] = '#';
                    }
                } else if (power.charAt(6) == '0') {
                    for (int index = 0; index < sevenSegment[2].length; index++) {
                        sevenSegment[2][index] = ' ';
                    }
                }
            }
        }
        else {
            System.out.println("invalid input");
        }
    }


    public String getSevenSegment() {
        if (isValid && power!=null){
            for (int i = 0; i < sevenSegment.length; i++) {
                for (int j = 0; j < sevenSegment[i].length; j++) {
                    System.out.print(sevenSegment[i][j] + " ");
                }
                System.out.println();
            }
        }
        return null;
    }

}
