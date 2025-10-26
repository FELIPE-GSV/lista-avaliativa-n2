public class ProdutoNacional extends Produto {
    public ProdutoNacional(String descricao, double valorBase) {
        super(descricao, valorBase);
    }

    @Override
    protected double aliquotaTaxaNacional() {
        return 0.05;
    }
}