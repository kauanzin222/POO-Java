
/**
 * @author KauãCardoso
 */
public class Aplic {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(5.0);
        retangulo.setBase(8.0);

        System.out.println("BASE: " + retangulo.getBase());
        System.out.println("ALTURA: " + retangulo.getAltura());
        
        System.out.println("\nMedida da área do Retângulo: " + retangulo.calcArea());
        System.out.println("Medida do perímetro do Retângulo: " + retangulo.calcPerimetro());
        System.out.printf("Medida da diagonal do Retângulo: %.2f\n", retangulo.calcDiagonal());
    }

}
