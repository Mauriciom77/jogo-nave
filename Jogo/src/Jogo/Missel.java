package Jogo;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Mauricio
 */
public class Missel {

    private Image imagem;
    private int x, y;
    private int largura,altura;
    private boolean isVisivel;

    private static final int LARGURA__TELA = 500;
    private static final int VELOCIDADE = 2;

    public Missel(int x, int y) {
        this.x = x;
        this.y = y;

        ImageIcon referencia = new ImageIcon("res\\Tiroduplo.png");
        imagem = referencia.getImage();
        
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);

        isVisivel = true;

    }

    public void mexer(){
        
        this.x += VELOCIDADE;
        if(this.x > LARGURA__TELA){
            isVisivel = false;
        }
    }
    
    public boolean isVisivel() {
        return isVisivel;
    }

    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }

    public Image getImagem() {
        return imagem;
    }

    public int getX() {
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public Rectangle getBouds(){
    
        return new Rectangle(x, y, largura, altura);
}
}
