import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe seu usuário: ");
		String usu = entrada.next();
		
		System.out.print("Informe sua senha: ");
		String senha = entrada.next();
		
		while (usu.equals(senha)) {
			System.out.println("A senha não pode ser igual ao usuário.");
			
			System.out.print("Informe seu usuário: ");
			usu = entrada.next();
			
			System.out.print("Informe sua senha: ");
			senha = entrada.next();
		}
		
		entrada.close();

	}

}
