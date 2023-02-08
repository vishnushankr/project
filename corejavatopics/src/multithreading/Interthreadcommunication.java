package multithreading;
/*class chat{
	boolean flag=false;
	public synchronized void question(String msg) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
					}
		System.out.println(msg);
		flag=true;
		notify();
	}
	public synchronized void answer(String msg) {
		if(flag==false) {
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag=false;
		notify();
	}
}
class Teacher1 implements Runnable	{
	chat m;
	String s[]= {"hi how are you ?"};
	public Teacher1(chat m) {
		this.m=m;
		Thread t=new Thread(this,"tecaher");
		t.start();
	}
			
	@Override
	public void run() {
		for(int i=0;i<s.length;i++) {
			m.question(s[i]);
		}
	
	
}
	
}
class Student1 implements Runnable{
chat m;
String[] s1= {"hi i am good ,what about you mam"};
Student1(chat m){
	this.m=m;
	Thread t1=new Thread(this,"student");
	t1.start();
}
	@Override
	public void run() {
		for(int i=0;i<s1.length;i++) {
			m.answer(s1[i]);
		}
	}
	
}
public class Interthreadcommunication {

	public static void main(String[] args) {
chat m=new chat();
new Teacher1(m);
new Student1(m);
	}

}*/
class Chat {
	boolean flag = false;
	public synchronized void Question(String msg) {
        // a method from object class which provide signal to next thread
		if (flag==true) {
            try {
            	
                wait();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
      }
        System.out.println(msg);
        flag = true;
        notify();



	
	}
	
	public synchronized void Answer(String msg) {
		if (flag==false) {
            try {
            	Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);
        flag = false;
        notify();    }
}

class Teacher1 implements Runnable {
    Chat m;
    String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

    public Teacher1(Chat m) {
        this.m = m;
        new Thread(this, "Teacher").start();
        
        /* thread t=new Thread(this, "Teacher");
         * t.start();        
         */
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.Question(s1[i]);
        }
    }
}

class Student1 implements Runnable {
    Chat m;
    String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

    public Student1(Chat m) {
        this.m = m;
        new Thread(this, "Student").start();
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.Answer(s2[i]);
        }
    }
}
public class Interthreadcommunication {
    public static void main(String[] args) {
        Chat m = new Chat();
        new Teacher1(m);
        new Student1(m);
    }
}
