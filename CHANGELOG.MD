# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - 2025-10-07

### Adicionado
- Implementação dos padrões de projeto Strategy e Observer para os serviços de notificação.
- Criação da interface `NotificacaoStrategy` para padronizar os tipos de notificação.
- Registro dinâmico dos serviços de notificação como observadores no fluxo de pedidos.

### Corrigido
- Remoção de chave extra e problemas de sintaxe nos arquivos de serviço.
- Ajuste de incompatibilidade entre versão do Java e dependências do Spring Boot.

### Modificado
- Refatoração das classes de serviço para implementar a interface de estratégia.
- Alteração do construtor de `PedidoService` para registrar observadores.
- Atualização do `pom.xml` para garantir compatibilidade entre dependências e ambiente Java.