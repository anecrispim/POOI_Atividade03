import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float pedido[][] = new float[6][2], valorTotal=0;
		String cardapio[] = {"Cachorro Quente - 100 ","Bauru Simples - 101 ","Bauru com ovo - 102", "Hambúrguer - 103",
				"Cheeseburguer - 104","Refrigerante - 105"};
		int codigoLan=0, quant=0;
		
		while(codigoLan != 99) {
			System.out.println("------------ Cardapio ------------");
			System.out.println("Especificação	-Código	-Preço\n"
					+ "Cachorro Quente	- 100 	- R$ 1,20\n"
					+ "Bauru Simples 	- 101 	- R$ 1,30\n"
					+ "Bauru com ovo 	- 102 	- R$ 1,50\n"
					+ "Hambúrguer 	- 103 	- R$ 1,20\n"
					+ "Cheeseburguer	- 104	- R$ 1,30\n"
					+ "Refrigerante 	- 105	- R$ 1,00\n"
					+ "Fechar pedido  - 99");
			
			
			System.out.println("Digite o codigo do seu pedio : ");
			codigoLan = entrada.nextInt();
			
			while (codigoLan < 99 || codigoLan > 105) {
				System.out.println("Operação invalida");
				System.out.println("Digite o codigo do seu pedio : ");
				codigoLan = entrada.nextInt();
			}
			
			if(codigoLan != 99) {
					System.out.println("Digite a Quantidade do seu pedio : ");
					quant = entrada.nextInt();
					
					while (quant < 0 ) {
						System.out.println("Operação invalida");
						System.out.println("Digite a Quantidade do seu pedio : ");
						quant = entrada.nextInt();
					}
					
					if(codigoLan == 100) {
						pedido[0][0] = 1.20f;
						pedido[0][1] = quant;
					}
					else if(codigoLan == 101) {
						pedido[1][0] = 1.30f;
						pedido[1][1] = quant;
					}
					else if(codigoLan == 102) {
						pedido[2][0] = 1.50f;
						pedido[2][1] = quant;
					}
					else if(codigoLan == 103) {
						pedido[3][0] = 1.20f;
						pedido[3][1] = quant;
					}
					else if(codigoLan == 104) {
						pedido[4][0] = 1.30f;
						pedido[4][1] = quant;
					}
					else if(codigoLan == 105) {
						pedido[5][0] = 1.00f;
						pedido[5][1] = quant;
					}
					
					System.out.println();
			}
		}
		
		System.out.println("------------ Pedido ------------");
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]+ "	Valor: R$"+ pedido[i][0]+ "	Quantidade: "+ pedido[i][1]+"	Total:"+ (pedido[i][0]*pedido[i][1]));
			valorTotal = valorTotal + (pedido[i][0]*pedido[i][1]);
		}
		System.out.println("------------------------"
				+ "\nTotal: R$ "+valorTotal);
		
		
		
		entrada.close();
	}

}
