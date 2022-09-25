import java.util.Scanner;
public class Lab6C {
    public static void main(String[] args) {
        int menu;
        int deposit;
        int withdraw;
        int dollarAmount = 1000;
        String mainMenu = null;

        System.out.println("Welcome!\nYou have $1000 in your account.\n");
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu\n0 - Make a deposit\n1 - Make a withdrawal\n2 - Display account value\n");
            System.out.print("Please make a selection: ");
            menu = input.nextInt();
            switch (menu) {
                case 0:
                    System.out.print("How much would you like to deposit? : ");
                    deposit = input.nextInt();
                    dollarAmount = dollarAmount + deposit;
                    System.out.println("Your current balance is $" + dollarAmount);
                    System.out.print("Would you like to return to the main menu (Y/N)? : ");
                    mainMenu = input.next();
                    if (mainMenu.equals("N"))
                    {
                        System.out.println("Thank you for banking with us!");
                    }
                    break;

                case 1:
                    System.out.print("how much would you like to withdraw? : ");
                    withdraw = input.nextInt();
                    dollarAmount = dollarAmount - withdraw;
                    System.out.println("Your current balance is $" + dollarAmount);
                    System.out.print("Would you like to return to the main menu (Y/N)? : ");
                    mainMenu = input.next();
                    if (mainMenu.equals("N"))
                    {
                        System.out.println("Thank you for banking with us!");
                    }
                    break;

                case 2:
                    System.out.println("Your current balance is $" + dollarAmount);
                    System.out.print("Would you like to return to the main menu (Y/N)? : ");
                    mainMenu = input.next();
                    if (mainMenu.equals("N"))
                    {
                        System.out.println("Thank you for banking with us!");
                    }
                    break;

                default:
                    System.out.println("Invalid entry, please try again.");
                    System.out.print("Would you like to return to the main menu (Y/N)? : ");
                    mainMenu = input.next();
                    if (mainMenu.equals("N"))
                    {
                        System.out.println("Thank you for banking with us!");
                    }
            }


        } while(mainMenu.equals("Y"));
    }
}
