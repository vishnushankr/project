package controlstatements;

public class Natural {

	public static void main(String[] args) {
		int sum=0;
		for(int i =1; i<=4; i++)
		{
			System.out.print(i+"+");
			sum = sum + i;
		}
		for(int j = 10; j>=4;j--)
		{
			System.out.print("-+");
			sum=sum+j;
		}
		System.out.println();
		System.out.println("Sum ="+sum);
	}

}
