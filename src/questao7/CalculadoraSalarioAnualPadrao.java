package questao7;

public class CalculadoraSalarioAnualPadrao implements CalculadoraSalarioAnual {
    @Override
    public double calcularSalarioAnual(Empregado empregado) {
        return empregado.getSalarioMensal() * 12;
    }
}
