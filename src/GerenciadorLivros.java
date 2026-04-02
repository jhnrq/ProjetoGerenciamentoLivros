import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorLivros {
    ArrayList<String> listaLivros = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void CadastrarLivro(String nomeLivro){
        try {
            listaLivros.add(nomeLivro);
            System.out.printf("Livro %s cadastrado com sucesso!\n", nomeLivro);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar livro: " + e);
        }
    }

    public void ListarLivro(){
        System.out.println("Livros cadastrados:");
//        for(String livro : listaLivros) {
//            System.out.println(livro);
//        }
        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.printf("[%s] - %s\n", i+1, listaLivros.get(i));
        }
    }

    public void AtualizarLivro(int indice, String novoNome) {
        if (indice < 0 || indice >= listaLivros.size()) {
            System.out.println("Índice inválido.");
            return;
        }
        String antigo = listaLivros.get(indice);
        listaLivros.set(indice, novoNome);
        System.out.printf("Livro '%s' atualizado para '%s'.%n", antigo, novoNome);
    }

    public void DeletarLivro(){

        System.out.print("Digite o nome do livro para deletar: ");
        String deletarLivro = sc.nextLine();

        if (listaLivros.contains(deletarLivro)){
            System.out.printf("O livro %s foi removido.\n", deletarLivro);
            listaLivros.remove(deletarLivro);
        } else {
            System.out.println("O livro não está na lista.");
        }

    }
}