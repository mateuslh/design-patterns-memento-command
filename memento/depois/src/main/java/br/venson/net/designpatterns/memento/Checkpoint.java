package br.venson.net.designpatterns.memento;

/**
 * Memento: snapshot imutável do estado do {@link Jogo}.
 *
 * Interface estreita (para o caretaker): só existe como tipo opaco, sem
 * nenhum método público. Interface ampla (para o originator): os campos
 * são visíveis apenas dentro do pacote e lidos só por {@link Jogo}.
 */
public final class Checkpoint {

    final String fase;
    final int vidas;
    final int pontuacao;
    final double x;
    final double y;

    Checkpoint(String fase, int vidas, int pontuacao, double x, double y) {
        this.fase = fase;
        this.vidas = vidas;
        this.pontuacao = pontuacao;
        this.x = x;
        this.y = y;
    }
}
