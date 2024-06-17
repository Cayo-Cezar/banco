//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        conta cp = new contaPoupanca();
        conta cc = new contaCorrente();

        cc.depositar(100.0);
        cc.sacar(17.0);

        cp.depositar(80.0);
        cp.sacar(23.0);

        cc.transferir(50.0, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}