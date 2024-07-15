import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Questão 01 da lista 05

public class Q01LivroUtil {
    public static void main(String[] args) {
        Deque<Q01Livro> pilhaDeLivros = new ArrayDeque<Q01Livro>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("Vamos inserir mais um livro na pilha!");
            System.out.println("Insira o nome do livro");
            String nomeLivro = scanner.nextLine();
            System.out.println("Insira o nome do(s) autor(es):");
            String autorLivro = scanner.nextLine();
            System.out.println("Insira o número da edição do livro: ");
            int edicaoLivro = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Insira o ano do livro: ");
            int anoLivro = scanner.nextInt();
            scanner.nextLine();

            pilhaDeLivros.push(new Q01Livro(nomeLivro, autorLivro, edicaoLivro, anoLivro));
        }
        System.out.println("Atual pilha de livros: \n" + pilhaDeLivros);

        Deque<Q01Livro> pilhaTemp = new ArrayDeque<>();

        pilhaTemp.push(pilhaDeLivros.pop());
        pilhaTemp.push(pilhaDeLivros.pop());
        pilhaDeLivros.pop();

        System.out.println("Atual pilha de livros: \n" + pilhaDeLivros);
        System.out.println("Pilha temporária: \n" + pilhaTemp);

        pilhaDeLivros.push(pilhaTemp.pop());
        pilhaDeLivros.push(pilhaTemp.pop());

        System.out.println("Atual pilha de livros: \n" + pilhaDeLivros);
        System.out.println("Pilha temporária: \n" + pilhaTemp);

        scanner.close();
    }
}