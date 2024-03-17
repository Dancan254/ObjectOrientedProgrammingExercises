public class BankAccount {
    //encapsulation -> binding methods&attributes in class
    //attributes -> instance variables
    private String nameOfHolder;
    //name of holder
    //account number
    private String accountNumber;
    //account balance
    private int accountBalance; //inbank -> set to zero unless you deposit

    //default constructor
//    public BankAccount(){
//
//    }
    //parametirized const
    public BankAccount(String name, String accountNumber){//parameters
        //this keyword -> use to refer to the current instance -parameter name equals the instance variable name
        nameOfHolder = name;
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    //when you use private you need getters and setters

    //method to deposit money
    public void depositMoney(int depositAmount){

        //account balance set to 0
        //increment the account balance with the deposit
        //check whether the amount is positive
        if(depositAmount < 0){
            System.out.println("Cannot deposit zero or less amount");
        }
        else {
            accountBalance +=depositAmount;
            System.out.println("Successfully deposited " + depositAmount);
            System.out.println("Your new balance is " + accountBalance);
        }
    }
    public void withdrawMoney(int withdrawAmount){

        //account balance set to 0
        //increment the account balance with the deposit
        //check whether the amount is positive
        if(withdrawAmount < 0){
            System.out.println("Cannot withdraw zero or less amount");
        }
        else {
            if(accountBalance >= withdrawAmount) {
                accountBalance -= withdrawAmount;
                System.out.println("Successfully withdrawn " + withdrawAmount);
                System.out.println("Your new balance is " + accountBalance);
            }else{
                System.out.println("Insufficient funds");
            }
        }
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
                ", accountBalance=" + accountBalance +
                '}';
    }
}
