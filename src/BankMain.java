import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        //create our object -> real bank account
        //className referenceVariable new(creates the obj) constructor() which is same name as the class
        BankAccount branson = new BankAccount("Branson", "e02301");
        
        //get the name of the created account
        String name = branson.getNameOfHolder();
        System.out.println(" _________________________________________");
        System.out.println("| Welcome to the Wizards Bank of Gringotts|");
        System.out.println("|_________________________________________|");
        System.out.println();
        System.out.println("Your name is: " + name);
        String accountNumber = branson.getAccountNumber();
        System.out.println("Your Account Number is:  " + accountNumber);

        //Ask user to deposit money 
        Scanner scan = new Scanner(System.in);

        //Show the User the Menu
        System.out.println("_________________________________________");
        System.out.println("Please select one of the following options: ");
        int menu;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Deposit Money ");
            System.out.println("2. Withdraw cash");
            System.out.println("3. Check your balance");
            System.out.println("4. Check your loan limit");
            System.out.println("5. Request for a loan");
            System.out.println("6. Exit ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("|_________________________________________|");
                    System.out.println("Enter the amount to deposit into your account: ");
                    double depositAmount= scan.nextDouble();
                    branson.depositMoney(depositAmount);
                    System.out.println("You have deposited an amount of : " + depositAmount + 
                        " .Your new account balance is " + branson.getAccountBalance());
                    break;

                 case 2 :
                    System.out.println("|_________________________________________|"); 
                    System.out.println("Enter the amount to withdraw from your account: ");
                    int withdrawAmount = scan.nextInt();
                    branson.withdrawMoney(withdrawAmount);
                    System.out.println("You have successfully withdrawn: " + withdrawAmount +
                    " .Your new Account balance is " + branson.getAccountBalance());
                    break;

                 case 3 : 
                    System.out.println("|_________________________________________|");
                    System.out.println("Your account balance is: " + 
                    branson.getAccountBalance());
                    break;

                 case 4 : 
                    System.out.println("|_________________________________________|");
                    System.out.println("Your loan limit is " + branson.getLoanLimit());
                    break;

                 case 5 :
                    System.out.println("|_________________________________________|");
                    System.out.println("Enter an amount to receive a  loan: ");
                    int loanAmount = scan.nextInt();
                    branson.requestLoan(loanAmount);
                    System.out.println("Your account has been debited with: " + loanAmount
                    + ".Your current account balance is " + branson.getAccountBalance());
                    break;

                 case 6 :
                     System.out.println("|_________________________________________|");
                    System.out.println(" Exiting the account Menu");
                    break;

                 default:
                    System.out.println("Invalid Choice , please try again");
                    System.out.println("|_________________________________________|");

                } 
        } while (menu != 6);
        scan.close();

        //    allan.setAccountBalance(40);
                //     allan.depositMoney(90);
                //     allan.withdrawMoney(50);
                //     allan.withdrawMoney(100);

                    //ToDO
                    //ask for user details
                    //create an array of users
                    //create a method to the print user info
                    //menu of of items

                    //Take user Input
                    

            
    }
}
