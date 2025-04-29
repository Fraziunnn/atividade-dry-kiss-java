package questao6;

public class CarroPasseio extends Motor {
    private String cor;
    private String modelo;

    public CarroPasseio() {
        super();
        cor = "";
        modelo = "";
    }

    public CarroPasseio(int numCilindros, int potencia, String cor, String modelo) {
        super(numCilindros, potencia);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void set(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public void print() {
        super.print();
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }
}
