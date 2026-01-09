Sistema de Gestão de Trabalhadores e Contratos (Java)
📌 Descrição do Projeto

Este projeto consiste em um sistema de gestão de trabalhadores, desenvolvido em Java, com foco na aplicação prática dos conceitos de Programação Orientada a Objetos (POO).
O sistema permite cadastrar um trabalhador, seu departamento, seus contratos por hora e calcular a renda mensal com base em um mês e ano informados pelo usuário.

O projeto foi desenvolvido com o objetivo de consolidar conhecimentos fundamentais de Java, como encapsulamento, associação entre classes, uso de enums, manipulação de datas e entrada de dados via console.

🧠 Conceitos Aplicados

✔ Programação Orientada a Objetos (POO)

✔ Encapsulamento

✔ Associação entre classes

✔ Enum (NivelTrabalhador)

✔ API moderna de datas (LocalDate, DateTimeFormatter)

✔ Coleções (List, ArrayList)

✔ Estruturas de repetição

✔ Leitura de dados com Scanner

✔ Boas práticas de organização de código

🏗 Estrutura do Sistema

O sistema é composto pelas seguintes entidades:

Trabalhador

Nome

Nível (JUNIOR, PLENO, SENIOR)

Salário base

Departamento

Lista de contratos

Departamento

Nome do departamento

HoraContrato

Data do contrato

Valor por hora

Quantidade de horas

Cálculo do valor total do contrato

Enum NivelTrabalhador

Define os níveis possíveis do trabalhador, garantindo segurança e padronização

⚙ Funcionalidades

📌 Cadastro de departamento

👤 Cadastro de trabalhador

🕒 Cadastro de múltiplos contratos por hora

📅 Leitura e validação de datas no formato dd/MM/yyyy

💰 Cálculo da renda mensal com base no mês e ano informados

📊 Soma do salário base com os contratos do período escolhido

▶ Exemplo de Funcionamento

O usuário informa os dados do trabalhador e do departamento

Informa a quantidade de contratos

Cadastra cada contrato com data, valor por hora e duração

Informa um mês e ano (MM/YYYY)

O sistema calcula e exibe a renda do trabalhador naquele período

🧪 Tecnologias Utilizadas

Java (JDK 8+)

API java.time

Collections Framework

Console (entrada padrão)

📈 Possíveis Melhorias Futuras

Persistência de dados em arquivo ou banco de dados

Interface gráfica ou API REST

Validações de entrada mais robustas

Testes automatizados

Refatoração para padrões de projeto

🎯 Objetivo do Projeto

Este projeto tem caráter educacional, sendo ideal para estudantes e iniciantes em Java que desejam entender na prática como funciona um sistema orientado a objetos, organizado e bem estruturado.

👨‍💻 Autor

Desenvolvido por Emerson Amorim
Estudante de Análise e Desenvolvimento de Sistemas
Foco em desenvolvimento backend com Java
