package br.edu.univas.vo;

import java.util.List;
import java.util.Map;

public class DataBase {

    private static List<Doador> doadores;
    private static Map<String, Long> estoqueSanguineo;

    public static void addDoador(Doador doador){
        doadores.add(doador);
    }
    public static void addDoacao(String tipoSanguineo, Long quantidade){
        estoqueSanguineo.put(tipoSanguineo, quantidade);
    }
    public static Long getSituaçãoEstoque(String tipoSanguineo){
        return null;
    }
}
