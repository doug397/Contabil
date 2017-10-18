package br.com.persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class GenericDAO {
	public static Connection getConexao() throws SQLException, ClassNotFoundException{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conexao= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/poo","root","alunoifba");
		 return conexao;
	}

}
