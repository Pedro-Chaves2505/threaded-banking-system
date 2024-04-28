public class Store{
  private Account account;
  private  Bank bank;

  public Store(Bank bank){
    this.bank = bank;
    this.account = new Account(bank, 0);
  }
  
  public Account getAccount(){
    return this.account;
  }
    
}