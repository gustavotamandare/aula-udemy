package conversor_moeda;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollar, quantidadeASerComprada;
		
		System.out.println("What is the dollar price?");
		dollar = sc.nextDouble();

		System.out.println("How many dollars will be bought?");
		quantidadeASerComprada = sc.nextDouble();
		
		double valorAPagar = conversor.convert(quantidadeASerComprada, dollar);
		
		System.out.println("Amount to be paid in reais: R$" + valorAPagar);
		
		
		sc.close();
	}

}
