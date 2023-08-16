package com.example;

import java.sql.SQLException;
import com.example.dao.ConnectionManager;
import com.example.dao.EstadoDAO;
import com.example.dao.ProdutoDAO;
import com.example.model.Marca;
import com.example.model.Produto;


public class AppBd {
    public static void main(String[] args) { 
        new AppBd();
    }

    public AppBd() {  
        try(var conn = ConnectionManager.getConnection()) {
        //    carregarDriverJDBC();            atualmente não precisamos mais carregar o driver
            var estadoDAO = new EstadoDAO(conn);
            var listaEstados = estadoDAO.listar();
            for (var estado : listaEstados) {
                System.out.println(estado);
            }
            
            
            estadoDAO.localizar("TO"); 

            var marca = new Marca();
            marca.setId(2L);

            var produto = new Produto();
            produto.setId(201L);
            produto.setMarca(marca);
            produto.setValor(90);
            produto.setNome("Produto Novo");
            
            var produtoDAO = new ProdutoDAO(conn);
            //inserir(produto);
            produtoDAO.excluir(202L);
            produtoDAO.alterar(produto);

            //var dao = new DAO(conn);
            //dao.listar("produto");

        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }
}

/* 
    private  void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        
            } catch (ClassNotFoundException e) {
                System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados" + e.getMessage());
            }
    } */

