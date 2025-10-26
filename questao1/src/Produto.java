// Produto.java
public abstract class Produto {
    private final String descricao;
    private final double valorBase;

    protected Produto(String descricao, double valorBase) {
        this.descricao = descricao;
        this.valorBase = valorBase;
    }

    protected double aliquotaImpostoEstadual() {
        return 0.10;
    }

    protected double aliquotaTaxaNacional() {
        return 0.00;
    }

    protected double aliquotaTaxaImportacao() {
        return 0.00;
    }

    public final double calcularImpostoEstadual() {
        return valorBase * aliquotaImpostoEstadual();
    }

    public final double calcularTaxaNacional() {
        return valorBase * aliquotaTaxaNacional();
    }

    public final double calcularTaxaImportacao() {
        return valorBase * aliquotaTaxaImportacao();
    }

    public final double calcularTributosTotais() {
        return calcularImpostoEstadual()
                + calcularTaxaNacional()
                + calcularTaxaImportacao();
    }

    public final double calcularPrecoFinal() {
        return valorBase + calcularTributosTotais();
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void gerarRelatorio(){
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor Base: " + this.getValorBase());
        System.out.println("Imposto Estadual: " + this.calcularImpostoEstadual());
        System.out.println("Tributos Totais: " + this.calcularTributosTotais());
        System.out.println("Preço Final: " + this.calcularPrecoFinal());
        System.out.println();
    }
}
