package app;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean emprestado;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }

    public String getTitulo() { return titulo; }
    public boolean isEmprestado() { return emprestado; }

    public void emprestar() { emprestado = true; }
    public void devolver() { emprestado = false; }

    @Override
    public String toString() {
        return String.format("%s - %s (%d) [%s]",
                titulo, autor, ano, emprestado ? "Emprestado" : "Disponível");
    }
}
