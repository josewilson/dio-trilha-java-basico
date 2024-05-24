import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // TODO:Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela classe Scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada

        // Solicitar e ler o número da conta

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpar o buffer do scanner
        scanner.nextLine();

        // Solicitar e ler a agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitar e ler o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo é R$ " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
