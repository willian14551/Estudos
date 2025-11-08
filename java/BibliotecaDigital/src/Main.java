import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ItemBibliotecaDigital i1 = new Ebook("Thinking in Java", "Bruce Eckel", "PDF", 4.7);
        ItemBibliotecaDigital i2 = new Ebook("Clean Code", "Robert Martin", "EPUB", 2.3);
        ItemBibliotecaDigital i3 = new VideoDigital("CURSO DE JAVA PARA INICIANTES", "Tiago Aguiar", 16, "1080p");
        ItemBibliotecaDigital i4 = new VideoDigital("Curso de PROGRAMAÇÃO JAVA para INICIANTES", "Fernanda Kipper", 120, "4K");

        ArrayList<ItemBibliotecaDigital> acervo = new ArrayList<>();
        acervo.add(i1);
        acervo.add(i2);
        acervo.add(i3);
        acervo.add(i4);

        System.out.println("=== Catálogo ===");
        for (ItemBibliotecaDigital item : acervo) {
            System.out.println(item.descricao());
        }

        System.out.println("\n=== Downloads de Itens Baixáveis ===");
        for (ItemBibliotecaDigital item : acervo) {
            if (item instanceof Baixavel b) {
                b.baixar();
            }
        }

        for (ItemBibliotecaDigital item : acervo) {
            if (item instanceof Visualizavel v) {
                v.visualizar();
            }
        }
    }
}
