package telaLogin;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameLogin {

	public FrameLogin(){
		
		
		//Frame Principal
		JFrame frmPrincipal = new JFrame("tinyPrice Market Search");
		frmPrincipal.setSize(275,230);
		frmPrincipal.setVisible(true);
		frmPrincipal.setLocationRelativeTo(null);
		frmPrincipal.setLayout(null);
		frmPrincipal.setResizable(false);
		frmPrincipal.getContentPane().setBackground(new Color(255, 240, 245)); 

		
		ImageIcon icone1 = new ImageIcon("T:\\Documentos\\H\\Java\\TCC\\Imagem\\market1.png");
		ImageIcon icone2 = new ImageIcon("T:\\Documentos\\H\\Java\\TCC\\Imagem\\market2.png");
		
		//
		JLabel lbimg = new JLabel(icone1);
		lbimg.setBounds(120, 50, 250,250);
		
		JLabel teste = new JLabel("potato");
		teste.setBounds(120, 50, 50,50);
		
		frmPrincipal.setIconImage(icone2.getImage());
		frmPrincipal.add(teste);
		frmPrincipal.add(lbimg);
		
		
		
		
		
		
		
		
	}
		
}
