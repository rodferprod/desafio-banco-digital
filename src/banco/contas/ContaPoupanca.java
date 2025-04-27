package banco.contas;

import banco.clientes.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirExtrato() {
        System.out.println("----- Extrato Conta Poupança -----");
        super.imprimirExtrato();
    }
}
