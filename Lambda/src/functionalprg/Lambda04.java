package functionalprg;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda04 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(7);
		list.add(4);
		list.add(12);
		list.add(15);
		list.add(15);
		
		distinctEl(list);
		squaredDistinctEl(list);
		
		//distinctEl(list);
        System.out.println();
        squareDistinctSortedEven(list);
        System.out.println();
        sqrtDistinctReverseOdd(list);
        System.out.println();
        
        System.out.println(halfDistinctReverseList1(list));
        System.out.println(halfDistinctReverseSet2(list));

	}
	private static List<Double> halfDistinctReverseList1(List<Integer> list) {
		   return list.
                   stream().
                   filter(t->t>5).
                   map(t->t/2.0).
                   distinct().
                   sorted(Comparator.reverseOrder()).
                   collect(Collectors.toList());
	}
	//Create a method to print list elements in natural order.
	public static void distinctEl(List<Integer> list)
	{
		list
			.stream()
			.sorted()
			.distinct()
			.forEach(System.out::println);
	}
	//Create a method to print the squares of distinct even elements in natural order
	public static void squaredDistinctEl(List<Integer> list)
	{
		list.stream()
		.filter(t->t%2==1)
		.distinct()
		.map(Math::sqrt)
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);

	}
	
	  //Create a method to print the square of distinct, even elements in natural order.
    public static void squareDistinctSortedEven(List<Integer> list){
        list.stream().filter(t->t%2==0).distinct().sorted().map(t->t*t).forEach(System.out::print);
    }
    //Create a method to print the square root of distinct, odd elements in reverse order.
    public static void sqrtDistinctReverseOdd(List<Integer> list){
        list.stream().filter(t->t%2!=0).distinct().map(Math::sqrt).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    //Create a method to print the half of distinct, greater than 5 elements in reverse order in a list.
 

    public static Set halfDistinctReverseSet2(List<Integer> list){
        return list.
                  stream().
                  filter(t->t>5).
                  map(t->t/2.0).
                  collect(Collectors.toSet());
    }


}
