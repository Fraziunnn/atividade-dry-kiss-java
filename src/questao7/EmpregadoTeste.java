package questao7;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado("João", "Silva", 3000);
        Empregado emp2 = new Empregado("Maria", "Souza", 4000);

        CalculadoraSalarioAnual calculadora = new CalculadoraSalarioAnualPadrao();
        AumentoSalario aumento = new AumentoPercentual(10);

        System.out.println("Salário Anual João: " + calculadora.calcularSalarioAnual(emp1));
        System.out.println("Salário Anual Maria: " + calculadora.calcularSalarioAnual(emp2));

        aumento.aplicarAumento(emp1);
        aumento.aplicarAumento(emp2);

        System.out.println("\nApós aumento:");
        System.out.println("Salário Anual João: " + calculadora.calcularSalarioAnual(emp1));
        System.out.println("Salário Anual Maria: " + calculadora.calcularSalarioAnual(emp2));
    }
}

