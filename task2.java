/*
    write a program of banking process
*/
import java.util.*;
import java.io.*;
public class task2 
{
    static int deposite_amount,age,ch,withdraw_amount,balance_amount=100000,
    // limit set by the bank for every consumers
    limit_amount=5000;
    static String firstname_accountholder,sex,lastname_accountholder;
    static Scanner sn=new Scanner(System.in);
    // option given to the user/consumers
    void menu()
    {
        System.out.println("Case 1: Open New Account");    
        System.out.println("Case 2: Balance");    
        System.out.println("Case 3: Withdraw");    
        System.out.println("Case 4: Deposite");    
        System.out.println("Case 5: Exit");    
    }
    // detail of the user/consumers
    void new_account()
    {
        System.out.print("Enter the first name of the customer:- ");
        firstname_accountholder=sn.next();
        System.out.print("Enter the last name of the customer:- ");
        lastname_accountholder=sn.next();
        System.out.print("Enter the age of the customer:- ");
        age=sn.nextInt();
        System.out.print("Enter the sex of the customer:- ");
        sex=sn.next();
        System.out.println("Account opened sucessfully ");
    }
    // for checking balance of the consumer account
    void balance()
    {
        System.out.println("Balanace in your account is:- "+balance_amount);
    }
    // for withdrawing money from the account
    void withdraw()
    {
        System.out.print("Enter the amount to be withdraw:- ");
        withdraw_amount=sn.nextInt();
        if(withdraw_amount<=(balance_amount-limit_amount))
        {
            balance_amount-=withdraw_amount;
        }
        else
        {
            System.out.println("Insufficient balance in your account ");
        }
        System.out.println("Total balance in your account is :- "+balance_amount);
    }
    // for depositing money in to the account
    void deposite()
    {
        System.out.print("Enter the amount to be deposited:- ");
        deposite_amount=sn.nextInt();
        balance_amount+=deposite_amount;
        System.out.println("Total balance in your account is :- "+balance_amount);
    }
    public static void main(String[]args)
    {
        while(true)
        {
            task2 obj=new task2();        
            obj.menu();
            System.out.print("Enter your choice:- ");
            ch=sn.nextInt();
            // use of switch case
            switch(ch)
            {
                case 1:  obj.new_account(); break;
                case 2:  obj.balance(); break;
                case 3:  obj.withdraw(); break;
                case 4:  obj.deposite(); break;
                case 5:  System.exit(balance_amount); 
                default: 
                {
                    System.out.println("Inavlid Choice");
                    sn.next();
                    obj.main(args);
                }
            }
            obj.main(args);
        }
    }
}