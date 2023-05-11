import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !, " + "Siga o seguinte padrão (xxxx)");
        int numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência !, " + "Siga o seguinte padrão (xxx-x)");
        String agencia = scan.next();

        System.out.println("Por favor, digite o seu Nome e Sobrenome !");
        scan.nextLine();
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o quanto gostaria de depositar!");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua âgencia é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já esta disponível para saque.");
    }
}