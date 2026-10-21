package br.venson.net.designpatterns.command;

/** Command: o pedido como objeto. */
public interface Comando {
    void executar();
    void desfazer();
}
