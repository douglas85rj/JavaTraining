public class Carro {

String fabricante;
String modelo;
String cor;
int anoFabricacao;
double valorCompra;
Pessoa proprietario;

double calcularValorRevenda() {
    int anosUso = 2023 - anoFabricacao;

    double valorRevenda = valorCompra - (anosUso * 0.15 * valorCompra);

    if (valorRevenda < 0){
        valorRevenda = 0;

    }

//    System.out.printf("Tempo de uso (anos): %d%n",anosUso);
//    System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);

    return valorRevenda;
}

}
