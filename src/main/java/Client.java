public class Client{
    private Account account;
    private Bank bank;


  public Client(Bank bank){
    this.bank = bank;
    this.account = new Account(bank, 1000);
  }

  public Account getAccount(){
    return this.account;
  }

    public void buy(Store store){
      account.getBank().transfer(account, store.getAccount(), 100);      
    }
}