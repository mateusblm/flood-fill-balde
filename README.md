<<<<<<< HEAD
# Flood Fill Balde

## 📖 Sobre o Projeto

Este repositório contém a implementação do algoritmo **Flood Fill** (preenchimento por inundação), desenvolvido como parte da disciplina de **Resolução de Problemas Estruturados em Computação** do curso de **Engenharia de Software da PUCPR**.

O projeto demonstra o funcionamento do algoritmo utilizando duas abordagens distintas para o armazenamento de pixels:  
- **Pilha (Stack)** → resultando em uma busca em profundidade (*Depth-First Search – DFS*).  
- **Fila (Queue)** → resultando em uma busca em largura (*Breadth-First Search – BFS*).  

Ambas as estruturas foram implementadas do zero, sem o uso das bibliotecas padrão do Java.

---

## 🎯 Objetivos do Projeto

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
- **`input/`** → Coloque aqui a imagem PNG que deseja preencher.  
- **`output/`** → Criada automaticamente para salvar os resultados e frames da animação.  

---

## 🚀 Como Executar

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

## ✨ Diferenças Visuais: Pilha vs. Fila

- 🎨 **Pilha (Stack - DFS):** o preenchimento segue um caminho até o fim antes de voltar, resultando em um preenchimento **irregular e imprevisível**.  
- 🌊 **Fila (Queue - BFS):** o preenchimento se expande em camadas a partir do ponto inicial, de forma **radial e uniforme**, como uma onda.

---
=======
Implementação do Algoritmo Flood Fill em JavaEste repositório contém a implementação do algoritmo Flood Fill (preenchimento por inundação), desenvolvido como parte da disciplina de Resolução de Problemas Estruturados em Computação do curso de Engenharia de Software da PUCPR.O projeto demonstra o funcionamento do algoritmo utilizando duas abordagens distintas para o armazenamento de pixels: uma com Pilha (Stack) e outra com Fila (Queue), ambas implementadas do zero, sem o uso das bibliotecas padrão do Java.📖 Sobre o ProjetoO Flood Fill é um algoritmo clássico da computação gráfica, famoso pela sua aplicação na ferramenta "balde de tinta" de softwares como o Paint. O objetivo é preencher uma área conectada de uma mesma cor com uma nova cor, a partir de um ponto inicial.Este projeto cumpre os seguintes requisitos:Duas Implementações: O algoritmo foi implementado duas vezes, uma usando uma Pilha (resultando em uma busca em profundidade - DFS) e outra usando uma Fila (resultando em uma busca em largura - BFS).Estruturas de Dados Próprias: As estruturas PilhaPontos e FilaPontos foram criadas do zero, atendendo a um requisito fundamental do trabalho acadêmico.Manipulação de Imagens: O programa carrega uma imagem PNG de entrada, processa o preenchimento e salva o resultado final.Geração de Animação: Para visualizar o processo, o algoritmo salva frames da imagem em intervalos regulares, criando uma animação que demonstra o padrão de preenchimento de cada estrutura.📂 Estrutura do ProjetoO código foi organizado seguindo os princípios da Programação Orientada a Objetos, com responsabilidades bem divididas:src/
├── App.java              # Classe principal, ponto de entrada da aplicação
│
├── algoritmo/
│   └── Inundar.java      # Contém a lógica principal do Flood Fill (versões com Pilha e Fila)
│
├── data/
│   ├── Ponto.java        # Representa uma coordenada (x, y)
│   ├── PilhaPontos.java  # Implementação da estrutura de dados Pilha (LIFO)
│   └── FilaPontos.java   # Implementação da estrutura de dados Fila (FIFO)
│
└── imagem/
    └── GerenciadorImagem.java # Responsável por carregar, salvar e manipular pixels
🚀 Como ExecutarSiga os passos abaixo para executar o projeto em sua máquina.Pré-requisitosJava Development Kit (JDK) instalado (versão 8 ou superior).Passos para ExecuçãoClone o repositório:git clone [https://github.com/mateusblm/flood-fill-balde.git](https://github.com/mateusblm/flood-fill-balde.git)
Estrutura de Pastas:Crie as seguintes pastas na raiz do projeto:input/: Coloque a imagem que você deseja colorir aqui (ex: imagem.png).output/: Esta pasta será criada automaticamente para salvar os resultados e os frames da animação.Configure os Parâmetros:Abra o arquivo src/App.java e ajuste as variáveis de configuração conforme sua necessidade:// Caminho da imagem de entrada
String caminhoEntradaImagem = "input/imagem.png";
// Coordenadas (x, y) do ponto inicial do preenchimento
int inicioX = 100; 
int inicioY = 100; 
// Nova cor para a área
Color novaCor = Color.CYAN; 
// A cada quantos pixels um frame da animação será salvo
int intervaloAnimacao = 10000;
Compile e Execute:Navegue até a pasta src pelo terminal e execute os seguintes comandos:# Compilar todos os arquivos .java
javac ./*.java algoritmo/*.java data/*.java imagem/*.java

# Executar a classe principal
java App
Após a execução, a pasta output/ conterá os frames da animação (pilha_frame_*.png, fila_frame_*.png) e as imagens com o resultado final.✨ Diferenças Visuais: Pilha vs. FilaA animação gerada revela a principal diferença no comportamento dos dois algoritmos:🎨 Com a Pilha (Stack - DFS): O preenchimento segue um padrão de busca em profundidade. Ele explora um "caminho" de pixels até o fim antes de retornar, resultando em um preenchimento visualmente mais irregular e imprevisível.🌊 Com a Fila (Queue - BFS): O preenchimento segue um padrão de busca em largura. Ele se expande em camadas a partir do ponto inicial, de forma radial, como uma onda. O resultado é um preenchimento visualmente mais uniforme e organizado.
>>>>>>> 8e54d6556225090f53dba39a2be4bf9ee5085933
