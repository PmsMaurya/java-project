import java.util.Scanner;

public class bank_deposite {
	
	 

	public static void main(String []args) {
		// TODO Auto-generated method stub
       int pwd;
       int money;
       double bal=5000;
       System.out.println("1 withdraw");
       System.out.println("2.Deposite");
       System.out.println("3.checkbalance");
       
       Scanner sc=new Scanner(System.in);
      
        System.out.print("enter the deposite money:");
        money=sc.nextInt();
        System.out.print("enter password:");
        pwd =sc.nextInt();
		if(pwd==456) {
			bal=bal+money;
			System.out.print("Balance:"+bal);
			
			
		}
		else {
			System.out.print("incorrect password...");
		}
	}

}
