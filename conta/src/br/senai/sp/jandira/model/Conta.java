package br.senai.sp.jandira.model;

public class Conta {

	public String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	
	public void depositar(double valorDeposito) {
		if (valorDeposito < 0) {
			System.out.println("O valor deve ser maior que zero.");
		} else {
			
		saldo= saldo + valorDeposito;
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo da conta: " + saldo );
	}
	
	public void sacar() {
		
	}
	
	public void transferir() {
		
		
	}
	
}

