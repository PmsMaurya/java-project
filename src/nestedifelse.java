
public class nestedifelse {

	public static void main(String[] args) {
		int num1=1000,num2=50,num3=80;
		if(num1>num2) {
			
			if(num1>num3) {
				System.out.print("Maximum"+num1);
			}
			else {
				System.out.print("maximum"+num3);
				
				
			}
		}
		else
		{
			if(num2>num3) {
				System.out.print("maximum"+num2);
			}
			else {
				System.out.print("maximum"+num3);
			}
		}

	}

}
