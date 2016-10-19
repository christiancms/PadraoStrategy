package ComStrategy;

import ComStrategy.service.Frete;
import ComStrategy.service.TipoFrete;

import java.util.Scanner;


public class Exemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("Informe a distância: ");
			int distancia = entrada.nextInt();
			System.out.println("Qual o tipo de frete (1) Normal, " +
					"(2) Sedex, (3) Buscar a pé: ");
			int opcaoFrete = entrada.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

			// cria a instância da classe que será utilizada
			Frete frete = tipoFrete.obterFrete();
			
			double preco = frete.calcularPreco(distancia);
			System.out.printf("O valor total é de R$%.2f", preco);
		}
	}

}
