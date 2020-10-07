package Jogo;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Nave {

    private int x, y;
    private int dx, dy;
    private int altura, largura;
    private boolean isVisivel;
    
    private Image imagem;
    
    private List<Missel> misseis;

    public Nave() {

        ImageIcon referencia = new ImageIcon("res\\nave.png");
        imagem = referencia.getImage();

        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
        
        
        misseis = new ArrayList<Missel>();
        
        this.x = 100;
        this.y = 100;
    }

    public void mexer() {
       
        x += dx;// -1 e 307
        y += dy;// -5 e 433
       
        
        if (this.x < -5){
            x = -5;
        }
        if (this.x > 433){
            x = 433;
        }
        
        if (this.y < 1){
            y = 1;
        }
        if (this.y > 307){
            y = 307;
        }
        
    }

    public List<Missel> getMisseis(){
    return misseis;    
       
    }
    
    public boolean isVisivel(){
        return isVisivel;
    }
    
    public void setVisivel(boolean isVisivel){
        this.isVisivel = isVisivel;
    }
    
    
    public int getx() {

        return x;
    }

    public int gety() {

        return y;
    }

    public Image getImagem() {

        return imagem;
    }
    
    public void atira(){
        this.misseis.add(new Missel(x + largura,y + altura/4));
    }
    
     public Rectangle getBouds(){
    
        return new Rectangle(x, y, largura, altura);
}

    public void keyPressed(KeyEvent tecla){
		
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_SPACE){
                    atira();
                }
                
		if(codigo == KeyEvent.VK_UP){
			dy = -3;
		}
		
		if(codigo == KeyEvent.VK_DOWN){
			dy = 3;
		}
		
		if(codigo == KeyEvent.VK_LEFT){
			dx = -3;
		}
		
		if(codigo == KeyEvent.VK_RIGHT){
			dx = 3;
		}
		
	}
	
	public void keyReleased(KeyEvent tecla){
		
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP){
			dy = 0;
		}
 
		if(codigo == KeyEvent.VK_DOWN){
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_LEFT){
			dx = 0;
		}
		
		if(codigo == KeyEvent.VK_RIGHT){
			dx = 0;
		}
		
	}

   
}
