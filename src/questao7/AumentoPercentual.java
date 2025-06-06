package questao7;

public class AumentoPercentual implements AumentoSalario {
    private double percentual;

    public AumentoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public void aplicarAumento(Empregado empregado) {
        double novoSalario = empregado.getSalarioMensal() * (1 + percentual / 100);
        empregado.setSalarioMensal(novoSalario);
    }
}

