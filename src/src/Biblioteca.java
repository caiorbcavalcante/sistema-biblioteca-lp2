import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> listaLivros = new ArrayList<>();

    public Biblioteca(ArrayList<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public void adicionarLivro(Livro livro){
        listaLivros.add(livro);
        System.out.println("Livro " + livro.getTitle() + " adicionado com sucesso");
    }

}
