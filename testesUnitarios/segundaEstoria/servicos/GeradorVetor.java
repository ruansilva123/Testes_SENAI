package testesUnitarios.segundaEstoria.servicos;

import java.util.Random;

public class GeradorVetor {
    public static double[] gerarVetor(){
        Random rand = new Random();
        double[] vetor = new double[50];

        for(int i=0; i<50; i++){
            vetor[i] = -1000 + (2000 - rand.nextDouble(2000));
        }

        return vetor;
    }
}
