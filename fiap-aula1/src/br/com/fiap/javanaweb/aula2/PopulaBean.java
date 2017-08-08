package br.com.fiap.javanaweb.aula2;

import java.time.LocalDateTime;

public class PopulaBean {
			
	private LocalDateTime primeiroAcesso = null;
	private LocalDateTime ultimoAcesso = null;
		
	public PopulaBean() {
		super();
		this.registraPrimeiroAcesso();
		this.registraUltimoAcesso();
	}
	public LocalDateTime getPrimeiroAcesso() {
		return primeiroAcesso;
	}
	public void registraPrimeiroAcesso() {
		if (this.primeiroAcesso == null) {
			primeiroAcesso = LocalDateTime.now();		
		}
	}
	public LocalDateTime getUltimoAcesso() {
		this.registraPrimeiroAcesso();
		return ultimoAcesso;
	}
	public void registraUltimoAcesso() {
		this.ultimoAcesso = LocalDateTime.now();
	}
		

}
