package testesUnitarios.segundaEstoria.testes;

import java.util.Arrays;
import testesUnitarios.segundaEstoria.servicos.OrdenacaoVetor;
import testesUnitarios.segundaEstoria.servicos.GeradorVetor;

public class TestesVetor{
    public static void executarTestes(){
        System.out.println(
            "TESTES DE INTERFACE:\n"+
            "- Garantir que a entrada seja um vetor;\n"+
            "- Verificar se os números do vetor estão em ordem crescente;\n"+
            "- O tamanho do vetor deve ser o mesmo do vetor de entrada;\n"+
            "- O tamanho do vetor deve ser o mesmo do vetor de entrada:\n"+
            "   Resultado: " + Arrays.toString(OrdenacaoVetor.ordenarVetorCrescente(new double[]{7, 2, 2.88}))+"\n"+
            "Retornar um vetor vazio se a entrada for um vetor vazio:\n"+
            "   Resultado: " + Arrays.toString(OrdenacaoVetor.ordenarVetorCrescente(new double[]{}))+"\n"
        );

        System.out.println(
            "TESTES DE CONDIÇÕES LIMITE:\n"+
            "- Inserir números positivos e negativos no vetor:\n"+
            "   Resultado: " + Arrays.toString(OrdenacaoVetor.ordenarVetorCrescente(new double[]{10, 0, -2.8})) + "\n"+
            "- Envio de vetor com mais de 50 itens sortidos (positivos, negativos, decimais e zero):\n"+
            "   Resultado: " + Arrays.toString(OrdenacaoVetor.ordenarVetorCrescente(GeradorVetor.gerarVetor())) + "\n"
        ); // criar random em services para o vetor de 50 itens

        System.out.println(
            "TESTES DE CAMINHOS INDEPENDENTES:\n"+
            "- Envio de vetor com todos os números repetidos:\n"+
            "   Resultado: " + Arrays.toString(OrdenacaoVetor.ordenarVetorCrescente(new double[]{10, 10, 10})) + "\n"+
            "- Envio de vetor com apenas números negativos:\n"+
            "   Resultado: " + Arrays.toString(OrdenacaoVetor.ordenarVetorCrescente(new double[]{-12, -156, -11})) + "\n"+
            "- Envio de vetor com apenas números positivos:\n"+
            "   Resultado: " + Arrays.toString(OrdenacaoVetor.ordenarVetorCrescente(new double[]{111, 121, 221})) + "\n"+
            "- Envio de vetor com números positivos, negativos, decimais e zero:\n"+
            "   Resultado: " + Arrays.toString(OrdenacaoVetor.ordenarVetorCrescente(new double[]{0, -67, 2, -2.88, 1.8})) + "\n"
        );

        System.out.println(
            "TESTES DE CAMINHOS DE MANIPULAÇÃO DE ERRO:\n"+
            "- "
        );
    }
}
