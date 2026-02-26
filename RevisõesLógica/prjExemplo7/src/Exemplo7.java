
/**
 * @author 0030482421022
 */
public class Exemplo7 {

    public static void main(String[] args) {
        int[] TabNum;
        int cont = 0;
        
        TabNum = new int[3];
        
        while (cont < TabNum.length) {
            TabNum[cont] = cont + 2;
            cont++;
        }
        
        for (cont = 0; cont < TabNum.length; cont++) {
            System.out.print("Conteúdo de TabNum[ " + cont + " ]: ");
            System.out.println(TabNum[cont]);
        }
    }
    
}
