package br.com.letscode.enums;

public enum TipoContaEnum {
    CONTA_CORRENTE("Conta-Corrente"),
    CONTA_POUPANCA("Conta-Poupança");

    private String descricao;

    TipoContaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
