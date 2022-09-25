import java.util.Random;
import java.util.Scanner;
public class Lab6B {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand1 = rand.nextInt(1001);
        int num1 = 0;
        int guessNum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 1000: ");
        num1 = input.nextInt();

        while (rand1 != num1)
        {
            rand1 = rand.nextInt(1001);
            System.out.println("My guess was " + rand1);
            guessNum++;
        }
        System.out.println("I guessed the number was " + num1 + " and it only took me " + guessNum + " guesses");

    }
}
