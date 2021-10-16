import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe qual fatorial deseja: ");
		int num = entrada.nextInt();
		
		int fatorial = num;
		for (int i = num-1; i > 0; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		entrada.close();
	}

}
