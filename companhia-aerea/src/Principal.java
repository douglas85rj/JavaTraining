
public class Principal {

    public static void main(String[] args) {
        Aeronave aviaGol = new Aeronave();
        aviaGol.totalAssentos = 100;
        aviaGol.reservarAssento(10);
        System.out.printf("GOL (%s): %d assentos disponíveis\n", aviaGol.ativo ?
                "ativo" : "inativo", aviaGol.calcularAssentosDisponiveis());

        aviaGol.desativar();


        System.out.printf("GOL (%s): %d assentos disponíveis\n", aviaGol.ativo ?
                "ativo" : "inativo", aviaGol.calcularAssentosDisponiveis());

    }
}