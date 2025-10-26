import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Controlador controlador = new Controlador();

        int opcao;
        do {
            System.out.println("----------------------------");
            System.out.println("*** Cadastro de Produtos ***");
            System.out.println("----------------------------");
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("1 - Cadastrar Produto Estadual");
            System.out.println("2 - Cadastrar Produto Nacional");
            System.out.println("3 - Cadastrar Produto Importado");
            System.out.println("4 - Exibir Produtos Estaduais");
            System.out.println("5 - Exibir Produtos Nacionais");
            System.out.println("6 - Exibir Produtos Importados");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");

            while (!s.hasNextInt()) {
                System.out.print("Digite um número de 1 a 7: ");
                s.next();
            }
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String descricao = s.nextLine();
                    System.out.print("Valor Base: ");
                    double valorBase = s.nextDouble();
                    controlador.cadastrarProdutoEstadual(descricao, valorBase);
                    opcao = 0;
                    break;
                case 2:
//                    System.out.print("Descrição: ");
//                    descricao = s.nextLine();
//                    System.out.print("Valor Base: ");
//                    valorBase = s.nextDouble();
//                    controlador.cadastrarProdutoNacional(descricao, valorBase);
                    opcao = 0;
                    break;

                case 3:
                    //                    System.out.print("Descrição: ");
//                    descricao = s.nextLine();
//                    System.out.print("Valor Base: ");
//                    valorBase = s.nextDouble();
//                    controlador.cadastrarProdutoNacional(descricao, valorBase);
                    opcao = 0;
                    break;
                case 4:
                    System.out.println("Produtos Estaduais:");
                    controlador.exibirProdutosEstaduais();
                    opcao = 0;
                    break;
                case 5:
//                    controlador.exibirProdutosNacionais();
                    opcao = 0;
                    break;
                case 6:
//                    controlador.exibirProdutosImportados();
                    opcao = 0;
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    opcao = 0;


            }
        } while (opcao < 1 || opcao > 7);
    }
}