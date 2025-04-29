package questao6;

public class Main {
    public static void main(String[] args) {
        CarroPasseio carro = new CarroPasseio(4, 100, "Vermelho", "Sedan");
        Caminhao caminhao = new Caminhao(8, 300, 15, 400, 1200);

        System.out.println("Carro de Passeio:");
        carro.print();
        System.out.println("\nCaminhão:");
        caminhao.print();
    }
}

