import java.util.Scanner;

public class ATM {
    public static void main(String[] args ){
        int balance = 100000 ;
        int withdraw ;
        int deposit ;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("welcome to the ATM");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for deposit");
            System.out.println("choose 3 for check balance");
            System.out.println("choose 4 for Exit");
            System.out.println("Choose the operation you want to perform: ");
        
       int choose = sc.nextInt();
       switch(choose)
       {
        case 1 :
        System.out.println("Enter the money ypu want to deposit");
        withdraw = sc.nextInt();
        balance = balance-withdraw;
        if (withdraw >= balance){
            System.out.println("Please collect the money");
        } else {
            System.out.println("insufcient balance");
        }
    System.out.println(" ");
    break;
    case 2 :
    System.out.println("Enter the amount to be deposit");
    deposit = sc.nextInt();
    deposit = deposit + balance;
    System.out.println("The money is sucessfully deposited");
    System.out.println(" ");
    break;
    case 3 :
    System.out.println("Here is the required balance in the account");
    System.out.println("balance"+balance);
    break;
       }
    }
    
}
}