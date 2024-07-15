import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03ContatoTelefonicoUtil {
    final static Scanner scanner = new Scanner(System.in);
    final static List<Q03ContatoTelefonico> agendaTelefonica = new ArrayList<>();

    public static void main(String[] args) {
        int op;

        do {
            menu();
            System.out.println("Digite o numero da operação desejada:");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1: inserir();
                case 2: listarPorPais();
                case 3: percentualPorCategoria();
            }

        } while (op != 4);
    }

    public static void inserir(){
        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o sobrenome do contato: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite o e-mail do contato: ");
        String email = scanner.nextLine();
        System.out.println("Digite o código do país: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite a categoria 0 - Familiar, 1 - Profissional," +
                " 2 - Outros:");
        int categoria = scanner.nextInt();
        scanner.nextLine();

        agendaTelefonica.add(new Q03ContatoTelefonico(nome, sobrenome, email,
                codigo, telefone, categoria));
    }

    public static void listarPorPais(){
        System.out.println("Digite o código do país a ser listado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        for(Q03ContatoTelefonico contato : agendaTelefonica){
            if(contato.getCodigoPais() == codigo){
                System.out.println(contato);
            }
        }
    }

    public static void percentualPorCategoria(){
        int f = 0;
        int p = 0;
        int o = 0;

        for(Q03ContatoTelefonico contato : agendaTelefonica){
            switch (contato.getCategoria()){
                case 0: f++;
                case 1: p++;
                case 2: o++;
            }
        }
        int total = f + p + o;
        System.out.println("Percentual por categoria: ");
        System.out.println("Contatos Familiares: " + (f/total)*100 );
        System.out.println("Contatos Profissionais: " + (p/total)*100 );
        System.out.println("Outros Contatos: " + (o/total)*100 );

    }

    public static void menu(){
        System.out.println("MENU DE OPERAÇÕES: ");
        System.out.println("1- Inserir Contato");
        System.out.println("2- Listar Contatos por país");
        System.out.println("3- Porcentagem de contatos por categoria");
        System.out.println("4- Encerrar programa");
    }

}
