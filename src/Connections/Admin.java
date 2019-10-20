package Connections;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Admin extends JPanel{

	public  JFrame fen= new JFrame() ;
	private static String titre = "CONNEXION EN ADMINISTRATEUR" ;
	JButton okBouton , reset,cancel ; 
	JTextField champTexte ; 
	JPasswordField  champTexte1 ; 
	JLabel login, passwd;
	JDialog d ;

	
	public Admin() {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.DARK_GRAY);
		d = new ConnexionAdmin() ;
	}
	
	public JDialog getBoite() {
		return this.d ;
	}

	public class ConnexionAdmin extends JDialog {
		

		private static final long serialVersionUID = 1L;
		public ConnexionAdmin(){
			super(fen,titre,true);
			 Toolkit tk = Toolkit.getDefaultToolkit();
			 Dimension dimEcran = tk.getScreenSize();
			this.setSize(dimEcran.width-725, dimEcran.height-480) ;
			this.setResizable(false);
			this.setLocationRelativeTo(null) ;
			 
			 champTexte = new JTextField("");
			 champTexte1 = new JPasswordField();
			 Container contenu = getContentPane() ;
			 FlowLayout gl = new FlowLayout(7) ;
			 contenu.setLayout (gl) ;
			 
			 login = new JLabel(" LOGIN "); 
			 passwd = new JLabel(" PASSWORD ");
			 okBouton = new JButton("OK") ;
			 reset = new JButton("RESET") ;
			 cancel = new JButton("Cancel") ;
			 
			 login.setForeground(Color.red);
			 passwd.setForeground(Color.RED);
			 okBouton.setForeground(Color.white);
			 reset.setForeground(Color.white);
			 cancel.setForeground(Color.black);	 
			
			 login.setPreferredSize(new Dimension(dimEcran.width-800,40));
			 passwd.setPreferredSize(new Dimension(dimEcran.width-800,40));
			 champTexte.setPreferredSize(new Dimension(dimEcran.width-800,40));
			 champTexte1.setPreferredSize(new Dimension(dimEcran.width-800,40));
			 okBouton.setPreferredSize(new Dimension((dimEcran.width-1000)/2,40));
			 reset.setPreferredSize(new Dimension((dimEcran.width-1000)/2,40));
			 cancel.setPreferredSize(new Dimension((dimEcran.width-1000)/2,40));
			 
			 champTexte.setHorizontalAlignment(JTextField.CENTER);
			 champTexte1.setHorizontalAlignment(JTextField.CENTER);
			 login.setHorizontalAlignment(JLabel.CENTER);
			 passwd.setHorizontalAlignment(JLabel.CENTER);
			 okBouton.setHorizontalAlignment(JLabel.CENTER);
			 reset.setHorizontalAlignment(JLabel.CENTER);
			 cancel.setHorizontalAlignment(JLabel.CENTER);
			 
			 okBouton.setBackground(new Color(22,29,86).darker());
			 reset.setBackground(new Color(22,29,86).darker());
			 cancel.setBackground(Color.red);
			 contenu.add(login);  
			 contenu.add(champTexte) ;
			 contenu.add(passwd); 
			 contenu.add(champTexte1);
			 contenu.add(okBouton);
			 contenu.add(reset);
			 contenu.add(cancel);
		}
	}

	
}
