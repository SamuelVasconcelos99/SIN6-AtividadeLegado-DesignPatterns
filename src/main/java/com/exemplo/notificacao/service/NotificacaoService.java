
package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class NotificacaoService {
    private final List<NotificacaoStrategy> observadores = new ArrayList<>();

    public void adicionarObservador(NotificacaoStrategy observador) {
        observadores.add(observador);
    }

    public void removerObservador(NotificacaoStrategy observador) {
        observadores.remove(observador);
    }

    public void enviarNotificacoes(Pedido pedido) {
        for (NotificacaoStrategy obs : observadores) {
            obs.enviar(pedido);
        }
    }
}
