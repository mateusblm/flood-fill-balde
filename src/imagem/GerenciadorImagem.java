package imagem;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GerenciadorImagem {

    public BufferedImage carregar(String caminho){
    try {
        return ImageIO.read(new File(caminho));
    } catch (IOException e) {
        System.err.println("O carregamento de imagem apresentou o seguinte erro: " + e.getMessage());
        return null;
    }
    }

    public void salvar(BufferedImage imagem, String caminho) {
        try {
            File diretorioSaida = new File(caminho);
            diretorioSaida.getParentFile().mkdirs();
            ImageIO.write(imagem, "png", diretorioSaida);
        } catch(IOException e) {
            System.err.println("Ocorreu um erro ao salvar a imagem:  " + e.getMessage());
        }

    }

    public int obterCorPixel(BufferedImage imagem, int coordenadaX, int coordenadaY) {
        return imagem.getRGB(coordenadaX, coordenadaY);
    }

    public void alterarCorPixel(BufferedImage imagem, int coordenadaX, int coordenadaY, int novaCor) {
        imagem.setRGB(coordenadaX, coordenadaY, novaCor);
    }

}
