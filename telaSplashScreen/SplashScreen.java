package telaSplashScreen;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SplashScreen extends JWindow {
    
    private int duration;
    
    public SplashScreen(int d) {
        duration = d;
    }
    
// Este é um método simples para mostrar uma tela de apresentção
// no centro da tela durante a quantidade de tempo passada no construtor
    private void showSplash() {        
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);
        
        // Configura a posição e o tamanho da janela
        int width = 350;
        int height = 150;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        
        // Constrói o splash screen
        JLabel label = new JLabel(new ImageIcon("Imagem\\chat1.png"));
        JLabel copyrt = new JLabel
                ("Copyright 2016, WardenTechnologies©", JLabel.CENTER);
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        content.setBackground(new Color(0,179,179));
        content.setBorder(BorderFactory.createLineBorder(new Color(162,232,232), 9));     
        // Torna visível
        setVisible(true);
         
        // Espera ate que os recursos estejam carregados
        try { Thread.sleep(duration); } catch (Exception e) {}        
        setVisible(false);        
    }
    
    public void showSplashAndExit() {        
        showSplash();
       // System.exit(0);        
    }
    

}