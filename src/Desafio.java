import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Eugenio";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("***************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***************************");

        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        double saque = 0;
        double deposito = 0;
        double valorTransferencia = 0;

        String menu = """
                ## Informe sua opção ##
                1 - Consultar Saldo
                2 - Saque
                3 - Deposito
                4 - Transferencia pix
                5 - Sair
                """;



        while (opcao != 5){
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            if ( opcao == 1 ){
                System.out.println("Saldo Atual é: R$ " + saldo);

            } else if ( opcao == 2) {
                System.out.println("Informe o valor da saque: R$");
                saque = leitura.nextDouble();

                if ( saque <= saldo) {
                    System.out.println("Seu saque foi de: R$ " + saque);
                    saldo -= saque;
                    System.out.println("Saldo atulizado e de R$: " + saldo);
                } else if (saque > saldo) {
                    System.out.println("Saldo insuficiente.");
                }

            } else if (opcao == 3) {

                System.out.println("Qual o valor do depositor: ");
                deposito  = leitura.nextDouble();
                System.out.println("O valor de R$ " + deposito + " Foi depositado com sucesso.");
                if (deposito > 0){
                    saldo += deposito;
                    System.out.println("Saldo atualizado para R$ " + saldo);
                }

            } else if (opcao == 4) {
                System.out.println("Informe o valor do transferencia: ");
                valorTransferencia = leitura.nextDouble();
                leitura.nextLine();

                if (valorTransferencia <= saldo) {
                    System.out.println("Informe o nome do beneficiário: ");
                    String nomeTransferencia = leitura.nextLine();
                    System.out.println(nome + ", sua transferência de R$ " + valorTransferencia + " para " + nomeTransferencia + " foi realizada com sucesso.");
                    saldo -= valorTransferencia;
                    System.out.println("Saldo atualizado para R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else if (opcao != 5) {
                System.out.println("opção Invalida");

            }else {
                System.out.println("Encerrando Sistema");
            }

        }

    }
}
