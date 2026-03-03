
/**
 * @author 0030482421022
 */
public class Retangulo {

    private double base;
    private double altura;

    //  Getters and Setters
    public double getBase() {
        return this.base;
    }
    
     public void setBase(double base) {
        this.base = base;
    }
     
    public double getAltura() {
        return this.altura;
    }
     
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos
    public double calcArea() {
        return (this.altura * this.base);
    }

    public double calcPerimetro() {
        return (2 * (this.base + this.altura));
    }

    public double calcDiagonal() {
//        double catAltura = Math.pow(this.getAltura(), 2);;
//        double catBase = Math.pow(this.getBase(), 2);
//       
//        return Math.sqrt(catBase + catAltura);

        return Math.hypot(altura, base);
    }
}
