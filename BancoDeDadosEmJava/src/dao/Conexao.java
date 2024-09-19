
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{
    public static void main(String[] args) {
        // URL de conexão com o banco de dados
        String url = "jdbc:postgresql://localhost:5432/cursojava";
        // Nome de usuário e senha
        String user = "postgres";
        String password = "postgres";

        // Conexão
        try (Connection conexao = DriverManager.getConnection(url, user, password)) {
            if (conexao != null) {
                System.out.println("Conectado ao banco de dados PostgreSQL com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco de dados.");
            e.printStackTrace();
        }
    }
}