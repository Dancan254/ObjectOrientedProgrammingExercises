

public class BankAccount {
    //encapsulation -> binding methods&attributes in class
    //attributes -> instance variables-> class instance -> global
    private String nameOfHolder;
    //name of holder
    //account number
    private String accountNumber;
    //account balance
    private int accountBalance; //inbank -> set to zero unless you deposit
    private int loanLimit; 

    //default constructor
//    public BankAccount(){
//
//    }
    //parameterized constuctor 
    public BankAccount(String name, String accountNumber){//parameters
        //this keyword -> use to refer to the current instance -parameter name equals the instance variable name
        this.nameOfHolder = name;
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
        this.loanLimit = 0;

    }

    //when you use private you need getters and setters

    //method to deposit money
    public void depositMoney(double depositAmount){

        //account balance set to 0
        //increment the account balance with the deposit
        //check whether the amount is positive
        if(depositAmount <= 0){
            System.out.println("Cannot deposit zero or less amount");
        }
        else {
            accountBalance +=depositAmount;
            CalculateLoanLimit();
            //accountBalance = accountBalance + depositAmount
            System.out.println("Successfully deposited " + depositAmount);
            //showBalance();
        }
    }
    public void withdrawMoney(int withdrawAmount){

        //account balance set to 0
        //increment the account balance with the deposit
        //check whether the amount is positive
        if(withdrawAmount <= 0){
            System.out.println("Cannot withdraw zero or less amount");
        }
        else {
            if(accountBalance >= withdrawAmount) {
                accountBalance -= withdrawAmount;
                System.out.println("Successfully withdrawn " + withdrawAmount);
                //showBalance();
                //CalculateLoanLimit();
            }else{
                System.out.println("Failed to withdraw " + withdrawAmount + " Insufficient funds");
            }
        }

    }

    public void CalculateLoanLimit() {
        //creating a loan limit method to based on account balance 

        if  (accountBalance <= 0) { 
            System.out.println("You do not qualify for a loan");
        }else if ( accountBalance <= 500 ) { 
            loanLimit = accountBalance * 2;
        } else if ( accountBalance <= 1000) { 
            loanLimit = accountBalance * 3;
        } else if (accountBalance <= 1500) {
            loanLimit = accountBalance* 4;
        }else {
            this.loanLimit = accountBalance* 5;
        }

    }

    public void requestLoan (int loanAmount) {
        
        //check if user has qualified for a loan 
         if (loanAmount > loanLimit)  {
            System.out.println("You are not eligible for a loan of: " + loanAmount);
        } else{
            accountBalance =  accountBalance + loanAmount;
            System.out.println("You have been successfully granted a loan of : " + loanAmount );
            System.out.println("Your new account balance is " + accountBalance);
        }

    }

    public int getLoanLimit(){
        return loanLimit;
    }

    public void  setLoanLimit (int loanLimit) {
        this.loanLimit = loanLimit;
    }


    public String getNameOfHolder() {
        return nameOfHolder;
    }

    public void setNameOfHolder(String nameOfHolder) {
        this.nameOfHolder = nameOfHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    //modify the account number to be assigned randomly
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    //toSTring -> modofied to print the class details depending on the varibales

    @Override
    public String toString() {
        return "BankAccount{" +
                "nameOfHolder='" + nameOfHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", loanLimit Amount='" + loanLimit + '\'' +
                ", current accountBalance=" + accountBalance +
                '}';
    }
    
}
