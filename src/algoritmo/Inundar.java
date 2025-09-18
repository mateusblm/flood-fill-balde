package algoritmo;
import java.awt.image.BufferedImage;

import data.FilaPontos;
import data.PilhaPontos;
import data.Ponto;
import imagem.GerenciadorImagem;

public class Inundar {
    private final GerenciadorImagem gerenciadorImagem;
    private final String diretorioSaida;
    private int contagemFrame = 0;
    private final int intervaloAnimacaoFrame;

    public Inundar(String diretorioSaida, int intervaloAnimacaoFrame) {
        this.gerenciadorImagem = new GerenciadorImagem();
        this.diretorioSaida = diretorioSaida;
        this.intervaloAnimacaoFrame = intervaloAnimacaoFrame;
    }

    public void inundarComPilha(BufferedImage imagem, int inicioX, int inicioY, int novaCor) {
        this.contagemFrame = 0;
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();
        int corOriginal = gerenciadorImagem.obterCorPixel(imagem, inicioX, inicioY);

        if (corOriginal == novaCor) {
            System.out.println("A cor inicial é a mesma do preencimento, não sera preenchido");
            return;
        }

        PilhaPontos pilhaPontos = new PilhaPontos();
        pilhaPontos.empilhar(new Ponto(inicioX, inicioY));

        int contadorPixel = 0;

        while(!pilhaPontos.pilhaEstaVazia()) {
            Ponto ponto = pilhaPontos.desempilhar();
            int coordenadaX = ponto.getCoordenadaX();
            int coordenadaY = ponto.getCoordenadaY();

            // Verifica se o ponto é válido e tem a cor original
            if (
                coordenadaX < 0 || coordenadaX >= largura || 
                coordenadaY < 0 || coordenadaY >= altura || 
                gerenciadorImagem.obterCorPixel(imagem, coordenadaX, coordenadaY) != corOriginal) {
                continue;
            }

            gerenciadorImagem.alterarCorPixel(imagem, coordenadaX, coordenadaY, novaCor);
            contadorPixel++;

            if(contadorPixel % intervaloAnimacaoFrame == 0) {
                salvarFrameAnimacao(imagem, "pilha");
            }
            
            // Empilha os 4 pontos proximos

            pilhaPontos.empilhar(new Ponto(coordenadaX + 1, coordenadaY));
            pilhaPontos.empilhar(new Ponto(coordenadaX - 1, coordenadaY));
            pilhaPontos.empilhar(new Ponto(coordenadaX, coordenadaY + 1));
            pilhaPontos.empilhar(new Ponto(coordenadaX + 1, coordenadaY - 1));
        }
        salvarFrameAnimacao(imagem, "pilha");
        System.out.println("Inundação com pilha concluida.");
    }

    public void inundarComFila(BufferedImage imagem, int inicioX, int inicioY, int novaCor) {
        this.contagemFrame = 0;
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();
        int corOriginal = gerenciadorImagem.obterCorPixel(imagem, inicioX, inicioY);
        
        if (corOriginal == novaCor) {
            System.out.println("A cor inicial é a mesma do preencimento, não sera preenchido");
            return;
        }

        FilaPontos filaPontos = new FilaPontos();
        filaPontos.adicionar(new Ponto(inicioX, inicioY));
        int contadorPixel = 0;

        while(!filaPontos.filaEstaVazia()) {
            Ponto ponto = filaPontos.remover();
            int coordenadaX = ponto.getCoordenadaX();
            int coordenadaY = ponto.getCoordenadaY();

            // Mesma verificação da pilha
            if (
                coordenadaX < 0 || coordenadaX >= largura || 
                coordenadaY < 0 || coordenadaY >= altura || 
                gerenciadorImagem.obterCorPixel(imagem, coordenadaX, coordenadaY) != corOriginal) {
                continue;
            }

            gerenciadorImagem.alterarCorPixel(imagem, coordenadaX, coordenadaY, novaCor);
            contadorPixel++;

            if(contadorPixel % intervaloAnimacaoFrame == 0) {
                salvarFrameAnimacao(imagem, "fila");
            }
            
            filaPontos.adicionar(new Ponto(coordenadaX + 1, coordenadaY));
            filaPontos.adicionar(new Ponto(coordenadaX - 1, coordenadaY));
            filaPontos.adicionar(new Ponto(coordenadaX, coordenadaY + 1));
            filaPontos.adicionar(new Ponto(coordenadaX + 1, coordenadaY - 1));
        }
        
        salvarFrameAnimacao(imagem, "fila");
        System.out.println("Inundação com fila concluida.");
    }

    private void salvarFrameAnimacao(BufferedImage imagem, String metodo) {
        String nomeArquivo = String.format("%s/%s_frame_%05d.png", diretorioSaida, metodo, contagemFrame++);
        gerenciadorImagem.salvar(imagem, nomeArquivo);
    }
}
