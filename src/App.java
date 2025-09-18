import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import algoritmo.Inundar;
import imagem.GerenciadorImagem;

public class App {
    public static void main(String[] args) throws Exception {

        String caminhoEntradaImagem = "entrada/imagem.png";
        String diretorioSaida = "saida";
        int inicioX = 250; 
        int inicioY = 250; 
        Color novaCor = Color.RED; 
        int intervaloAnimacao = 5000;

        GerenciadorImagem gerenciadorImagem = new GerenciadorImagem();
        Inundar inundar = new Inundar(diretorioSaida, intervaloAnimacao);

        System.out.println("Imagem original: " + caminhoEntradaImagem);
        BufferedImage imagemOriginal = gerenciadorImagem.carregar(caminhoEntradaImagem);
        if (imagemOriginal == null) {
            System.err.println("Falha ao carregar a imagem. Verifique o caminho do arquivo.");
            return;
        }
        System.out.println("Imagem carregada com sucesso.");


        System.out.println("\nIniciando preenchimento com pilha");
        BufferedImage imageForStack = copyImage(imagemOriginal);
        inundar.inundarComPilha(imageForStack, inicioX, inicioY, novaCor.getRGB());
        gerenciadorImagem.salvar(imageForStack, diretorioSaida + "/resultado_final_pilha.png");
        System.out.println("Resultado final da Pilha salvo em: " + diretorioSaida + "/resultado_final_pilha.png");

        System.out.println("\nIniciando preenchimento com fila");
        BufferedImage imageForQueue = copyImage(imagemOriginal);
        inundar.inundarComFila(imageForQueue, inicioX, inicioY, novaCor.getRGB());
        gerenciadorImagem.salvar(imageForQueue, diretorioSaida + "/resultado_final_fila.png");
        System.out.println("Resultado final da Fila salvo em: " + diretorioSaida + "/resultado_final_fila.png");

        System.out.println("\nVerifique a pasta '" + diretorioSaida + "' para os frames da animação e os resultados finais.");
    }

    public static BufferedImage copyImage(BufferedImage source) {
        BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
        Graphics2D g = b.createGraphics();
        g.drawImage(source, 0, 0, null);
        g.dispose();
        return b;
    }
 }
