import java.util.Scanner;

public class CalculadorImc {

public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Peso: ");
	int peso = entrada.nextInt();

	System.out.print("Altura: ");
	double altura = entrada.nextDouble();	

	double imc =  peso / (altura * altura);
	//ajuste para rodar o nome fora da ordem
	entrada.nextLine();
	
	System.out.print("Nome: ");
	String nome = entrada.nextLine();

	System.out.printf("IMC de %s: %.2f%n", nome, imc);

	}	

}