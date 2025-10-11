public class Audiobook extends ConteudoDeAudio {
    private String narrador;

    public Audiobook (String titulo, int duracao, String autor, String narrador){
        super(titulo, duracao, autor);
        this.narrador = narrador;
    }
    public String getNarrador(){
        return narrador;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Narrador: " + this.narrador);
    }

    public void marcarPagina(){
        System.out.println("Página marcada no audiobook '" + this.titulo + "'.");
    }
}
