import java.util.Scanner;

class BankAccount {
     private double balance;

     public BankAccount(double initialBalance) {
          this.balance = initialBalance;
     }

     public double getBalance() {
          return balance;
     }

     public void deposit(double amount) {
          balance += amount;
          System.out.println("Deposit of Rs " + amount + " successful.");
     }

     public void withdraw(double amount) {
          if (amount <= balance) {
               balance -= amount;
               System.out.println("Withdrawal of Rs " + amount + " successful.");
          } else {
               System.out.println("Insufficient funds.");
          }
     }
}

class ATM {
     private BankAccount account;

     public ATM(BankAccount account) {
          this.account = account;
     }

     public void displayMenu() {
          System.out.println("Welcome to the ATM");
          System.out.println("1. Check Balance");
          System.out.println("2. Deposit");
          System.out.println("3. Withdraw");
          System.out.println("4. Exit");
     }

     public void processOption(int option) {
          Scanner scanner = new Scanner(System.in);
          double amount;
          switch (option) {
               case 1:
                    System.out.println("Your balance is: Rs " + account.getBalance());
                    break;
               case 2:
                    System.out.print("Enter deposit amount in Rs: ");
                    amount = readAmount(scanner);
                    account.deposit(amount);
                    break;
               case 3:
                    System.out.print("Enter withdrawal amount in Rs: ");
                    amount = readAmount(scanner);
                    account.withdraw(amount);
                    break;
               case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
               default:
                    System.out.println("Invalid option. Please try again.");
          }
     }

     private double readAmount(Scanner scanner) {
          while (!scanner.hasNextDouble()) {
               System.out.println("Invalid input. Please enter a valid amount.");
               scanner.next(); // Clear the invalid input
          }
          return scanner.nextDouble();
     }
}

public class atm1 {
     public static void main(String[] args) {
          BankAccount bankAccount = new BankAccount(1000); // Initial balance in Rs
          ATM atm = new ATM(bankAccount);
          Scanner scanner = new Scanner(System.in);

          int option;
          do {
               atm.displayMenu();
               System.out.print("Enter option: ");
               while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Clear the invalid input
               }
               option = scanner.nextInt();
               atm.processOption(option);
               System.out.println();
          } while (option != 4);
     }
}
