package banco.contas;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta conta);

    void exibirExtrato();
}
