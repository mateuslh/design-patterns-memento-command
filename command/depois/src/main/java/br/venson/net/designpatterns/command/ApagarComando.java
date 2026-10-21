package br.venson.net.designpatterns.command;

/** Comando concreto: apagar N caracteres. Guarda o que removeu para poder desfazer. */
public class ApagarComando implements Comando {

    private final Editor editor;
    private final int quantidade;
    private String removido = "";

    public ApagarComando(Editor editor, int quantidade) {
        this.editor = editor;
        this.quantidade = quantidade;
    }

    @Override
    public void executar() {
        removido = editor.apagar(quantidade);
    }

    @Override
    public void desfazer() {
        editor.digitar(removido);
    }
}
