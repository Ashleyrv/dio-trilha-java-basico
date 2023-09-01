import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Importar a classe locale e scanner
        //TODO: Exibir as mensagens
        //TODO: Obter pela classe scanner as informações solicitadas no terminal
        //TODO: Exibir as informações digitadas

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Número da conta: ");
        int numConta = scan.nextInt();

        System.out.print("Agência: ");
        String agencia = scan.next();

        System.out.print("Saldo da conta: ");
        double saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numConta, saldo);

        scan.close();
    }
}

