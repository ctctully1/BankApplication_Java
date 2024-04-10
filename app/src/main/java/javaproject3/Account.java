package javaproject3;
import java.util.Random;

public abstract class Account implements IBaseRate{

  private String name;
  private String ssn;
  private double balance;

  private static int index=10000;
  protected String accountNumber;
  protected double rate;

  public Account(String name, String ssn, double initDeposit){

    this.name = name;
    this.ssn = ssn;
    balance = initDeposit;
    this.accountNumber = setAccountnumber();
    index++; 
    setRate();
  }

  public void compound(){
    double accruedInterest = balance * (rate/100);
    balance = balance + accruedInterest;
    System.out.println("Accrued Interest: $" + accruedInterest);
    printBalance();
  }
  
  public abstract void setRate();

  //List common methods transactions

  public void deposit(double amount){
    balance = balance + amount;
    System.out.println("Depositing $"+ amount);
    printBalance();
  }

  public void withdraw(double amount){
    balance = balance - amount;
    System.out.println("Withdrawing $"+ amount);
    printBalance();
  }

  public void transfer(String toWhere, double amount){
    balance = balance - amount;
    System.out.println("Transfering $" + amount +" to " + toWhere);
    printBalance();
  }

  public void printBalance(){
    System.out.println("Your balance is $" + balance);
  }

  private String setAccountnumber(){
    String lastTwoSsn = ssn.substring(ssn.length()-2);
    int uniqueId = index;
    Random rand = new Random();
    int randNumber = rand.nextInt(1000);
    return lastTwoSsn + uniqueId + randNumber;
  }

  public void showInfo(){
     System.out.println(
      "Name: " + name +
      "\nAccount Number: " + accountNumber +
      "\nBalance: " + balance +
      "\nRate: " + rate + "%"     );
  }

}
