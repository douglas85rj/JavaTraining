package curso.operadoresTernarios;

public class opTernarios {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
//IF ELSE
		if (media >= 70) {
			System.out.println("Aluno aprovado:" + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação!");
		} else {
			System.out.println("Aluno Reprovado!" + media);
		}
//Operador ternário
		String saidaResultado;

		saidaResultado = media >= 70 ? "Aluno aprovado!" : "Aluno Reprovado";

		System.out.println(saidaResultado);

		/* Switch CASE: Operações exatas */

		int dia = 1;

		switch (dia) {
		case 1: {
			System.out.println("domingo !");
			break;
		}
		case 2: {
			System.out.println("segunda-feira !");
			break;
		}

		default:
			System.out.println("outro dia qualquer");
		}

		/* While - Verifica e depois executa o código */
		int numero = 0;

		while (numero <= 3) {
			System.out.println("O número atual é :" + numero);
			numero++;
		}

		// do while - executa e depois verifica

		do {
			System.out.println("O número atual é :" + numero);
			numero++;

		} while (numero <= 5);

	}

}
