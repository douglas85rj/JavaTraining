public class Aeronave {

    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void desativar() {
        ativo = false;
    }
    void ativar() {
        ativo = true;
    }
    void reservarAssento(int numeroAssentos) {
        if (ativo) {
            assentosReservados += numeroAssentos;
        } else {
            System.out.println("Aeronave inativa");
        }
    }
    void cancelarReserva() {
        assentosReservados--;
    }

}


