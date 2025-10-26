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

    public void cadastrarProdutoNacional(String descricao, double valorBase) {
        ProdutoNacional produtoNacional = new ProdutoNacional(descricao, valorBase);
        if (produtosNacionais.contains(produtoNacional)) {
            System.out.println("Produto já cadastrado.");
            return;
        }
        this.produtosNacionais.add(produtoNacional);
        System.out.println("Produto cadastrado com sucesso.");
        System.out.println();
    }

    public void exibirProdutosNacionais() {
        System.out.println("Produtos Nacionais:");
        for (ProdutoNacional produtoNacional : produtosNacionais) {
            produtoNacional.gerarRelatorio();
            System.out.println();
        }
        System.out.println();
    }

    public void cadastrarProdutoImportado(String descricao, double valorBase) {
        ProdutoImportado produtoImportado = new ProdutoImportado(descricao, valorBase);
        if (produtosImportados.contains(produtoImportado)) {
            System.out.println("Produto já cadastrado.");
            return;
        }
        this.produtosImportados.add(produtoImportado);
        System.out.println("Produto cadastrado com sucesso.");
        System.out.println();
    }

    public void exibirProdutosImportados() {
        System.out.println("Produtos Importados:");
        for (ProdutoImportado produtoImportado : produtosImportados) {
            produtoImportado.gerarRelatorio();
            System.out.println();
        }
        System.out.println();
    }
}
