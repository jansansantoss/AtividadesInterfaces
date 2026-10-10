package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        String mensagem = "Sua compra foi aprovada!";

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar(mensagem);
        }
    }
}