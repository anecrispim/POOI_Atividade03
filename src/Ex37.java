import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char[] respostas = new char[10], Gabarito = new char[10] ;
		int[] notas;
		int continuaraResposta=1, cont=0, aux=0, quantAlunos=0, maiornota=0,menornota=0;
		float media=0.0f;
	
		
		System.out.println("Bem-vindo ao sistema de Avaliações\nDigite o Gabarito da prova");
		
		System.out.println("Digite a quantidade de alunos que iram ser avaliados");
		quantAlunos = entrada.nextInt();
		
		notas=new int[quantAlunos];
		

		for (int i = 0; i < Gabarito.length; i++) {
			System.out.print("Digite a Resposta correta da questão "+(i+1)+" : ");
			Gabarito[i] =  entrada.next().charAt(0);
			System.out.println();
			
		}
		
	
		
		while(continuaraResposta == 1 ) {
			
			System.out.println("Bem-vindo! aluno(a) "+(cont+1)+"\nDigite seu gabarito");
			for (int i = 0; i < respostas.length; i++) {
				System.out.print("Digite a nota para a questão "+(i+1)+" : ");
				respostas[i] =  entrada.next().charAt(0);
				System.out.println();
			}
			
			for (int i = 0; i < respostas.length; i++) {
				if(respostas[i] == Gabarito[i]) {
					aux++;
				}
				
			}
			 
			notas[cont]= aux;
			
			
			if(continuaraResposta == 1) {
				if((cont+1) != quantAlunos) {
					System.out.println("Deseja continuar ?");
					continuaraResposta=entrada.nextInt();
				}
				else {
					continuaraResposta = 0;
				}
			}
			
			cont++;
			aux=0;
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Aluno(a)"+(i+1)+" : "+ notas[i]);
			if(i == 0) {
				maiornota=notas[i];
				menornota=notas[i];
			}
			else {
				if(maiornota < notas[i]) {
					maiornota=notas[i];
				}
				if(menornota > notas[i]) {
					menornota = notas[i];
				}
			}
			media = media+notas[i];
		}
		
		media = media/quantAlunos;
		
		//Fim do programa 
		
		System.out.println("-----------------");
		System.out.println("A maior nota da turma: "+maiornota);
		System.out.println("A menor nota da turma: "+menornota);
		System.out.println("A Media nota da turma: "+media);
		System.out.println("Quantidade de alunos(as) da turma: "+quantAlunos);
		System.out.println("Quantidade de alunos(as) que colocaram o gabarito: "+cont);
		
		
		entrada.close();
		
	}

}