import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<ProdutoEstadual> produtosEstaduais = new ArrayList<>();
    private List<ProdutoNacional> produtosNacionais = new ArrayList<>();
    private List<ProdutoImportado> produtosImportados = new ArrayList<>();

    public void cadastrarProdutoEstadual(String descricao, double valorBase) {
        ProdutoEstadual produtoEstadual = new ProdutoEstadual(descricao, valorBase);
        if (produtosEstaduais.contains(produtoEstadual)) {
            System.out.println("Produto já cadastrado.");
            return;
        }
        this.produtosEstaduais.add(produtoEstadual);
        System.out.println("Produto cadastrado com sucesso.");
        System.out.println();
    }

    public void exibirProdutosEstaduais() {
        System.out.println("Produtos Estaduais:");
        for (ProdutoEstadual produtoEstadual : produtosEstaduais) {
            produtoEstadual.gerarRelatorio();
            System.out.println();
        }
        System.out.println();
    }
}
