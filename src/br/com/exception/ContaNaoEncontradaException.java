package br.com.exception;

public class ContaNaoEncontradaException extends Exception{
	
	private String nome;
	
	public ContaNaoEncontradaException(Exception ex){
		super(ex);
		
	}
	
	public ContaNaoEncontradaException(String nome){
		this.nome=nome;
	}
	
	public String getNomeConta(){
		return this.nome;
	}
	
	@Override
	public String toString(){
		return "ContaNaoEncontradaException : [Nome da Conta: "
				+ this.getNomeConta() + "]";
	}

}
