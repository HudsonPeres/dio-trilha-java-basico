import Funcoes.NavegadorInternet;
import Funcoes.Musica;
import Funcoes.Smartphone;
import Funcoes.Telefone;
import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) throws Exception{
        Smartphone iphone = new Smartphone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iphone Ligado \n Bem vindos");
        System.out.println("Selecione o que deseja fazer \n");
        System.out.println("1 - Menu Telefone \n 2 - Menu Web \n 3 - Menu Música \n 4 - Sair");
        
        Integer opc = scanner.nextInt();

        while (opc != 4) {
            if (opc.equals(1)) {
                System.out.println("1 - Atender Chamada");
                System.out.println("2 - Discar");
                System.out.println("3 - Voice Mail");
                System.out.println("4 - Sair");
                Integer subopc = scanner.nextInt();

                while (subopc != 4) {
                    if (subopc.equals(1)) {
                        iphone.atender();
                    } else if (subopc.equals(2)) {
                        iphone.ligar();
                    } else if (subopc.equals(3)) {
                        iphone.iniciarVoiceMail();
                    } else {
                        System.out.println("Insira um valor válido");
                    }
                    System.out.println("1 - Menu Telefone \n 2 - Menu Web \n 3 - Menu Música \n 4 - Sair");
                    subopc = scanner.nextInt();
                }
            }
            System.out.println("1 - Menu Telefone \n 2 - Menu Web \n 3 - Menu Música \n 4 - Sair");
            opc = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Encerrando Iphone");
    }
}