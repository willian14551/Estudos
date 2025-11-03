import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void tocarConteudo(ConteudoDeAudio item) {
        System.out.println("\n--- Tocando agora ---");
        item.exibirDetalhes();
        System.out.println("--------------------");
    }

    public static void interagirComConteudo(ConteudoDeAudio item) {
        if (item instanceof Musica) {
            Musica musica = (Musica) item;
            musica.adicionarAPlaylist("Favoritas");
        } else if (item instanceof Podcast) {
            Podcast podcast = (Podcast) item;
            podcast.pularParaProximoEpisodio();
        } else if (item instanceof Audiobook) {
            Audiobook audiobook = (Audiobook) item;
            audiobook.marcarCapitulo(3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ConteudoDeAudio> biblioteca = new ArrayList<>();

        int opcao = 0;
        do {
            System.out.println("\n--- Menu Spotify ---");
            System.out.println("1. Cadastrar Música");
            System.out.println("2. Cadastrar Podcast");
            System.out.println("3. Cadastrar Audiobook");
            System.out.println("4. Listar Biblioteca");
            System.out.println("5. Tocar um conteúdo");
            System.out.println("6. Interagir com um conteúdo");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
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
                    scanner.nextLine();

                    Musica novaMusica = new Musica(tituloMusica, duracaoMusica, autorMusica, album, genero);
                    biblioteca.add(novaMusica);
                    System.out.println("Música cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n-- Cadastro de Podcast --");
                    System.out.print("Título do Episódio: ");
                    String tituloPodcast = scanner.nextLine();
                    System.out.print("Autor/Host: ");
                    String autorPodcast = scanner.nextLine();
                    System.out.print("Nome do Programa: ");
                    String nomePrograma = scanner.nextLine();
                    System.out.print("Número do Episódio: ");
                    int numeroEpisodio = scanner.nextInt();
                    System.out.print("Duração em segundos: ");
                    int duracaoPodcast = scanner.nextInt();
                    scanner.nextLine();

                    Podcast novoPodcast = new Podcast(tituloPodcast, duracaoPodcast, autorPodcast, nomePrograma, numeroEpisodio);
                    biblioteca.add(novoPodcast);
                    System.out.println("Podcast cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n-- Cadastro de Audiobook --");
                    System.out.print("Título: ");
                    String tituloAudiobook = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorAudiobook = scanner.nextLine();
                    System.out.print("Narrador: ");
                    String narrador = scanner.nextLine();
                    System.out.print("Total de Capítulos: ");
                    int totalCapitulos = scanner.nextInt();
                    System.out.print("Duração em segundos: ");
                    int duracaoAudiobook = scanner.nextInt();
                    scanner.nextLine();

                    Audiobook novoAudiobook = new Audiobook(tituloAudiobook, duracaoAudiobook, autorAudiobook, narrador, totalCapitulos);
                    biblioteca.add(novoAudiobook);
                    System.out.println("Audiobook cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("\n-- Itens na Biblioteca --");
                    if (biblioteca.isEmpty()) {
                        System.out.println("A biblioteca está vazia!");
                    } else {
                        for (int i = 0; i < biblioteca.size(); i++) {
                            System.out.println((i + 1) + ". " + biblioteca.get(i).getTitulo() + " - " + biblioteca.get(i).getAutor());
                        }
                    }
                    break;

                case 5:
                case 6:
                    if (biblioteca.isEmpty()) {
                        System.out.println("A biblioteca está vazia!");
                        break;
                    }
                    System.out.println("\nEscolha o número do item:");
                    for (int i = 0; i < biblioteca.size(); i++) {
                        System.out.println((i + 1) + ". " + biblioteca.get(i).getTitulo());
                    }
                    int escolha = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (escolha >= 0 && escolha < biblioteca.size()) {
                        ConteudoDeAudio itemSelecionado = biblioteca.get(escolha);
                        if (opcao == 5) {
                            tocarConteudo(itemSelecionado);
                        } else {
                            interagirComConteudo(itemSelecionado);
                        }
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 7:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 7);
        scanner.close();
    }
}