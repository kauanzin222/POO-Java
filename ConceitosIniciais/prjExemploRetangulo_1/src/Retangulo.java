
/**
 * @author 0030482421022
 */
public class Retangulo {

    private double base;
    private double altura;

    //  Getters and Setters
    public double getAltura() {
        return this.altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Métodos
    public double calcArea() {
        return (this.altura * this.base);
    }

    public double calcPerimetro() {
        return (2 * (this.base + this.altura));
    }

    public double calcDiagonal() {      
        return Math.hypot(this.altura, this.base);
    }
}
