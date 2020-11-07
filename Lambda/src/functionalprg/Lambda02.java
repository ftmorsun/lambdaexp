package functionalprg;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

	

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
       //Create a method to print the squares of every element on the console in the same line with a space
		squareEl(myList);
		squareEl2(myList);
		//mulofall(myList);
		System.out.println(multofall(myList));
	}
	//If I  need to apply operations 
	public static void squareEl(List<Integer> list) {
		list.stream()
		.map(t->t*t)
		.forEach(t->System.out.println(t+ " "));
	}
	
	//if I need to do some operation I use map method
	public static void squareEl2(List<Integer> list) {
		list.stream()
		.filter(t->t%2==1)
		.map(t->"The cube is "+t+ "is :"+t*t*t)
		.forEach(System.out::println);
	}
	public static  int  sumofall(List<Integer> list)
	{
		//reduce method works with two parameters. before arrow x,y 
		//when you use single variable no need to  use paranthesis
		//find the sum of elements are found with reduced to 
		 return  list.stream().reduce(0,Integer::sum);

           
		//return list.stream().reduce(0,(x,y)->x+y );
	}
	public static Double sumofsqrtEven(List<Integer> list)
	{
		//reduce method works with two parameters. before arrow x,y 
		//when you use single variable no need to  use paranthesis
		//find the sum of elements are found with reduced to 
	
	     return list.stream()
				 .filter(t->t%2==0)
				 .mapToDouble(Math::sqrt)
				 .reduce((double)0, Double::sum);

           
		//return list.stream().reduce(0,(x,y)->x+y );
	}
	public static int multofall(List<Integer> list)
	{
		//reduce method works with two parameters. before arrow x,y 
		//when you use single variable no need to  use paranthesis
		//find the sum of elements are found with reduced to 
	
	     return list.stream()
				 .filter(t->t%2==1)
			//	 .reduce(1, (x,y)->x*y);
	             // .reduce(1, Math::multiplyExact);
	               .reduce(1, Lambda02::mult);

           
		//return list.stream().reduce(0,(x,y)->x+y );
	}
	
	public static int mult (int a, int b)
	{
		
	
	     return a*b;
	}
	




}
