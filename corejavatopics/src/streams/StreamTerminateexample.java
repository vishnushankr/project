package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTerminateexample {

	public static void main(String[] args) {
List<String> names=new ArrayList<>();
names.add("vishnu");
names.add("shiva");
names.add("mani");
names.add("manjunath");

boolean matchedResult = names.stream()
.anyMatch((s) -> s.startsWith("s"));

boolean matchedResult1 = names.stream()
.allMatch((s) -> s.startsWith("s"));

System.out.println(matchedResult);
System.out.println(matchedResult1);

	}

}
