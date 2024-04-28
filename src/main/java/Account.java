public class Account {
  private float balance;
  private Bank bank;

  public Account(Bank bank, float balance) {
    this.bank = bank;
    this.balance = balance;
  }

  public float getBalance() {
    return balance;
  }

  public Bank getBank() {
    return bank;
  }
  
  public float withdraw(float ammount){
    if(ammount > balance){
      System.out.println("Não é possível tirar mais do que o saldo");
      return this.balance;
    }
    this.balance -= ammount;
    return this.balance;
  }
  public float deposit(float ammount){
    this.balance += ammount;
    return this.balance;
  }
}