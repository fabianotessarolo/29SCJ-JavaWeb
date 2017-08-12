package br.com.fiap.javanaweb.aula3;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginBean {
	
	private String boasVindas = "Olá, bem vindo!";

	private String login;
	private String senha; 		
	private Integer contador = 0;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getBoasVindas() {
		return boasVindas;
	}

	public void setBoasVindas(String boasVindas) {
		this.boasVindas = boasVindas;
	}
	
	public Integer getContador() {
		return contador;
	}
	
	public void incrementaContador() {
		contador++;
	}
	
	
	
	

}
