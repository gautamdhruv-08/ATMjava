 import java.io.IOException;
import java .text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
 public class Optionmenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat=  new DecimalFormat("&&");
    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
    public void getLogin() throws IOException{
        int x  = 1;
        do {
            try {
                data.put(952141,191904);
                data.put(989947,71976);
                data.put(952243,123456);
                System.out.println("Welcome to the ATM Project");
                System.out.println("Enter The Customer number");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("Enter the PIN Number :");
                setPinNumber(menuInput.nextInt());
            }   catch (Exception e){
                System.out.println("\n "+ "Invalid character(s). + Ony number + \n");
                x=2;
        }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if(data.containsKey(cn) && data.get(cn)==pn){
                getAccountType();
            } else
                System.out.println("Wrong CustomerNumber OR PIN Number");
    } while(x==1);

}
  public void getAccountType(){
        System.out.println("Select the Account you want to Access");
        System.out.println(" Type 1 : Checking Account");
        System.out.println(" Type 2 : Saving Account");
        System.out.println("Type 3 for Exit");
        int selection = menuInput.nextInt();
        switch(selection){
            case 1 :
                getChecking();
                break;

            case 2:
                getSaving();
                break;
            case 3 :
                System.out.println("Thank You for Using this ATM . Have a Good DAY");
                break;
            default:
                System.out.println("Invalid Choice");
                getAccountType();
        }
    }
    public void getChecking(){
        System.out.println("Checking Account");
        System.out.println("Type 1 :- View Balance");
        System.out.println("Type 2 :- Withdraw Funds");
        System.out.println("Type 3 :- Deposit Funds ");
        System.out.println("Type 4 :- Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance : " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositeInput();
                getAccountType();
            case 4:
                System.out.println("Thank for using this ATM");
            default:
                System.out.println("Invalid choice .");

                getChecking();
        }
    }

    public void getSaving(){
        System.out.println("Saving Account :-");
        System.out.println("Type 1 :- View Balance");
        System.out.println("Type 2 :- Withdraw Funds");
        System.out.println("Type 3 :- Deposit Funds ");
        System.out.println("Type 4 :- Exit");
        System.out.println("Choice: ");
        int selection = menuInput.nextInt();

        switch(selection){
            case 1:

            System.out.println("Saving Account Balance :- " + moneyFormat.format(getSavingbalance()));
            getAccountType();
            break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3 :
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM .");
            default:
                System.out.println("Invalid choice");
              getAccountType();
        }
    }

}
