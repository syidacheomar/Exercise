import java.util.Scanner;

class bank {

    private double depositAmount;
    private double withdrawAmount;
    private double balance;

    public double getDepositAmount(){
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount){
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount(){
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount){
        this.withdrawAmount = withdrawAmount;
    }

    //method for depositing
    public void deposit(double depositAmount){
        if(depositAmount > 0){
            balance += depositAmount;
            System.out.println("You have succesfully depositing RM:" + depositAmount);
        }
    }

    //method for withdrawing
    public void withdraw(double withdrawAmount)
    {
        if(withdrawAmount <= balance){
            balance -= withdrawAmount;
            System.out.println("You have succesfully withdrawal RM:" + withdrawAmount);
        }
        else{
            System.out.println("You have insufficient balance for withdrawl.");
        }

    }

     //method for checking the balance
     public void checkBalance(){

        System.out.println("Your account balance is: RM" + balance);

    }

 }

public class bankSystem{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        bank bank = new bank();
        int choice = 0;

    do{
        System.out.println("Please choose (1-4):");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");
        choice = scanner.nextInt();


        if (choice == 1) {
            // Check balance
            bank.checkBalance();
        } else if (choice == 2) {
            // Deposit money
            System.out.print("Enter the amount to deposit: RM");
            double depositAmount = scanner.nextDouble();
            bank.deposit(depositAmount);
        } else if (choice == 3) {
            // Withdraw money
            System.out.print("Enter the amount to withdraw: RM");
            double withdrawAmount = scanner.nextDouble();
            bank.withdraw(withdrawAmount);
        } else if (choice == 4) {
            // Exit
            System.out.println("Thank you for using our banking system. Have a nice day");
        } else {
            // Handle invalid menu choices
            System.out.println("Invalid choice. Please try again.");
        }
        }while (choice != 4);

        scanner.close();

    }
}
