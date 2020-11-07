package functionalprg;

import java.util.ArrayList;
import java.util.List;

public class Lamda01 {
	
	/* Instead of using "Lambda Expression", if it is possible we use "Method Reference"
      Method Reference means ==> Class Name :: Method Name
      t-> System.out.print(t + " ") ==> System.out :: print
    */

 public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(1);
		myList.add(11);
		myList.add(13);
		myList.add(14);
		myList.add(18);
		myList.add(19);
		
		myList.add(17);
		printEvenListElFunctional(myList);
		printListElFunctional(myList);
		
		

	}
	public static void printListElFunctional(List<Integer> list)
	{
		list.stream().forEach(t->System.out.println(t+ " "));
		
	}
	public static void printEvenListElFunctional(List<Integer> list)
	{
		list.stream().filter(t->t%2==0).forEach(t->System.out.println(t+ " "));
		
	}
	public static void print(List<Integer> list)
	{
            for (Integer t:list)
            	System.out.println(t+ " ");
		
	}

}
