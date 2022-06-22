package br.edu.univas.constants;

public enum TipoSanguineo {

    APOSITIVO ("A positivo"),
    ANEGATIVO ("A negativo"),
    BPOSITIVO ("B Positivo"),
    BNEGATIVO ("B negativo"),
    ABPOSITIVO("AB positivo"),
    ABNEGATIVO("AB negativo"),
    OPOSITIVO ("O positivo"),
    ONEGATIVO ("O negativo");

    private String tipo;

    TipoSanguineo (String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public TipoSanguineo fromTipo(String tipo){
        return null;
    }

}
