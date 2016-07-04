package telaLogin;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import telaSplashScreen.SplashScreen;

public class Principal {

	    public static void main(String[] args) {        
	        // Mostra uma imagem com o título da aplicação 
	        SplashScreen splash = new SplashScreen(1000); //Duração em milisec
	        splash.showSplashAndExit();        //Mostrar e Fechar após a duração
	        
	        try {
				EventQueue.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						FrameLogin mlogin = new FrameLogin();
						
					}
				});
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Falha");
			}
	        

	        
	        
	    }
		
		
	}
