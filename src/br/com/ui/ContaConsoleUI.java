package br.com.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.sessao.ContabilSessao;


public class ContaConsoleUI {
	
	private ContabilSessao logica;
	
	public void showMenu() throws NumberFormatException, IOException{
		
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		int option;
		
		System.out.println("Operaçoes");
		System.out.println("[1]- Registrar Fato Contabil");
		option= Integer.parseInt(reader.readLine());
		
		switch(option){
			case 1: // this.registrarFato()
				
				
			
				
				
		
		}
	}
	
	public void registrarFato(){
		// capturar os dados digitados pelo USUArio
		
	//	this.logica(id,descricao, nomeContaCreditos,nomeContaDebito);
	}
	public void run() throws Exception{
		while(true){
			this.showMenu();
		}
	}
	
	public static void main(String[] args) throws Exception {
		(new ContaConsoleUI()).run();
	}

}
