package creational_pattern;

public class singletonexampple {
	static class Product {
		   private  static Product product=null;
		    private Product()
		    {
		        System.out.println("object is created");
		    }
		public static Product getInstance()
		{    
		    if(product==null) {
		        product=new Product();
		        //return product;
		    }
		    return product;//address of old product
		}
		}
		public static class SingleToneExample {
		 
		    public static void main(String[] args) {
		   // Product obj=new Product();
		    	
		        Product u1=Product.getInstance();
		        System.out.println(u1);
		        Product u2=Product.getInstance();
		        System.out.println(u2);
		        Product u3=Product.getInstance();
		        System.out.println(u3);
		    }
		 
}
}
