public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Livro de Caio", "Caio", 2025);

        String titulo = livro.getTitle();
        System.out.println(titulo);
    }
}