package structural_pattern;

/*import java.io.*;
//Base classes

class BaseEntiy{
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
	this.id = id;
	}
}
class Student1 extends BaseEntiy{
	private String name;
	public String getName() {
	return name; 
	}
	public void setName(String name) {
	this.name = name;
	}
}
//Implementation
interface StorageRepository{
  public void store(BaseEntiy entiy);
}

class FileRepository implements StorageRepository{
	public void store(BaseEntiy entiy){
	try {
	
		FileOutputStream fileOut = new FileOutputStream("filePath");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		objectOut.writeObject(entiy);
		objectOut.close();
	
		} catch (IOException e) {
	
			e.printStackTrace();}
	}
}

class DataBaseRepository implements StorageRepository{
	public void store(BaseEntiy entiy){
	
	System.out.println("Save in Database");
	}

}

//Abstarction
interface BaseRepository{
  public Student1 save(Student1 entiy);
  public StorageRepository getRepository();
} 

class StudentRepository implements BaseRepository {

  private StorageRepository repository;
  public StudentRepository(StorageRepository repository){
      this.repository=repository;
  }
	public StorageRepository getRepository(){
		return repository;
	}

   public Student1 save(Student1 student) {

  	 if (student == null || student.getName() == null) {
	            return null;
	        }
	        student.setId(23L);
	        repository.store(student);
	        return student;
  }
	
}
public class BridgeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// code to store in file 
	     StudentRepository fileRepositroy = new StudentRepository (new FileRepository());
	     fileRepositroy.save(new Student1() );
	 
	     // code to store in DataBase 
	     StudentRepository dbRepositroy = new StudentRepository(new DataBaseRepository());
	     dbRepositroy.save(new Student1() );

	}

}*/




import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Base class
class Student1{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
/****************************************************************************/
//Implementation
interface StorageRepository{
    public void store(Student1 entiy);
}


class FileRepository implements StorageRepository{
	public void store(Student1 entiy){
	try {
	
		FileOutputStream fileOut = new FileOutputStream("student.txt");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		objectOut.writeObject(entiy);
		objectOut.close();
	
		} catch (IOException e) {
	
			e.printStackTrace();}
	}
}

class DataBaseRepository implements StorageRepository{
	public void store(Student1 entiy){
	
	System.out.println("Save in Database");
	}

}


/*****************************************************************************/
//Bridge
class StudentRepository  {

	  private StorageRepository repository;
	  public StudentRepository(StorageRepository repository){
	      this.repository=repository;
	  }
		public StorageRepository getRepository(){
			return repository;
		}

	   public Student1 save(Student1 student) {

	  	 if (student == null || student.getName() == null) {
		            return null;
		        }
		        
		        repository.store(student);
		        return student;
	  }
		
	}


class BridgeExample1{
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.setRollno(1);
		s.setName("Anil");
		StudentRepository repo=new StudentRepository(new FileRepository());
		repo.save(s);	
	}
}