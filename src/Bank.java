import java.util.Scanner;

class Bank {
    private String accountNumber;
    private String accountName;
    private long accountBalance;

    Scanner sc = new Scanner(System.in);

    //Open account
    void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.next();

        System.out.print("Enter Name: ");
        accountName = sc.next();

        System.out.print("Enter Balance: ");
        accountBalance = sc.nextLong();
    }

    //Show account details
    void showAccount() {
        System.out.println("Account Number: " + accountNumber + "\n Account Name: " + accountName + "\n Account Balance: " + accountBalance);
    }

    //Deposit
    void deposit() {
        long amount;
        System.out.println("How Much Do You Want To Deposit: ");
        amount = sc.nextLong();
        accountBalance = accountBalance + amount;
    }

    //Withdraw
    void withdrawal() {
        long amount;
        System.out.println("How much do you want to withdraw: ");
        amount = sc.nextLong();

        if (accountBalance >= amount) {
            accountBalance =  accountBalance - amount;
        } else {
            System.out.println("Balance is less than the amount you want to withdraw");
        }
    }

    //Search for account number
    boolean search(String acn) {
        if (accountNumber.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}