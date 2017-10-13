package br.com.test;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import br.com.logica.Conta;
import br.com.persistencia.BD;

public class Execucao {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		if(BD.getConexao()== null){
			System.out.println("Falha na Conexao");
		}else{
			System.out.println("Conectado Com Sucesso!");
		}
		
		Conta c= new Conta();
		c.setId(123);
		c.setEmUso(true);
		c.setNome("Douglas");
		c.setSaldo(10000);
		c.setTipo('A');
		
		
		Map<Integer,Conta> lista= new HashMap<Integer,Conta>();
		lista.put(c.getId(), c);
		
		
		
		
		
		
	}

}
