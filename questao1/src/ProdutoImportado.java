public class ProdutoImportado extends Produto {
    public ProdutoImportado(String descricao, double valorBase) {
        super(descricao, valorBase);
    }

    @Override
    protected double aliquotaTaxaNacional() {
        return 0.05;
    }

    @Override
    protected double aliquotaTaxaImportacao() {
        return 0.05;
    }
}
