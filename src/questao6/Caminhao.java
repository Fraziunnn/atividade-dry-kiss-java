package questao6;

public class Caminhao extends Motor {
    private int toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
        super();
    }

    public Caminhao(int numCilindros, int potencia, int toneladas, int alturaMax, int comprimento) {
        super(numCilindros, potencia);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void set(int toneladas, int alturaMax, int comprimento) {
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void print() {
        super.print();
        System.out.println("Toneladas: " + toneladas);
        System.out.println("Altura Max: " + alturaMax + " cm");
        System.out.println("Comprimento: " + comprimento + " cm");
    }
}
