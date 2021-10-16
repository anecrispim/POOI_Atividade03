import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe seu nome: ");
		String nome = entrada.next();
		
		while (nome.length() <= 3) {
			System.out.println("O nome deve possuir mais que 3 caracteres!");
			
			System.out.print("Informe seu nome: ");
			nome = entrada.next();
		}
		
		System.out.print("Informe sua idade: ");
		int idade = entrada.nextInt();
		
		while (idade < 0  || idade > 150) {
			System.out.println("A idade deve estar entre 0 e 150.");
			
			System.out.print("Informe sua idade: ");
			idade = entrada.nextInt();
		}
		
		System.out.print("Informe seu salário: ");
		float salario = entrada.nextFloat();
		
		while (salario <= 0) {
			System.out.println("O salário deve ser maior que 0.");
			
			System.out.print("Informe seu salário: ");
			salario = entrada.nextFloat();
		}
		
		System.out.print("Informe seu sexo: ");
		char sexo = entrada.next().charAt(0);
		
		boolean vSexo = sexo == 'f' || sexo == 'm';
		
		while (!vSexo) {
			System.out.println("Sexo inválido! 'f' para Feminino e 'm' para Masculino");
			
			System.out.print("Informe seu sexo: ");
			sexo = entrada.next().charAt(0);
			
			vSexo = sexo == 'f' || sexo == 'm';
		}
		
		System.out.print("Informe seu Estado Cívil: ");
		char estadoC = entrada.next().charAt(0);
		
		boolean vEstadoC = estadoC == 's' || estadoC == 'c' || estadoC == 'v' || estadoC == 'd';
		
		while (!vEstadoC) {
			System.out.println("Estado Cívil inválido! 's', 'c', 'v', 'd';");
			
			System.out.print("Informe seu Estado Cívil: ");
			estadoC = entrada.next().charAt(0);
			
			vEstadoC = estadoC == 's' || estadoC == 'c' || estadoC == 'v' || estadoC == 'd';
		}
		
		entrada.close();

	}

}
