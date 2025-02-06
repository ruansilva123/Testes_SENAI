package testesUnitarios.primeiraEstoria.servicos;

public class VerificaPrimeiroNumero{
    public static String verificarPrimeiroNumero(
        double primeiroNumero, double segundoNumero, double terceiroNumero
        ){
        if (primeiroNumero < segundoNumero & primeiroNumero < terceiroNumero){return "Menor";}
        if (primeiroNumero > segundoNumero & primeiroNumero > terceiroNumero){return "Maior";}
        if (primeiroNumero == segundoNumero & primeiroNumero == terceiroNumero){return "Igual";}
        if (primeiroNumero == segundoNumero & primeiroNumero < terceiroNumero){return "Menor";}
        if (primeiroNumero < segundoNumero & primeiroNumero == terceiroNumero){return "Menor";}
        if (primeiroNumero == segundoNumero & primeiroNumero > terceiroNumero){return "Maior";}
        if (primeiroNumero > segundoNumero & primeiroNumero == terceiroNumero){return "Maior";}
        return "Intermediário";
    }
}