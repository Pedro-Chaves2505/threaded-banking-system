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

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}