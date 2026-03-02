# Estrutura-de-Dados-Atividade-4-
Este documento apresenta a implementação e as soluções desenvolvidas na Atividade 4 da disciplina de Estrutura de Dados I. O principal objetivo deste trabalho foi aprimorar a organização do código, aplicando os conceitos de Tipos Abstratos de Dados (TAD), modularização e refatoração, além de realizar uma análise teórica da eficiência de um novo algoritmo proposto.

Desenvolvimento do código

A etapa inicial do trabalho consistiu na integração das resoluções das atividades anteriores em estruturas lógicas reutilizáveis. Para isso, foram adotadas as seguintes diretrizes de organização:

Modularização: A lógica de cada questão (da 1 à 5) foi separada em funções específicas. O programa principal (main) ficou responsável apenas por coordenar a execução dessas funções.

Encapsulamento: Não foram utilizadas variáveis globais. A troca de informações entre a função principal e as demais ocorre exclusivamente por meio da passagem de parâmetros e do retorno de valores.

As funções refatoradas abordam diferentes problemas, como o processamento de notas acadêmicas, a simulação da contagem de cédulas para cálculo de troco, a validação de critérios de segurança para senhas, a conversão de unidades de tempo e a verificação de valores duplicados em arrays.

Além disso, foi implementada a Questão 6, que introduz o método inverterLista. Esse método recebe um array de números inteiros e inverte a ordem de seus elementos utilizando a estratégia in-place. Dessa forma, as trocas são realizadas diretamente no vetor original, o que otimiza o uso da memória ao eliminar a necessidade de um vetor auxiliar.

## Resoluções Teóricas e Manuscritas

Abaixo estão registradas as respostas analíticas exigidas nas Partes 2 e 3 da atividade, justificando o funcionamento e a eficiência do algoritmo de inversão.

### Parte 2: Teste de Mesa (Questão 6)

A tabela a seguir demonstra o rastreio do estado das variáveis a cada iteração do laço de troca, utilizando como base o vetor de teste exigido na especificação: `v = [10, 20, 30, 40, 50]`.

| Iteração | Início (índice) | Fim (índice) | Temp (valor) | Estado do Vetor |
| :--- | :---: | :---: | :---: | :--- |
| **Início** | - | - | - | `10, 20, 30, 40, 50` |
| **1** | 0 | 4 | 10 | `50, 20, 30, 40, 10` |
| **2** | 1 | 3 | 20 | `50, 40, 30, 20, 10` |

### Parte 3: Análise de Complexidade (Notação Big-O)

**1. Quantas trocas são realizadas em um vetor de tamanho n?**

Em um vetor genérico de tamanho n, o algoritmo realiza n / 2 trocas (considerando apenas a parte inteira da divisão). Isso ocorre porque o laço de repetição precisa iterar apenas até a metade do array para que as extremidades opostas sejam trocadas, invertendo toda a estrutura com sucesso.

**2. Classificação e Justificativa Teórica**

Este algoritmo possui complexidade de tempo classificada como **O(n)**.

**Justificativa:** O crescimento do número de operações fundamentais (as trocas de valores entre as posições) ocorre de maneira linear e proporcional ao tamanho da entrada n. Embora o laço de repetição seja executado exatamente pela metade das vezes em relação à quantidade de elementos (n / 2), a notação assintótica descarta frações e constantes matemáticas. Dessa forma, o comportamento do algoritmo se enquadra na taxa de crescimento linear, sendo formalmente representado por O(n).
