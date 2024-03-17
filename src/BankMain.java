public class BankMain {

    public static void main(String[] args) {

        //create our object -> real bank account
        //className referenceVariable new(creates the obj) constructor()
        //same name as the class
        BankAccount allan = new BankAccount("Allan", "e02301");
        //get
//        String name = allan.getNameOfHolder();
//        System.out.println("Your name is "+ name);
//        //set balance
//        allan.setAccountBalance(40);
        allan.depositMoney(90);
        allan.withdrawMoney(50);
        allan.withdrawMoney(100);
//
        //ask for user details
        //create an array of users
        //create a method to the print user info
        //menu of o

    }
}
