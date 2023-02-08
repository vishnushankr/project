package streams;
import java.util.*;
class product{
	int id;
	String name;
	float price;
	public product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Streamfilterexample {

	public static void main(String[] args) {
		List<product> obj=new ArrayList<product>();
		obj.add(new product(1,"lg tv",15000f));
		obj.add(new product(2,"lg washingmachine",15000f));
		obj.add(new product(3,"lg refridgarator",24000f));
		obj.add(new product(4,"lg mobilephone",22000f));
		obj.add(new product(5,"lg microphone",12000f));
		obj.add(new product(6,"lg speakers",3000f));

		product productA = obj.stream()  
	               .max((product1,product2)-> product1.price > product2.price ? 1: -1 ).get();
	 
	        	System.out.println(productA.price); 
	        	
	        	
	        	obj.stream()  
                .filter(product -> product.price == 22000)  
                .forEach(product -> System.out.println(product.name)); 
	        	
	        	
	        	float totalPrice2 = obj.stream()  
	                    .map(product->product.price)
	                    .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
	            System.out.println(totalPrice2);
	        	
	        	
	        	
	        	
	}

}
