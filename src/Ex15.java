
public class Ex15 {

	public static void main(String[] args) {
		
		final int TAM = 38;
		
		System.out.print("S = ");
		int cont = 1;
		float soma = 0;
		for (int i = TAM; i > 0; i--) {
			soma = ((i - 1) * i) + soma;
			
			System.out.print("(" + (i - 1) + "*" + i + ")/" + cont + " + ");
			
			cont++;
		}
		
		System.out.println("\nS = " + soma);
	}

}
