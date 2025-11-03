public class Podcast extends ConteudoDeAudio {
    private String nomeDoPrograma;
    private int numeroDoEpisodio;

    public Podcast(String titulo, int duracao, String autor,
                   String nomeDoPrograma, int numeroDoEpisodio){
        super(titulo, duracao, autor);
        this.nomeDoPrograma = nomeDoPrograma;
        this.numeroDoEpisodio = numeroDoEpisodio;
    }

    public String getNomeDoPrograma() {
        return nomeDoPrograma;
    }
    public int getNumeroDoEpisodio() {
        return numeroDoEpisodio;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Programa: " + this.nomeDoPrograma);
        System.out.println("Episódio Nº: " + this.numeroDoEpisodio);
    }

    public void pularParaProximoEpisodio() {
        System.out.println("Pulando para o episódio " + (this.numeroDoEpisodio + 1) + " do programa '" + this.nomeDoPrograma + "'.");
    }
}

