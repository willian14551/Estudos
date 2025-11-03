public class ConteudoDeAudio {
    private String titulo;
    private int duracao;
    private String autor;

    public ConteudoDeAudio(String titulo, int duracao, String autor){
        this.titulo = titulo;
        this.duracao = duracao;
        this.autor = autor;
    }
    public ConteudoDeAudio(){
    }

    public String getTitulo(){
        return titulo;
    }

    public int getDuracao(){
        return duracao;
    }

    public String getAutor(){
        return autor;
    }

    public void play(){
        System.out.println("Tocando o título" + titulo);
    }
    public void pausa(){
        System.out.println("Pausando o título" + titulo);
    }


    public void exibirDetalhes(){
        System.out.println("--- Detalhes ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Duração: " + this.duracao + " segundos");
    }
}