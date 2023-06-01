public class SistemaBanco {
    private String nome;
    private String numeroConta;
    private double saldo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }


    public void realizarOperacao(String operation, double valorDepositar, double valorSacar) {
        switch (operation) {
            case "1":
                depositar(valorDepositar);
                System.out.printf("Depósito de R$%.2f realizado com sucesso.\n", valorDepositar);
                break;
            case "2":
                if (valorSacar > saldo) {
                    System.out.println("Saldo insuficiente para realizar a operação.");
                } else if (valorSacar > 5000) {
                    System.out.println("Valor do saque acima do permitido (R$5000,00).");
                } else {
                    sacar(valorSacar);
                    System.out.printf("Saque de R$%.2f realizado com sucesso.\n", valorSacar);
                }
                break;
            case "3":
                System.out.println("O seu saldo atual é de R$" + getSaldo());
                break;
            case "Q":
            case "q":
                break;
            default:
                System.out.println("Operação inválida, tente novamente.");
                break;
        }
    }

    public void depositar(double valorDepositar) {
        saldo += valorDepositar;
    }

    public void sacar(double valorSacar) {
        saldo -= valorSacar;

    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
