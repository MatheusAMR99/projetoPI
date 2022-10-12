package com.a107.exemplojdbc.dao;

import com.a107.exemplojdbc.model.NotaFiscal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando.tfernandes
 */
public class NotaFiscalDAO {
    
    public static String url = "jdbc:mysql://localhost:3307/basenotafiscal";
    public static String login = "root";
    public static String senha = "";
    
    public static boolean salvar(NotaFiscal obj){
        
        boolean retorno = false;
        Connection conexao = null;
        
        try {
            //1º passo - Carregar o Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2º passo - Abrir a conexão
            conexao = DriverManager.getConnection(url, login, senha);
            
            //3º passo - Criar o comando SQL
            PreparedStatement comandoSQL = 
            conexao.prepareStatement("INSERT INTO NotaFiscal (numeroNota,valorNota) VALUES(?,?); ");
            
            comandoSQL.setInt(1, obj.getNumeroNota());
            comandoSQL.setDouble(2, obj.getValorNota());
            
            //4º passo - Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    }
    
}
