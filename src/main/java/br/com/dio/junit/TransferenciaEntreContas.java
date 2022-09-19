package br.com.dio.junit;

public class TransferenciaEntreContas {

    public void veficarTransferencia(Conta contaOrigem, Conta contaDestino, int valor){
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor de transferencia tem que ser maior que zero");
        } else {
            System.out.println("Transferencia Realizada!");
        }
    }
}
