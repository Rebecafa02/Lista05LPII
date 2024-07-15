
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

//Questão 02
public class Q02FatorPrimoUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> fatorPrimo = new ArrayDeque<Integer>();

        int[] numerosPrimos = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 61, 67, 71, 73, 79, 83, 89, 97};

        System.out.print("Insira o numero a ser fatorado: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int i = 0;
        int tempNum = num;
        while (tempNum > 1) {
            if (tempNum % numerosPrimos[i] == 0) {
                tempNum = tempNum/numerosPrimos[i];
                fatorPrimo.offer(numerosPrimos[i]);
            } else
                i++;
        }

        System.out.println("Fatores primos do número: " + num);
        for (int numero: fatorPrimo){
            System.out.println(numero);
        }
        scanner.close();
    }
}
