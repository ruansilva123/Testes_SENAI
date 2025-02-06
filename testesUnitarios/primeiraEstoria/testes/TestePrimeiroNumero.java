package testesUnitarios.primeiraEstoria.testes;

import testesUnitarios.primeiraEstoria.servicos.VerificaPrimeiroNumero;

public class TestePrimeiroNumero{
    public static void executarTestes(){
        System.out.println(
            "TESTES DE INTERFACE:\n"+
            "- Rodando teste com números válidos;\n"+
            "- Verificando se o retorno é uma String;\n"+
            "- Verificando se o resultado está entre as opções: maior, menor, igual ou intermediário.\n"+
            "   Resultado: " + VerificaPrimeiroNumero.verificarPrimeiroNumero(1, 2, 3) + "\n"
        );

        System.out.println(
            "TESTES DE CONDIÇÕES LIMITE:\n"+
            "- Testar comparação com valores distântes entre sí (um positivo e outro negativo):\n"+
            "   Resultado: " + VerificaPrimeiroNumero.verificarPrimeiroNumero(100, 0, -100) + "\n"+
            "- Testar comparação com casas decimais:\n"+
            "   Resultado: " + VerificaPrimeiroNumero.verificarPrimeiroNumero(0.005, 1, 0.05) + "\n"
        );

        System.out.println(
            "TESTES DE CAMINHOS INDEPENDENTES:\n"+
            "- Primeiro número menor e os demais maiores:\n"+
            "   Resultado: " + VerificaPrimeiroNumero.verificarPrimeiroNumero(0, 1, 10) + "\n"+
            "- Primeiro número maior e os demais menores:\n"+
            "   Resultado: " + VerificaPrimeiroNumero.verificarPrimeiroNumero(10, 1, 0) + "\n"+
            "- Todos os números iguais:\n"+
            "   Resultado: " + VerificaPrimeiroNumero.verificarPrimeiroNumero(1, 1, 1) + "\n"+
            "- Primeiro número está entre os outros dois:\n"+
            "   Resultado: " + VerificaPrimeiroNumero.verificarPrimeiroNumero(1, 0, 2) + "\n"+
            "- Primeiro número é igual a um dos dois, porém, menor ao outro:\n"+
            "   Resultado: " + VerificaPrimeiroNumero.verificarPrimeiroNumero(1, 1, 2) + "\n"+
            "- Primeiro número é igual a um dos dois, porém, maior ao outro:\n"+
            "   Resultado: " + VerificaPrimeiroNumero.verificarPrimeiroNumero(2, 1, 2) + "\n"
        );

        System.out.println(
            "TESTES DE CAMINHOS DE MANIPULAÇÃO DE ERRO:\n"+
            "- "
        );
    }
}