package app;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        livros.forEach(System.out::println);
    }

    public void procurarLivro(String titulo) {
        boolean encontrado = false;
        for (Livro l : livros) {
            if (l.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                System.out.println(l);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Nenhum livro encontrado.");
    }

    public void emprestarLivro(String titulo) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo) && !l.isEmprestado()) {
                l.emprestar();
                System.out.println("Livro emprestado com sucesso.");
                return;
            }
        }
        System.out.println("Livro não disponível para empréstimo.");
    }

    public void devolverLivro(String titulo) {
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo) && l.isEmprestado()) {
                l.devolver();
                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Livro não encontrado ou não está emprestado.");
    }
}
