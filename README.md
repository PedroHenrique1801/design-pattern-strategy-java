# Projeto Padrão Strategy em Java 

Este projeto é uma implementação prática do padrão de projeto de software estrutural Strategy, desenvolvido em Java puro. O objetivo principal é demonstrar como alterar o comportamento de um objeto em tempo de execução sem a necessidade de modificar sua estrutura interna utilizando estruturas condicionais complexas.

## O que o projeto faz

O sistema simula o controle de um robô que possui diferentes estratégias de movimento. Através de um menu interativo no console, o usuário pode enviar comandos para o robô e observar as mudanças em tempo real.

O projeto também implementa uma regra de negócio adicional para demonstrar o controle de estado do objeto (Contexto):
* O robô inicia com 100% de bateria.
* Cada movimento consome 20% de energia.
* Se a bateria atingir 20% ou menos, o robô ignora o comando do usuário e entra em "Modo Defensivo" automaticamente para poupar energia.

## Funcionalidades implementadas

* Menu interativo de comandos (entrada via terminal).
* Padrão Strategy aplicado ao comportamento do robô.
* Classes de comportamento: Normal, Defensivo e Agressivo.
* Sistema de consumo e recarga de bateria simulado.
* Inteligência de contexto (troca autônoma de estratégia).

## Tecnologias utilizadas

* Java (JDK 25)
* Nenhuma biblioteca ou framework externo foi utilizado.

## Como executar o projeto

1. Certifique-se de ter o Java (JDK) configurado em sua máquina.
2. Clone este repositório.
3. Abra o diretório do projeto no terminal ou em sua IDE de preferência.
4. Navegue até a pasta `src` e compile/execute o arquivo principal `Test.java`.
