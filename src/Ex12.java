import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o limite de termos da sequência: ");
		int num = entrada.nextInt();
		
		int aux1 = 1;
		int aux2 = 1;
		
		System.out.println(aux1);
		System.out.println(aux2);
		
		int i = 2;
		int prox;
		while (i < num) {
			prox = aux1 + aux2;
			System.out.println(prox);
			aux2 = aux1;
			aux1 = prox;
			i++;
		}
		
		entrada.close();
	}

}
