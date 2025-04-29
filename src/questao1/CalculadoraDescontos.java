package questao1;

public class CalculadoraDescontos {
    public double calcularDesconto(double preco, double percentualDesconto) {
        return preco - (preco * percentualDesconto);
    }

    public static void main(String[] args) {
        CalculadoraDescontos calc = new CalculadoraDescontos();
        double resultado = calc.calcularDesconto(100.0, 0.1); // 10% de desconto
        System.out.println("Preço com desconto: R$" + resultado);
    }
}
