public interface iconta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, iconta contaDestino);

    void imprimirExtrato();
}

