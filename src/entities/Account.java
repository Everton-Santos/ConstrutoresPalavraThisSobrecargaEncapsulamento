package entities;

public class Account {

	
	private int number;
	public String holder;
	private double balance;
	

	
	public void criarConta(int numeroConta, String nameTitular, double depositoInicial) {
		this.number = numeroConta;
		this.holder = nameTitular;
		deposit(depositoInicial);
	}
	
	public void criarConta(int numeroConta, String nameTitular) {
		this.number = numeroConta;
		this.holder = nameTitular;
	}
	
	
	public void deposit(double valor) {
		this.balance += valor;
	}
	
	public void withdraw(double valor) {
		if(valor <= this.balance) {
			System.out.println("Taxa de saque: $ 5.00");
			this.balance -= (valor + 5.0);
		}
		else {
			System.out.println("Saque invalido!");
			System.out.println("Valor de saque maior do que o Disponivel em conta");
		}
	}
	
	public void dadosConta() {
		System.out.printf("Conta: " + number);
		System.out.printf("Titular: " + holder);
		System.out.printf("Valor: %.2f %n", balance);
	}
	
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f %n", balance);
	}
	
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String nameTitular) {
		this.holder = nameTitular;
	}
	public double getBalance() {
		return balance;
	}
	
	
	
	
	
	
	
}
