import java.util.Scanner;
// import java.util.jar.Attributes.Name;
import java.util.Random;

public class rock_game {

    public static void main(String[] args) {

        while (true) {
            Random computer_choice = new Random();
            int p = computer_choice.nextInt(3);
            System.out.println("0-Rock,1-Paper,2-Seoser");
            System.out.println("Please Enter Your Choice:-");

            Scanner user_choice = new Scanner(System.in);
            int user = user_choice.nextInt();

            if (p == user) {
                System.out.println("The Match Is Draw");

            } else if (user > 2) {
                System.out.println("Please Select A correct Choice\n\n");
            }

            else if (p == 1 && user == 2 || p == 0 && user == 1 || p == 2 && user == 0) {
                System.out.println("You Won The Game  " + "the computer choice=" + p);
                System.out.println("If You Want To Play Continue press y Else n");
                Scanner yorn = new Scanner(System.in);
                String yn = yorn.nextLine();
                if (yn == "y") {
                    continue;

                } else {
                    break;
                }

            }

            else {
                System.out.println("You Lose The Match " + "the computer choice=" + p);
            }

        }

    }

}
