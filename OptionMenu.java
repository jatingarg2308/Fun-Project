import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput= new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'Rs.'###,##0.00");
    HashMap<Integer,Integer> data=new HashMap<Integer, Integer>();

    public void getLogin() throws IOException{
        int x=1;
        do{
            try{
                data.put(1234,89);
                data.put(3456,21);
                System.out.println("Welcome to ATM");
                System.out.print("Enter the User ID: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter the Password: ");
                setPinNumber(menuInput.nextInt());

            }catch (Exception e){
                System.out.println("\n"+"Invalid character(s). Only numbers"+"\n");
                x=2;
            }
            for (Map.Entry<Integer,Integer> entry : data.entrySet()){
                if (entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber()){
                    getAccountType();
                }
            }
            System.out.println("\n"+"Please Enter a valid ID and Password"+"\n");
        } while(x==1);
    }
    public void getAccountType(){
        System.out.println("Select the Account type you want to access");
        System.out.println("Type1: Current Account");
        System.out.println("Type 2: Saving Account");
        System.out.println("Type 3: Exit");
        System.out.print("Choice: ");
        int selection=menuInput.nextInt();
        switch(selection){
            case 1:
                getCurrent();
                break;

            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You for using ATM");
                break;
            default:
                System.out.println("\n"+"Invalid Choice"+"\n");
                getAccountType();
        }
    }
    public void getCurrent(){
        System.out.println("Current Account: ");
        System.out.println("Type 1: View Balance");
        System.out.println("Type 2: Withdraw Funds");
        System.out.println("Type 3: Deposit Funds");
        System.out.println("Type 4: Exit");
        System.out.print("Choice: ");
        int selection=menuInput.nextInt();
        switch(selection){
            case 1:
                System.out.println("Current Account Balance: "+moneyFormat.format(getCurrentBalance()));
                getAccountType();
                break;
            case 2:
                getCurrentWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCurrentDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using ATM");
                break;
            default:
                System.out.println("\n"+"Invalid Choice"+"\n");
                getAccountType();
        }
    }
    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1: View Balance");
        System.out.println("Type 2: Withdraw Funds");
        System.out.println("Type 3: Deposit Funds");
        System.out.println("Type 4: Exit");
        System.out.print("Choice: ");
        int selection=menuInput.nextInt();
        switch(selection){
            case 1:
                System.out.println("Current Account Balance: "+moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using ATM");
                break;
            default:
                System.out.println("\n"+"Invalid Choice"+"\n");
                getAccountType();
        }
    }
}