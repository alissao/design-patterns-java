package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {
	
	String banco = System.getenv("tipoBanco");
	
	public Connection getConnection() {
        try {
            Connection conexao = 
                    DriverManager.getConnection("jdbc:"+banco+"://localhost:3306/banco", "usuario", "senha");

            return conexao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
