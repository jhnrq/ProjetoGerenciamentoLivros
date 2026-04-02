import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ArrayList<String> teste = new ArrayList<>();
//
//        System.out.print("Insira um nome para add: ");
//        String addNome = sc.next();
//
//        teste.add(addNome);
//        teste.add("João");
//        teste.add("Fernanda");
//        teste.add("Diego");
//        teste.add("Agata");
//        teste.add("May");
//        teste.add("Nesh");
//
//        System.out.println(teste.size());
//        teste.remove("Agata");
//        teste.remove(0);
//        System.out.println(teste.size());
//
//        System.out.println(teste.contains("João"));
//
//        if (teste.contains("Fernanda")){
//            System.out.println("O nome estava na lista e foi removido.");
//            teste.remove("Fernanda");
//        } else {
//            System.out.println("O nome não está na lista.");
//        }
//
//
//        for (String nomes : teste){
//            System.out.println(nomes);
//        }
//
//
//        System.out.println("você quer remover todos os valores da lista ?");
//        String opcaoUsuario = sc.next();
//
//        if (opcaoUsuario.equals("sim")){
//            teste.clear();
//
//            System.out.println("Lista resetada com sucesso: " + teste.size());
//
//            for (String nomes : teste){
//                System.out.println(nomes);
//            }
//        }

        GerenciadorLivros gLivros = new GerenciadorLivros();
        boolean continuarRodando = true;

        do {
            System.out.println("Escolha a operação desejada: ");
            System.out.println("[1] Cadastrar Livro  |  [2] Listar Livro");
            System.out.println("[3] Atualizar Livro  |  [4] Deletar Livro");
            System.out.print("[0] Sair do Programa :  ");
            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario){
                case 1:
                    sc.nextLine(); // Limpar o cache do nextLine buffer
                    System.out.println("C A D A S T R O   D E   L I V R O S");
                    System.out.print("Informe o nome do livro: ");
                    String nomeLivro = sc.nextLine();
                    gLivros.CadastrarLivro(nomeLivro);
                    break;
                case 2:
                    System.out.println("L I S T A   D E   L I V R O S");
                    gLivros.ListarLivro();
                    break;
                case 3:
                    System.out.println("A T U A L I Z A Ç Ã O   D E   L I V R O S");
                    gLivros.ListarLivro();
                    sc.nextLine();

                    System.out.print("Informe o número do livro que deseja atualizar: ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o novo nome do livro: ");
                    String novoNome = sc.nextLine();
                    gLivros.AtualizarLivro(indice - 1, novoNome);
                    break;
                case 4:
                    System.out.println("D E L E T A R   L I V R O S");
                    gLivros.DeletarLivro();
                    break;
                case 0:
                    System.out.println("P R O G R A M A   E N C E R R A D O");
                    continuarRodando = false;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;

            }


        } while (continuarRodando);
    }
}