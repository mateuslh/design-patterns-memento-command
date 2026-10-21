package br.venson.net.designpatterns.command;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        Macro macro = new Macro();

        macro.adicionar(new DigitarComando(editor, "Ola "));
        macro.adicionar(new DigitarComando(editor, "mundo"));
        macro.adicionar(new ApagarComando(editor, 3));

        macro.executar();
        System.out.println("Executada:      \"" + editor.getTexto() + "\"");

        macro.desfazer();
        System.out.println("Desfez 1 passo: \"" + editor.getTexto() + "\"");

        macro.desfazerTudo();
        System.out.println("Desfez tudo:    \"" + editor.getTexto() + "\"");
    }
}
