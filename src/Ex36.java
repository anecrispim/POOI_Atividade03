import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opicao = 0, votos[]=new int[6], continuarVoto = 1;
		
		while(continuarVoto != 0) {
			System.out.println("------------- Candidatos -------------");
			System.out.println("Cod - Nome\n"
							+ "1 - José\n"
							+ "2 - João\n"
							+ "3 - Ane\n"
							+ "4 - Felipe\n"
							+ "5 - Voto Nulo\n"
							+ "6 - Voto em Branco\n ");
			System.out.println("Digite seu voto: ");
			opicao = entrada.nextInt();
		
			while(opicao < 0 || opicao>7) {
				System.out.println("Opição invalida");
				System.out.println("Digite seu voto: ");
				opicao = entrada.nextInt();
			}
			
			if(opicao == 1){
				votos[0] = votos[0] + 1; 
			}
			else if(opicao == 2){
				votos[1] = votos[1] + 1; 
			}
			else if(opicao == 3){
				votos[2] = votos[2] + 1; 
			}
			else if(opicao == 4){
				votos[3] = votos[3] + 1; 
			}
			else if(opicao == 5){
				votos[4] = votos[4] + 1; 
			}
			else if(opicao == 6){
				votos[5] = votos[5] + 1; 
			}
			else if(opicao == 0){
				continuarVoto = 0 ; 
			}


			System.out.println("Continuar votando ? 1 - Sim ou 0 - Não ");
			continuarVoto=entrada.nextInt();
			while(continuarVoto < 0 || continuarVoto>1) {
				System.out.println("Operação invalida\nContinuar votando ? 1 - Sim ou 0 - Não");
				continuarVoto=entrada.nextInt();
			}
		}
		
		System.out.println("Cod - Nome - N° votos\n"
				+ "1 - José "+votos[0] +"\n"
				+ "2 - João "+votos[1] +"\n"
				+ "3 - Ane "+votos[2] +"\n"
				+ "4 - Felipe "+votos[3] +"\n"
				+ "5 - Voto Nulo "+votos[4] +"\n"
				+ "6 - Voto em Branco "+votos[5] +"\n");
		
		
		
		System.out.println("A percentagem de votos nulos sobre o total de votos foi de: "+
				((votos[4]*100)/(votos[0]+votos[1]+votos[2]+votos[3]+votos[4]+votos[5]))+"%");
		System.out.println("A percentagem de votos em branco sobre o total de votos foi de: "+
				((votos[5]*100)/(votos[0]+votos[1]+votos[2]+votos[3]+votos[4]+votos[5]))+"%");
		
		
		
		entrada.close();
	}

}
