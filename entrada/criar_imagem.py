from PIL import Image, ImageDraw
largura, altura = 400, 400
cor_fundo = "white"
cor_linha = "black"
imagem = Image.new("RGB", (largura, altura), cor_fundo)
desenho = ImageDraw.Draw(imagem)

desenho.rectangle([20, 20, 180, 150], outline=cor_linha, width=1)

desenho.ellipse([150, 180, 250, 280], outline=cor_linha, width=1)

desenho.rectangle([220, 20, 380, 380], outline=cor_linha, width=1)
desenho.line([300, 20, 300, 380], fill=cor_linha, width=1)

try:
    imagem.save("imagem.png", "PNG")
    print("Imagem 'imagem.png' criada com sucesso!")
except Exception as e:
    print(f"Ocorreu um erro ao salvar a imagem: {e}")