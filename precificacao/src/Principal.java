public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto();
      //  produto.precoCusto = 100;

produto.alterarPrecoCusto(80);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(produto, 20);

        System.out.printf("Preço de custo: R$ %.2f%n", produto.precoCusto);
        System.out.printf("Preço de venda: R$ %.2f%n", produto.precoVenda);
    }
}