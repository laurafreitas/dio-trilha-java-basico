import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String nomeCliente = args [0];
        int conta = Integer.valueOf(args [1]);
        String agencia = args [2];
        double saldo = Double.valueOf(args [3]); 

        // conhecer e importar a classe scanner - OK
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // exibir mensagens aos usuarios
        System.out.println("Digite seu primeiro nome");
        nomeCliente = scanner.next();   

        System.out.println(nomeCliente + ", digite sua conta (somente numeros)");
        conta = scanner.nextInt();    
        
        System.out.println(nomeCliente + ", digite sua agencia");
        agencia = scanner.next();   

        System.out.println(nomeCliente + ", digite seu saldo (Utilizar formato: 0.00)");
        saldo = scanner.nextDouble();   

        // obter pela classe scanner os valores digitados no terminal

        // exiber a mensagem conta criada
        System.out.println("Ola, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia: " + agencia + ", conta: " + conta + " e seu saldo: " + saldo + " ja esta disponivel para saque.");
    }
}
