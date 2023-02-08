package problems;
/*class table{
	void table(Thread t) {
		System.out.println(t.getId());
	}
}
class firstThread extends Thread{
	table t;
	firstThread(table t){
		this.t=t;
	}
	public void run() {
	t.table(this);
	}
		
}
class secondThread extends Thread{
	table t;
	secondThread(table t){
		this.t=t;
	}
	public void run() {
		t.table(this);;
	}
}*/


class  mythread extends Thread{
	mythread(){
		this.start();
	}
	public void run() {
		//System.out.println(this.getId());
		System.out.println(this.getState());
	}
}
public class Questiontwothreads {

	public static void main(String[] args) {
		
mythread obj1=new mythread();
mythread obj2=new mythread();



/*table obj=new table();
firstThread obj1=new firstThread(obj);
secondThread obj2=new secondThread(obj);
obj1.start();
obj2.start();
System.out.println("firstThread is :"+obj1.getState());
System.out.println("secondThtead is :"+obj2.getState());*/
	}

}
