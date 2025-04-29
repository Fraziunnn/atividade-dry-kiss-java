package questao5;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoPorItem(precoPorItem);
    }

    public String getNumero() { return numero; }
    public String getDescricao() { return descricao; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoPorItem() { return precoPorItem; }

    public void setQuantidade(int quantidade) {
        this.quantidade = Math.max(0, quantidade);
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = Math.max(0.0, precoPorItem);
    }

    public double getTotalFatura() {
        return quantidade * precoPorItem;
    }
}

