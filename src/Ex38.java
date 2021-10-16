import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero=entrada.nextInt();
		
		String numeroS = String.valueOf(numero);
		
		char[] digitos = numeroS.toCharArray();
		
		System.out.println(" ► "+numero);
		for(int i = digitos.length; i > 0; i--) {
	         System.out.print(digitos[(i-1)]);
	    }
		System.out.println(" ◄ ");
		
		entrada.close();
	}

}
