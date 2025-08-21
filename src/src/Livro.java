public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos título
    public String getTitle(){
        return titulo;
    }
    public void setTitle(String title){
        this.titulo = title;
    }
    // Métodos autor
    public String getAuthor(){
        return autor;
    }
    public void setAuthor(String autor){
        this.autor = autor;
    }
    // Método ano
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        int ano_atual = 2025;
        if (anoPublicacao > ano_atual || anoPublicacao < 0){
            System.out.println("Erro: ano inválido");
            return;
        }
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
