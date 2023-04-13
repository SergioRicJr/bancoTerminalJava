import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta: ");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite o nome da agencia: ");
        String agencia = scan.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scan.next();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scan.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        System.out.println(conta);

    }
}
