import java.util.Locale;
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobre Nome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println ("Olá me chamo " + nome + " " + sobreNome);
        System.out.println ("Tenho " + idade + "anos");
        System.out.println ("Minha altura é " + altura + "cm");
    }
}