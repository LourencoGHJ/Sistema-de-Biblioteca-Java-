package app;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            System.out.println("\n=== Sistema de Biblioteca ===");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Procurar livro");
            System.out.println("4. Emprestar livro");
            System.out.println("5. Devolver livro");
            System.out.println("0. Sair");

            opcao = Util.lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    String titulo = Util.lerString("Título: ");
                    String autor = Util.lerString("Autor: ");
                    int ano = Util.lerInt("Ano: ");
                    biblioteca.adicionarLivro(new Livro(titulo, autor, ano));
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    biblioteca.procurarLivro(Util.lerString("Digite parte do título: "));
                    break;
                case 4:
                    biblioteca.emprestarLivro(Util.lerString("Título do livro: "));
                    break;
                case 5:
                    biblioteca.devolverLivro(Util.lerString("Título do livro: "));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
