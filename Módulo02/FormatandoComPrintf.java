public class FormatandoComPrintf {


	public static void main (String[]args) {

	String nome1 = "Thiago";
	//%s substitua uma String e %n é para quebra de linha
	System.out.printf("Olá, %s%n",  nome1);
	
	// %d para números inteiros
	int quantidade = 48;
	System.out.printf("Quantidade: %d itens %n ", quantidade);

	//Controlar casas decimais 
	double peso = 983.22;
	System.out.printf("Peso: %.2f %n", peso);


	}


}