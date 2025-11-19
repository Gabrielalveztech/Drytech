package model;

public class InteressesUsuario {
    private int usuarioId;
    private int categoriaId;

    public InteressesUsuario(int usuarioId, int categoriaId) {
        this.usuarioId = usuarioId;
        this.categoriaId = categoriaId;
    }

    public int getUsuarioId() { return usuarioId; }
    public int getCategoriaId() { return categoriaId; }
}
