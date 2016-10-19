package ComStrategy.service.frete;

import ComStrategy.service.Frete;

/**
 * Created by christian on 12/10/16.
 */
public class Buscarape implements Frete {
    @Override
    public double calcularPreco(int distancia) {
        return distancia * 0;
    }
}
