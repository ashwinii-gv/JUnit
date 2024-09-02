package testingJUint;
import org.junit.jupiter.api.Test;
//@Test not allowed
public class First {
	@Test// it is method level and cant be applied on class
	void display() {
		System.out.println("My test method");
	}
	@Test
	void Hello()
	{
		System.out.println("qroot");
	}
}
