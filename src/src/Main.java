import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listaLivro = new ArrayList<>();
        Biblioteca minhaBiblioteca = new Biblioteca(listaLivro);
        Livro livro = new Livro("Livro de Caio", "Caio", 2025);
        minhaBiblioteca.adicionarLivro(livro);
    }
}