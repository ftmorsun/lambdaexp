package functionalprg;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(7);
		list.add(4);
		list.add(12);
		list.add(15);
		list.add(15);
		System.out.println(halfDistincReverseSet(list));

	}
	public static Set halfDistincReverseSet(List<Integer> list)
	{
		return list.
				stream().
				filter(t->t>5)
				.map(t->t/2.0)
				.collect(Collectors.toSet());
	}

}
