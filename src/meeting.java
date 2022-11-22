import java.util.*;
public class meeting {

	public static void main(String[] args) {
		int ch,pwd;
		
		System.out.println("1.Ashutosh");
		System.out.println("2.Pranav");
		System.out.println("3.Alok");
		System.out.println("4.Priyanshu");
		System.out.println("5.Prakhar ");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.whom you want to meet:");
		ch=sc.nextInt();
		System.out.print("Enter the password:");
		pwd=sc.nextInt();
		
		switch(ch){
			case 1:if(pwd==123) {
				System.out.println("Ashutosh ");
				System.out.println("contact no.61232231");
				System.out.println("Machenical Eng.");
				System.out.println("Address:Mujhahidpur");
			}
			else {
				System.out.print("Wrong password,Try again");
			}
			break;
			case 2:if(pwd==456) {
				System.out.println("Pranav");
				System.out.println("contact no.8840701916");
				System.out.println("Software Eng.");
				System.out.println("Address:Hanswar");}
				else {
					System.out.print("Wrong password,Try again");
				}
		
		break;
			case 3:if(pwd==789) {
				System.out.println("Alok ");
				System.out.println("contact no.637054231");
				System.out.println(" DRDO agent");
				System.out.println("Address:Baskhari");}
			else {
				System.out.print("Wrong password,Try again");
			}
		   break;
			case 4:if(pwd==100) {
				System.out.println("Priyanshu ");
				System.out.println("contact no.6388072231");
				System.out.println("Computer Engineer");
				System.out.println("Address:Baskhari");}
			else {
				System.out.print("Wrong password,Try again");
			}
			break;
			case 5:if(pwd==200) {
				System.out.println("Prakhar  ");
				System.out.println("contact no.61232231");
				System.out.println("Software engineer");
				System.out.println("Address:Tanda");}
			else {
				System.out.print("Wrong password,Try again");
			}
			break;

}}}
