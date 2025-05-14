# Conversor de Moedas

### Descrição
Projeto desenvolvido como parte do desafio Alura: Challenge ONE - Conversor de Moedas
(Java Backend).

### Objetivo
Construir uma aplicação de conversão de moedas com interação via console. O usuário pode escolher 
entre **6 opções distintas de conversão** por meio de um menu interativo.
As taxas de câmbio são obtidas dinamicamente por meio da API [ExchangeRate-API](https://www.exchangerate-api.com/), garantindo processos dados
precisos e em tempo real para uma experiência mais atualizada e eficaz.

### Funcionalidades
- Menu interativo com múltiplas opções de conversão.
- Consumo de API externa para obter as taxas de câmbio atuais.
- Exibição clara e direta dos resultados ao usuário.
- Estrutura modular com separação por responsabilidades.

### Conteúdos abordados
- Configuração de ambiente Java
- Consumo de API com Java
- Manipulação de JSON com GSON
- Boas práticas de estruturação em projetos Java
- Interação com o usuário via console

### Pré-requisitos
- Java (JDK instalado)
- Biblioteca GSON

### Estrutura do repositório
```- src
  - app
    MenuHandler.java              // Responsável pelo menu e interação com o usuário
  - client
    CurrencyApiClient.java        // Faz as requisições à API de câmbio
  - model
    ExchangeRateResponse.java     // Representa a estrutura da resposta JSON da API
  - services
    CurrencyCalculator.java       // Lógica de cálculo entre moedas
    CurrencyConversion.java       // Estrutura dos dados de conversão
  
  Main.java                       // Classe principal para execução da aplicação
``` 