import br.com.dio.junit.BancoDeDados;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void iniciarConexaoComBancoDeDados(){
        BancoDeDados.iniciarConexao();
    }

    @Test
    void validarConexaoComBancoDeDados(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexaoComBancoDeDados(){
        BancoDeDados.finalizarConexao();
    }
}
