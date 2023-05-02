import java.util.*;

class Account {
    String bankname;
    long AccountId;
    String AccountName;
    long Balance;
    int password = 1234;
    Scanner sc = new Scanner(System.in);

    public void get_Account_details() {
        System.out.println("Enter Bank Name:-");
        bankname = sc.nextLine();
        System.out.println("Enter Acc no:-");
        AccountId = sc.nextLong();
        System.out.println("Enter Account name:-");
        AccountName = sc.next();
    }

    public void display(String bankname, long AccountId, String AccountName) {
        System.out.println("Bank name is:- " + bankname);
        System.out.println("Acc No:- " + AccountId);
        System.out.println("Acc name is:- " + AccountName);
    }

    public void withdraw() {
        if(validatePassword()){
        System.out.println("Enter the amount to be withdrawn:-");
        long withdraw = sc.nextLong();
        Balance -= withdraw;
        System.out.println("Available balance =" + Balance);
    }else{
        System.out.println("Wrong password");
    }

    }

    public void deposit() {
        if(validatePassword()){
        System.out.println("Enter the amount you want to deposit:-");
        long deposit = sc.nextLong();
        Balance += deposit;}
    }
    public boolean validatePassword() {
        System.out.println("Enter 4-digit password:");
        int enteredPassword = sc.nextInt();
        if (enteredPassword == password){
            return true;
        } else {
            System.out.println("Invalid password.");
            return false;
        }
    }
    
}

public class Account1 {
    public static void main(String [] args){
        Account ac = new Account();
        ac.get_Account_details();
        ac.display(ac.bankname,ac.AccountId,ac.AccountName);
       
        ac.deposit();
        ac.withdraw();
    }
}
