public class BankAccount {
    //encapsulation -> binding methods&attributes in class
    //attributes -> instance variables-> class instance -> global
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
    //parameterized const
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
        if(depositAmount <= 0){
            System.out.println("Cannot deposit zero or less amount");
        }
        else {
            accountBalance +=depositAmount;
            //accountBalance = accountBalance + depositAmount
            System.out.println("Successfully deposited " + depositAmount);
            showBalance();
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
                showBalance();
            }else{
                System.out.println("Failed to withdraw " + withdrawAmount + " Insufficient funds");
            }
        }

    }

    public void showBalance(){
        System.out.println("Displaying your balance ");
        System.out.println("Your new balance is " + accountBalance);
        System.out.println("- -".repeat(20));
    }
    public String getNameOfHolder() {//nameOfHolder -> getNameOfHolder-> return type -> type when declaring
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
