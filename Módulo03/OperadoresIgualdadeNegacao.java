public class OperadoresIgualdadeNegacao {

	public static void main (String[]args) {
	
	int numero1 = 11;
	int numero2 = 10;
	String nome1 = "Thiago";
	String nome2 = "Miguel";
	boolean numerosIguais = 10 == 10;
	boolean numerosIguais2 = (4+6) == (5*2);
	boolean numerosIguais3 = numero1 == numero2;
	boolean nomesIguais = nome1 == nome2;

	//Operador unário ! negação
	boolean numerosDiferentes = !numerosIguais;	
	//Negar uma expressão boleada
	boolean numerosDiferentes2 = !(numero1 == numero2);
	boolean numerosDiferentes3 = numero1 != numero2;


	System.out.printf("Números iguais: %b%n", numerosIguais);
	System.out.printf("Números iguais 2:  %b %n", numerosIguais2);
	System.out.printf("Números iguais 3: %b%n", numerosIguais3);
	System.out.printf("Números iguais (diferentes): %b%n", numerosDiferentes);
	System.out.printf("Números iguais (diferentes2): %b%n", numerosDiferentes2);
	System.out.printf("Números iguais (diferentes3): %b%n", numerosDiferentes3);
	System.out.printf("Nomes iguais: %b%n", nomesIguais);




	}
}