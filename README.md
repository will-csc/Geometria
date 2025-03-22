# Geometria

Este projeto é uma implementação simples em Java, que permite ao usuário calcular a área e o perímetro de figuras geométricas como Círculo, Retângulo e Triângulo. Além disso, o sistema verifica características específicas dessas figuras, como se o triângulo é retângulo ou 3-4-5 e se o retângulo é um quadrado.

![image](https://github.com/user-attachments/assets/669a6b24-7ca8-4013-a083-b828c23c82b6)
![image](https://github.com/user-attachments/assets/ad3f83d4-a64c-4106-bd92-56abbe3bb25c)

---

## Objetivo
Este repositório tem a função de cumprir os requisitos da atividade proposta abaixo pela faculdade UniFECAF na matéria de OOP

### Critérios de Avaliação
![image](https://github.com/user-attachments/assets/f3d9c7bc-07c9-4150-bf60-e9ded86e7d5f)

### Requisitos Funcionais
![image](https://github.com/user-attachments/assets/8986af66-9530-4d20-9bb8-11aabfa72bd0)

---

## Estrutura do Projeto

O projeto é dividido em várias classes e pacotes, seguindo uma estrutura modular para facilitar a manutenção e extensão. Abaixo, estão as principais classes e pacotes utilizados:

### Pacote `br.com.fecaf.model`
Contém as classes que representam as figuras geométricas (Círculo, Retângulo e Triângulo). Cada classe implementa a interface Figura e possui métodos para cadastrar os dados, calcular área e perímetro, além de verificar características específicas.

#### Principais Classes e Interface:

- Retângulo: Calcula área, perímetro e verifica se é um quadrado.
- Triângulo: Calcula área, perímetro, verifica o tipo (Equilátero, Escaleno, Isósceles), testa se é um triângulo retângulo e verifica a condição 3-4-5.
- Círculo: Implementa as operações básicas de um círculo.

**Interface Figura**
Define os métodos essenciais para todas as figuras geométricas, como cadastrar(), calcularArea(), calcularPerimetro(), entre outros.

### Pacote `br.com.fecaf.controller`
Contém a classe Menu, que gerencia a interação com o usuário. O menu permite que o usuário escolha qual figura geométrica deseja trabalhar e oferece as opções de calcular área, perímetro ou verificar características específicas.

### Pacote `br.com.fecaf`
Contém a classe Geometria, que é a classe principal que executa o programa. Ela instancia o menu e começa a interação com o usuário.

---

## Funcionalidades

- Cadastrar figura: O usuário pode informar os parâmetros necessários (como lados ou altura) para cadastrar a figura geométrica.
- Calcular área e perímetro: O sistema calcula e exibe a área e o perímetro da figura.
- Verificar características: O sistema verifica se o Retângulo é um quadrado, se o Triângulo é retângulo, e se ele se encaixa nas condições 3-4-5.
- Menu interativo: O menu interativo permite que o usuário escolha qual figura deseja trabalhar e oferece opções de operações.

---

## Como rodar
Clone o repositório:
```Bash
git clone https://github.com/will-csc/geometria-java.git
```

Navegue até o repositório e compile:
```Bash
javac -d bin src/br/com/fecaf/*.java
```

Execute o programa:
```bash
java -cp bin br.com.fecaf.Geometria
```

---

## Contribuição

Vale ressaltar que esse é um repositório de estudos, então se os senhores(a) tiverem melhores soluções ou ajuda, sintam-se à vontade para abrir uma issue ou enviar um pull request. Contribuições são muito bem-vindas!

