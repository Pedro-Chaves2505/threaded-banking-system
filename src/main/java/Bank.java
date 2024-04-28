public class Bank{
  public void transfer(Account transferer, Account receiver, float ammount){
    transferer.withdraw(ammount);
    receiver.deposit(ammount);
  }
}