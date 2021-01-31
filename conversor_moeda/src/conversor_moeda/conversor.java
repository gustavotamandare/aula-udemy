package conversor_moeda;

public class conversor {
	
	public static double convert(double quantidadeASerComprada , double dollar) {
		double valorAPagar = dollar * quantidadeASerComprada + dollar * quantidadeASerComprada * 6/100; 
		return valorAPagar;
	}

}
