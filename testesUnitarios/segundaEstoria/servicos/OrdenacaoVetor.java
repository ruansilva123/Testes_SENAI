package testesUnitarios.segundaEstoria.servicos;

public class OrdenacaoVetor{
    public static double[] ordenarVetorCrescente(double[] vetor){
        int tamanhoVetor = vetor.length;

        if(tamanhoVetor == 0){
            return vetor;
        }

        for(int i=0; i<tamanhoVetor - 1; i++){
            for(int j=0; j<tamanhoVetor - 1; j++){
                if(vetor[j] > vetor[j + 1]){
                    double temporario = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temporario;
                }
            }
        }

        return vetor;
    }
}
