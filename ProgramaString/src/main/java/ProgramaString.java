import java.util.Scanner;

public class ProgramaString {

    public static Integer procuraCaractere(String cadeia, String caractere){
        return cadeia.indexOf(caractere);
    }

    public static boolean checaTamanho(Integer tamanho){
        if(tamanho < 1 || tamanho > 20){
            throw new IllegalArgumentException("Tamanho menor que 1 ou maior que 20.");
        }
        else {
            return true;
        }
    }

    public static boolean checaCadeia(String cadeiaCaracteres, Integer tamanho){
        if(cadeiaCaracteres.length() > tamanho || cadeiaCaracteres.length() < tamanho || cadeiaCaracteres == null){
            throw new IllegalArgumentException("Cadeia de tamanho incorreto.");
        }
        else {
            return true;
        }
    }

    public static boolean checaCaractere(String caractere){
        if(caractere.length() > 1 || caractere.equals(null)){
            throw new IllegalArgumentException("Caractere inválido.");
        }
        else {
            return true;
        }
    }

    public static Integer ProgString(Integer tamanho, String cadeiaCaracteres, String caractere){
        Integer posicao = -1;
        if(checaTamanho(tamanho)){
            if(checaCadeia(cadeiaCaracteres, tamanho)){
                if(checaCaractere(caractere)){
                    posicao =  procuraCaractere(cadeiaCaracteres, caractere);
                }
            }
        }
        return posicao;
    }

}
