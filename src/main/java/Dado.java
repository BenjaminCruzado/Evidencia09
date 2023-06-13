import java.util.Random;
public class Dado {
	private int caraSuperior;
	public int getCaraSuperior() {
		return this.caraSuperior;
	}
	public void setCaraSuperior(int caraSuperior) {
		this.caraSuperior = caraSuperior;
	}
	public void lanzarDado() {
		Random random = new Random();
		caraSuperior = random.nextInt(6) + 1;
	}
}


