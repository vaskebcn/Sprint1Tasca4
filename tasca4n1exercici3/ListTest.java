package tasca4n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	void testCallCar(String car) {
		List list = new List();
		String actual = list.callCar();
		String expected = "seat";
		assertEquals(expected, actual);
	}
}
