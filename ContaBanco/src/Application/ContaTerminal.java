package Application;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        System.out.print("Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta !");
        System.out.print("Conta: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Número da conta deve ser um número inteiro.");
            scanner.next();
            System.out.print("Número: ");
        }
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, Informe o nome do cliente !");
        System.out.print("Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, Informe o valor inicial para depósito !");
        System.out.print("Valor Depósito: ");

        while (true) {
            if (scanner.hasNextDouble()) {
                saldo = scanner.nextDouble();

                if (saldo > 0) {
                    break;
                } else {
                    System.out.println("O número deve ser maior que zero. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida! Valor do depósito deve ser numérico.");
                scanner.next(); // Descarta a entrada inválida
            }

            System.out.print("Valor Depósito: ");
        }

        System.out.println("Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numeroConta))
                .concat(" e seu saldo R$ ")
                .concat(String.format("%.2f", saldo))
                .concat(" já está disponível para saque."));

        scanner.close();
    }
}
