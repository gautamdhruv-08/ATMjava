import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int PinNumber;

    private double checkingBalance = 0;
    private double savingbalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("$$ ");
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;

    }
    public int setPinNumber(int pinNumber){
        this.PinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return PinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingbalance(){
        return savingbalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance-amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingbalance = (savingbalance- amount);
        return savingbalance;
    }
    public double calCheckingDeposit(double amount){
        checkingBalance = (checkingBalance+amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingbalance =  (savingbalance+amount);
        return savingbalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking  AccountBalance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want form Checking Account : ");
        double amount = input.nextDouble();
        if((checkingBalance-amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance : " + moneyFormat.format(checkingBalance));

        }  else {
            System.out.println("Balance Cannot be Negative ");
        }
    }
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance : " + moneyFormat.format(savingbalance));
        System.out.print("Amount you want to Withdraw  for Saving Account ");
        double amount = input.nextDouble();
        if((savingbalance-amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance " + moneyFormat.format(savingbalance));
        } else
            System.out.println("Balance can not be Negative");
    }
    public void getCheckingDepositeInput(){
        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to Deposit from Checking Account ");
        double amount = input.nextDouble();
        if((checkingBalance+ amount)>=0){
            calCheckingDeposit(amount);
            System.out.println("New Checking Account Balance" + moneyFormat.format(checkingBalance));
        } else
            System.out.println("Balance cannot be Negative");
    }
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance :- " + moneyFormat.format(savingbalance));
        double amount = input.nextDouble();
        if((savingbalance + amount )>=0){
            calcSavingDeposit(amount);
            System.out.println("Nwe Savig Account Balnace :-" + moneyFormat.format(savingbalance));
        } else
            System.out.println("Balance can not be Negative");
    }

}

