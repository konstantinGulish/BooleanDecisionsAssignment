import java.util.Scanner;
public class BooleanDecisionsAssignment {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your test score: ");
        int score = scan.nextInt();
        char grade = 'F';//I'm not hopeful

        if (score > 89)
            grade = 'A';
        else if (score > 79)
            grade = 'B';
        else if (score > 69)
            grade = 'C';
        else if (score > 59)
            grade = 'D';
        else
        grade = 'F';

        System.out.print(grade);
        if (score % 10 >= 0 && score % 10 <= 2) {
            System.out.print("-");
        }
        else if (score % 10 <= 9 && score % 10 >= 7) {
            System.out.print("+");
        }
        System.out.println();
        if (score > 69)
        System.out.println("Very good! You don't have to retake the exam!");
        else
        System.out.println("Did you even look at the book?");
    }
}
