import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
            valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " comprado!");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou tudo!");
    }
    
    public static Double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(0.0, 50.0);
    }
}
