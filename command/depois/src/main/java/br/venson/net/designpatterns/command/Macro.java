package br.venson.net.designpatterns.command;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/** Invoker: só armazena e dispara comandos; não conhece nenhuma operação. */
public class Macro {

    private final List<Comando> comandos = new ArrayList<>();
    private final Deque<Comando> executados = new ArrayDeque<>();

    public void adicionar(Comando comando) {
        comandos.add(comando);
    }

    public void executar() {
        for (Comando c : comandos) {
            c.executar();
            executados.push(c);
        }
    }

    /** Desfaz o último passo executado. */
    public void desfazer() {
        if (!executados.isEmpty()) {
            executados.pop().desfazer();
        }
    }

    public void desfazerTudo() {
        while (!executados.isEmpty()) {
            desfazer();
        }
    }
}
