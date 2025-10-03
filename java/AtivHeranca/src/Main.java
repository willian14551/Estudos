import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList <ConteudoDeAudio> biblioteca = new ArrayList<>();

        int opcao = 0;

        do{
            System.out.println("\n--- Menu Biblioteca de Aúdio feita por Willian e Kamilly ---");
            System.out.println("1. Cadastrar Música");
            System.out.println("2. Cadastrar Podcast");
            System.out.println("3. Listar Biblioteca");
            System.out.println("4. Ouvir Música / Podcast");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n-- Cadastro de Música --");
                    System.out.print("Título: ");
                    String tituloMusica = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorMusica = scanner.nextLine();
                    System.out.print("Álbum: ");
                    String album = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Duração em segundos: ");
                    int duracaoMusica = scanner.nextInt();

                    Musica novaMusica = new Musica(tituloMusica, duracaoMusica, autorMusica, album, genero);
                    biblioteca.add(novaMusica);
                    System.out.println("Musica cadastrada!");
                    break;

                case 2:
                    System.out.println("\n-- Cadastro de Podcast --");
                    System.out.print("Título: ");
                    String tituloPodcast = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorPodcast = scanner.nextLine();
                    System.out.println("Nome do Programa: ");
                    String nomePrograma = scanner.nextLine();
                    System.out.println("Numero do Episódio: ");
                    int numeroEpisodio = scanner.nextInt();
                    System.out.print("Duração em horas: ");
                    int duracaoPodcast = scanner.nextInt();
                    scanner.nextLine();

                    Podcast novoPodcast = new Podcast(tituloPodcast, duracaoPodcast, autorPodcast,
                            nomePrograma, numeroEpisodio);
                    biblioteca.add(novoPodcast);
                    System.out.println("Podcast cadastrado!");
                    break;

                case 3:
                    System.out.println("\n-- Itens na Biblioteca --");

                    if (biblioteca.isEmpty()){
                        System.out.println("A Biblioteca está vázia!");
                    }
                    else{
                        for(ConteudoDeAudio item: biblioteca){
                            System.out.println("--------------");
                            System.out.println("Título: " + item.titulo);
                            System.out.println("Autor: " + item.autor);

                            if (item instanceof Musica){
                                Musica musica = (Musica) item;
                                System.out.println("Tipo: Música");
                                System.out.println("Albúm: " + musica.getAlbum());
                                System.out.println("Gênero: " + musica.getAlbum());
                            }
                            else if (item instanceof Podcast){
                                Podcast podcast = (Podcast) item;
                                System.out.println("Tipo: Podcast");
                                System.out.println("Programa: " + podcast.getNomeDoPrograma());
                                System.out.println("Episódio: " + podcast.getNumeroDoEpisodio());
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n-- Tocador de Midia --");

                    if (biblioteca.isEmpty()){
                        System.out.println("A Biblioteca está vazia! Voltando ao Menu...");
                        break;
                    }

                    System.out.println("Itens disponíveis: ");
                    for (int i = 0; i < biblioteca.size(); i++){
                        System.out.println(i + 1);
                    }

                    System.out.println("\nEscolha o número do item para tocar: ");
                    int escolhaItem = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaItem > 0 && escolhaItem <= biblioteca.size()){
                        ConteudoDeAudio itemSelecionado = biblioteca.get(escolhaItem - 1);

                        System.out.println("Você selecionou: " + itemSelecionado.titulo);
                        System.out.println("1. Play");
                        System.out.println("2. Pausa");
                        System.out.print("Escolha uma ação: ");
                        int acao = scanner.nextInt();
                        scanner.nextLine();

                        if (acao == 1) {
                            itemSelecionado.play();
                        }
                        else if (acao == 2){
                            itemSelecionado.pausa();
                        }
                        else {
                            System.out.println("Opção inválida!");
                        }
                    }
                    else {
                        System.out.println("Número inválido!");
                    }
                    break;

                case 5:
                    System.out.println("Adeus!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        while (opcao != 5);
        scanner.close();
    }
}