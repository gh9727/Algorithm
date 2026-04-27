import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] studentNumber = new int[30];

        for(int i = 1; i <= 30; i++) {
            studentNumber[i - 1] = i;
        }

        for(int i = 1; i <= 28; i++) {
            // 제출한 학생 번호
            int submitNumber = scan.nextInt();

            // 제출한 학생 명단에서 배열 명단에서 제외
            for(int s = 1; s <= 30; s++) {
                if(studentNumber[s - 1] == submitNumber) {
                    studentNumber[s - 1] = 0;
                    break;
                }
            }
        }

        int[] noSubmitStudents = new int[2];
        int index = 0;
        for(int i = 1; i <= 30; i++) {
            if(studentNumber[i - 1] != 0) {
                noSubmitStudents[index] = studentNumber[i - 1];
                index++;

                if(index >= 2) break;
            }
        }

        noSubmitStudents[0] = Math.min(noSubmitStudents[0], noSubmitStudents[1]);
        noSubmitStudents[1] = Math.max(noSubmitStudents[0], noSubmitStudents[1]);
        for(int i = 0; i < 2; i++) {
            System.out.println(noSubmitStudents[i]);
        }
    }

}
