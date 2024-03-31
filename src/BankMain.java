
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {

   public static void main(String[] args) {

      // create our object -> real bank account
      // className referenceVariable new(creates the obj) constructor() which is same
      // name as the class

      // BankAccount branson = new BankAccount("Branson", "e02301");
      // get the name of the1 created account

      Scanner scan = new Scanner(System.in);
      CreateAccount customer = new CreateAccount(null, null, null);
      customer.createUser();

      BankAccount customerBankAccount = new BankAccount(customer);

      System.out.println("Thank you: " + customer.getFirstName() + "  " + customer.getLastName()
            + " for opening an account at Gringotts Wizards Bank: ");

      System.out.println("Your Bank account number is : " + ((Object) customer.getAccountNumber()));
      System.out.println("Your account Number: " + customer.getAccountNumber());

      // Show the User the Menu
      System.out.println("_________________________________________");
      System.out.println("Please select one of the following options: ");

      //initializing the menu
      int menu = 0;

         try {

            do {
               printMenu();
               try {
                  menu = scan.nextInt();
                  switch (menu) {
      
                  case 1:
                     while (true) {
                           System.out.println("|_________________________________________|");
                           System.out.println("Enter the amount to deposit into your account: ");
                           try {
                              double depositAmount = scan.nextDouble();
                              if (depositAmount <= 0) {
                                 System.out.println("Invalid amount, please enter a valid amount: ");
                                 continue;
                              }
                              customerBankAccount.depositMoney(depositAmount);
                              break;
                           }
                           catch (InputMismatchException e) {
                              System.out.println("Invalid input");
                              scan.next();
                           }
                     } 
                     break;

                  case 2:
                     while (true) {
                        System.out.println("|_________________________________________|");
                        System.out.println("Enter the amount to withdraw from your account: ");
                        try {
                           int withdrawAmount = scan.nextInt();
                           if (withdrawAmount <= 0){
                              System.out.println("Invalid Input, please try again");
                              continue;
                           }
                           customerBankAccount.withdrawMoney(withdrawAmount);
                           break;
                        } catch (InputMismatchException e) {
                           System.out.println("Invalid Input , please try again");
                           scan.next();
                        }
                     }
                     break;
      
                  case 3:
                     System.out.println("|_________________________________________|");
                     System.out.println("Your account balance is: " + 
                     customerBankAccount.getAccountBalance());
      
                  case 4:
                     System.out.println("|_________________________________________|");
                     System.out.println("Your loan limit is " + customerBankAccount.getLoanLimit());
                     break;
      
                  case 5:
                     while (true){
                        System.out.println("|_________________________________________|");
                        System.out.println("Enter an amount to receive a  loan: ");
                        try {
                           int loanAmount = scan.nextInt();
                           if (customerBankAccount.getAccountBalance() <= 0){
                              System.out.println("Your bank Account balance is zero, you do not qualify for a loan");
                              break;
                           }else if (customerBankAccount.getAccountBalance() > 0 && loanAmount <= 0){
                                 System.out.println("Invalid loan amount request, please try again");
                                 continue;
                              } else ;
                              customerBankAccount.requestLoan(loanAmount);
                           break;
                        } catch (InputMismatchException e) {
                           System.out.println("Invalid Input: Please enter a value");
                           scan.next();
                        }
                     }
                     break;
      
                  case 6:
                     System.out.println("|_________________________________________|");
                     System.out.println("Your account details are: ");
                     System.out.println("Account Name : " + customerBankAccount.getNameOfHolder());
                     System.out.println("Your Bank account number is : " + ((Object) customer.getAccountNumber()));
                     System.out.println("Your account Number: " + customer.getAccountNumber());
                     System.out.println("Your Bank account number is : " + customer.getAccountNumber());
                     System.out.println("Your password  is : " + customer.getPassWord());
                     break;
      
                  case 7:
                     System.out.println("|_________________________________________|");
                     System.out.println(" Exiting the account Menu");
                     return;

                  default:
                     System.out.println("Invalid Choice , please try again");
                     System.out.println("|_________________________________________|");
                  }
               } catch (InputMismatchException e) {
                  System.out.println("Invalid selection: Please select a value between 1 -7");
                  scan.next();
               }
      
            } while ( menu != 7);
         
         } finally {
         scan.close();
      }
   }


      // Show menu
        public static void printMenu() {
         // CreateAccount obj = new CreateAccount(null, null);
          // obj.createUser();
         System.out.println("\nMenu: ");  
         System.out.println("1. Deposit Money ");
         System.out.println("2. Withdraw cash");

         System.out.println("3. Check your balance");
         System.out.println("4. Check your loan limit");
         System.out.println("5. Request for a loan");
         System.out.println("6. Show Account Details");
         System.out.println("7. Exit ");
      }
}
