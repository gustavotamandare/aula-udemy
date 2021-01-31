package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;


public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as informações do produto: ");
		
		System.out.print("Produto: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		
		product produto = new product(nome, preco, quantidade);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		sc.nextLine();
		
		System.out.println();
		System.out.println("Deseja alterar o nome do produto para computador? ");
		String alteraNome = sc.nextLine();
		
		if ("S".equals(alteraNome)){
			produto.setNome("Computador");
			System.out.println();
			System.out.println("Dados do produto atualizado: " + produto);
		}
		
		else {
			System.out.println();
			System.out.println("O Produto não foi alterado.");
		}
		
		System.out.println();
		System.out.print("Informe a quantidade de produtos a serem adicionados ao estoque: ");
		quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println("Dados do produto atualizados: " + produto);
		
		System.out.println();
		System.out.print("Informe a quantidade de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println("Dados do produto atualizados: " + produto);
		
		sc.close();
	}

}
