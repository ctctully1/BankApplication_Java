package javaproject3;

public class Savings extends Account{

  private int SafetyDepositBoxID;
  private int SafetyDepositBoxKey;

  public Savings(String name, String ssn, double initDeposit){
    super(name, ssn, initDeposit);
    accountNumber = "1" + accountNumber;
    setSafetyDepositBox();
  }

  @Override
  public void setRate(){
    rate = getBaseRate() - 0.25;
  }

  private void setSafetyDepositBox(){
    SafetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
    SafetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
  }

  public void showInfo(){
    super.showInfo();
    System.out.println("Your Savings account features: " +
    "\nSafety Deposit Box ID: " + SafetyDepositBoxID +
    "\nSafety Deposit Box Key: " + SafetyDepositBoxKey);
  }

}
