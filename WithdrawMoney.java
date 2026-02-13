import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class WithdrawMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.0;

        System.out.println("Your current balance: " + balance);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new InsufficientBalanceException("Error: Insufficient balance!");
            }

            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            sc.close();
            System.out.println("Transaction ended.");
        }
    }
}
