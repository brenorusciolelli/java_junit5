package br.com.dio.junit;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Conexao iniciada com sucesso as: " + LocalDateTime.now());
    }

    public static void finalizarConexao(){
        LOGGER.info("Conexao finalizada com sucesso as: " + LocalDateTime.now());
    }

}
