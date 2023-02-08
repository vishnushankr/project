package exceptionhandling;

public class ExceptionPractice1 {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		int sum=a+b;
		//int div=a/b;
		int a1[]=new int[2];
		a1[0]=1;
		a1[1]=2;
		//a1[2]=3;

		
		
		try{
		int div=a/b;
		System.out.println(a1[2]);
		System.out.println(div);
		//System.out.println(a+b);
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e);
		}finally{
			System.out.println("this is final  block");
		}
		System.out.println(sum);
		System.out.println(a1[1]);

	}

}
