package br.com.sessao;

import br.com.logica.Conta;
 // Interface para Guia de Usuario
public interface ContabilSessao {
		public String gerarLivro();
		public void registrarFatoContabil();
		public void addConta(Conta conta) throws Exception;

}
