package ComStrategy.service.frete;

import ComStrategy.service.Frete;

public class Sedex implements Frete {
	
	public double calcularPreco(int distancia) {
		// lógica do cálculo de frete "sedex"
		return distancia * 1.25 + 10.3;
		
	}
}
