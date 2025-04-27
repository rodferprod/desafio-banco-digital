package banco.contas;

import banco.clientes.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("----- Extrato Conta Corrente -----");
        super.imprimirExtrato();
    };
}
