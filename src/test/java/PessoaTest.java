import br.com.dio.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade(){
        Pessoa Leticia = new Pessoa("Leticia", LocalDate.of(1998,11,13));
        Assertions.assertEquals(23, Leticia.getIdade());
    }

    @Test
    void validarSeMaiorDeIdade(){
        Pessoa Leticia = new Pessoa("Leticia", LocalDate.of(1998,11,13));
        Assertions.assertTrue(Leticia.eMaiordeIdade());

        Pessoa Cecilia = new Pessoa("Cecilia", LocalDate.of(2018, 4, 14));
        Assertions.assertFalse(Cecilia.eMaiordeIdade());
    }
}
