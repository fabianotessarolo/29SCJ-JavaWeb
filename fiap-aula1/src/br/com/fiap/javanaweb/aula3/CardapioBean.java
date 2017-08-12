package br.com.fiap.javanaweb.aula3;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

enum TipoPrato {

	SOBREMESA("Sobremesa"), PRATOPRINCIPAL("Prato Principal");
	private String tipo;

	private TipoPrato(String tipoPrato) {
		this.tipo = tipoPrato;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}

@ManagedBean
@SessionScoped
public class CardapioBean {

	private String nome;
	private String password;
	private double valor;
	private TipoPrato tipos;

	public String salvar() {
		System.out.println(tipos.name());
		System.out.println("Salvando");
		return "SUCESSO";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TipoPrato[] getTipo() {
		return TipoPrato.values();
	}

	public TipoPrato getTipos() {
		return tipos;
	}

	public void setTipos(TipoPrato tipos) {
		this.tipos = tipos;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void sPassword(String password) {
		this.password = password;
	}

}
