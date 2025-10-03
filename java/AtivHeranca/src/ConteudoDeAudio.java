public class ConteudoDeAudio {
    protected String titulo;
    protected int duracao;
    protected String autor;

    public ConteudoDeAudio(String titulo, int duracao, String autor){
        this.titulo = titulo;
        this.duracao = duracao;
        this.autor = autor;
    }

    public void play(){
        System.out.println("Tocando o título" + titulo);
    }
    public void pausa(){
        System.out.println("Pausando o título" + titulo);
    }
}