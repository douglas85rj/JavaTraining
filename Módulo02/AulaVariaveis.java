
//declaração com CamelCase
public class AulaVariaveis {

public static void main (String[] args) {

	//lowerCamelCAse na declaração
	int minhaIdade = 40;
  	int suaIdade = 50;
	int idadeJoao = 60;
 
	
	//Adição 
	int totalIdades = minhaIdade + suaIdade + 100;
	System.out.println("Soma do total das totalIdades: " + totalIdades);
	//Subtração
	int diferencaIdades = minhaIdade - suaIdade;
	System.out.println("A diferença das idades é :"+ diferencaIdades);

	//Multiplicação
	int multiplicacao =  2 * suaIdade;
	System.out.println("Dobro da idade é :" + multiplicacao);


	//Divisão
	int metadeIdade = suaIdade / 2;
	System.out.println("A metade da sua idade é:"+ metadeIdade);
	
	//Resto de divisão
	int restoDivisao = 7 % 2;
	System.out.println("O resto de divisão é :" + restoDivisao);

	int idadeMedia =  (minhaIdade + suaIdade + idadeJoao) / 3;

	System.out.println("A média de idade da classe é "+ idadeMedia);
  }
}