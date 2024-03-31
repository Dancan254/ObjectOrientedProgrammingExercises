import java.io.Console;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.UUID;

public class CreateAccount {
 private String firstName;
 private String lastName;
 private String password;
private  String accountNumber;
 

 public CreateAccount (String firstName, String lastName , String accountNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = null;
    this.accountNumber = accountNumber;
 }


 public void createUser () {

   //create a linked List to store user details 
   LinkedList <CreateAccount> accountHolder  = new LinkedList<>(); 

   Scanner scan = new Scanner(System.in);

   //Control the number of users created 
   boolean creatingAccountHolders = true; 

   //Create accounts until the user chooses to stop 
   while (creatingAccountHolders) {
      System.out.println("Create a Bank Account at Gringotts");
      System.out.println("Enter your first name");
      this.firstName = scan.nextLine();
      
      
      System.out.println("Enter your last name");
      this.lastName = scan.nextLine();
      
      
      //Read password securely from the console
      Console console = System.console();
      //System.out.println("Enter your password ");
      char [] passwordCharacters = console.readPassword("Enter password: ");
      String password = new String(passwordCharacters);
      console.flush();
      this.password = password;


      //validate password 
      setPassword(String.valueOf(password));

      //Generate UUID for an account number 
      String uniqueId = UUID.randomUUID().toString();
      String accountNumber = uniqueId.substring(0,10);
      setAccountNumber(accountNumber);


      //Create a  CreateAccount  object and store it to the linked list
      CreateAccount newAccount = new CreateAccount(firstName, lastName, accountNumber);
      accountHolder.add(newAccount);

      //ask if the user would like to proceed
      System.out.println("Do you want to add another User? (yes/No)");
      String additionalUser = scan.nextLine();
      if (!additionalUser.equalsIgnoreCase("yes")) {
         creatingAccountHolders = false;
      }
      
   }
 }

 //Method for users to Login to their accounts 
 //TO DO 


//Ensure the password is only made of digits
 public boolean  passwordChecker (String password) {

   //iterate through each character
   for (char c : password.toCharArray()) {

      //check if the char is not a digit
      if (!Character.isDigit(c)) {
         return false; //-> if a non digit is found
      }
   }
   //return true if the all the characters are digits
   return true; 

 }

 public void setPassword ( String password) {
   if (passwordChecker(password)) {
      this.password = password;
   } else {
      System.out.println("Your password must contain only digits");
   }

}

//getters and setters

public String getAccountNumber (){
   return accountNumber; 
 }

 public void setAccountNumber (String accountNumber){
  this.accountNumber = accountNumber;
 }


public String getFirstName () {
   return firstName;
}

public void setFirstName (String firstName) {
   this.firstName = firstName;
}

public String getLastName () {
   return lastName;
}

public void setLastName (String lastName) {
   this.lastName = lastName;
}


public String getPassWord () {
   return password;
}

 @Override
 public String toString () {
   return "CreateAccount{" +
          "firstname=' " + firstName + '\'' + 
          ", lastname = ' " + lastName + '\'' + 
          ", password = ' " + password + '\'' +
          '}';
  }
}

