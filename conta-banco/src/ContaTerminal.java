import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, informe o seu nome"); 
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, informe a agência"); 
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da sua conta");
        numero = sc.nextInt();

        System.out.println("Por favor, informe o saldo");
        saldo = sc.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, " + "sua agência é " + agencia + ", conta " +
        numero + " e seu de saldo " + saldo + " já esta disponível para saque.";


        System.out.println(mensagem);
     
        sc.close();
    }
}
