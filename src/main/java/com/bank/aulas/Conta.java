package com.bank.aulas;

public class Conta {
	private String nif;
	private String iban;
	private double saldo;
	public static String tipoConta = "Poupanca";
	
	public Conta() {}
	
	public Conta(String nif, String iban, double saldo) {
		this.nif = nif;
		this.iban = iban;
		this.saldo = saldo;
	}

	public void debito(double valor) {
		this.saldo = this.saldo - valor;
	}

	public void credito(double valor) {
		this.saldo = this.saldo + valor;
		this.saldo = (this.saldo * 0.01) + this.saldo;
	}

	public void transf(double valorTrans, Conta contaCredit) {
		if (this.saldo < valorTrans) {
			System.out.println("Nao tem saldo suficiente para realizar a transferencia.");
		} else {
			this.debito(valorTrans);
			contaCredit.credito(valorTrans);
		}
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getIban() {
		return this.iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
