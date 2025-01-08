import java.util.Scanner;

	public class calculaPagamentos {

	public static void main(String[]args) {

	Scanner entrada = new Scanner(System.in);

	System.out.println("Seu nome ?");
	String nome = entrada.nextLine();

	System.out.println("Valor por hora?");
	double valorHora = entrada.nextDouble();

	System.out.println("Quantas horas trabalhadas?");
	int horasTrabalhadas = entrada.nextInt();
	
	System.out.println("qual o valor dos descontos?");
	double descontos = entrada.nextDouble();
	
	double total = horasTrabalhadas * valorHora;
	double totalDevido = total - descontos;
		
	
	System.out.println("Folha de pagamento" + nome );
	System.out.printf("%d horas x R$ %.2f = R$ %.2f   \n Descontos: R$ %.2f  \nTotal devido: R$ %.2f ", horasTrabalhadas, valorHora, total, descontos, totalDevido);


	}	

}