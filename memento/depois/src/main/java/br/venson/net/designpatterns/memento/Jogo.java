package br.venson.net.designpatterns.memento;

/** Originator: cria e restaura seus próprios checkpoints. Sem getters/setters. */
public class Jogo {

    private String fase;
    private int vidas;
    private int pontuacao;
    private double x;
    private double y;

    public void jogar(String fase, int vidas, int pontuacao, double x, double y) {
        this.fase = fase;
        this.vidas = vidas;
        this.pontuacao = pontuacao;
        this.x = x;
        this.y = y;
    }

    public Checkpoint salvar() {
        return new Checkpoint(fase, vidas, pontuacao, x, y);
    }

    public void restaurar(Checkpoint c) {
        this.fase = c.fase;
        this.vidas = c.vidas;
        this.pontuacao = c.pontuacao;
        this.x = c.x;
        this.y = c.y;
    }

    @Override
    public String toString() {
        return "Jogo{fase=" + fase + ", vidas=" + vidas + ", pontuacao=" + pontuacao
                + ", x=" + x + ", y=" + y + "}";
    }
}
