package tasca4n1exercici2;

public class CalculoDni {

	final int divisor = 23;

	public CalculoDni() {
	}

	public char calcularLetra(String completoDni) {
		int numeroDni = Integer.parseInt(completoDni);
		char[] letra = { 't', 'r', 'w', 'a', 'g', 'm', 'y', 'f', 'p', 'd', 'x', 'b', 'n', 'j', 'z', 's', 'q', 'v',
				'h', 'l', 'c', 'k', 'e' };
		int num = (numeroDni % divisor);
		char let = letra[num];
		return let;
	}

}
