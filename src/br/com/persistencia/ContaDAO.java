package br.com.persistencia;

import br.com.logica.Conta;

public interface ContaDAO {
	public void save(Conta conta) throws Exception;
	public Conta findByName(String nome)throws Exception;

}
