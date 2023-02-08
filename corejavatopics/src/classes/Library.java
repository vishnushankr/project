package classes;

import java.util.Scanner;

public class Library {
private int bookid;
private String bookname;
private String Author;
private int quantity;
private boolean issued;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public boolean isIssued() {
	return issued;
}
public void setIssued(boolean issued) {
	this.issued = issued;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Library vis=new Library();
	System.out.println("enter bookid");
	vis.setBookid(sc.nextInt());
	System.out.println("enter bookname");
	vis.setBookname(sc.next());
	System.out.println("enter author");
	vis.setAuthor(sc.next());
	System.out.println("quantity");
	vis.setQuantity(sc.nextInt());
	if(vis.getQuantity()>2)
	{
		vis.setIssued(false);
	}
	else {
		vis.setIssued(true);
	}
	System.out.println("book id is :"+vis.getBookid());
	System.out.println("book name is : "+vis.getBookname());
	System.out.println("author is:"+vis.getAuthor());
	System.out.println("quantity is"+vis.getQuantity());
	System.out.println("book issued:"+vis.issued);
}

}