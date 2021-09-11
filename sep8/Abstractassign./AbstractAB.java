package abstraction;

    public class AbstractAB {
	

	abstract class A{
		abstract void  display();
	}
	class B extends A{
		void display() {
			System.out.println("call me from B");
		}
	}
    

}
