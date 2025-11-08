public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    private int duracaoMin;
    private String resolucao;

    public VideoDigital(String titulo, String autor, int duracaoMin, String resolucao) {
        super(titulo, autor);
        this.duracaoMin = duracaoMin;
        this.resolucao = resolucao;
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: \"" + titulo + "\" (" + autor + ") - " + duracaoMin + " min, " + resolucao;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando vídeo \"" + titulo + "\" em " + resolucao + "...");
        System.out.println("Download concluído de \"" + titulo + "\"!");
    }

    @Override
    public void visualizar() {
        System.out.println("Reproduzindo \"" + titulo + "\" em " + resolucao + "...");
    }
}
