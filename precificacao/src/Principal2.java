public class Principal2 {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        //Alterando uma variável estática
        produto1.alterarCustoEmbalagem(12);
        produto2.alterarCustoEmbalagem(20);
        //    produto1.custoEmbalagem = 10;
        //   produto2.custoEmbalagem = 15;

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }

}
