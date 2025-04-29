package questao6;

public class Motor {
    private int numCilindros;
    private int potencia;

    public Motor() {
        this(0, 0);
    }

    public Motor(int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    public void set(int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    public void print() {
        System.out.println("Cilindros: " + numCilindros);
        System.out.println("Potência: " + potencia + " cv");
    }
}
