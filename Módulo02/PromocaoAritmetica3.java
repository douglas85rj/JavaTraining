
public class PromocaoAritmetica3 {

	public static void main (String[]args) {

	int x =3;
	int y = 2;
	float z = x/y; //o resultado da operação acaba ficando tipo int, pois esta   	calculando duas variáveis tipo int.

	//Para ter o resultado float precisa que uma das variáveis seja float ou 	double para 	ocorrer a promoção aritmetica.

	//Se não for possível alterar o tipo da variável pode ser feito o casting.

	System.out.println(z);

	}

}