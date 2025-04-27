import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;
import banco.Banco;
import banco.clientes.Cliente;
import banco.contas.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco();

        Cliente cliente = new Cliente("Rodrigo");

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(140.0);
        contaCorrente.transferir(70.0, contaPoupanca);

        contaCorrente.exibirExtrato();
        contaPoupanca.exibirExtrato();

        banco.listarContas();
    }
}
