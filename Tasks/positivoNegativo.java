package Tasks;

import java.util.Scanner;

public class positivoNegativo {

    public static void main(String[] args) {
       
    int numero;
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero");
    numero = sc.nextInt();

    if (numero < 0){
        System.out.println("NEGATIVO ");
    }else{
        System.out.println("NAO NEGATIVO");
    }

    sc.close();

 }

}
