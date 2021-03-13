
public class Conversiones {
	public static void main(String args[]) {
		//Convertir String a numeros 
		int numero = Integer.parseInt("1");
		float numeroFloat = Float.parseFloat("1.5");
		double numeroDouble = Double.parseDouble("1.9");
		long numeroLong = Long.parseLong("3456");
				
		String numeroString = numeroLong + "";
		numeroLong = (long) numeroDouble;
		
		final double pi = 3.1416; 
		
		boolean logico = 1 < 0 | 4 < 1; 
		 
	}
}