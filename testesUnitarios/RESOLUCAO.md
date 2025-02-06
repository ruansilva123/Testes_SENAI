# Exercício 3 - Testes Unitários

A atividade 3 possui como objetivo realizar os testes unitários nas seguintes estórias presentes no [PDF](https://marisangila.com.br/institution/senai/subjects/teso/exercicios/unidade.pdf).

## 📖 Primeira Estória 

### 1. Testes de Interface

- As três entradas devem ser apenas números válidos;
- Validar se os resultados das comparações estão corretas;
- Garantir que as mensagens retornem com o resultado da comparação (maior, menor, igual ou intermediário).

### 2. Testes de Condições Limite

- Testar comparação com valores distantes entre si (um positivo e outro negativo);
- Testar comparação dos valores com casas decimais.

### 3. Testes de Caminhos Independentes

- Primeiro número menor e os demais maiores;
- Primeiro número maior e os demais menores;
- Todos os números iguais;
- Primeiro número está entre os outros dois;
- Testar se o primeiro número é igual a um dos dois, porém, menor ao outro;
- Testar se o primeiro número é igual a um dos dois, porém, maior ao outro.

### 4. Testes de Caminhos de Manipulação de Erro

- Retornar erro de input inválido ao inserir letras ou caracteres especiais.

## 📖 Segunda Estória 

### 1. Testes de Interface

- Garantir que a entrada seja um vetor;
- Verificar se os números do vetor estão em ordem crescente;
- O tamanho do vetor deve ser o mesmo do vetor de entrada;
- Retornar um vetor vazio se a entrada for um vetor vazio. 

### 2. Testes de Condições Limite

- Inserir números positivos e negativos no vetor;
- Envio de vetor com mais de 50 itens sortidos (positivos, negativos, decimais e zero).

### 3. Testes de Caminhos Independentes

- Envio de vetor com todos os números repetidos;
- Envio de vetor com apenas números negativos;
- Envio de vetor com apenas números positivos;
- Envio de vetor com números positivos, negativos, decimais e zero.

### 4. Testes de Caminhos de Manipulação de Erro

- Retornar erro ao inserir vetor com algum caractere.
