package com.bank.aulas;

import java.util.Scanner;

public class Conta {
	private String nif;
	private String iban;
	private double saldo;

	public void debito(double valor) {
		this.saldo = this.saldo - valor;
	}

	public void	credito(double valor) {this.saldo = this.saldo + valor;
		this.saldo = (this.saldo * 0.01) + this.saldo;
	}

	public void transf() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é o IBAN da conta que pretende transferir?");
		String iban = sc.nextLine();

		System.out.println("Qual e o valor que pretende transferir?");
		double valorTrans = sc.nextDouble();


        if (this.saldo < valorTrans){
			System.out.println("Nao tem saldo suficiente para realizar a transferencia.");
		} else {
			this.saldo = this.saldo - valorTrans;

		}
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getIban() { return this.iban;}

	public void setIban(String iban) { this.iban = iban; }

	public double getSaldo() { return this.saldo;}

	public void setSaldo(double saldo) {this.saldo = saldo;}

}
