import java.util.ArrayList;

public class JuegoDeDados {
	private Dado dado1;
	private Dado dado2;
	private Calculadora calculadora;
	public JuegoDeDados() {
		dado1 = new Dado();
		dado2 = new Dado();
		calculadora = new Calculadora();
	}
	public String jugar() {
		dado1.lanzarDado();
		dado2.lanzarDado();
		int suma = calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());

		if (suma == 7) {
			return "ganaste te salio un " + suma;
		} else {
			return "perdiste te salio un " + suma;
		}
	}
}