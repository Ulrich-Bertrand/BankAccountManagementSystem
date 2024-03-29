import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

//importe mes classes
import Connections.Admin;
import Connections.Admin.ConnexionAdmin;
import Connections.Aide;
import Connections.Apropos;
import Connections.Client;
import Connections.Cordonateur;
import Connections.Documentation;

public class WelcomeInterface extends JFrame implements ActionListener{
	
	/** tout ceci est fait lors du premier commit
	 * @author Lionnel MOFFO
	 */
	private static final long serialVersionUID = 1L;
	private JButton adminB,clientB,docB,aproposB, aideB, cordoB ;
	public JPanel connex ;
	public CardLayout cl ;
	public Admin admin ;
	public Client client ;
	public Documentation documentation ;
	public Apropos apropos ;
	public Aide aide ;
	public Cordonateur cordo ;
	public String [] listContent = {"admin", "client","doc", "apropos", "aide","cordo"} ;
	
	public WelcomeInterface() {
		
		Defaults dim = new Defaults() ;
		Dimension dimEcran = dim.getDim() ;
		this.setSize(dimEcran.width-8, dimEcran.height - 40); // par defaut prend toute la largeur de la fenetre
		
		Container panel = this.getContentPane() ;
		//panel.setLayout(new BorderLayout(1,2));
		
		Menus menu = new Menus() ; 
		connex = new JPanel() ;
		cl = new CardLayout(5,0) ;
		connex.setLayout(cl);
		
		//definitions des panneaux qui correspondent aux differents interfaces.
		admin = new Admin() ;
		client = new Client() ;
		documentation = new Documentation() ;
		apropos = new Apropos() ;
		aide = new Aide() ;
		cordo = new Cordonateur() ;
		
		 adminB = menu.adminBut() ;
		 clientB = menu.clientBut() ;
		 docB = menu.documentationBut() ;
		 aproposB = menu.aproposBut() ;
		 aideB = menu.aideBut() ;
		 cordoB = menu.cordoBut() ;
		
		adminB.addActionListener(this) ;
		clientB.addActionListener(this) ;
		docB.addActionListener(this) ;
		aproposB.addActionListener(this) ;
		aideB.addActionListener(this) ;
		cordoB.addActionListener(this) ;
		
		connex.add(admin,"p1") ;
		connex.add(client,"p2") ;
		connex.add(documentation, "p3") ;
		connex.add(apropos, "p4") ;
		connex.add(aide, "p5") ;
		connex.add(cordo, "p6") ;
		
		panel.add(menu, BorderLayout.WEST) ; //OPtions
		panel.add(connex) ;

		
		
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Account Management"); // donne le titre � la fenetre
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		WelcomeInterface fenetre = new WelcomeInterface() ;
		fenetre.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==adminB) {
			JDialog d = admin.getBoite() ;
			d.setVisible(true);
			cl.show(connex,"p1") ;
		}
		if(event.getSource()==clientB) {
			cl.show(connex,"p2") ;
			clientB.setForeground(Color.black);
			}
		if(event.getSource()==docB) {
			cl.show(connex, "p3") ;	
			}
		if(event.getSource()==aproposB) {
			cl.show(connex, "p4") ;		
			}
		if(event.getSource()==aideB) {
			cl.show(connex, "p5") ;		
			}
		if(event.getSource()==cordoB) {
			cl.show(connex, "p6") ;		
			}
	}

}
