public class Ebook extends ItemBibliotecaDigital implements Baixavel {
    private String formato;
    private double tamanhoMB;

    public Ebook(String titulo, String autor, String formato, double tamanhoMB) {
        super(titulo, autor);
        this.formato = formato;
        this.tamanhoMB = tamanhoMB;
    }

    @Override
    public String descricao() {
        return "Ebook: \"" + titulo + "\" (" + autor + ") - " + formato + ", " + tamanhoMB + " MB";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando ebook \"" + titulo + "\" em " + formato + "...");
        System.out.println("Download concluído de \"" + titulo + "\"!");
    }
}
