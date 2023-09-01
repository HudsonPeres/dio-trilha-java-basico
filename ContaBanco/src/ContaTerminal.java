import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome !");
        String nome_Sobrenome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String Agência = scanner.next();

        System.out.println("Por favor, digite a sua conta !");
        int conta = scanner.nextInt();

        System.out.println("Sr(a) " +nome_Sobrenome+ " Digite o valor do saldo que deseja sacar?");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá Sr(a) " +nome_Sobrenome+ ", obrigado por criar um conta em nosso banco, sua agência é " + Agência + ", conta" +conta+ " e o seu saldo de R$" +saldo+ " já disponível para saque");

        System.out.println("Obrigado por usar nosso serviços, volte sempre!");



    






        
        
    }
}