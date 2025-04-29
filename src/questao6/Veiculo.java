package questao6;

public class Veiculo {
    private int peso;
    private int velMax;
    private float preco;

    public Veiculo() {
        this(0, 0, 0.0f);
    }

    public Veiculo(int peso, int velMax, float preco) {
        this.peso = peso;
        this.velMax = velMax;
        this.preco = preco;
    }

    public void set(int peso, int velMax, float preco) {
        this.peso = peso;
        this.velMax = velMax;
        this.preco = preco;
    }

    public void print() {
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Vel. Máxima: " + velMax + " km/h");
        System.out.println("Preço: R$" + preco);
    }
}
