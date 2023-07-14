package cursojava.executavel;

public class PrimeiraClasseJava {
	static int numMagic;

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// Operações lógicas aninhadas : Operações dentro de operações
		if (media >= 50) {
			if (media >= 70) {
				System.out.println("Aluno Aprovado direto!");
			}

		} else {
			System.out.println("Aluno em recuperação!");
		}

		// Repetição com break

		for (numMagic = 10; numMagic >= 0; numMagic--) {

			if (numMagic == 7) {
				System.out.println("Obaaaa, encontrei o número mágico :" + numMagic);
				System.out.println("Estou parando de executar");
				break;
			}
		}
		
		/*Estrutura de repetição com continue */
		
		for (numMagic = 10; numMagic >= 0; numMagic--) {

			if (numMagic == 7 || numMagic == 6 || numMagic == 9) {
				System.out.println("Obaaaa, encontrei o número mágico :" + numMagic);
				continue;
				
			}
		}
		/* Módulo:Resto de divisão % */
		
		double carro = 9;
		double pessoa =2;
		
		double resto = carro % pessoa; //MOD
		
		System.out.println("Sobraram exatamente : " + resto + " carros.");

	}
}