package tasca4n1exercici2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTest {
	
	@ParameterizedTest
	@CsvSource({
	    "56756756, r",
	    "06156035, q",
	    "17850925, g",
	    "54512824, h",
	    "51542428, a",
	    "24285451, g",
	    "65622428, r",
	    "65622428, r",
	    "76731814, l",
	    "58513734, d"    
	})
	void test(String Dni, char letra) {
		char expected = letra;
		CalculoDni dni = new CalculoDni();
		char actual = dni.calcularLetra(Dni);
		assertEquals(expected, actual);
	}
}
