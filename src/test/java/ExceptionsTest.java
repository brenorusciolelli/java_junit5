import br.com.dio.junit.Conta;
import br.com.dio.junit.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarSaldoTransferenciaEntreContas(){
        Conta contaOrigem = new Conta(123456, 2);
        Conta contaDestino = new Conta(123456, 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.veficarTransferencia(contaOrigem, contaDestino, -2));
    }

    @Test
    void checkSaldoTransferenciaEntreContas(){
        Conta contaOrigem = new Conta(123456, 0);
        Conta contaDestino = new Conta(123456, 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.veficarTransferencia(contaOrigem, contaDestino, 2));
    }
}
