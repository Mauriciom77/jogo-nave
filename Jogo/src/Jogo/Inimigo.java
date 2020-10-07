package Jogo;

import com.sun.javafx.geom.RectBounds;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Mauricio
 */
public class Inimigo {

    private Image imagem;
    private int x, y;
    private int largura,altura;
    private boolean isVisivel;

    private static final int LARGURA__TELA = 500;
    private static final int VELOCIDADE = 2;
    
    private static int contador = 0;

    
    
    public Inimigo(int x, int y) {
        this.x = x;
        this.y = y;

        ImageIcon referencia;
        if (contador++ % 3 == 0){
            
           referencia = new ImageIcon("res\\inimigo1.png");
        }else{
            referencia = new ImageIcon("res\\inimigo2.png");
        }
        
        imagem = referencia.getImage();
        
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);

        isVisivel = true;

    }

    public void mexer(){
        
        if(this.x < 0){
            this.x = LARGURA__TELA;
        }else{
            this.x -= VELOCIDADE;
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
