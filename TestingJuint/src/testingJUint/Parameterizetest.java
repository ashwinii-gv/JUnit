package testingJUint;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;


public class Parameterizetest {
	@ParameterizedTest//annotation
	@ValueSource(strings= {"cali","bali","manu"})
	
	
	void endswithI(String str) {
		assertTrue(str.endsWith("i"));

}
}

	