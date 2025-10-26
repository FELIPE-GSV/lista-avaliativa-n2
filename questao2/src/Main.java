//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("Victor", 10);

        Pessoa ana = new Pessoa("Ana", 5);
        ana.adicionarContato(new Email("ana@mail.com"));
        ana.adicionarContato(new Telefone("92993599234"));

        Pessoa bruno = new Pessoa("Bruno", 5);
        bruno.adicionarContato(new Telefone("92988026481"));

        agenda.addPessoa(ana);
        agenda.addPessoa(bruno);

        agenda.addContato("Bruno", new Email("bruno@mail.com"));

        agenda.exibirTodasPessoas();
        System.out.println();

        agenda.exibirContatosPessoa("Ana");
        System.out.println();

        agenda.exibirPessoasComEmail();
        System.out.println();

        agenda.recuperarPessoaPorEmail("bruno@mail.com");
        agenda.recuperarPessoaPorTelefone("92993599234");
    }
}
