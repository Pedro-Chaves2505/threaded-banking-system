// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Bank bank = new Bank();

    Store store1 = new Store(bank);
    Client client = new Client(bank);

    System.out.println(client.getAccount().getBalance());
    System.out.println(store1.getAccount().getBalance());
    client.buy(store1);

      System.out.println(client.getAccount().getBalance());
      System.out.println(store1.getAccount().getBalance());
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}