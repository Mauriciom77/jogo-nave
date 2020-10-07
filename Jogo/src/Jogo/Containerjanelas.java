package Jogo;


import javax.swing.JFrame;


public class Containerjanelas extends JFrame{
    
    public Containerjanelas(){
        
        add(new Fase());
        setTitle("Meu Primeiro jogo");
        setSize(500,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
                
    }
    
    public static void main(String[] args) {
        new Containerjanelas();
    }
}
