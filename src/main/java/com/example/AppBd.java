package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBd {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");
        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possível carregar a biblioteca para acesso ao banco de dados" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }
}
