
public class break_continue {

	public static void main(String[] args) {
		int i;
		for(i=0;i<=20;i++) {
			if(i==5)
				continue;
			if(i==18)
				break;
			System.out.print(i+" ");
		}
	}

}
