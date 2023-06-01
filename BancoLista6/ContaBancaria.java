import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaBanco sistemaBanco = new SistemaBanco();

        System.out.println("\tConta Bancária");

        System.out.print("Digite seu nome: ");
        sistemaBanco.setNome(scanner.next());
        System.out.print("Digite o número da sua conta: ");
        sistemaBanco.setNumeroConta(scanner.next());
        System.out.print("Digite seu saldo inicial: R$");
        sistemaBanco.setSaldo(scanner.nextDouble());

        System.out.println("\nConta bancária criada com sucesso.");

        String operation;
        double valorDepositar, valorSacar;
        do {
            System.out.println("\nEscolha a operação que deseja realizar: \n1 - Depositar \n2 - Sacar \n3 - Consultar saldo disponível \nQ - Sair");
            operation = scanner.next();

            if (operation.equals("1")) {
                System.out.print("Digite o valor do depósito: R$");
                valorDepositar = scanner.nextDouble();
                sistemaBanco.realizarOperacao(operation, valorDepositar, 0);
            } else if (operation.equals("2")) {
                System.out.print("Digite o valor do saque: R$");
                valorSacar = scanner.nextDouble();
                sistemaBanco.realizarOperacao(operation, 0, valorSacar);
            } else {
                sistemaBanco.realizarOperacao(operation, 0, 0);
            }

        } while (!operation.equalsIgnoreCase("Q"));

        System.out.println("\nVocê saiu do programa!");
        scanner.close();
    }
}
