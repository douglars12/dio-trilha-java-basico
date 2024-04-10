import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner .nextLine(); 

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor,digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor digite o saldo da conta");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco  sua agencia é " + agencia + ", conta" + numero + "e seu  saldo " + saldo + " já esta disponivel  para saque.");

    }

}

