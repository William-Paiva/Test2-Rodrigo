package br.edu.univas.vo;

import br.edu.univas.constants.TipoSanguineo;

public class Doador {

    private long cpf;
    private TipoSanguineo tipoSanguineo;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
}
