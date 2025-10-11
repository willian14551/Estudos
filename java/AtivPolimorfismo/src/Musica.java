public class Musica extends ConteudoDeAudio {
    private String album;
    private String genero;

    public Musica(String titulo, int duracao, String autor, String album, String genero){
        super(titulo, duracao, autor);

        this.album=album;
        this.genero=genero;
    }
    public String getAlbum(){
        return album;
    }
    public String getGenero(){
        return genero;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Gênero: " + this.genero);
        System.out.println("Album");
    }

    public void adicionarAPlaylist(){
        System.out.println("A musica '"  + this.titulo + "' foi adicionada à sua playlist.")
    }
}