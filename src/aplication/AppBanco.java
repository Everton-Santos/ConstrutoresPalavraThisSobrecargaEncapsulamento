package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AppBanco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		int conta = ler.nextInt();
		
		System.out.print("Enter account holder: ");
		ler.nextLine();
		String nome = ler.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char character = ler.next().charAt(0);
		
		if(character == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valor = ler.nextDouble();
			account.criarConta(conta, nome, valor);
		}
		else {
			account.criarConta(conta, nome);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double valor = ler.nextDouble();
		account.deposit(valor);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		valor = ler.nextDouble();
		account.withdraw(valor);
		
		System.out.println("Update account data:");
		System.out.println(account);
		
		
		
		
		
		
		
		
		

	}

}
