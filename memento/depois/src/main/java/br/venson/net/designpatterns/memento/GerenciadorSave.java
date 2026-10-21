package br.venson.net.designpatterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/** Caretaker: guarda os mementos sem inspecioná-los. Não muda se o Jogo ganhar campos. */
public class GerenciadorSave {

    private final Deque<Checkpoint> checkpoints = new ArrayDeque<>();

    public void salvar(Jogo jogo) {
        checkpoints.push(jogo.salvar());
    }

    public void restaurar(Jogo jogo) {
        if (checkpoints.isEmpty()) {
            System.out.println("Nenhum checkpoint salvo.");
            return;
        }
        jogo.restaurar(checkpoints.pop());
    }
}
