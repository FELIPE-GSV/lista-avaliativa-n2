public class ProdutoEstadual extends Produto {
    public ProdutoEstadual(String descricao, double valorBase) {
        super(descricao, valorBase);
    }

    public void gerarRelatorio(){
        System.out.println("Descrição: " + super.getDescricao());
        System.out.println("Valor Base: " + super.getValorBase());
        System.out.println("Imposto Estadual: " + super.calcularImpostoEstadual());
        System.out.println("Tributos Totais: " + super.calcularTributosTotais());
        System.out.println("Preço Final: " + super.calcularPrecoFinal());
        System.out.println();
    }
}