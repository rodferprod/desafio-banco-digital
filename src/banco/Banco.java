package banco;

import java.util.ArrayList;
import java.util.List;
import banco.contas.Conta;

public class Banco {
    private static String nome = "Banco do Brasil";
    private static List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public Banco() {
        Banco.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        Banco.contas.add(conta);
    }

    public void listarContas() {
        System.out.println(String.format("====== Listando %s contas ======", Banco.contas.size()));
        Banco.contas.forEach(conta -> {
            System.out.println("Tipo de conta: " + conta.getClass().getCanonicalName().split("\\.")[2]
                    + " | Titular da conta: " + conta.exibeTitular());
        });
    }
}
