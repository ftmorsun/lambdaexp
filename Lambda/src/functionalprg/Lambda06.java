package functionalprg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda06 {
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Jackson");
		list.add("Jackson");
		list.add("Tucker");
		list.add("Christ");
		sortByLastLength(list);
		sortByLength(list);
		removeAorN(list);
		lengthNameSort(list);

	}
	
	//just use stream
	
	public static void toUpper(List<String> list)
	{
		list.
			stream().
			map(t->t.toUpperCase()).
			forEach(System.out::println);
		
	}
	
	//find all in a method
	public static void toUpper2(List<String> list)
	{
		list.
			stream().
			map(String::toUpperCase).
			forEach(System.out::println);
		
	}
	
	//Sort the list with length
	public static void sortByLength(List<String> list)
	{
		list.
			stream().
			sorted(Comparator.comparing(t->t.length())).
			
			forEach(System.out::println);
		
	}
	//Sort the list with last character
		public static void sortByLast(List<String> list)
		{
			list.
				stream().
				sorted(Comparator.comparing(t->t.substring(t.length()-1))).
				
				forEach(System.out::println);
			
		}
		
		//Create a method to sort the elements according to length and 
		public static void sortByLastLength(List<String> list)
		{
			list.
				stream().
				sorted(Comparator.comparing(t->t.toString().length()).thenComparing(t->t.toString().substring(0,1))).
	
				forEach(System.out::println);
			
		}
	
	// Remove the elements if the length of the element is greater than 5
   public static void removeGreaterThanFive(List<String> list){
       list.removeIf(t->t.length()>5);
       System.out.println(list);
   }
	 
   //Remove the elements if the element is starting with 'A' or ending with 'N'
   public static void removeAorN(List<String> list){
       list.removeIf(t->t.startsWith("A") || t.endsWith("N"));
       System.out.println(list);
   }

   
   //Remove the elements if the element is starting with 'A' or ending with 'N'
   public static void lengthNameSort(List<String> list){
       list.
	       stream().
	       sorted(Comparator.comparing(t->t.length())).
	       map(t->t + ": " + t.length()).
	       forEach(System.out::println);
    		   
      // System.out.println(list);
   }


}
