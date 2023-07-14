public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();
        Cachorro meuCachorro = new Cachorro();
        Cachorro seuCachorro = new Cachorro();

        meuCarro.anoFabricacao = 2022;
        meuCarro.cor = "branco";
        meuCarro.fabricante ="Hyundai";
        meuCarro.modelo ="HB20";

        seuCarro.anoFabricacao = 2011;
        seuCarro.cor="verde";
        seuCarro.fabricante ="FIAT";
        seuCarro.modelo = "Uno";

        meuCachorro.raca = "Labrador";
        meuCachorro.tamanho="grande";
        meuCachorro.idade = 7;

        seuCachorro.raca = "vira lata";
        seuCachorro.tamanho="médio";
        seuCachorro.idade =9;



        System.out.println("Meu Carro");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);

        System.out.println("------------");

        System.out.println("Seu Carro");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);

        System.out.println("------------");

        System.out.println("Meu Cachorro");
        System.out.printf("Raça: %s%n", meuCachorro.raca);
        System.out.printf("Tamanho: %s%n",meuCachorro.tamanho);
        System.out.printf("Idade: %d%n", meuCachorro.idade);

        System.out.println("------------");

        System.out.println("Seu Cachorro");
        System.out.printf("Raça: %s%n", seuCachorro.raca);
        System.out.printf("Tamanho: %s%n",seuCachorro.tamanho);
        System.out.printf("Idade: %d%n", seuCachorro.idade);


            }
    }
