package com.br.rmartins;

public class Veiculo {
	
	private int ano;
	
	private String cor;
	
	private int valor;

	private String marca;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

	public void consultarValor(int valor) {
		setValor(valor);
	}
	
}
