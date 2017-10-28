package br.com.sessao;

import br.com.logica.Conta;
import br.com.persistencia.ContaDAO;
import br.com.persistencia.ContaDAOSQL;

public class RegistroContabil implements ContabilSessao{
	
	private ContaDAO contaDAO;
	
	public RegistroContabil(){
		this.contaDAO= new ContaDAOSQL();
	}
	

	@Override
	public String gerarLivro() {
		// TODO Auto-generated method stub
		return "Gerando Livro";
	}

	@Override
	public void registrarFatoContabil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addConta(Conta conta) throws Exception {
	  this.contaDAO.save(conta);
		
	}

}
