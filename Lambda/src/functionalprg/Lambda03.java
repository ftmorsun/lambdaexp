package functionalprg;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myList = new ArrayList<>();
		myList.add(12);
		myList.add(9);
		myList.add(13);
		myList.add(4);
		myList.add(6);
		myList.add(2);
		myList.add(15);
		LocalTime startTime1= LocalTime.now();
		System.out.println(startTime1);
		System.out.println(maxWithSort(myList));
		System.out.println(LocalTime.now());
		System.out.println(min(myList));
		System.out.println(LocalTime.now());
		 printAllSorted(myList);
	}
	public static int max(List<Integer> myList)
	{
		return myList.stream()
				.reduce(Integer.MIN_VALUE, (x,y)->x>y?x : y);
	}
	//store a minumum that is even and bigger than 7
	public static int min(List<Integer> myList)
	{
		return myList.stream()
				.filter(t->t%2==0 && t>7)
				
				.reduce(Integer.MAX_VALUE, (x,y)->x<y?x : y);
	}
	//find all sorted elements
	public static void printAllSorted(List<Integer> myList)
	{
		myList.stream()
		.sorted()
		.forEach(System.out::print);
		
	}
	//find max by sorting values
	public static Optional<Integer> maxWithSort(List<Integer> myList)
	{
		//Optional is like try catch to collect 
		Optional<Integer> max=myList.stream()
		.sorted()
		.reduce((x,y)->x); //for min write x and for max write y
		return max;
	}
	
	public static int min2 (List<Integer> myList)
	{
	   int min=myList.get(0);
	   for (Integer el:myList)
	   {
		   min=el<min?el:min;
	   }
	   return min;
	   
	}

}
