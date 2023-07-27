public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double valorCompra;
    Pessoa proprietario;

    void imprimirResumoDepreciacao() {
        double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }
    void imprimirIpva(){
        System.out.printf("O valor do seu IPVA é : %6.2f%n", calcularIpva());
    }
    double calcularIpva(){
        return calcularValorRevenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos() {
        return 2023 - anoFabricacao;
    }

    double calcularValorRevenda() {
        int anosUso = calcularTempoDeUsoEmAnos();

        double valorRevenda = valorCompra - (anosUso * 0.15 * valorCompra);

        if (valorRevenda < 0) {
            valorRevenda = 0;

        }

        return valorRevenda;
    }

}
