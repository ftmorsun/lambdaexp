package functionalprg;


/*                              15 Minutes
Type a program to count the number of every word in a String
For example; if the String is "Ali, do you know Ali? Ali said you know him."
the output should be like {Ali=3, do=1, you=2, know=2, said=1, him=1}
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
	    list.add("Ali");
	    list.add("Mark");
	    list.add("Jackson");
	    list.add("Amanda");
	    list.add("Mariano");
	    list.add("Alberto");
	    list.add("Tucker");
	    list.add("Christ");
	    
	    reverseIf(list);
	    checkAll(list);
	    noneMatch(list);
	    anyMatch(list);
	    getFirstAfterSort(list);
	    getLastAfterSort(list);

	}
	//Create a method to calculate the squares of strings and print distinctly in reverse order
	public static void reverseIf(List<String> list)
	{
		list.stream().
			map(t->t.length()*t.length()).
			filter(t->t>20).
			distinct().
			sorted(Comparator.reverseOrder()).
			forEach(System.out::print);
	}
	
	//Create a method to check if the length of all elements are less than 8
	public static void checkAll(List<String> list)
	{
		boolean result=list.stream().allMatch(t->t.length()<8);
		System.out.println(result);
	}
	
	//Create a method to chech if the initials of any element are not X
	public static void noneMatch(List<String> list)
	{
		boolean m=list.stream().noneMatch(t->t.startsWith("X"));
		System.out.println(m);
	}
	
	
	//Create a method to chech if at least the initials of any element are not X
	public static void anyMatch(List<String> list)
	{
			boolean m=list.stream().anyMatch(t->t.endsWith("R"));
			System.out.println(m);
	}
	
	
	//Create a method to chech if at least the initials of any element are not X
	public static void   getFirstAfterSort(List<String> list)
	{
		Optional<String> el=list.stream().
								sorted(Comparator.comparing(t->t.charAt(t.length()-2)))
								.findFirst();
			System.out.println(el);
	}
	
	
	//Create a method to get the last elenent after starting the elements by using their length
	
	public static void   getLastAfterSort(List<String> list)
	{
		Optional<String> el=list.stream().
								sorted(Comparator.comparing(t->t.toString().length()).reversed()).
								findFirst();
								
			System.out.println(el);
	}
		
		

}
