**Implementação do Algoritmo Flood Fill em JavaEste repositório contém a implementação do algoritmo Flood Fill (preenchimento por inundação), desenvolvido como parte da disciplina de Resolução de Problemas Estruturados em Computação do curso de Engenharia de Software da PUCPR.O projeto demonstra o funcionamento do algoritmo utilizando duas abordagens distintas para o armazenamento de pixels: uma com Pilha (Stack) e outra com Fila (Queue), ambas implementadas do zero, sem o uso das bibliotecas padrão do Java.📖 Sobre o ProjetoO Flood Fill é um algoritmo clássico da computação gráfica, famoso pela sua aplicação na ferramenta "balde de tinta" de softwares como o Paint. O objetivo é preencher uma área conectada de uma mesma cor com uma nova cor, a partir de um ponto inicial.Este projeto cumpre os seguintes requisitos:Duas Implementações: O algoritmo foi implementado duas vezes, uma usando uma Pilha (resultando em uma busca em profundidade - DFS) e outra usando uma Fila (resultando em uma busca em largura - BFS).Estruturas de Dados Próprias: As estruturas PilhaPontos e FilaPontos foram criadas do zero, atendendo a um requisito fundamental do trabalho acadêmico.Manipulação de Imagens: O programa carrega uma imagem PNG de entrada, processa o preenchimento e salva o resultado final.Geração de Animação: Para visualizar o processo, o algoritmo salva frames da imagem em intervalos regulares, criando uma animação que demonstra o padrão de preenchimento de cada estrutura.📂 Estrutura do ProjetoO código foi organizado seguindo os princípios da Programação Orientada a Objetos, com responsabilidades bem divididas:src/
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
🚀 Como ExecutarSiga os passos abaixo para executar o projeto em sua máquina.Pré-requisitosJava Development Kit (JDK) instalado (versão 8 ou superior).Passos para ExecuçãoClone o repositório:git clone <url-do-seu-repositorio>
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
Após a execução, a pasta output/ conterá os frames da animação (pilha_frame_*.png, fila_frame_*.png) e as imagens com o resultado final.✨ Diferenças Visuais: Pilha vs. FilaA animação gerada revela a principal diferença no comportamento dos dois algoritmos:🎨 Com a Pilha (Stack - DFS): O preenchimento segue um padrão de busca em profundidade. Ele explora um "caminho" de pixels até o fim antes de retornar, resultando em um preenchimento visualmente mais irregular e imprevisível.🌊 Com a Fila (Queue - BFS): O preenchimento segue um padrão de busca em largura. Ele se expande em camadas a partir do ponto inicial, de forma radial, como uma onda. O resultado é um preenchimento visualmente mais uniforme e organizado.Projeto desenvolvido por [Seu Nome Aqui]**Implementação do Algoritmo Flood Fill em JavaEste repositório contém a implementação do algoritmo Flood Fill (preenchimento por inundação), desenvolvido como parte da disciplina de Resolução de Problemas Estruturados em Computação do curso de Engenharia de Software da PUCPR.O projeto demonstra o funcionamento do algoritmo utilizando duas abordagens distintas para o armazenamento de pixels: uma com Pilha (Stack) e outra com Fila (Queue), ambas implementadas do zero, sem o uso das bibliotecas padrão do Java.📖 Sobre o ProjetoO Flood Fill é um algoritmo clássico da computação gráfica, famoso pela sua aplicação na ferramenta "balde de tinta" de softwares como o Paint. O objetivo é preencher uma área conectada de uma mesma cor com uma nova cor, a partir de um ponto inicial.Este projeto cumpre os seguintes requisitos:Duas Implementações: O algoritmo foi implementado duas vezes, uma usando uma Pilha (resultando em uma busca em profundidade - DFS) e outra usando uma Fila (resultando em uma busca em largura - BFS).Estruturas de Dados Próprias: As estruturas PilhaPontos e FilaPontos foram criadas do zero, atendendo a um requisito fundamental do trabalho acadêmico.Manipulação de Imagens: O programa carrega uma imagem PNG de entrada, processa o preenchimento e salva o resultado final.Geração de Animação: Para visualizar o processo, o algoritmo salva frames da imagem em intervalos regulares, criando uma animação que demonstra o padrão de preenchimento de cada estrutura.📂 Estrutura do ProjetoO código foi organizado seguindo os princípios da Programação Orientada a Objetos, com responsabilidades bem divididas:src/
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
🚀 Como ExecutarSiga os passos abaixo para executar o projeto em sua máquina.Pré-requisitosJava Development Kit (JDK) instalado (versão 8 ou superior).Passos para ExecuçãoClone o repositório:git clone <url-do-seu-repositorio>
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
