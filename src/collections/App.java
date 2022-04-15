package collections;

public class App {
	  public static void main(String[] args) {
		  
		  ImplementingIterableUrlLibrary urlLibrary = new ImplementingIterableUrlLibrary();
		  
//		  for(String url: urlLibrary) {
//			  System.out.println(url);
//		  }
		  
		  // for each calls the hasNext inside the class 
		  for(String html: urlLibrary) {
			  System.out.println(html.length());
			  System.out.println(html);
		  }
	  }
}
