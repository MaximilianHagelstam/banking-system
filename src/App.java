import java.util.Scanner;

public class App {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);

    // Create account
    System.out.print("How Many Accounts Do You Want To Create: ");
    int n = sc.nextInt();
    Bank[] C = new Bank[n];
    for (int i = 0; i < C.length; i++) {
      C[i] = new Bank();
      C[i].openAccount();
    }

    // Loops until user exits (presses 5)
    int choice;
    do {
      System.out.println(
          "Show Menu\n 1. Show All Accounts\n 2. Search For Account\n 3. Deposit\n 4. Withdraw\n 5.Exit");
      System.out.println("Your Choice: ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          for (Bank bank : C) {
            bank.showAccount();
          }
          break;

        case 2:
          System.out.print("Account Number You Want To Search For: ");
          String accountNum = sc.next();

          boolean accountFound = false;
          for (Bank bank : C) {
            accountFound = bank.search(accountNum);
            if (accountFound) {
              break;
            }
          }

          if (!accountFound) {
            System.out.println("Didn't find account");
          }
          break;

        case 3:
          System.out.print("Enter Account Number To Deposit To: ");
          accountNum = sc.next();
          accountFound = false;

          for (Bank bank : C) {
            accountFound = bank.search(accountNum);
            if (accountFound) {
              bank.deposit();
              break;
            }
          }

          if (!accountFound) {
            System.out.println("Didn't find account");
          }
          break;

        case 4:
          System.out.print("Enter Account Number To Withdraw From: ");
          accountNum = sc.next();
          accountFound = false;

          for (Bank bank : C) {
            accountFound = bank.search(accountNum);
            if (accountFound) {
              bank.withdrawal();
              break;
            }
          }

          if (!accountFound) {
            System.out.println("Didn't find account");
          }
          break;

        case 5:
          System.out.println("App Closed");
          break;
      }
    } while (choice != 5);
  }
}
