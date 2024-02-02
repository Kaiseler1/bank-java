package com.bank.aulas;

import java.util.Scanner;

public class MainTransfer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta nossaConta = new Conta("12345789", "147258369", 500);
		nossaConta.tipoConta = "Ordem";
		System.out.println(nossaConta.tipoConta);
		Conta contaCredit = new Conta("789456123", "741852369", 20);
		System.out.println(nossaConta.tipoConta);
		
		System.out.println("Qual o valor da transferência?");
		double valorTrans = sc.nextDouble();
		
		nossaConta.transf(valorTrans, contaCredit);
		
		System.out.println("Saldo atual: "+ nossaConta.getSaldo());
		System.out.println("Saldo atual conta crédito: "+ contaCredit.getSaldo());

	}

}
