package day33;

import java.util.ArrayList;
import java.util.List;

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
		System.out.println(max(myList));
		System.out.println(min(myList));
	}
	public static int max(List<Integer> myList)
	{
		return myList.stream()
				.reduce(Integer.MIN_VALUE, (x,y)->x>y?x : y);
	}
	public static int min(List<Integer> myList)
	{
		return myList.stream()
				.reduce(Integer.MAX_VALUE, (x,y)->x<y?x : y);
	}

}
