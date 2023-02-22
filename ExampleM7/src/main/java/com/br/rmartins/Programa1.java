package com.br.rmartins;

public class Programa1 {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		veiculo.consultarValor(27000);
		veiculo.setAno(2016);
		veiculo.setCor("Azul");
		veiculo.setMarca("volkswagem-GOL");
		
		
		System.out.println(veiculo.getMarca());
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getValor());
	}

}
