package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = ler.nextLine();
		System.out.print("Price: ");
		double price = ler.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = ler.nextInt();
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());
		
		System.out.println("");
		System.out.println("Product data: " + product);
		
		System.out.println("");
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = ler.nextInt();
		product.addProducts(quantity);

		System.out.println("");
		System.out.println("Updated data: " + product);
		
		System.out.println("");
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = ler.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("");
		System.out.println("Updated data: " + product);

	}

}
