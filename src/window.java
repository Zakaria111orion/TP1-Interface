import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;



public class window extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	
	

	public window(String a, int b, int c,boolean d) {
		
		this.setTitle(a);
	    this.setSize(b, c); 
	    this.setLocation(10, 40);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(d);
	    this.setLayout(new BorderLayout());
	    
	    this.add(img, BorderLayout.EAST );
	    this.add(img2, BorderLayout.WEST); 
	    this.add(img3, BorderLayout.CENTER); 
	    
	    img.setBorder(BorderFactory.createLineBorder(java.awt.Color.red));
	    img2.setBorder(BorderFactory.createLineBorder(java.awt.Color.black));
	    img3.setBorder(BorderFactory.createLineBorder(java.awt.Color.green));
	    inception.setBorder(BorderFactory.createLineBorder(java.awt.Color.blue));
	    inception2.setBorder(BorderFactory.createLineBorder(java.awt.Color.orange));
	    
	    img.setPreferredSize(new Dimension(250, 0)); 
	    img2.setPreferredSize(new Dimension(540, 0));
	    inception.setPreferredSize(new Dimension(200, 180)); 
	    inception2.setPreferredSize(new Dimension(200, 180));
	    
	    
	    
	    img.setLayout(new FlowLayout());
	    img2.setLayout(new FlowLayout());
	    img3.setLayout(new BorderLayout());
	  
	    img.add(pic);
	    img2.add(pic2);
	    img3.add(inception, BorderLayout.NORTH);
	    img3.add(inception2, BorderLayout.SOUTH);
	    inception.add(pic3);
	    inception2.add(pic4);
	    
	    ((JLabel) pic).setIcon(iconLogo);
	    ((JLabel) pic2).setIcon(iconlogo2);
	    ((JLabel) pic3).setIcon(iconlogo3);
	    ((JLabel) pic4).setIcon(iconlogo4);
	   
	    this.setJMenuBar(menuBar);
	    
	    menuBar.add(menu);
	    menuBar.add(menu1);
	    
	    
	}
	
	
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("Fichier");
	JMenu menu1 = new JMenu("Editer");
	
	
	
	
	JPanel img2 = new JPanel();
	JPanel img3 = new JPanel();
	JPanel img = new JPanel();
	
	JPanel inception = new JPanel();
	JPanel inception2 = new JPanel();
	
	JFrame window = new JFrame();
	
	JLabel pic = new JLabel();
    JLabel pic2 = new JLabel();
    JLabel pic3 = new JLabel();
    JLabel pic4 = new JLabel();
    
    ImageIcon iconLogo = new ImageIcon("C:\\Users\\Zaki Orion\\Desktop\\putin.jpg");
    ImageIcon iconlogo2= new ImageIcon("C:\\Users\\Zaki Orion\\Desktop\\psy.gif");
    ImageIcon iconlogo3= new ImageIcon("C:\\Users\\Zaki Orion\\Desktop\\psy2.jpg");
    ImageIcon iconlogo4= new ImageIcon("C:\\Users\\Zaki Orion\\Desktop\\psy3.jpg");
	

}
