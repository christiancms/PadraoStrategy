package SemStrategy;


import SemStrategy.service.Frete;
import SemStrategy.service.TipoFrete;

import java.util.Scanner;

/**
 * Created by christian on 12/10/16.
 */
public class Exemplo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Informe a distância: ");
            int distancia = entrada.nextInt();
            System.out.print("Qual o tipo de frete (1) Normal, " +
                    "(2) Sedex, (3) Buscar a pé: ");
            int opcaoFrete = entrada.nextInt();
            TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

            Frete frete = new Frete(tipoFrete);
            double preco = frete.calcularPreco(distancia);
            System.out.printf("O valor total é de R$%.2f", preco);
        }
    }
}
