package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class student implements Serializable {

	private int sno;
	private String stdname;
	transient int marks;

	public student() {
		sno = 100;
		stdname = "vishnu";
		marks = 85;

	}

	public void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student roll no:");
		sno = sc.nextInt();
		System.out.println("enter the student name:");
		stdname = sc.next();
		System.out.println("enter the stuent subject marks");
		marks = sc.nextInt();
	}

	public void display() {
		System.out.println("student rollno is:" + sno);
		System.out.println("student name is :" + stdname);
		System.out.println("student marks is:" + marks);
	}

}

public class Serializedexample {

	public static void main(String[] args) {
		try {
			student obj = new student();
			obj.getdata();
			student obj1 = new student();
			obj1.getdata();
			FileOutputStream vis = new FileOutputStream("D:\\register.txt");
			ObjectOutputStream obj7 = new ObjectOutputStream(vis);
			obj7.writeObject(obj);
			obj7.writeObject(obj1);
			vis.close();

			FileInputStream sha = new FileInputStream("D:\\register.txt");
			ObjectInputStream obj2 = new ObjectInputStream(sha);
			student obj3 = (student) obj2.readObject();
			obj3.display();
			sha.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
