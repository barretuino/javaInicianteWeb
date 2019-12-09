package br.barretuino.dao;

public class BarretuinoException 
				extends Exception{
	private String mensagem;
	public BarretuinoException(String mensagem) {
		this.mensagem = mensagem; 
	}
	
	@Override
	public String getMessage() {		
		return "[BARRETUINO] " + mensagem;
	}
}
