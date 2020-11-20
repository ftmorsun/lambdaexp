package functionalprg;
import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Lambda09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum1(20));
		System.out.println(sum2(20));
		System.out.println(sum5());
		System.out.println(sum50());
		System.out.println(fact(4));

	}
	//Create a method to find the sum of first 50 odd positive integers by using "functional programming"
	public static int sum1(int x) 
	{
		return IntStream.range(1,x+1).sum();
		
	}
	
	//Create a method to find the sum of first 50 odd positive integers by using "functional programming"
		public static int sum2(int x) 
		{
			return IntStream.range(1,x).sum();
			
		}

		//Create a method to find the sum of first 50 odd positive integers by using "functional programming"
				public static int sum50() 
				{
					return IntStream.rangeClosed(1,99).filter(t->t%2==1).sum();
					
				}
				
			//Create a method to find the sum of first 50 odd positive integers by using "functional programming"
				public static int sum5() 
				{
					return IntStream.iterate(1, t->t+2).limit(50).sum();
				}
				
				public static OptionalInt power5(int numOfPow) 
				{
					return IntStream.iterate(3, t->t*3).limit(numOfPow).reduce((x,y)->y);
				}
				//Create a method to calculate the factorial of any number (5!=1x2x3x4x5)
				public static OptionalInt fact(int numOfPow) 
				{
					return IntStream.rangeClosed(1,numOfPow).reduce(Math::multiplyExact);
				}
				//Create a method to calculate the factorial of any number (5!=1x2x3x4x5)
				public static Stream<BigInteger> fact2(int numOfPow) 
				{
					return IntStream.rangeClosed(1,numOfPow).mapToObj(BigInteger::valueOf);
				}




}


