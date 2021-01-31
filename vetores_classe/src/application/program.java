package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();

			vect[i] = new Product(nome, preco);			
		}
		
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			soma += vect[i].getPrice();
		}
		
		double avg = soma/n;
		
		System.out.printf("Average price: %.2f%n", avg);
		
		sc.close();
	}

}
