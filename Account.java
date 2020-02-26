import java.text.DecimalFormat;
import java.util.Scanner;

public class Account
{
    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'Rs.' ###,##0.00");

    public int setCustomerNumber(int CustomerNumber)
    {
        this.customerNumber=CustomerNumber;
        return CustomerNumber;
    }
    public int getCustomerNumber()
    {
        return customerNumber;
    }
    public int setPinNumber(int PinNumber)
    {
        this.pinNumber=PinNumber;
        return pinNumber;
    }
    public int getPinNumber()
    {
        return pinNumber;
    }
    public double getCurrentBalance()
    {
        return currentBalance;
    }
    public double getSavingBalance()
    {
        return savingBalance;
    }
    public double calcCurrentWithdrawl(double amount)
    {
        currentBalance-=amount;
        return currentBalance;
    }
    public double calcSavingWithdrawl(double amount)
    {
        savingBalance-=amount;
        return savingBalance;
    }
    public double calcCurrentDeposit(double amount)
    {
        currentBalance+=amount;
        return currentBalance;
    }
    public double calcSavingDeposit(double amount)
    {
        savingBalance+=amount;
        return savingBalance;
    }
    public void getCurrentWithdrawInput()
    {
        System.out.println("Current Account Balance: "+moneyFormat.format(getCurrentBalance()));
        System.out.print("Amount to Withdraw: ");
        double amount=input.nextDouble();
        if (currentBalance-amount>=0)
        {
            calcCurrentWithdrawl(amount);
        }
        else
        {
            System.out.println("Balance cannot be Negative \n");
        }
    }
    public void getSavingWithdrawInput()
    {
        System.out.println("Saving Account Balance: "+moneyFormat.format(getCurrentBalance()));
        System.out.print("Amount to Withdraw: ");
        double amount=input.nextDouble();
        if (savingBalance-amount>=0)
        {
            calcSavingWithdrawl(amount);
        }
        else
        {
            System.out.println("Balance cannot be Negative \n");
        }
    }
    public void getCurrentDepositInput()
    {
        System.out.println("Current Account Balance: "+moneyFormat.format(getCurrentBalance()));
        System.out.print("Amount to Withdraw: ");
        double amount=input.nextDouble();
        if (amount>0)
        {
            calcCurrentDeposit(amount);
        }
        else {
            System.out.println("Amount Cannot be Negative\n");
        }
    }
    public void getSavingDepositInput()
    {
        System.out.println("Current Account Balance: "+moneyFormat.format(getCurrentBalance()));
        System.out.print("Amount to Withdraw: ");
        double amount=input.nextDouble();

        if (amount>0)
        {
            calcSavingDeposit(amount);
        }
        else
        {
            System.out.println("Amount Cannot be Negative\n");
        }

    }
    private int customerNumber;
    private int pinNumber;
    private double currentBalance=0;
    private double savingBalance=0;
}