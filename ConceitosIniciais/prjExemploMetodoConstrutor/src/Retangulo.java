
public class Retangulo {

    private double altura;
    private double base;
    private String unidadeMedida;

    public void setAltura(double alt) {
        altura = alt;
    }

    public void setBase(double bas) {
        base = bas;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public Retangulo(String unidMed) {
        unidadeMedida = unidMed;
    } //MÉTODO CONSTRUTOR, usado só uma vez, mesmo nome classe
 
    public double calcArea() {
        return (altura * base);
    }

    public double calcPerimetro() {
        return ((altura * 2) + (base * 2));
    }

    public double calcDiagonal() {
        return (Math.sqrt((Math.pow(altura, 2)) + (Math.pow(base, 2))));
    }
}
