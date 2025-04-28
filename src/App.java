import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;
import banco.Banco;
import banco.clientes.Cliente;
import banco.contas.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Rodrigo");
        Cliente cliente2 = new Cliente("Ricardo");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(140.0);
        contaCorrente.transferir(80.0, contaPoupanca);

        contaCorrente.exibirExtrato();
        contaPoupanca.exibirExtrato();

        banco.listarContas();
    }
}
