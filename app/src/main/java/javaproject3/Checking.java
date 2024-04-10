package javaproject3;

public class Checking extends Account {

  private int debitCardnumber;
  private int debitCardPin;

  public Checking(String name, String ssn, double initDeposit){
    super(name, ssn, initDeposit);
    accountNumber = "2" + accountNumber ;
    setDebitCardDetails();
  }

  @Override
  public void setRate(){
    rate = getBaseRate() * 0.15;
  }

  private void setDebitCardDetails(){
    debitCardnumber = (int)(Math.random() * Math.pow(10,12));
    debitCardPin = (int)(Math.random() * Math.pow(10,4));
  }

  public void showInfo(){
    super.showInfo();
    System.out.println("Your Checking account features: " +
    "\nDebit Card Number: " + debitCardnumber +
    "\nDebit Card Pin: " + debitCardPin);
  }

}
