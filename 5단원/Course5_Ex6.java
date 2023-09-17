import java.util.Scanner;

public class Course5_Ex6 {
    public static void YorN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your YES/NO question : ");
        String question = scanner.nextLine().trim().toLowerCase();

        String answer = "";


        if (question.matches("^[aeiouAEIOU].*")) { //모음 시작 확인
            answer += "MAYBE ";
        }


        char lastLetter = question.charAt(question.length() - 1);
        switch (lastLetter) {
            case 'a':
            case 'i':
            case 'u':
                answer += "YES";
                break;
            case 'e':
            case 'o':
                answer += "NO";
                break;
            default:
                answer += "DON'T KNOW";
        }

        System.out.println("Answer: " + answer);
    }

    public static void main(String[] args) {
        YorN();
    }
}






