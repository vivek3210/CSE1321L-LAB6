import java.util.Scanner;
public class Lab6A {

    public static void main(String[] args) {
        int num1 = 0;
        int largestNum = 0;

        System.out.println("Please enter 10 numbers and this program will display the largest.\n");
        Scanner input = new Scanner(System.in);
        for (int timesRun = 1; timesRun <= 10; timesRun++) {
            System.out.print("Please enter number " + timesRun + ": ");
            num1 = input.nextInt();

            if (largestNum < num1)
            {
                largestNum = num1;
            }

        }
        System.out.println("\nThe largest number was " + largestNum);

    }

}



    


