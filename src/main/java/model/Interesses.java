package model;

public enum Interesses {
    IA_RESPONSAVEL("IA Responsável"),
    CIBERSEGURANCA("Cibersegurança"),
    PRIVACIDADE_ETICA("Privacidade & Ética Digital");

    private String descricao;

    Interesses(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
