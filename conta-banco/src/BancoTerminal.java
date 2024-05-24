public class BancoTerminal {

    public static void main(String[] args) {
        // Primeira execução com saldo inicial igual a 25 e valor solicitado igual a 18
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo atual: " + saldo);

        // Segunda execução com saldo inicial igual a 15 e valor solicitado igual a 22
        saldo = 15.0;
        valorSolicitado = 22.0;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo atual: " + saldo);

        System.out.println("Saldo atual: " + valorSolicitado);
    }
}
