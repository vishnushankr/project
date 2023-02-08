package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamexample2 {

	public static void main(String[] args) {
ArrayList<Integer> vis=new ArrayList<>(Arrays.asList(1,2,3,9,5,6,7,8));
List<Integer> sha=vis.stream().distinct().collect(Collectors.toList());

System.out.println(sha);
	}

}
