
/**
 * @author vania
 */
public class Circulo {

    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public double calcArea() {
        return Math.PI * (raio * raio);
    }

    public double calcPerimetro() {
        return 2* Math.PI * raio;
    }

    public double calcDiametro() {
        return 2 * raio;
    }
}
