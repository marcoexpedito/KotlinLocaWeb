
# 📱 ProjetoApp – Simulador de Envio de E-mails

Aplicativo Android desenvolvido em Kotlin no Bootcamp da Locaweb, com foco no aprendizado de Jetpack Compose, gerenciamento de estado com ViewModel e simulação de envio e recebimento de e-mails em ambiente controlado.

---

## 🚀 Funcionalidades principais

✅ Tela de Login
- Autenticação simples com validação de usuário e senha.

✅ Menu de E-mails
- Interface que simula a navegação entre diferentes categorias de e-mails (caixa de entrada, enviados, etc.).

✅ Envio de E-mail
- Formulário para compor e simular o envio de uma mensagem (campos: destinatário, assunto, corpo do e-mail).
- Salvamento do e-mail enviado em uma base local.

✅ Caixa de Entrada
- Exibição de lista de e-mails armazenados localmente simulando mensagens recebidas.

✅ Persistência Local
- Utilização de banco de dados local (Room) para armazenar usuários e e-mails simulados.

✅ Arquitetura Moderna
- Separação em camadas:
  - `model`: dados e entidades (ex.: `Email.kt`, `Usuario.kt`).
  - `viewModel`: gerenciamento de estado (ex.: `UserViewModel.kt`).
  - `screens`: telas da aplicação (ex.: `TelaLogin.kt`, `EnvioEmail.kt`, `CaixaDeEntrada.kt`).
  - `components`: componentes de interface reutilizáveis.
  - `ui/theme`: temas e estilos personalizados.

---

## 🛠️ Tecnologias e práticas utilizadas

- Kotlin – linguagem principal
- Jetpack Compose – construção declarativa da interface
- ViewModel – gerenciamento de estado e ciclo de vida
- Room Database – persistência de dados local
- Gradle Kotlin DSL – gerenciamento de dependências
- Arquitetura MVVM – organização em camadas
- Material Design – padrões visuais e interativos

---

## 🎯 Objetivos do projeto

- Praticar conceitos fundamentais de desenvolvimento Android moderno
- Criar experiência de usuário fluida com Jetpack Compose
- Simular fluxo completo de autenticação, envio e exibição de e-mails
- Aprender persistência de dados local e uso de ViewModel

---

## 💡 Possíveis melhorias futuras

- Integração real com serviços de e-mail (ex.: Gmail API)
- Implementar notificações push
- Suporte a múltiplos usuários e múltiplas contas
- Filtro e pesquisa de e-mails
- Melhoria de usabilidade e responsividade

---

## 👨‍💻 Sobre o autor

Este projeto foi desenvolvido como parte do Bootcamp Kotlin Locaweb, com foco em consolidar práticas modernas do ecossistema Android.

---

🔗 Repositório no GitHub:  
https://github.com/marcoexpedito/KotlinLocaWeb
