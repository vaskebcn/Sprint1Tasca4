package tasca4n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JavaTest {

	@Test
	void testGetSize() {
		Java java = new Java();
		int size = java.getSize();
		assertEquals(12, size);
	}

	@Test
	void testMes8() {
		Java java = new Java();
		String mesA = java.mes8();
		assertEquals("august", mesA);
	}
	
	

}
