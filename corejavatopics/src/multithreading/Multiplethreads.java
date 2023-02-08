package multithreading;
class Mythreads extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(this.getName()+" "+i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e)
			{
				e.printStackTrace();
		}
	}
}
}
public class Multiplethreads {

	public static void main(String[] args) {
Mythreads obj1=new Mythreads();
System.out.println(obj1.getId());
obj1.start();

Mythreads obj2 = new Mythreads();
System.out.println(obj2.getId());
obj2.setPriority(2);
obj2.start();
	}

}
