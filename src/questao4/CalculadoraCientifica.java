package questao4;

public class CalculadoraCientifica extends Calculadora {
    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        System.out.println("Soma: " + calc.somar(2, 3));
        System.out.println("Raiz Quadrada: " + calc.raizQuadrada(16));
        System.out.println("Potência: " + calc.potencia(2, 4));
    }
}
