package banco.contas;

import banco.clientes.Cliente;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta {

    private static final int AGENCIA = 1;
    private static int AUTO_INCREMENT = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA;
        this.conta = Conta.AUTO_INCREMENT++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String exibeTitular() {
        return this.cliente.getNome();
    }

    protected void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.exibeTitular()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
