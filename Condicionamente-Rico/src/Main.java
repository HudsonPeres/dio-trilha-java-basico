import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

        int novoSaldo = saldoTotal - valorSaque;     

        if (saldoTotal >= valorSaque) {
            novoSaldo = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + novoSaldo);
        }   else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }

        scanner.close();
    }
}
