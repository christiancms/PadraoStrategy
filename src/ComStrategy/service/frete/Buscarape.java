package ComStrategy.service.frete;

import ComStrategy.service.Frete;

public class Buscarape implements Frete {
    @Override
    public double calcularPreco(int distancia) {
        return distancia * 0;
    }
}
