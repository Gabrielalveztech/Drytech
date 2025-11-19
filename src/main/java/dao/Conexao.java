package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    
    private static Properties props = new Properties();
    
    static{
        try(InputStream entrada = Conexao.class.getClassLoader().getResourceAsStream("config.properties")){
            if (entrada == null){
            throw new RuntimeException("Arquivo Não Encontrado");
            }
            props.load(entrada);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo",e);
        }


    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                props.getProperty("db.url"),
                props.getProperty("db.user"),
                props.getProperty("db.password")
        );
    }
}
