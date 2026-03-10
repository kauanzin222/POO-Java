
public class Circulo {

    private double raio;
    private String unidadeMedida;

    public Circulo(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public String getUnidadeMedida() {
        return this.unidadeMedida;
    }
    
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
        return 2 * Math.PI * raio;
    }

    public double calcDiametro() {
        return 2 * raio;
    }
}
