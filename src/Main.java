import java.util.Scanner;

//code arrangement shift+alt+f
public class Main {
    public static void main(String[] args){
        int pin = 1234;
        int balance = 100000;
        int addamount = 0;
        int takeamount = 0;
        String name;
        //create object for getting input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your pin number");
        int password = scanner.nextInt();

        if(password == pin){
            System.out.println("Enter your name");
            name  = scanner.next();
            System.out.println("Welcome " + name);
            while (true) {
                System.out.println("Press 1 to Check your balance");
                System.out.println("Press 2 for how much amount you add");
                System.out.println("Press 3 for how much amount you want");
                System.out.println("Press 4 for take recipte");


                int opt = scanner.nextInt();
                switch(opt){
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("Please add your amount");
                        addamount = scanner.nextInt();
                        balance = addamount + balance;
                        System.out.println("Your current balance is " + balance);
                        break;
                    case 3:
                        System.out.println("Please enter how much amount you want");
                        takeamount = scanner.nextInt();
                        if(balance<takeamount){
                            System.out.println("Sorry, Your balance is insufficient");
                            System.out.println("Check and try less than your available balance");
                        }
                        else {
                            System.out.println("Please take your amount " + takeamount);
                            balance = balance - takeamount;
                            System.out.println("Your current balance is " + balance);
                        }
                        break;
                    case 4:
                        System.out.println("Your account name is " + name);
                        System.out.println("Your deposited money is " + takeamount);
                        System.out.println("Your current balance is " + balance);
                        System.out.println("Thank you, Have a Great day");
                        break;
                    default:
                        System.out.println("Please enter number below 5 for access banking system and for stopping system enter number 5");
                        break;
                    }
                if(opt == 5){
                    System.out.println("Thank you");
                    break;
                }

            }
        }
        else {
            System.out.println("Sorry sir, Please enter correct pin number");
            System.out.println("Thank you, Have a Great day");
        }
    }
}