// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Account account = new Account(100);
    System.out.println(account.getBalance());
    account.withdraw(20);
    System.out.println(account.getBalance());
    account.withdraw(120);
    System.out.println(account.deposit(180));

    Bank bank = new Bank();
    Account account1 = new Account(300);

    System.out.println(account.getBalance());
    System.out.println(account1.getBalance());
    bank.transfer(account, account1, 100);
    System.out.println(account.getBalance());
    System.out.println(account1.getBalance());
    
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}