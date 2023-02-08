package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streamexample1 {

	public static void main(String[] args) {
List<String> obj=new ArrayList<String>();
	obj.add("vishnu");
	obj.add("shankar");
	obj.add("madisetty");
	
Stream<String> stream=obj.stream();
stream.forEach(p->System.out.println(p));

}
}