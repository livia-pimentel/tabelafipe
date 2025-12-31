# 🚗 Consulta Tabela FIPE (Java & Spring Boot)

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

> Uma aplicação via linha de comando (CLI) para consultar valores médios de veículos (Carros, Motos e Caminhões) utilizando a API da Tabela FIPE.

## 📝 Sobre o Projeto

Este projeto foi desenvolvido como parte de um desafio técnico/estudo para consolidar conhecimentos em **Java** e **Spring Framework**. O objetivo principal é consumir uma API externa, tratar os dados recebidos (desserialização de JSON) e apresentar as informações de forma interativa ao usuário no terminal.

A aplicação permite que o usuário navegue por marcas, modelos e anos para encontrar o valor atualizado de mercado de um veículo específico.

## ⚙️ Funcionalidades

* ✅ **Menu Interativo:** Escolha entre Carros, Motos ou Caminhões.
* ✅ **Busca de Marcas:** Lista todas as marcas disponíveis para o tipo de veículo selecionado.
* ✅ **Filtragem de Modelos:** Permite digitar um trecho do nome do veículo para filtrar a lista de modelos.
* ✅ **Consulta Completa:** Exibe o valor do veículo para todos os anos disponíveis na Tabela FIPE.
* ✅ **Consumo de API:** Integração com a [API Tabela Fipe (Wrapper)](https://github.com/deividfortuna/fipe).

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot** (para injeção de dependências e estrutura base)
* **Spring Framework** (`CommandLineRunner` para execução no terminal)
* **Jackson** (ObjectMapper) para manipulação de JSON
* **Maven** para gerenciamento de dependências

## 🚀 Como Executar

### Pré-requisitos

Certifique-se de ter o **Java JDK 17** (ou superior) e o **Maven** instalados em sua máquina.

### Passo a passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/livia-pimentel/tabelafipe.git
