package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private final NotificacaoService notificacaoService;
    private final EmailService emailService;
    private final SmsService smsService;
    private final PushService pushService;

    public PedidoService(NotificacaoService notificacaoService, EmailService emailService, SmsService smsService, PushService pushService) {
        this.notificacaoService = notificacaoService;
        this.emailService = emailService;
        this.smsService = smsService;
        this.pushService = pushService;

        notificacaoService.adicionarObservador(emailService);
        notificacaoService.adicionarObservador(smsService);
        notificacaoService.adicionarObservador(pushService);
    }

    public void criarPedido(String cliente, double valor) {
        Pedido pedido = new Pedido(cliente, valor);
        System.out.println("Pedido criado para o cliente: " + cliente);
        notificacaoService.enviarNotificacoes(pedido);
    }
}
