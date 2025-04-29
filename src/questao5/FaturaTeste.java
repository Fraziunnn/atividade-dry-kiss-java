package questao5;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("001", "Teclado", 2, 250.0);
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Total: R$" + fatura.getTotalFatura());
    }
}

