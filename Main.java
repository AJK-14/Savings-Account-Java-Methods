public class Main {
  
  int balance;
  
  public Main(int initialBalance){
    balance = initialBalance;
  }
 public void checkBalance(){
    System.out.println("  Your balance is "+balance);
  }
  
  public void deposit(int amountToDeposit){
    balance = amountToDeposit + balance;
    System.out.println("  You just deposited " + amountToDeposit);
  }
  public int withdraw(int amountToWithdraw){
    balance = balance - amountToWithdraw;
    System.out.println("  You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  public static void main(String[] args){
    Main savings = new Main(2000);
    savings.deposit(20000);
    savings.withdraw(350);
    savings.deposit(190);
    savings.checkBalance();
  }       
}