public class Audiobook extends ConteudoDeAudio {
    private String narrador;
    private int totalDeCapitulos;

    public Audiobook(String titulo, int duracao, String autor, String narrador, int totalDeCapitulos) {
        super(titulo, duracao, autor);
        this.narrador = narrador;
        this.totalDeCapitulos = totalDeCapitulos;
    }

    public String getNarrador() {
        return narrador;
    }

    public int getTotalDeCapitulos() {
        return totalDeCapitulos;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Narrador: " + this.narrador);
        System.out.println("Total de Capítulos: " + this.totalDeCapitulos);
    }

    public void marcarCapitulo (int numeroDoCapitulo){
        if (numeroDoCapitulo > 0 && numeroDoCapitulo <= totalDeCapitulos){
            System.out.println("Capítulo " + numeroDoCapitulo + " marcado no audiobook '" + getTitulo() + "'.");
        }
        else {
            System.out.println("Capítulo Inválido.");
        }
    }
}