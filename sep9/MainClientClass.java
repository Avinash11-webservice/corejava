    package mainclientclass;

	import com.addition.AdditionServiceClass;
	import com.evenoddclass.EvenOddServiceClass;
	import com.multiplication.MultiplicationServiceClass;
	import com.substraction.SubstractionServiceClass;

	public class MainClientClass {

		public static void main (String arg[]) {
		AdditionServiceClass additionserviceclass = new AdditionServiceClass();
        additionserviceclass.SumOfNumber(87, 50);
		
		SubstractionServiceClass substractionserviceclass = new SubstractionServiceClass();
		substractionserviceclass.SubOfNumber(87, 32);

		MultiplicationServiceClass multiplicationserviceclass =new MultiplicationServiceClass();
		multiplicationserviceclass.ProductOfNumber(20, 15);
		
		EvenOddServiceClass evenoddserviceclass = new EvenOddServiceClass();
		evenoddserviceclass.EvenOrOdd(556);
	}
	}


