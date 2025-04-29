package questao2;

public class Fatorial {
    public int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        int resultado = f.calcularFatorial(5); // 5! = 120
        System.out.println("Fatorial: " + resultado);
    }
}
