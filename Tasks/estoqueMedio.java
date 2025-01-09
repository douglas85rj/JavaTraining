package Tasks;

/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *************************************************************************/

 import java.util.Scanner;

 public class estoqueMedio {

    public static void main(String [] args) { 
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade mínima do estoque: ");
    int qtdMinima = scanner.nextInt();

    System.out.print("Digite a quantidade máxima do estoque: ");
    int qtdMaxima = scanner.nextInt();

    int estoqueMedio = (qtdMinima + qtdMaxima) / 2;

    System.out.println("O estoque médio é: " + estoqueMedio);

    scanner.close();
    
    
    }
 }
