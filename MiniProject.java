import java.util.Scanner;

/**
 * MiniProject
 */
public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int randomNo = (int)(Math.random()*100);
        
        do {
            System.out.println("Enter a number");
            number = sc.nextInt();

            if (number == randomNo) {
                System.out.println("WOHOO THAT'S CORRECT ANSWER !!");
                break;
            } else if (number > randomNo) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        } while (number >= 0);
    }
}