# Flood Fill Balde

## Sobre o Projeto

Este repositório contém a implementação do algoritmo **Flood Fill** (preenchimento por inundação), desenvolvido como parte da disciplina de **Resolução de Problemas Estruturados em Computação** do curso de **Engenharia de Software da PUCPR**.

O projeto demonstra o funcionamento do algoritmo utilizando duas abordagens distintas para o armazenamento de pixels:  
- **Pilha (Stack)** → resultando em uma busca em profundidade (*Depth-First Search – DFS*).  
- **Fila (Queue)** → resultando em uma busca em largura (*Breadth-First Search – BFS*).  

Ambas as estruturas foram implementadas do zero, sem o uso das bibliotecas padrão do Java.

---

## Objetivos do Projeto

O Flood Fill é um algoritmo clássico da computação gráfica, famoso pela sua aplicação na ferramenta **“balde de tinta”** de softwares como o Paint.  

O projeto cumpre os seguintes requisitos:  
- **Duas Implementações** → com Pilha (DFS) e com Fila (BFS).  
- **Estruturas de Dados Próprias** → `PilhaPontos` e `FilaPontos`.  
- **Manipulação de Imagens** → carregar uma imagem PNG, processar o preenchimento e salvar o resultado.  
- **Geração de Animação** → frames são salvos periodicamente, permitindo visualizar a progressão do algoritmo.

---

## 📂 Estrutura do Projeto

```
src/
├── App.java                 # Classe principal, ponto de entrada da aplicação
│
├── algoritmo/
│   └── Inundar.java         # Lógica principal do Flood Fill (versões com Pilha e Fila)
│
├── data/
│   ├── Ponto.java           # Representa uma coordenada (x, y)
│   ├── PilhaPontos.java     # Implementação da estrutura de dados Pilha (LIFO)
│   └── FilaPontos.java      # Implementação da estrutura de dados Fila (FIFO)
│
└── imagem/
    └── GerenciadorImagem.java # Carregar, salvar e manipular pixels
```

Além disso, o projeto utiliza duas pastas auxiliares:  
- **`entrada/`** → Coloque aqui a imagem PNG que deseja preencher.  
- **`saida/`** → Criada automaticamente para salvar os resultados e frames da animação.  

---

## Como Executar

### Pré-requisitos
- **Java Development Kit (JDK 8+)** instalado e configurado no PATH.

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/mateusblm/flood-fill-balde.git
   cd flood-fill-balde
   ```

2. Estrutura de pastas:  
   - Coloque sua imagem em `entrada/` (ex: `entrada/imagem.png`).  
   - Certifique-se de que a pasta `saida/` será criada automaticamente.  

3. Configure os parâmetros em `src/App.java`:
   ```java
   // Caminho da imagem de entrada
   String caminhoEntradaImagem = "entrada/imagem.png";

   // Coordenadas iniciais (x, y)
   int inicioX = 100; 
   int inicioY = 100; 

   // Nova cor da área
   Color novaCor = Color.CYAN; 

   // Intervalo de salvamento de frames
   int intervaloAnimacao = 10000;
   ```

4. Compile o projeto:
   ```bash
   cd src
   javac ./*.java algoritmo/*.java data/*.java imagem/*.java
   ```

5. Execute:
   ```bash
   java App
   ```

6. Após a execução, verifique a pasta `saida/` para:
   - **Frames da animação** (`pilha_frame_*.png`, `fila_frame_*.png`).  
   - **Resultado final** do preenchimento.  

---

## Diferenças Visuais: Pilha vs. Fila

- **Pilha (Stack - DFS):** o preenchimento segue um caminho até o fim antes de voltar, resultando em um preenchimento **irregular e imprevisível**.  
- **Fila (Queue - BFS):** o preenchimento se expande em camadas a partir do ponto inicial, de forma **radial e uniforme**, como uma onda.

---
